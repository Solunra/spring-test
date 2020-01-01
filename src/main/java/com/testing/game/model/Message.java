package com.testing.game.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Message {

    private String username;
    private String message;

    public Message(String username, String message)
    {
        this.username = username;
        this.message = message;
    }
}
