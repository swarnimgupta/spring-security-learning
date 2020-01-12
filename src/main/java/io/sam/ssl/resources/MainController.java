package io.sam.ssl.resources;

import io.sam.ssl.models.ResponseToUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping("/")
    public ResponseToUser welcome() {
        log.info("Accessing normal welcome method for expose");
        return new ResponseToUser("Welcome");
    }

}
