package com.example.javawebsocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketBrokerController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

//    @MessageMapping("/broker")
//    @SendTo("/topic/messages")
//    public String randomMSG(String param) {
//        //handle message
//        System.out.println(param);
//        return "AAAAAA";
//    }

    @MessageMapping("/broker")
    public void sendMSG(){
        // send custom message
        simpMessagingTemplate.convertAndSend("/topic/messages","AAAAA");
    }
}
