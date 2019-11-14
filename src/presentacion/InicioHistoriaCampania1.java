
package presentacion;

import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
import logica.ControladorUsuario;
import logica.DataUsuarioJuego;
import static logica.ISistemaPrincipalImpl.usuariosDelJuego;
import logica.interfaces.ISistemaUsuario;

public class InicioHistoriaCampania1 extends javax.swing.JFrame {
    
    
    public InicioHistoriaCampania1() {
        
        initComponents();
        jTextArea1.setLineWrap(true);
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelEncabezado = new javax.swing.JPanel();
        jlCerrar = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelCampania1 = new javax.swing.JLabel();
        jLabelSubfondo = new javax.swing.JLabel();
        jLabelNombreVentana = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelEncabezado.setBackground(new java.awt.Color(0, 0, 0));

        jlCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/icons8_Multiply_32px_1.png"))); // NOI18N
        jlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCerrarMouseClicked(evt);
            }
        });

        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/icons8_Expand_Arrow_32px_1.png"))); // NOI18N
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpanelEncabezadoLayout = new javax.swing.GroupLayout(jpanelEncabezado);
        jpanelEncabezado.setLayout(jpanelEncabezadoLayout);
        jpanelEncabezadoLayout.setHorizontalGroup(
            jpanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(570, Short.MAX_VALUE)
                .addComponent(jlMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCerrar))
        );
        jpanelEncabezadoLayout.setVerticalGroup(
            jpanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEncabezadoLayout.createSequentialGroup()
                .addGroup(jpanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCerrar)
                    .addComponent(jlMinimizar))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        getContentPane().add(jpanelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 51));
        jScrollPane1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 102, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Bienvenido: Mi nombre es Hack, nuestra comunidad “PowerHack” está integrada por adolescentes de más de 20 países, nos une el propósito de crear comunidades en defensa de la publicación de nuestros datos personales, la intercomunicación se desarrolla mediante ciber-redes. En la actualidad nuestro sistema está siendo intervenido por un ser malicioso, alias “Destroyer”, quien intenta afectar nuestro sistema de archivos alterando los objetivos de la comunidad, interviniendo en los servidores que protegen la información restringida de la misma. Recuerda que siempre estaré visualizando tus procesos y evaluando tus intervenciones que te permitirán avanzar en las misiones.  ");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 350, 310));

        jLabelCampania1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Campania1.gif"))); // NOI18N
        jPanel2.add(jLabelCampania1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 500, 100));

        jLabelSubfondo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSubfondo.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabelSubfondo.setForeground(new java.awt.Color(0, 102, 51));
        jLabelSubfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/SubFondoIngresar.png"))); // NOI18N
        jLabelSubfondo.setText("Bienvenido: Mi nombre es Hack, nuestra comunidad “PowerHack” está integrada por adolescentes de más de 20 países, nos une el propósito de crear comunidades en defensa de la publicación de nuestros datos personales, la intercomunicación se desarrolla mediante ciber-redes. En la actualidad nuestro sistema está siendo intervenido por un ser malicioso, alias “Destroyer”, quien intenta afectar nuestro sistema de archivos alterando los objetivos de la comunidad, interviniendo en los servidores que protegen la información restringida de la misma. Recuerda que siempre estaré visualizando tus procesos y evaluando tu intervenciones que te permitirán avanzar en las misiones.  ");
        jPanel2.add(jLabelSubfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 280, -1));

        jLabelNombreVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/crearUsuario.gif"))); // NOI18N
        jPanel2.add(jLabelNombreVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/electrograma.gif"))); // NOI18N
        jPanel2.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 518));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 640, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCerrarMouseClicked
        int dialog=JOptionPane.YES_NO_OPTION;
        int result=JOptionPane.showConfirmDialog(null,"Desea Salir de Crear Usuario","Salir de Crear Usuario",dialog);
        if (result==0){
            this.setVisible(false);
            JuegoHistoria term=new JuegoHistoria();
            term.setVisible(true);
        }
    }//GEN-LAST:event_jlCerrarMouseClicked

    private void jlMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizarMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_jlMinimizarMouseClicked


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCampania1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombreVentana;
    private javax.swing.JLabel jLabelSubfondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlCerrar;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JPanel jpanelEncabezado;
    // End of variables declaration//GEN-END:variables
}
