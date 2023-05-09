package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping ("add")
    public String displayAddUserForm() {
        return "/user/add.html";
    }

    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (!user.getEmail().equals(verify)) {
            return "ERROR!";
        }


        user.setUsername(user.getUsername());
        System.out.println(user.getUsername());
//    user.setEmail();
//    user.setPassword();

    }

}
