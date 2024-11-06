package br.com.alura.screenmatch_frases.controller;

import br.com.alura.screenmatch_frases.dto.QuoteDTO;
import br.com.alura.screenmatch_frases.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
    @Autowired
    private QuoteService service;

    @GetMapping("/series/frases")
    public QuoteDTO getRandomQuote() {
        return service.getRandomQuote();
    }
}
