package bts.sio.api.controller;

import bts.sio.api.model.Ville;
import bts.sio.api.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VilleController {

    @Autowired
    private VilleService villeService;

    @GetMapping("/villes")
    public Iterable<Ville> getVilles(){
        return villeService.getLesVilles();
    }
}
