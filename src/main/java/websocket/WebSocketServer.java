package websocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class WebSocketServer {
    private Set<WebSocketConnection> connections;

    public WebSocketServer() {
        connections = new HashSet<>();
    }

    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("WebSocket server started on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                WebSocketConnection connection = new WebSocketConnection(socket, this);
                connection.start();
                connections.add(connection);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcastMessage(String message, WebSocketConnection sender) {
        for (WebSocketConnection connection : connections) {
            if (connection != sender) {
                connection.sendMessage(message);
            }
        }
    }

    public void removeConnection(WebSocketConnection connection) {
        connections.remove(connection);
    }

    public static void main(String[] args) {
        WebSocketServer server = new WebSocketServer();
        server.start(8082);
    }
}