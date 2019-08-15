package com.fdmgroup.reachdeliveryapp.Controllers;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Parcel;
import com.fdmgroup.reachdeliveryapp.Model.Entities.Reach_users;
import com.fdmgroup.reachdeliveryapp.Model.Entities.UserType;
import com.fdmgroup.reachdeliveryapp.Model.Services.ParcelImp;
import com.fdmgroup.reachdeliveryapp.Model.Services.UserTypeImp;
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
        // UserTypeImp userTypeImp = new UserTypeImp();
        // UserType userType = userTypeImp.Read(user.getUser_type().getType_id());
        // ParcelImp parcelImp = new ParcelImp();
        // Parcel parcel = parcelImp.Read(1);
        model.addAttribute("userObj", user);
        // model.addAttribute("userType", userType);
        return "index";
    }

}