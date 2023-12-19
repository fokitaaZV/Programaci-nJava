/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rutserver.rutclient;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author javii
 */
public class clientManager {

    protected String IP;
    protected int port;
    protected Socket socket;
    protected DataInputStream input;

    public clientManager(String IP, int port) {
        this.IP = IP;
        this.port = port;
    }

    public void connectToServer() throws IOException {
        socket = new Socket(IP, port);
        input = new DataInputStream(socket.getInputStream());

    }

    public String receiveMessage() throws IOException {
        return input.readUTF();
    }
}
