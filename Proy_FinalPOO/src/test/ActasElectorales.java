/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package test;

import modelo.MesaElectoral;
/**
 *
 * @author Average
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;


public class ActasElectorales extends javax.swing.JPanel {

    private MesaElectoral mesaActual = new MesaElectoral();
    /**
     * Creates new form ActasElectorales
     */
    public ActasElectorales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JINumeroActa = new javax.swing.JLabel();
        JITitulo = new javax.swing.JLabel();
        JIFecha = new javax.swing.JLabel();
        JIHora = new javax.swing.JLabel();
        JtfNumeroActa = new javax.swing.JTextField();
        JtfTitulo = new javax.swing.JTextField();
        JtfFecha = new javax.swing.JTextField();
        JtfHora = new javax.swing.JTextField();
        JINumeroMesa = new javax.swing.JLabel();
        JILugar = new javax.swing.JLabel();
        JtfLugar = new javax.swing.JTextField();
        JIVotosNulos = new javax.swing.JLabel();
        JIVotosBlancos = new javax.swing.JLabel();
        JtfVotosBlancos = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        JtfNumeroMesa = new javax.swing.JTextField();
        JtfVotosNulos = new javax.swing.JTextField();
        JIVotosPreferenciales = new javax.swing.JLabel();
        JtfVotosPreferenciales = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("Vista Acta Electoral");

        JINumeroActa.setText("Numero de Acta Unico:");

        JITitulo.setText("Titulo:");

        JIFecha.setText("Fecha:");

        JIHora.setText("Hora:");

        JtfNumeroActa.setText("numero acta unico");
        JtfNumeroActa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfNumeroActaActionPerformed(evt);
            }
        });

        JtfTitulo.setText("titulo");
        JtfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfTituloActionPerformed(evt);
            }
        });

        JtfFecha.setText("Fecha");
        JtfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfFechaActionPerformed(evt);
            }
        });

        JtfHora.setText("Hora");
        JtfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfHoraActionPerformed(evt);
            }
        });

        JINumeroMesa.setText("Numero de mesa:");

        JILugar.setText("Lugar:");

        JtfLugar.setText("lugar");
        JtfLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfLugarActionPerformed(evt);
            }
        });

        JIVotosNulos.setText("Votos Nulos:");

        JIVotosBlancos.setText("Votos Blancos:");

        JtfVotosBlancos.setText("votos blancos");
        JtfVotosBlancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfVotosBlancosActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        JtfNumeroMesa.setText("Numero mesa");
        JtfNumeroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfNumeroMesaActionPerformed(evt);
            }
        });

        JtfVotosNulos.setText("Votos nulos");
        JtfVotosNulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfVotosNulosActionPerformed(evt);
            }
        });

        JIVotosPreferenciales.setText("Votos Preferenciales:");

        JtfVotosPreferenciales.setText("votos preferenciales");

        jLabel3.setText("Votos Totales:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero de Acta Unico", "Titulo", "Fecha", "Hora", "Numero de mesa", "Lugar", "Votos Nulos", "Votos Blancos", "Votos Preferenciales", "Votos Totales"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTextField1.setText("Votos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnRegistrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JINumeroActa)
                            .addComponent(JtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JINumeroMesa))
                            .addComponent(JtfNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfNumeroActa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(JITitulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JIVotosBlancos))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(173, 173, 173)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JIVotosNulos)
                                        .addComponent(JtfVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(JtfVotosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JIHora)
                                    .addComponent(JIFecha))
                                .addGap(140, 140, 140)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JtfLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JIVotosPreferenciales)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JILugar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(JtfVotosPreferenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JINumeroActa)
                            .addComponent(JIVotosNulos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfNumeroActa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JITitulo)
                            .addComponent(JIVotosBlancos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfVotosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JIFecha)
                            .addComponent(JIVotosPreferenciales))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfVotosPreferenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JIHora)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JINumeroMesa)
                            .addComponent(JILugar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtfNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrar)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JtfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfTituloActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
    String numeroActa = JtfNumeroActa.getText();
    String titulo = JtfTitulo.getText();
    String fecha = JtfFecha.getText();
    String hora = JtfHora.getText();
    String numeroMesa = JtfNumeroMesa.getText();
    String lugar = JtfLugar.getText();

    int votosNulos = Integer.parseInt(JtfVotosNulos.getText());
    int votosBlancos = Integer.parseInt(JtfVotosBlancos.getText());
    int votosPreferenciales = Integer.parseInt(JtfVotosPreferenciales.getText());

    
    int totalVotos = votosNulos + votosBlancos + votosPreferenciales;

    
    jTextField1.setText(String.valueOf(totalVotos));

    
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();

    Object[] fila = new Object[10];
    fila[0] = numeroActa;
    fila[1] = titulo;
    fila[2] = fecha;
    fila[3] = hora;
    fila[4] = numeroMesa;
    fila[5] = lugar;
    fila[6] = votosNulos;
    fila[7] = votosBlancos;
    fila[8] = votosPreferenciales;
    fila[9] = totalVotos;

    modelo.addRow(fila); 




        
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void JtfNumeroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfNumeroMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfNumeroMesaActionPerformed

    private void JtfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfHoraActionPerformed

    private void JtfNumeroActaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfNumeroActaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfNumeroActaActionPerformed

    private void JtfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfFechaActionPerformed

    private void JtfLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfLugarActionPerformed

    private void JtfVotosBlancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfVotosBlancosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfVotosBlancosActionPerformed

    private void JtfVotosNulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfVotosNulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfVotosNulosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JIFecha;
    private javax.swing.JLabel JIHora;
    private javax.swing.JLabel JILugar;
    private javax.swing.JLabel JINumeroActa;
    private javax.swing.JLabel JINumeroMesa;
    private javax.swing.JLabel JITitulo;
    private javax.swing.JLabel JIVotosBlancos;
    private javax.swing.JLabel JIVotosNulos;
    private javax.swing.JLabel JIVotosPreferenciales;
    private javax.swing.JTextField JtfFecha;
    private javax.swing.JTextField JtfHora;
    private javax.swing.JTextField JtfLugar;
    private javax.swing.JTextField JtfNumeroActa;
    private javax.swing.JTextField JtfNumeroMesa;
    private javax.swing.JTextField JtfTitulo;
    private javax.swing.JTextField JtfVotosBlancos;
    private javax.swing.JTextField JtfVotosNulos;
    private javax.swing.JTextField JtfVotosPreferenciales;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
