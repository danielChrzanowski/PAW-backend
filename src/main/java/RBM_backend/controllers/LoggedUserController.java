package RBM_backend.controllers;

import RBM_backend.model.LoggedUser;
import RBM_backend.services.LoggedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggedUserController {
    @Autowired
    LoggedUserService loggedUserService;

    @GetMapping("/userByIdNoPassword/{id}")
    public LoggedUser userByIdNoPassword(@PathVariable int id) {
        return loggedUserService.userByIdNoPassword(id);
    }

}
