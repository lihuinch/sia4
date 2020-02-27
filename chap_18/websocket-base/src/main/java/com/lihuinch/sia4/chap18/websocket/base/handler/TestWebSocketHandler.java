package com.lihuinch.sia4.chap18.websocket.base.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * @author lihuinch
 * @date 2020/2/27 23:55
 */
public class TestWebSocketHandler extends AbstractWebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("afterConnectionEstablished");

        session.sendMessage(new TextMessage("Server connection established!"));
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println("handleTextMessage");

        String msg = message.getPayload();
        System.out.println("message = " + msg);

        session.sendMessage(new TextMessage("Polo!"));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("handleTransportError");
        exception.printStackTrace();
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("afterConnectionClosed");
        System.out.println("status = " + status);

        session.sendMessage(new TextMessage("Server connection closed!"));
    }
}
