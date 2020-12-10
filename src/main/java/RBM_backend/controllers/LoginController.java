package RBM_backend.controllers;

import RBM_backend.model.Login;
import RBM_backend.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
