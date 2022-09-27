package com.example.linkissue;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResourceController {

    @GetMapping(path = "/myresource")
    public ResponseEntity<String> getMyResource(@RequestParam(value = "requiredparam") String requiredparam,
                                                @RequestParam(value = "optionalparam", required = false) String optionalparam) {

        return ResponseEntity.ok("my resource");
    }
}
