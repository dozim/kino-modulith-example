package com.doz.business;

import com.doz.persistence.ReservierungJPARepository;
import org.springframework.stereotype.Service;

@Service
public class ReservierungService {

    private final ReservierungJPARepository reservierungJPARepository;

    public ReservierungService(ReservierungJPARepository reservierungJPARepository) {
        this.reservierungJPARepository = reservierungJPARepository;
    }

    public void reservierungSpeichern(Reservierung reservierung) {
        this.reservierungJPARepository.save(reservierung);
    }

    public Reservierung reservierungErstellen() {
        return new Reservierung();
    }
}
