package com.lucaszamboni.rota.viagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rota/viagem")
public class RotaViagemController {

    @GetMapping()
    public String getRotaViagem() {
        return "Rota Viagem";
    }
}
