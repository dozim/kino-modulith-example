package com.doz.business;

import com.doz.persistence.ProgrammJPARepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammService {

    private final ProgrammJPARepository programmJPARepository;

    public ProgrammService(ProgrammJPARepository programmJPARepository) {
        this.programmJPARepository = programmJPARepository;
    }

    public Iterable<Programm> getTagesprogramm() {
        return this.programmJPARepository.findAll();
    }
}
