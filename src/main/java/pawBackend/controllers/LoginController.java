package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pawBackend.model.Login;
import pawBackend.model.Password;
import pawBackend.services.LoginService;
import pawBackend.services.PasswordService;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/checkLogin/{login}")
    public Login checkLogin(@PathVariable String login) {
        return loginService.checkLogin(login);
    }

}
