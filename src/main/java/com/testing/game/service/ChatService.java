package com.testing.game.service;

import com.testing.game.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Queue;

@Service
public class ChatService {

    @Autowired
    Queue<Message> messages;

    public Queue<Message> getMessages()
    {
        return messages;
    }

    public void sendMessages(Message message)
    {
        if (messages.size() >= 10) {
            messages.remove();
        }
        messages.add(message);
    }
}
