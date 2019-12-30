package com.testing.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicTacToeController
{
    @GetMapping("/tictactoe")
    public String getTicTacToe()
    {
        return "tictactoe";
    }
}
