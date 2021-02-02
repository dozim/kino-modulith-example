package com.doz;

import org.springframework.stereotype.Service;

@Service
public class RechnungFacade {

    private final RechnungService rechnungService;

    public RechnungFacade(RechnungService rechnungService) {
        this.rechnungService = rechnungService;
    }

    public void speichereRechnung(Rechnung rechnung) {
        this.rechnungService.speichereRechnung(rechnung);
    }

    public Rechnung erstelleRechnung() {
        return rechnungService.erstelleRechnung();
    }
}
