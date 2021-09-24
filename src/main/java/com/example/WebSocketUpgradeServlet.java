package com.example;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

public class WebSocketUpgradeServlet extends WebSocketServlet
{
    @Override
    public void configure(WebSocketServletFactory webSocketServletFactory)
    {
        webSocketServletFactory.setCreator((req, resp) -> new EchoEndPoint());
    }
}
