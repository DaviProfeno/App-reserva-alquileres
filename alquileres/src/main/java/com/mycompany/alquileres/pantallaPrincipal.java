/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.alquileres;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author David
 */
public class pantallaPrincipal extends javax.swing.JFrame {

    private javax.swing.JLabel labelImagen;

    /**
     * Creates new form pantallaPrincipal
     */
    public pantallaPrincipal() throws MalformedURLException {
        initComponents();
        setTitle("SmartOcupation - Consulta de Alquileres");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creamos la imagen de fondo de la pantalla principal
        labelImagen = new javax.swing.JLabel();
        try {
            File file = new File("C:\\Users\\magan\\OneDrive\\Documentos\\NetBeansProjects\\alquileres\\src\\main\\java\\com\\mycompany\\alquileres\\CasaAlquiler.jpg");
            String absolutePath = file.toURI().toURL().toString();
            labelImagen.setIcon(new ImageIcon(new URL(absolutePath)));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        labelImagen.setBounds(0, 0, 600, 600);
        getContentPane().add(labelImagen);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVivienda = new javax.swing.JButton();
        botonCliente = new javax.swing.JButton();
        botonAlquiler = new javax.swing.JButton();
        bontonSalir = new javax.swing.JButton();
        consultarAlquileres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVivienda.setText("Registra una vivienda");
        botonVivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonViviendaActionPerformed(evt);
            }
        });

        botonCliente.setText("Registra un cliente");
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        botonAlquiler.setText("Registra un alquiler");
        botonAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlquilerActionPerformed(evt);
            }
        });

        bontonSalir.setText("Salir");
        bontonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonSalirActionPerformed(evt);
            }
        });

        consultarAlquileres.setText("Consultar alquileres");
        consultarAlquileres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAlquileresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bontonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVivienda)
                    .addComponent(botonCliente))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAlquiler)
                    .addComponent(consultarAlquileres))
                .addGap(30, 30, 30)
                .addComponent(bontonSalir)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonViviendaActionPerformed
        SwingUtilities.invokeLater(() -> {
            viviendaApp viviendaApp = new viviendaApp();
            viviendaApp.setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_botonViviendaActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        SwingUtilities.invokeLater(() -> {
            clienteApp clienteApp = new clienteApp();
            clienteApp.setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_botonClienteActionPerformed

    private void bontonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonSalirActionPerformed
    System.exit(0);
  
    }//GEN-LAST:event_bontonSalirActionPerformed

    private void botonAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilerActionPerformed
        SwingUtilities.invokeLater(() -> {
            AlquilerApp pantallaAlquiler = new AlquilerApp();
            pantallaAlquiler.setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_botonAlquilerActionPerformed

    private void consultarAlquileresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAlquileresActionPerformed
       SwingUtilities.invokeLater(() -> {
           consultaAlquiler pantallaConsultaAlquiler = new consultaAlquiler();
            pantallaConsultaAlquiler.setVisible(true);
            dispose();
           
        });
    }//GEN-LAST:event_consultarAlquileresActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pantallaPrincipal().setVisible(true);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(pantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bontonSalir;
    private javax.swing.JButton botonAlquiler;
    private javax.swing.JButton botonCliente;
    private javax.swing.JButton botonVivienda;
    private javax.swing.JButton consultarAlquileres;
    // End of variables declaration//GEN-END:variables
}
