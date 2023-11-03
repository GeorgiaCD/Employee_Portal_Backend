package com.bnta.capstone.controllers;

import com.bnta.capstone.models.Message;
import com.bnta.capstone.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    MessageService messageService;

    //    INDEX
    @GetMapping
    public ResponseEntity<List<Message>> getMessages(){
        return new ResponseEntity<>(messageService.findAllMessages(), HttpStatus.OK);
    }
}
