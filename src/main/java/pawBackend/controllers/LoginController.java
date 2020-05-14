package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import pawBackend.model.LoginForm;
import pawBackend.services.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginForm loginForm) {
        UserDetails user = userService.loadUserByUsername(loginForm.getUsername());
        return loginForm.getUsername().equals(user.getUsername()) && loginForm.getPassword().equals(user.getPassword());
    }

    @GetMapping("/user")
    public UserDetails user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").substring(5).trim();
        String username = new String(Base64.getDecoder().decode(authToken)).split(":")[0];
        UserDetails user = userService.loadUserByUsername(username);
        return user;
    }

}
