package ru.otus.webapp.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import ru.otus.webapp.dto.QuoteDto;

@Profile("p1-rest-template")
@Repository
public class QuoteRepositoryRestTemplate implements QuoteRepository {

    private final String quotesServiceUrl;
    private final RestTemplate restTemplate;

    public QuoteRepositoryRestTemplate(@Value("${app.quotes-service-url}/api/quote") String quotesServiceUrl,
                                       RestTemplate restTemplate) {
        this.quotesServiceUrl = quotesServiceUrl;
        this.restTemplate = restTemplate;
    }

    @Override
    public QuoteDto randomQuote() {
        return restTemplate.getForObject(quotesServiceUrl, QuoteDto.class);
    }
}
