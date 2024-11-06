package br.com.alura.screenmatch_frases.service;

import br.com.alura.screenmatch_frases.dto.QuoteDTO;
import br.com.alura.screenmatch_frases.model.Quote;
import br.com.alura.screenmatch_frases.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository repository;

    public QuoteDTO getRandomQuote() {
        Quote quote = repository.findRandomQuote();
        return new QuoteDTO(quote.getTitle(),
                quote.getQuote(),
                quote.getCharacter(),
                quote.getPoster());
    }
}
