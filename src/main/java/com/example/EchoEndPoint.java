package com.example;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class EchoEndPoint
{
    @OnMessage
    public void onMessage(Session session, String message)
    {
        try
        {
            for (Session sess : session.getOpenSessions())
            {
                if (sess.isOpen())
                {
                    sess.getBasicRemote().sendText(message);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
