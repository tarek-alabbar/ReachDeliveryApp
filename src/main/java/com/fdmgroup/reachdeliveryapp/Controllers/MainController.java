package com.fdmgroup.reachdeliveryapp.Controllers;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Reach_users;
import com.fdmgroup.reachdeliveryapp.Model.Services.UsersImp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainController
 */
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String indexPage(Model model){
        UsersImp usersImp = new UsersImp();
        Reach_users user = usersImp.Read(1);
        model.addAttribute("userObj", user);
        return "index";
    }

}