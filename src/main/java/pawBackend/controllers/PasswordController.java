package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pawBackend.model.Password;
import pawBackend.services.PasswordService;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class PasswordController {
    @Autowired
    PasswordService passwordService;

    @GetMapping("/passwordById/{id}")
    public Password getPasswordById(@PathVariable int id) {
        return passwordService.getPasswordById(id);

    }
}
