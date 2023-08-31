package ru.otus.webapp.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.webapp.dto.QuoteDto;
import ru.otus.webapp.service.QuoteService;

@RestController
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/api/quote")
    public QuoteDto randomQuote() {
        return quoteService.findRandom();
    }
}
