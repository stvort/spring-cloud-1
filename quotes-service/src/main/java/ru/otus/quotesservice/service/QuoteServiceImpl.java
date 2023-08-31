package ru.otus.quotesservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.quotesservice.config.QuotesProps;
import ru.otus.quotesservice.model.Quote;
import ru.otus.quotesservice.repository.QuoteRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuotesProps quotesProps;
    private final QuoteRepository repository;

    @Override
    public Optional<Quote> findRandom() {
        List<Quote> quotes = repository.findAll();
        Collections.shuffle(quotes);
        return quotes.stream().findFirst().map(q -> {
            q.setQuote(quotesProps.getPrefix() + q.getQuote());
            return q;
        });
    }
}
