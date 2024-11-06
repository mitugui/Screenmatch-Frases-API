package br.com.alura.screenmatch_frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String quote;
    private String character;
    private String poster;

    public String getTitle() {
        return title;
    }

    public String getQuote() {
        return quote;
    }

    public String getCharacter() {
        return character;
    }

    public String getPoster() {
        return poster;
    }
}
