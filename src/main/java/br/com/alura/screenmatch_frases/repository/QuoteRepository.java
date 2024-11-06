package br.com.alura.screenmatch_frases.repository;

import br.com.alura.screenmatch_frases.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query("SELECT q from Quote q ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Quote findRandomQuote();
}
