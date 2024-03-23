package com.example.demo1;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/notices")
    public String notices(){
        return "notices";
    }
    @GetMapping("/myAccount")
    public String getAccount(){
        return "account is empty";
    }

    @GetMapping("/myBalance")
    public String getBalance(){
        return "balance is low";
    }

    @PreAuthorize("hasAuthority('VIEWLOANS')")
    @GetMapping("/myLoans")
    public String getLoans(){
        return "loan details";
    }

    @GetMapping("/myCards")
    public String getCards(){
        return "card details";
    }

}
