package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pawBackend.model.User;
import pawBackend.services.UserService;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

/*
   @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
*/

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
