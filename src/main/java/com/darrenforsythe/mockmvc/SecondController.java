package com.darrenforsythe.mockmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/second/{id}")
public class SecondController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping
    public ResponseEntity<?> getXXX(
            @PathVariable String id,
            @RequestParam(value = "status") String status,
            @RequestParam(value = "comment") String comment,
            @RequestParam(value = "other") Optional<String> other) {
        log.info("Requested getXXX id={} status={} other={} comment={}", id, status, other, comment);

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}