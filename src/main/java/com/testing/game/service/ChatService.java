package com.testing.game.service;

import com.testing.game.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    @Autowired
    List<Message> messages;

    public List<Message> getMessages()
    {
        return messages;
    }

    public void sendMessages(Message message)
    {
        if (messages.size() >= 10) {
            messages.remove(0);
        }
        messages.add(message);
    }
}
