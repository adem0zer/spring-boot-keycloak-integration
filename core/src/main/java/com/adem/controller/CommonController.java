package com.adem.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(value = "/common", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class CommonController {

    @GetMapping(value = "helloWorld")
    @RolesAllowed({"admin", "user"})
    public Mono<ResponseEntity<String>> getHelloWorld() {
        return Mono.just(ResponseEntity.badRequest().body("Hello World!"));
    }

    @GetMapping(value = "roles")
    @RolesAllowed({"admin", "user"})
    public Flux<ResponseEntity<List<String>>> getRoles() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        List<String> roles = auth.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList();
        return Flux.just(ResponseEntity.badRequest().body(roles));
    }


}
