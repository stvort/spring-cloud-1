package ru.otus.webapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.webapp.dto.QuoteDto;
import ru.otus.webapp.repository.QuoteRepository;

@RequiredArgsConstructor
@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuoteRepository repository;

    @Override
    public QuoteDto findRandom() {
        return repository.randomQuote();
    }
}
