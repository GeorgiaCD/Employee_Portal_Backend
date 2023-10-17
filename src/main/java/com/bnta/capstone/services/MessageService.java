package com.bnta.capstone.services;


import com.bnta.capstone.models.Message;
import com.bnta.capstone.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> findAllMessages(){
        return this.messageRepository.findAll();
    }

}
