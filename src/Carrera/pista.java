/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrera;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Bryan F
 */
public class pista extends javax.swing.JFrame {

    /**
     * Creates new form pista
     */
    public pista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Carrera de Motocross");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        primer_bike = new javax.swing.JLabel();
        segundo_bike = new javax.swing.JLabel();
        meta = new javax.swing.JLabel();
        Jlprimero = new javax.swing.JLabel();
        Jlsegundo = new javax.swing.JLabel();
        podium = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        logo2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        logo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        primer_bike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/bike1.png"))); // NOI18N
        jPanel1.add(primer_bike, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        segundo_bike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/bike2.png"))); // NOI18N
        jPanel1.add(segundo_bike, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, -1));

        meta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/meta.jpg"))); // NOI18N
        jPanel1.add(meta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 69, 270));
        jPanel1.add(Jlprimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 194, 120, 100));
        jPanel1.add(Jlsegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 110, 100));

        podium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/podium.png"))); // NOI18N
        jPanel1.add(podium, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 280, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/desierto.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1060, -1));

        Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/start.png"))); // NOI18N
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 192, 60));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/logo2.jpg"))); // NOI18N
        getContentPane().add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 140, 110));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -20, 770, 130));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/exit.jpg"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 180, 50));

        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/logo2.jpg"))); // NOI18N
        logo3.setText("jLabel1");
        getContentPane().add(logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getPrimerBike(){
        return primer_bike;
    }
    
    public JLabel getSegundoBike(){
        return segundo_bike;
    }
    
    public JLabel getMeta(){
        return meta;
    }
    
    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        //System.out.println(primer_bike.getLocation().x);
        primer_bike.setLocation(0, primer_bike.getLocation().y);
        segundo_bike.setLocation(0, segundo_bike.getLocation().y);
        
         
        carrera bike1 = new carrera(primer_bike,Jlprimero, Jlsegundo, this);
        carrera bike2 = new carrera(segundo_bike,Jlprimero, Jlsegundo, this); 
       
        
        bike1.start();
        bike2.start();
    }//GEN-LAST:event_IniciarActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel Jlprimero;
    private javax.swing.JLabel Jlsegundo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logo3;
    private javax.swing.JLabel meta;
    private javax.swing.JLabel podium;
    private javax.swing.JLabel primer_bike;
    private javax.swing.JLabel segundo_bike;
    // End of variables declaration//GEN-END:variables
}
