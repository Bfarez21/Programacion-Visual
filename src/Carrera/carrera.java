/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrera;

import static java.lang.Math.random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class carrera extends Thread {

    // variables
    private JLabel etiqueta;
    private JLabel Jlprimero;
    private JLabel Jlsegundo;
    private pista bike;

    private ImageIcon imagenGanadorPrimeraBike;
    private ImageIcon imagenGanadorSegundaBike;

    // constructor
    public carrera(JLabel etiqueta, JLabel Jlprimero, JLabel Jlsegundo,pista bike) {
        this.etiqueta = etiqueta;
        this.Jlprimero = Jlprimero;
        this.Jlsegundo = Jlsegundo;
        this.bike = bike;
        
         // Cargar las imágenes de las bicicletas
    imagenGanadorPrimeraBike = new ImageIcon("src/Imagen/bike1.png");
    imagenGanadorSegundaBike = new ImageIcon("src/Imagen/bike2.png");
    }

    @Override
    public void run() {
        int bike1 = 0;
        int bike2 = 0;

        while (true) {
            try {
                // casteo y num aleatorios
                sleep((int) (Math.random() * 1000));
                // obtengo ubicacion en eje x
                bike1 = bike.getPrimerBike().getLocation().x;
                bike2 = bike.getSegundoBike().getLocation().x;

                if (bike1 < bike.getMeta().getLocation().x - 97 && bike2 < bike.getMeta().getLocation().x - 97) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    bike.repaint();
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            if (etiqueta.getLocation().x >= bike.getMeta().getLocation().x - 97) {
                if (bike1 > bike2) {
                    //JOptionPane.showMessageDialog(null, "Gano la primera motocicleta");
                   // Jlprimero.setText("Ganador");
                    Jlprimero.setIcon(imagenGanadorPrimeraBike);
                    Jlsegundo.setIcon(imagenGanadorSegundaBike);
                    
                } else if (bike2 > bike1) {
                   // JOptionPane.showMessageDialog(null, "Gano la segunda motocicleta");
                   // Jlprimero.setText("Ganador la bike 2");
                    Jlprimero.setIcon(imagenGanadorSegundaBike);
                    Jlsegundo.setIcon(imagenGanadorPrimeraBike);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "--------> EMPATE <-------");
                    empate();
                    break;
                }
            }
        }
    }
    public void empate(){
        Jlprimero.setIcon(null);
        Jlsegundo.setIcon(null);
    }
}
