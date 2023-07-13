package vista;

public class VistaLogin extends javax.swing.JFrame {

    public VistaLogin() {
        initComponents();
        lookAndFeel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl_login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txtFld_usuario = new javax.swing.JTextField();
        lbl_clave = new javax.swing.JLabel();
        bttn_iniciarSesion = new javax.swing.JButton();
        psswrdFld_clave = new javax.swing.JPasswordField();
        chckBox_recordarSesion = new javax.swing.JCheckBox();
        lbl_foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(1220, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mi proyecto.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Unidad Médica");

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addContainerGap(956, Short.MAX_VALUE))
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addGroup(pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(pnl_headerLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        pnl_login.setBackground(new java.awt.Color(255, 255, 255));
        pnl_login.setPreferredSize(new java.awt.Dimension(450, 540));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_usuario.setText("Usuario");

        txtFld_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFld_usuario.setPreferredSize(new java.awt.Dimension(71, 30));

        lbl_clave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_clave.setText("Clave");

        bttn_iniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_iniciarSesion.setText("INICIAR SESIÓN");
        bttn_iniciarSesion.setPreferredSize(new java.awt.Dimension(75, 35));

        psswrdFld_clave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        psswrdFld_clave.setPreferredSize(new java.awt.Dimension(90, 30));

        chckBox_recordarSesion.setText("Recordar sesión");

        javax.swing.GroupLayout pnl_loginLayout = new javax.swing.GroupLayout(pnl_login);
        pnl_login.setLayout(pnl_loginLayout);
        pnl_loginLayout.setHorizontalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_loginLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(160, 160, 160))
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chckBox_recordarSesion)
                    .addGroup(pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_clave)
                        .addComponent(lbl_usuario)
                        .addComponent(txtFld_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttn_iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(psswrdFld_clave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_loginLayout.setVerticalGroup(
            pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_loginLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFld_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbl_clave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(psswrdFld_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(chckBox_recordarSesion)
                .addGap(32, 32, 32)
                .addComponent(bttn_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        lbl_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unidadMedica.jpg"))); // NOI18N
        getContentPane().add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void lookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_iniciarSesion;
    private javax.swing.JCheckBox chckBox_recordarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_clave;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_login;
    private javax.swing.JPasswordField psswrdFld_clave;
    private javax.swing.JTextField txtFld_usuario;
    // End of variables declaration//GEN-END:variables
}
