package RBM_backend.REST.controllers;

import RBM_backend.REST.models.Password;
import RBM_backend.REST.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class PasswordController {
    @Autowired
    PasswordService passwordService;

    @GetMapping("/checkPasswordInDB/{id}")
    public boolean passwordById(@PathVariable int id, @RequestParam String password) {
        return passwordService.passwordById(id, password);
    }

    @PutMapping("/changePassword")
    public void changePassword(@RequestBody Password password) {
        passwordService.changePassword(password);
    }
}
