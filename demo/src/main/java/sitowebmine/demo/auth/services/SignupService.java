package sitowebmine.demo.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sitowebmine.demo.auth.entities.SignupDTO;
import sitowebmine.demo.entities.User;
import sitowebmine.demo.repositories.UserRepository;

import java.util.UUID;

@Service
public class SignupService {

    @Autowired
    UserRepository userRepository;




    public User signup(SignupDTO signupDTO){

        User user = new User();
        user.setName(signupDTO.getName());
        user.setSurname(signupDTO.getSurname());
        user.setActive(false);
        user.setEmail(signupDTO.getEmail());
        user.setUsername(signupDTO.getUsername());
        user.setPassword(signupDTO.getPassword());
        user.setActivationCode(UUID.randomUUID().toString());

        return userRepository.save(user);
    }
}
