package com.example;

import java.io.IOException;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

@WebSocket
public class EchoEndPoint
{
    @OnWebSocketMessage
    public void onMessage(Session session, String message) throws IOException
    {
        session.getRemote().sendString(message);
    }
}
