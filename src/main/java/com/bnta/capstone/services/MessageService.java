package com.bnta.capstone.services;


import com.bnta.capstone.models.Message;
import com.bnta.capstone.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> findAllMessages(){
        return this.messageRepository.findAll();
    }

}
