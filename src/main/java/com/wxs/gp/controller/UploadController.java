package com.wxs.gp.controller;

import com.wxs.gp.common.ReturnFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@CrossOrigin
@Controller
//规格照片的上传
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/img")
    @ResponseBody
    public String uploadImg(MultipartFile uploadFile) throws
            IOException {

        String originalFilename = uploadFile.getOriginalFilename();    //获取原文件名
        String newFilename = UUID.randomUUID() + "_" + originalFilename;    //使用UUID避免重名

        File filePath = new File("D:\\SoftDATA\\ProjectPath\\GraduationProject\\java\\src\\main\\resources\\static\\imgs\\" + newFilename);
        try {
            uploadFile.transferTo(filePath);
            return ReturnFormat.retData("/static/imgs/" + newFilename);
        } catch (Exception e) {
            return ReturnFormat.retParam(500, e.getMessage());
        }

    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(String name) throws
            IOException {

        return "/static/imgs/" + name;
    }
}
