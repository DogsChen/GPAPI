package com.wxs.gp.common;


import java.util.HashMap;
import java.util.Map;

public class ReturnFormat {
    private static final Map<String, String> messageMap = new HashMap();

    //初始化状态码与文字说明
    static {

        messageMap.put("400", "Bad Request!请求失败！");
        messageMap.put("401", "NotAuthorization（不被允许的操作）");

        messageMap.put("404", "Resource is not available（请求的资源找不到）");

        messageMap.put("405", "Method Not Allowed（方法不被允许）");
        messageMap.put("406", "Not Acceptable （406）");
        messageMap.put("500", "Internal Server Error（服务器错误）");

    }

    //出现异常时调用
    public static String retParam(int code, String msg) {
        msg = msg.isEmpty() ? messageMap.get(String.valueOf(code)) : msg;
//        OutputJson json = new OutputJson(code, messageMap.get(String.valueOf(code))+msg);
        OutputJson json = new OutputJson(code, msg);
        return json.toString();
    }

    //出现异常时调用
    public static String retParam(int code) {
        OutputJson json = new OutputJson(code, messageMap.get(String.valueOf(code)));
        return json.toString();
    }

    //正常时调用
    public static String retData(Object data) {
        OutputJson json = new OutputJson(200, "ok");
        json.setData(data);
        return json.toString();
    }

}

