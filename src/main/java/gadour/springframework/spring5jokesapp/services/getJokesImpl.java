package gadour.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class getJokesImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public getJokesImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJokes() {
        final String randomQuote = chuckNorrisQuotes.getRandomQuote();
        return randomQuote;
    }
}
