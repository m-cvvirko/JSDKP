package pl.achp.sinktools.service;

import pl.achp.sinktools.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageService {

    @Autowired
    private MessageRepository messageRepository;
}
