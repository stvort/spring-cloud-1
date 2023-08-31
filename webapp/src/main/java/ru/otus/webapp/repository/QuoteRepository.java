package ru.otus.webapp.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import ru.otus.webapp.dto.QuoteDto;

@Profile("!p1-rest-template")
@FeignClient("quotes-service")
public interface QuoteRepository {
    @GetMapping("/api/quote")
    QuoteDto randomQuote();
}
