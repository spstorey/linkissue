package com.example.linkissue;

import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class RootController {

    @GetMapping(path = "/myresource")
    public ResponseEntity<String> getMyResource(@RequestParam(value = "requiredparam") String requiredparam,
                                                @RequestParam(value = "optionalparam", required = false) String optionalparam) {

        UriComponentsBuilder builder = linkTo(methodOn(RootController.class).getMyResource(null, null)).toUriComponentsBuilder();

        return ResponseEntity.ok("Done");
    }
}
