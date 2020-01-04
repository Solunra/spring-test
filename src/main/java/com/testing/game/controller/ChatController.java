package com.testing.game.controller;

import com.testing.game.model.Message;
import com.testing.game.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class ChatController
{
    @Autowired
    private ChatService chatService;

    @GetMapping("/chat")
    public List<Message> getChat()
    {
       return chatService.getMessages();
    }

    @PutMapping("/chat")
    public void sendMessage(Message message)
    {
        chatService.sendMessages(message);
    }
}
