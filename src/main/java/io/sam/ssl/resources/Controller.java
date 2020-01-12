package io.sam.ssl.resources;

import io.sam.ssl.models.ResponseToUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {
    @GetMapping("/")
    public ResponseToUser welcome() {
        log.info("Accessing normal welcome method for expose");
        return new ResponseToUser("Welcome");
    }

    @GetMapping("/user")
    public ResponseToUser welcomeUser() {
        log.info("Accessing user welcome method for expose");
        return new ResponseToUser("Welcome User");
    }

    @GetMapping(value = "/admin")
    public ResponseToUser welcomeAdmin() {
        log.info("Accessing admin welcome method for expose");
        return new ResponseToUser("Welcome Admin");
    }
}
