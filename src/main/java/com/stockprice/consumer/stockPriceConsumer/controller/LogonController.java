package com.stockprice.consumer.stockPriceConsumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/stockprice")
public class LogonController {
//     @Autowired
//     UserRepo userRepo;
//     @Autowired
//     UserProfileRepo userProfileRepo;

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public boolean validateLogin(@RequestParam(value = "loginId", required = false) String userId,
                                 @RequestParam(value = "password", required = false) String password){
//        UserLogin userLogin =userRepo.findByUserId(userId);
//        if(userLogin!=null && userLogin.getPassWord()!=null) {
//            return userLogin.getPassWord().equals(password);
//        }

        return false;
    }
    @RequestMapping(value = "/addRegistration" , method = RequestMethod.POST)
    public String addRegistrationDetails(@RequestParam(value = "userId", required = false) String userId,
                                         @RequestParam(value = "name", required = false) String name,
                                         @RequestParam(value = "lastName", required = false) String lastName,
                                         @RequestParam(value = "phoneNumber", required = false) String phoneNumber,
                                         @RequestParam(value = "email", required = false) String email,
                                         @RequestParam(value = "newPassword", required = false) String newPassword,
                                         @RequestParam(value = "retypePassword", required = false) String retypePassword
    ) {
        String x = validate(newPassword, retypePassword);
//        if (x != null) return x;
//        UserProfile userProfile =  new UserProfile();
//        userProfile.setName(name);
//        userProfile.setUserId(userId);
//        userProfile.setLastName(lastName);
//        userProfile.setPhoneNumber(phoneNumber);
//        userProfile.setEmailId(email);
//        userProfileRepo.save(userProfile);
//        UserLogin userLogin = new UserLogin();
//        userLogin.setPassWord(newPassword);
//        userLogin.setUserId(userId);
//        userRepo.save(userLogin);
         return "Success";
    }

    private String validate( String newPassword,  String retypePassword) {
        if(StringUtils.isEmpty(newPassword)
        ||StringUtils.isEmpty(retypePassword) ){
            return "Password cannot be empty, please enter password";
        }else if(!newPassword.equals(retypePassword)){
            return "Password does not match";
        }
        return null;
    }

    @RequestMapping(value = "/getUserProfile" , method = RequestMethod.GET)
    public String getUserProfile(@RequestParam(value = "userId", required = false) String userId
    ) {
//        Optional<UserProfile> userProfileOptional = userProfileRepo.findById(userId);
//        if(userProfileOptional.isPresent()) {
//            return userProfileOptional.get();
//        }
        return null;
    }

    @RequestMapping(value = "/changePassword" , method = RequestMethod.GET)
    public String changePassword(@RequestParam(value = "userId", required = false) String userId,
                                      @RequestParam(value = "oldPassword", required = false) String oldPassword,
                                      @RequestParam(value = "userId", required = false) String newPassword,
                                      @RequestParam(value = "userId", required = false) String retypePassword
    ) {
//        Optional<UserLogin> userLoginOptional =userRepo.findById(userId);
//        if(userLoginOptional.isPresent()){
//            UserLogin userLogin = userLoginOptional.get();
//            String password = userLogin.getPassWord();
//            if(!oldPassword.equals(password)) {
//                return  "Please enter correct userId and Password";
//            }else if(!newPassword.equals(retypePassword)){
//                return "Password does not match";
//            }
//            userLogin.setPassWord(newPassword);
//            userRepo.save(userLogin);
//            return "Password has been changed successfully";
//        }
        return "Please enter correct userId and Password";
    }




}
