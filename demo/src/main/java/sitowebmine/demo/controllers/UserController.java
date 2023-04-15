package sitowebmine.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sitowebmine.demo.entities.User;
import sitowebmine.demo.services.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/registrazione")
    public String registrazioneUtente(@RequestParam String name,
                                      @RequestParam("surname") String surname,
                                      @RequestParam("username")String userName,
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password){
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(userName);
        user.setEmail(email);
        user.setPassword(password);

        userService.save(user);

        return "conferma-registrazione";

    }
}
