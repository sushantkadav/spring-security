package in.avenues.springsecurity.security.validator;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class TokenValidator {
    //@TODO Replace this with database storage

    private Set<String> tokens = new HashSet();

    public void add(String token){
        tokens.add(token);
    }

    public boolean contains(String token){
        return tokens.contains(token);
    }
}
