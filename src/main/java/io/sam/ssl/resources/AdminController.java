package io.sam.ssl.resources;

import io.sam.ssl.models.ResponseToUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @GetMapping("")
    public ResponseToUser welcomeAdmin() {
        log.info("Accessing admin welcome method for expose");
        return new ResponseToUser("Welcome Admin");
    }

}
