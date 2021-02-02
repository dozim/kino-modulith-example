package com.doz.api;

import com.doz.business.Programm;
import com.doz.business.ProgrammService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/programm")
public class ProgrammController {

    private final ProgrammService programmService;

    public ProgrammController(ProgrammService programmService) {
        this.programmService = programmService;
    }

    @GetMapping
    public Iterable<Programm> getTagesprogramm() {
        return this.programmService.getTagesprogramm();
    }
}
