package com.testing.game.controller;

import com.testing.game.model.Message;
import com.testing.game.service.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Queue;

@Controller
public class ChatController
{
    private ChatService chatService;

    @GetMapping("/chat")
    public Queue<Message> getChat()
    {
       return chatService.getMessages();
    }

    @PutMapping("/chat")
    public void sendMessage(Message message)
    {

    }
}
