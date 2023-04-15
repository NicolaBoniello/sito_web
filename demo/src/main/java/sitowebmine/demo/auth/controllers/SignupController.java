package sitowebmine.demo.auth.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import sitowebmine.demo.auth.entities.SignupDTO;
import sitowebmine.demo.auth.services.SignupService;
import sitowebmine.demo.entities.User;

@RestController
@RequestMapping("/auth")
public class SignupController {

    @Autowired
    SignupService signupService;

    @PostMapping("/signup")
    public String signup(@RequestParam("name") String name,
                                         @RequestParam("surname") String surname,
                                         @RequestParam("email") String email,
                                         @RequestParam("username") String username,
                                         @RequestParam("password") String password){


        SignupDTO userDto = new SignupDTO(name, surname, email, username, password);
        User user = signupService.signup(userDto);

        return "Registrazione effettuata con successo";

    }
}
