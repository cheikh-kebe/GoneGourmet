package com.gonegourmet.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gonegourmet.backend.models.User;
import com.gonegourmet.backend.services.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173") // Pour le frontend Vite
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        if (!userService.isUsernameAvailable(user.getUsername())) {
            return ResponseEntity.badRequest().body("Nom d'utilisateur déjà pris");
        }
        if (!userService.isEmailAvailable(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email déjà utilisé");
        }
        
        User createdUser = userService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }
}