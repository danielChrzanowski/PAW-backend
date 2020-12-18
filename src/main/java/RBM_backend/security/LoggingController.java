package RBM_backend.security;

import RBM_backend.REST.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
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
        String password = new String(Base64.getDecoder().decode(loginForm.getPassword()));
        /*
        console.log();
        String s = "demo@demo.com";
        String encoded = new String(Base64.getEncoder().encode(s.getBytes()));
        String decoded = new String(Base64.getDecoder().decode(encoded));
        System.out.println("S: " + s + " -> " + encoded + " -> " + decoded);
        */

        UserDetails user = userService.loadUserByUsername(loginForm.getUsername());
        return loginForm.getUsername().equals(user.getUsername()) && password.equals(user.getPassword());
    }

    @GetMapping("/user")
    public UserDetails user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").substring(5).trim();
        String username = new String(Base64.getDecoder().decode(authToken)).split(":")[0];
        return userService.loadUserByUsername(username);
    }

}
