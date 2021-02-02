package com.doz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/rechnungen")
public class RechnungenController {

    private final RechnungService rechnungService;

    public RechnungenController(RechnungService rechnungService) {
        this.rechnungService = rechnungService;
    }

    @GetMapping
    public ResponseEntity<Rechnung> getRechnung(long rechnungsId) {

        Optional<Rechnung> rechnungOptional = this.rechnungService.getRechnung(rechnungsId);

        return ResponseEntity.of(rechnungOptional);
    }
}
