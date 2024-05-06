package com.gft.achpayments.sinktools.service;

import com.gft.achpayments.sinktools.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageService {

    @Autowired
    private MessageRepository messageRepository;
}
