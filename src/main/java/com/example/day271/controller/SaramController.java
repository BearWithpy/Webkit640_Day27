package com.example.day271.controller;

import com.example.day271.service.SaramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@ComponentScan(basePackages={"com.example.day271.service"})
@Controller
public class SaramController {
    @Autowired
    SaramService saramService;

    @RequestMapping(value = "/saram/list", method = RequestMethod.GET)
    public String list(Locale locale, Model model) {
        System.out.println(">> list() - SaramController");
        saramService.selectAll();
        return "saram/list";
    }

    @RequestMapping("/saram/insert")
    public String insert() {
        System.out.println(">> insert() - SaramController");
        saramService.insert(null);
        return "saram/input";
    }

    @RequestMapping("/saram/detail")
    public String detail() {
        System.out.println(">> detail() - SaramController");
        saramService.selectOne(null);
        return "saram/detail";
    }

    @RequestMapping("/saram/modify")
    public String modify() {
        System.out.println(">> modify() - SaramController");
        saramService.update(null);
        return "saram/modify";
    }

    @RequestMapping("/saram/delete")
    public String delete() {
        System.out.println(">> delete() - SaramController");
        saramService.delete(null);
        return "saram/delete";
    }
}