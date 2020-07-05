/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author Usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInformacion = new javax.swing.JList<>();
        txtInformacion = new javax.swing.JTextField();
        btnMostrarInformacion = new javax.swing.JButton();
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

        btnArchivosOcultos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnArchivosOcultos.setText("Listar Archivos ocultos");

        btnDirectoriosOcultos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDirectoriosOcultos.setText("Listar Directorios Ocultos");

        jScrollPane1.setViewportView(lstInformacion);

        txtInformacion.setEditable(false);

        btnMostrarInformacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMostrarInformacion.setText("Mostrar Información");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(lbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(btnListarDirectorio)
                            .addGap(40, 40, 40)
                            .addComponent(btnArchivosOcultos)
                            .addGap(36, 36, 36)
                            .addComponent(btnDirectoriosOcultos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtInformacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnMostrarInformacion)
                .addGap(33, 33, 33))
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(10, 10, 610, 420);

        gestionarDirectorioMenu.setMnemonic('f');
        gestionarDirectorioMenu.setText("Gestionar Directorio");

        crearDirectorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        crearDirectorioMenuItem.setMnemonic('o');
        crearDirectorioMenuItem.setText("Crear");
        gestionarDirectorioMenu.add(crearDirectorioMenuItem);

        eliminarDirectorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarDirectorioMenuItem.setMnemonic('s');
        eliminarDirectorioMenuItem.setText("Eliminar");
        gestionarDirectorioMenu.add(eliminarDirectorioMenuItem);

        renombrarDirectorioMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        renombrarDirectorioMenuItem.setMnemonic('a');
        renombrarDirectorioMenuItem.setText("Renombrar");
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
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRuta;
    private javax.swing.JList<String> lstInformacion;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem renombrarDirectorioMenuItem;
    private javax.swing.JMenuItem salirMenuItem;
    private javax.swing.JTextField txtInformacion;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables

}
