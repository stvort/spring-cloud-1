package ru.otus.quotesservice.service;

import ru.otus.quotesservice.model.Quote;

import java.util.Optional;

public interface QuoteService {
    Optional<Quote> findRandom();
}
