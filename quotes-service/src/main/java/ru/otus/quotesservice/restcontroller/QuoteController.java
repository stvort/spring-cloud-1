package ru.otus.quotesservice.restcontroller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.quotesservice.model.Quote;
import ru.otus.quotesservice.service.QuoteService;


@Slf4j
@RequiredArgsConstructor
@RestController
public class QuoteController {

    private final QuoteService quoteService;

    @GetMapping("/api/quote")
    public Quote randomQuote(){
        log.info("Quote was requested");
        return quoteService.findRandom().orElseThrow();
    }
}
