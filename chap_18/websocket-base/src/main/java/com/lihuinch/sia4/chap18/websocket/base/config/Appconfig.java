package com.lihuinch.sia4.chap18.websocket.base.config;

import com.lihuinch.sia4.chap18.websocket.base.handler.TestWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @author lihuinch
 * @date 2020/2/27 23:54
 */
@ComponentScan("com.lihuinch.sia4.chap18.websocket.base")
@Configuration
@EnableWebSocket
public class Appconfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(testWebSocketHandler(), "/marco").setAllowedOrigins("*");
    }

    @Bean
    public TestWebSocketHandler testWebSocketHandler() {
        return new TestWebSocketHandler();
    }
}
