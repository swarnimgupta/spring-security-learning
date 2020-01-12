package io.sam.ssl.resources;

import io.sam.ssl.models.ResponseToUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/")
    public ResponseToUser welcomeUser() {
        log.info("Accessing user welcome method for expose");
        return new ResponseToUser("Welcome User");
    }

}
