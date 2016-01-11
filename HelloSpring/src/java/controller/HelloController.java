package controller;

import model.Sanpham;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author phuong
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    @RequestMapping(value = "/xinchao" , method = RequestMethod.GET)
    public String xinchao(ModelMap model){
        model.put("a", "Tran Duy Phuong");
        model.put("sp" , new Sanpham("SPA" , 100.03));
        return "xinchao";
    }
}
