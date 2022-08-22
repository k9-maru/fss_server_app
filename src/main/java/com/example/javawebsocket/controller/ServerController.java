package com.example.javawebsocket.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping()
public class ServerController {
    private final static String initMSG = "[{\"symbol\":\"RLC\",\"thamChieu\":\"10000\",\"giaTran\":\"14000\",\"giaSan\":\"6000\",\"status\":\"create\",\"listTP\":[]}]";
    private final static String updateMSG = "[{\"symbol\":\"RLC\",\"thamChieu\":\"6800\",\"giaTran\":\"7400\",\"giaSan\":\"6200\",\"status\":\"update\",\"listTP\":[{\"top\":\"1\",\"ben\":\"Offer\",\"gia\":\"7200\",\"khoiLuong\":\"1900\"},{\"top\":\"1\",\"ben\":\"Bid\",\"gia\":\"6500\",\"khoiLuong\":\"800\"},{\"top\":\"2\",\"ben\":\"Offer\",\"gia\":\"7300\",\"khoiLuong\":\"1100\"},{\"top\":\"2\",\"ben\":\"Bid\",\"gia\":\"6400\",\"khoiLuong\":\"700\"},{\"top\":\"3\",\"ben\":\"Offer\",\"gia\":\"7400\",\"khoiLuong\":\"500\"},{\"top\":\"3\",\"ben\":\"Bid\",\"gia\":\"6300\",\"khoiLuong\":\"1500\"}]}]";

    @GetMapping(path = "stockInfo")
    public String testAPI() {
        return initMSG;
    }
}