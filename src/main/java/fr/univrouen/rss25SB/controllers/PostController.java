package fr.univrouen.rss25SB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {


    @PostMapping(path = "/testpost",consumes="application/xml")
    public String postTest(@RequestBody String flux) {
        return ("<result><response>Message reçu : </response>"
                + flux + "</result>");
    }
}
