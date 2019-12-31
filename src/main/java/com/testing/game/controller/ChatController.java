package com.testing.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController
{
    @GetMapping("/chat")
    public String getTicTacToe()
    {
        return "chat";
    }
}