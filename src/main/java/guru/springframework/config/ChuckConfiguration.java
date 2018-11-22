package guru.springframework.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by sergei on 11/08/2018.
 */
//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
