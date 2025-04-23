package fr.univrouen.rss25SB.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {
    @GetMapping("/resume")
    public String getListRSSinXML() {
        return "Envoi de la liste des flux RSS";
    }
    @GetMapping("/guid")
    public String getRSSinXML(
        @RequestParam(value = "guid") String texte) {
        return ("Détail du flux RSS demandé  : " + texte);
    }

    @GetMapping("/test")
    public String getTest(
            @RequestParam(value = "nb")  int nb,
            @RequestParam(value = "search") String search
    )  {
        return ("test a3 \n guid :"+nb +"\n titre "+search);
    }


}
