package com.estrobacknew.servernew.controller;


import com.estrobacknew.servernew.model.UserModel;
import com.estrobacknew.servernew.model.mongorepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/signup")
    public ResponseEntity<UserModel> signUp(@RequestBody UserModel userModel)
    {
        UserModel save=this.userRepo.save(userModel);
        return ResponseEntity.ok(save);
    }



    @GetMapping("/credentials")
    public ResponseEntity<UserModel> logIn(@RequestParam("email") String email) {
        UserModel user = this.userRepo.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
