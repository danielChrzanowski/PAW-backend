package RBM_backend.security;

import RBM_backend.REST.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class LoggingController {

    @Autowired
    UserService userService;


    @PostMapping("/login")
    public boolean login(@RequestBody LoginForm loginForm) {
        UserDetails user = userService.loadUserByUsername(loginForm.getUsername());
        boolean passwordCorrect = BCrypt.checkpw(loginForm.getPassword(), user.getPassword());
        return loginForm.getUsername().equals(user.getUsername()) && passwordCorrect;
    }

    @GetMapping("/user")
    public UserDetails user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").substring(5).trim();
        String username = new String(Base64.getDecoder().decode(authToken)).split(":")[0];
        return userService.loadUserByUsername(username);
    }

}
