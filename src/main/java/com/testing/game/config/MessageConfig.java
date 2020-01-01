package com.testing.game.config;

import com.testing.game.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

@Component
public class MessageConfig {

    @Bean("messages")
    public Queue<Message> obtainMessages()
    {
        Queue<Message> messages = new PriorityQueue<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(getResources())))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] messagePart = line.split(";");
                messages.add(new Message(messagePart[0], messagePart[1]));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return messages;
    }

    private File getResources()
    {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("messageHistory.txt");
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
}
