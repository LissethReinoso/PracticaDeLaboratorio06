/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Lisseth Reinoso
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    public ControladorDirectorio controladorDirectorio;
     DefaultListModel lista;
     DefaultListModel listaInf;
    public VentanaPrincipal() {
        initComponents();
        controladorDirectorio=new ControladorDirectorio();
        lista=new DefaultListModel();
        lstInformacion.setModel(lista);
        listaInf=new DefaultListModel();
        lstInformacion.setModel(listaInf);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lbRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnListarDirectorio = new javax.swing.JButton();
        btnArchivosOcultos = new javax.swing.JButton();
        btnDirectoriosOcultos = new javax.swing.JButton();
        btnMostrarInformacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstInformacion = new javax.swing.JList<>();
        txtInf = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        gestionarDirectorioMenu = new javax.swing.JMenu();
        crearDirectorioMenuItem = new javax.swing.JMenuItem();
        eliminarDirectorioMenuItem = new javax.swing.JMenuItem();
        renombrarDirectorioMenuItem = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbRuta.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lbRuta.setText("RUTA:");

        btnListarDirectorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnListarDirectorio.setText("Listar Directorios");
        btnListarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectorioActionPerformed(evt);
            }
        });

        btnArchivosOcultos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnArchivosOcultos.setText("Listar Archivos ocultos");
        btnArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivosOcultosActionPerformed(evt);
            }
        });

        btnDirectoriosOcultos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoriosOcultosActionPerformed(evt);
            }
        });

        btnMostrarInformacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMostrarInformacion.setText("Mostrar Información");
        btnMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInformacionActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstInformacion);

        txtInf.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(txtInf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnMostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(btnListarDirectorio)
                            .addGap(40, 40, 40)
                            .addComponent(btnArchivosOcultos)
                            .addGap(36, 36, 36)
                            .addComponent(btnDirectoriosOcultos))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarDirectorio)
                    .addComponent(btnArchivosOcultos)
                    .addComponent(btnDirectoriosOcultos))
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarInformacion)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(20, 10, 630, 420);

        gestionarDirectorioMenu.setMnemonic('f');
        gestionarDirectorioMenu.setText("Gestionar Directorio");

        crearDirectorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        crearDirectorioMenuItem.setMnemonic('o');
        crearDirectorioMenuItem.setText("Crear");
        crearDirectorioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDirectorioMenuItemActionPerformed(evt);
            }
        });
        gestionarDirectorioMenu.add(crearDirectorioMenuItem);

        eliminarDirectorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarDirectorioMenuItem.setMnemonic('s');
        eliminarDirectorioMenuItem.setText("Eliminar");
        eliminarDirectorioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDirectorioMenuItemActionPerformed(evt);
            }
        });
        gestionarDirectorioMenu.add(eliminarDirectorioMenuItem);

        renombrarDirectorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        renombrarDirectorioMenuItem.setMnemonic('a');
        renombrarDirectorioMenuItem.setText("Renombrar");
        renombrarDirectorioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renombrarDirectorioMenuItemActionPerformed(evt);
            }
        });
        gestionarDirectorioMenu.add(renombrarDirectorioMenuItem);

        salirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        salirMenuItem.setMnemonic('x');
        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        gestionarDirectorioMenu.add(salirMenuItem);

        menuBar.add(gestionarDirectorioMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void btnListarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectorioActionPerformed
        // TODO add your handling code here:
         String ruta = txtRuta.getText();
         String direc=lstInformacion.getSelectedValue();
        List<String> directorios = controladorDirectorio.listarDirectorios(ruta);
        List<String> archivos = controladorDirectorio.listarArchivos(ruta);
        if (lista.isEmpty()) {
            for (String directorio : directorios) {
                lista.addElement(directorio);
            }
            for (String archivo : archivos) {
                lista.addElement(archivo);
            }
        } else {
            int elitodo = lstInformacion.getSelectedIndex();
            lista.removeAllElements();
            btnListarDirectorioActionPerformed(evt);
        }
        
    }//GEN-LAST:event_btnListarDirectorioActionPerformed

    private void btnArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivosOcultosActionPerformed

        String ruta = txtRuta.getText();
        List<String> archivos = controladorDirectorio.listarArchivosOcultos(ruta);
        if (archivos.isEmpty()) {
            for (String archivo : archivos) {
                archivos.add(archivo);
            }
        } else {
            int elitodo = lstInformacion.getSelectedIndex();
            lista.removeAllElements();
        }
    }//GEN-LAST:event_btnArchivosOcultosActionPerformed

    private void btnMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInformacionActionPerformed
         String ruta = txtRuta.getText();
         
         String opc = lstInformacion.getSelectedValue();
            
         String informacion=  controladorDirectorio.mostrarInformacion(opc);
         
         txtInf.setText(informacion);
       
    }//GEN-LAST:event_btnMostrarInformacionActionPerformed

    private void btnDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoriosOcultosActionPerformed
        // TODO add your handling code here:
         String ruta = txtRuta.getText();
        List<String> directorios = controladorDirectorio.listarDirectoriosOcultos(ruta);
        if (lista.isEmpty()) {
            for (String directorio : directorios) {
                lista.addElement(directorio);
            }
        } else {
            int elitodo = lstInformacion.getSelectedIndex();
            lista.removeAllElements();
        }
        
       /* String ruta = txtRuta.getText();
        List<String> directoriosOcultos = controladorDirectorio.listarArchivosOcultos(ruta);
        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "La ruta está vacía, por favor llenela");
        } else {
                if (!directoriosOcultos.isEmpty()) {
                   for (String directorio : directoriosOcultos) {
                   lista.addElement(directorio);
                   }
            }
        }*/
    }//GEN-LAST:event_btnDirectoriosOcultosActionPerformed

    private void crearDirectorioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDirectorioMenuItemActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showInputDialog("Nombre del nuevo directorio: ");
        String nuevo="";
        String ruta = txtRuta.getText();
        if("".equals(nuevo)){
            JOptionPane.showMessageDialog(this,"La ruta está vacía, por favor llenela.");
        }else{
            controladorDirectorio.crearDirectorio(nuevo);
           
           
            // List<String> directorio = controladorDirectorio.lista;
           //  lstInformacion.setModel((ListModel<String>) controladorDirectorio.listarDirectorios());
             
        } 

        
        
    }//GEN-LAST:event_crearDirectorioMenuItemActionPerformed

    private void eliminarDirectorioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDirectorioMenuItemActionPerformed
        // TODO add your handling code here:
         int archeli = lstInformacion.getSelectedIndex();
        String eliminar=" ";
        eliminar = lista.get(archeli)+"";
        controladorDirectorio.eliminarDirectorio(eliminar);
        
        
    }//GEN-LAST:event_eliminarDirectorioMenuItemActionPerformed

    private void renombrarDirectorioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renombrarDirectorioMenuItemActionPerformed
        // TODO add your handling code here:
        
        int archren = lstInformacion.getSelectedIndex();
        String renombrarActual=" ";
        String renombre=" ";
        renombrarActual = lista.get(archren)+"";
        String renombrarNuevo=" ";
        renombre = JOptionPane.showInputDialog("Escriba el nombre del nuevo directorio");
        if(!"".equals(renombre)){
            renombrarNuevo = txtRuta.getText();
        controladorDirectorio.renombrarDirectorio(renombrarActual, renombrarNuevo);
        }
       
    }//GEN-LAST:event_renombrarDirectorioMenuItemActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivosOcultos;
    private javax.swing.JButton btnDirectoriosOcultos;
    private javax.swing.JButton btnListarDirectorio;
    private javax.swing.JButton btnMostrarInformacion;
    private javax.swing.JMenuItem crearDirectorioMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem eliminarDirectorioMenuItem;
    private javax.swing.JMenu gestionarDirectorioMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbRuta;
    private javax.swing.JList<String> lstInformacion;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem renombrarDirectorioMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JTextField txtInf;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

}
