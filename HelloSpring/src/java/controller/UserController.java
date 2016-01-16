package controller;

import java.util.List;
import model.HibernateUtil;
import model.Units;
import model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author phuong
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String list(ModelMap mp){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Units> list = session.createQuery("from Units").list();
            
            session.getTransaction().commit();
            
            mp.addAttribute("units", list);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "users";
    }
}
