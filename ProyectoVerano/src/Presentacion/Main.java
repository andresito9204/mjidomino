/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Logica.Comunicacion;

//import Logica.Comunicacion;
/**
 *
 * @author Isra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Comunicacion.solicitarInicializarEstruturas();
        Comunicacion.solicitarCargaArchivo();
        Comunicacion.ImprimirListaUsuario();
        Comunicacion.solicitarGuardarArchivo();

        new VentanaLogin().setVisible(true);
    }

}
