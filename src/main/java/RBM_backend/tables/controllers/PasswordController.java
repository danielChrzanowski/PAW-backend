package RBM_backend.tables.controllers;

import RBM_backend.tables.models.Password;
import RBM_backend.tables.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class PasswordController {
    @Autowired
    PasswordService passwordService;

    @GetMapping("/passwordById/{id}")
    public Password passwordById(@PathVariable int id) {
        return passwordService.passwordById(id);
    }

    @PostMapping("/changePassword")
    public void changePassword(@RequestBody Password password) {
        passwordService.changePassword(password);
    }
}