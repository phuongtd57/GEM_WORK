package controller;

import Entities.Dealer;
import Entities.Inventory;
import Entities.Unit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by phuong on 1/16/2016.
 */
@Controller
@RequestMapping("/hello")
public class HelloController
{
    @RequestMapping("/xinchao")
    public String xinchao(ModelMap mm){
        SessionFactory factory  = new Configuration().configure().buildSessionFactory();
        Transaction tx = null;
        Session session = factory.openSession();

        tx = session.beginTransaction();
        List<Dealer> dealers = session.createQuery("from Dealer ").list();
        mm.addAttribute("dealers" , dealers);

        List<Unit> units = session.createQuery("from Unit").list();

        mm.addAttribute("units" , units);

        tx.commit();

        Dealer d = dealers.get(0);
        Set inventorys = d.getInventorys();

        mm.addAttribute("invens" , inventorys);

        return "xinchao";
    }
}
