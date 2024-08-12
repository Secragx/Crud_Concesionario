
package Vista;


public class DiseñoPrincipal extends javax.swing.JFrame {

 
    public DiseñoPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btn_archivo = new javax.swing.JMenu();
        btn_salir = new javax.swing.JMenuItem();
        btn_menu = new javax.swing.JMenu();
        btn_referencias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_archivo.setText("Archivo");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        btn_archivo.add(btn_salir);

        jMenuBar1.add(btn_archivo);

        btn_menu.setText("Menú");

        btn_referencias.setText("Referencias");
        btn_referencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_referenciasActionPerformed(evt);
            }
        });
        btn_menu.add(btn_referencias);

        jMenuBar1.add(btn_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_referenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_referenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_referenciasActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

 
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseñoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu btn_archivo;
    public javax.swing.JMenu btn_menu;
    public javax.swing.JMenuItem btn_referencias;
    public javax.swing.JMenuItem btn_salir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
