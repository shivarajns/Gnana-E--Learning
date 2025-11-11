package com.gnana.backend.service;


import com.gnana.backend.model.AppUser;
import com.gnana.backend.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    private BCryptPasswordEncoder encodePass = new BCryptPasswordEncoder();


    public AppUser regUser(AppUser user){
        if(appUserRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException("User using this Email already Exists");
        }

        user.setPassword(encodePass.encode(user.getPassword()));

        return appUserRepository.save(user);
    }

    public AppUser loginUser(String email, String password ){
        AppUser user = appUserRepository.findByEmail(email).orElseThrow(()-> new RuntimeException("Invalid email or password"));

        if(!encodePass.matches(password, user.getPassword())){
            throw new RuntimeException("Invalid email or password");
        }

        return user;
    }
}
