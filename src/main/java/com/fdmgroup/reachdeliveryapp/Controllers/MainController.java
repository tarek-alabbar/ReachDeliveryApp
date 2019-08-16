package com.fdmgroup.reachdeliveryapp.Controllers;

import com.fdmgroup.reachdeliveryapp.Model.Entities.Address;
import com.fdmgroup.reachdeliveryapp.Model.Entities.City;
import com.fdmgroup.reachdeliveryapp.Model.Entities.Parcel;
import com.fdmgroup.reachdeliveryapp.Model.Entities.Reach_users;
import com.fdmgroup.reachdeliveryapp.Model.Entities.Status;
import com.fdmgroup.reachdeliveryapp.Model.Entities.UserDetails;
import com.fdmgroup.reachdeliveryapp.Model.Entities.UserType;
import com.fdmgroup.reachdeliveryapp.Model.Services.AddressImp;
import com.fdmgroup.reachdeliveryapp.Model.Services.CityImp;
import com.fdmgroup.reachdeliveryapp.Model.Services.ParcelImp;
import com.fdmgroup.reachdeliveryapp.Model.Services.StatusImp;
import com.fdmgroup.reachdeliveryapp.Model.Services.UserDetailsImp;
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
        ParcelImp parcelImp = new ParcelImp();
        UserTypeImp userTypeImp = new UserTypeImp();
        AddressImp addressImp = new AddressImp();
        CityImp cityImp = new CityImp();
        StatusImp statusImp = new StatusImp();
        UserDetailsImp userDetailsImp = new UserDetailsImp();
        
        
        Reach_users user = usersImp.Read(1);
        UserType userType = userTypeImp.Read(user.getUser_type().getType_id());
        Address address = addressImp.Read(user.getAddress().getAddress_id());
        UserDetails userDetails = userDetailsImp.Read(user.getUsers_details().getDetails_id());
        
        Parcel parcel = parcelImp.Read(1);
        Status status = statusImp.Read(parcel.getStatus().getStatus_id());
        City fromCity = cityImp.Read(parcel.getFrom().getCity_id());
        City destinationCity = cityImp.Read(parcel.getDestination().getCity_id());
         
        model.addAttribute("userObj", user);
         model.addAttribute("userTypeObj", userType);
         model.addAttribute("addressObj", address);
         model.addAttribute("userDetailsObj", userDetails);
         
         model.addAttribute("parcelObj", parcel);
         model.addAttribute("statusObj", status);
         model.addAttribute("fromCityObj", fromCity);
         model.addAttribute("destinationCityObj", destinationCity);
        return "index";
    }

}