package ru.otus.quotesservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.quotesservice.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
