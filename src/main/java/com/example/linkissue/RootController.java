package com.example.linkissue;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class RootController {

    @GetMapping(path = "/")
    public ResponseEntity<RootResource> root() {

        RootResource r = new RootResource();

        UriComponentsBuilder builder = linkTo(methodOn(MyResourceController.class).getMyResource(null, null)).toUriComponentsBuilder();

        r.add(linkTo(methodOn(MyResourceController.class).getMyResource(null, null)).withRel("myResource"));

        return ResponseEntity.ok(r);
    }
}
