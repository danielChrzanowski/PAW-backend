package pawBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
public class KeyController {
    @Autowired
    private Environment env;

    @GetMapping("/getKey")
    public String getKey() {
        return env.getProperty("key");
    }
}
