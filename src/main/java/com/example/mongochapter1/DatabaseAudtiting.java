package com.example.mongochapter1;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DatabaseAudtiting implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

//        Authentication authentication = SecurityContextHolder.getContext()
//                .getAuthentication();
        String uname = "system";
//        if (authentication != null) {
//            uname = authentication
//                    .getName();
//        }
        return Optional.of(uname);
    }
}