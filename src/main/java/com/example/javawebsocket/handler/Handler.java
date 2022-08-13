package com.example.javawebsocket.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
@CrossOrigin
public class Handler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println(message.getPayload());
        if(message.getPayload().equals("init")){
            System.out.println("client init");
            session.sendMessage(new TextMessage("INIT DATA FROM SERVER!"));
        }
        else if(message.getPayload().equals("update")){
            System.out.println("client update");
            session.sendMessage(new TextMessage("UPDATE DATA..."));
        }
    }
}
