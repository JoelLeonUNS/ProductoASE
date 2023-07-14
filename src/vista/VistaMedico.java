package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentador.PresentadorGeneral;

public class VistaMedico extends javax.swing.JFrame implements ActionListener {

    private PresentadorGeneral pGeneral;
    
    public VistaMedico(PresentadorGeneral pGeneral) {
        this.pGeneral = pGeneral;
        initComponents();
    }
    
    public void iniciar() {
        pack();
        this.bttn_historiasClinicas.addActionListener(this);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);// visualiza la ventana
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttn_cerrarSesion = new javax.swing.JButton();
        PanelMedico = new javax.swing.JPanel();
        bttn_historiasClinicas = new javax.swing.JButton();
        bttn_examenes = new javax.swing.JButton();
        bttn_informes = new javax.swing.JButton();
        pnl_header = new javax.swing.JPanel();
        lbl_nombreApellido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttn_cerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_cerrarSesion.setText("Cerrar Sesión");
        bttn_cerrarSesion.setBorderPainted(false);
        bttn_cerrarSesion.setContentAreaFilled(false);
        bttn_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_cerrarSesion.setPreferredSize(new java.awt.Dimension(250, 70));
        getContentPane().add(bttn_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        PanelMedico.setBackground(new java.awt.Color(204, 204, 204));
        PanelMedico.setPreferredSize(new java.awt.Dimension(1280, 620));
        PanelMedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        bttn_historiasClinicas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_historiasClinicas.setText("Historias Clínicas");
        bttn_historiasClinicas.setBorderPainted(false);
        bttn_historiasClinicas.setContentAreaFilled(false);
        bttn_historiasClinicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_historiasClinicas.setPreferredSize(new java.awt.Dimension(185, 70));
        getContentPane().add(bttn_historiasClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 30, -1, -1));

        bttn_examenes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_examenes.setText("Exámenes");
        bttn_examenes.setBorderPainted(false);
        bttn_examenes.setContentAreaFilled(false);
        bttn_examenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_examenes.setPreferredSize(new java.awt.Dimension(185, 70));
        getContentPane().add(bttn_examenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        bttn_informes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttn_informes.setText("Informes");
        bttn_informes.setBorderPainted(false);
        bttn_informes.setContentAreaFilled(false);
        bttn_informes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttn_informes.setPreferredSize(new java.awt.Dimension(185, 70));
        getContentPane().add(bttn_informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 30, -1, -1));

        pnl_header.setBackground(new java.awt.Color(255, 255, 255));
        pnl_header.setPreferredSize(new java.awt.Dimension(265, 70));
        pnl_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombreApellido.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_nombreApellido.setText("Bienvenido:");
        pnl_header.add(lbl_nombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(pnl_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1220, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMedico;
    private javax.swing.JButton bttn_cerrarSesion;
    private javax.swing.JButton bttn_examenes;
    private javax.swing.JButton bttn_historiasClinicas;
    private javax.swing.JButton bttn_informes;
    private javax.swing.JLabel lbl_nombreApellido;
    private javax.swing.JPanel pnl_header;
    // End of variables declaration//GEN-END:variables

    
}
