import com.wxs.gp.common.ReturnFormat;
import com.wxs.gp.domain.Producttype;
import com.wxs.gp.service.impl.MenuServiceImpl;
import com.wxs.gp.service.impl.ProductSaleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test1 {

    @Autowired
    MenuServiceImpl menuService;
    @Autowired
    ProductSaleServiceImpl productSaleService;

    @Test
    public void getmenu() {
//        List<Menu> list = menuService.getMenuList(username);
////        for (Menuweb item : list) {
////            System.out.println(item);
////        }
//        System.out.println(ReturnFormat.retData(list));
    }

    @Test
    public void test1() {
        List<Producttype> p = productSaleService.getProductTypeByProductid(150);
        System.out.println(ReturnFormat.retData(p));
    }

}
