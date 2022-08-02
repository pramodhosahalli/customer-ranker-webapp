package com.rank.customerranker.controller;

import com.rank.customerranker.entity.Content;
import com.rank.customerranker.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {

    @Autowired
    ContentRepository contentRepository;

    @GetMapping("/getAllSongs")
    public ResponseEntity<List<Content>> getAllSongs(){
        return ResponseEntity.ok(contentRepository.findAll());
    }
}
