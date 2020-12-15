package RBM_backend.tables.controllers;

import RBM_backend.tables.models.User;
import RBM_backend.tables.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
