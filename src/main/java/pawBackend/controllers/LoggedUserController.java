package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pawBackend.model.LoggedUser;
import pawBackend.services.LoggedUserService;

@RestController
public class LoggedUserController {
    @Autowired
    LoggedUserService loggedUserService;

    @GetMapping("/userByIdNoPassword/{id}")
    public LoggedUser getUserByIdNoPassword(@PathVariable int id){return loggedUserService.getUserByIdNoPassword(id);}

}
