package com.gnana.backend.controller;

import com.gnana.backend.model.AppUser;
import com.gnana.backend.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http//:localhost:3000")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/register")
    public ResponseEntity<AppUser> newUserReg(@PathVariable AppUser user){
        AppUser registerUser = appUserService.regUser(user);
        return  ResponseEntity.ok(registerUser);
    }

    @GetMapping("/login")
    public ResponseEntity<AppUser> loginUser(@PathVariable Map<String, String> loginData){
        String email = loginData.get("email");
        String password = loginData.get("password");

        AppUser user = appUserService.loginUser(email, password);

        return ResponseEntity.ok(user);
    }

}
