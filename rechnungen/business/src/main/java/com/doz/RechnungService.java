package com.doz;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RechnungService {

    private final RechnungJPARepository rechnungJPARepository;

    public RechnungService(RechnungJPARepository rechnungJPARepository) {
        this.rechnungJPARepository = rechnungJPARepository;
    }

    public void speichereRechnung(Rechnung rechnung) {
        this.rechnungJPARepository.save(rechnung);
    }

    public Rechnung erstelleRechnung() {
        return new Rechnung();
    }

    public Optional<Rechnung> getRechnung(long rechnungsId) {
        return this.rechnungJPARepository.findById(rechnungsId);
    }
}
