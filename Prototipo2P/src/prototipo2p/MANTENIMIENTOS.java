/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo2p;

/**
 *
 * @author SEBAS
 */
public class MANTENIMIENTOS extends javax.swing.JInternalFrame {

    /**
     * Creates new form MANTENIMIENTOS
     */
    public MANTENIMIENTOS() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mantenimientoEmpleados = new javax.swing.JMenuItem();
        mantenimientoPuestos = new javax.swing.JMenuItem();
        mantenimientoDepartamentos = new javax.swing.JMenuItem();
        mantenimientoConceptos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        jMenu1.setText("Abrir");

        mantenimientoEmpleados.setText("Empleados");
        mantenimientoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(mantenimientoEmpleados);

        mantenimientoPuestos.setText("Puestos");
        mantenimientoPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoPuestosActionPerformed(evt);
            }
        });
        jMenu1.add(mantenimientoPuestos);

        mantenimientoDepartamentos.setText("Departamentos");
        mantenimientoDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoDepartamentosActionPerformed(evt);
            }
        });
        jMenu1.add(mantenimientoDepartamentos);

        mantenimientoConceptos.setText("Conceptos");
        mantenimientoConceptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoConceptosActionPerformed(evt);
            }
        });
        jMenu1.add(mantenimientoConceptos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mantenimientoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoEmpleadosActionPerformed
        // TODO add your handling code here:
        Empleados ventana = new Empleados();
        jDesktopPane1.add(ventana);
    }//GEN-LAST:event_mantenimientoEmpleadosActionPerformed

    private void mantenimientoPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoPuestosActionPerformed
        // TODO add your handling code here:
        Puestos ventana = new Puestos();
        jDesktopPane1.add(ventana);
    }//GEN-LAST:event_mantenimientoPuestosActionPerformed

    private void mantenimientoDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoDepartamentosActionPerformed
        // TODO add your handling code here:
        Departamentos ventana = new Departamentos();
        jDesktopPane1.add(ventana);
    }//GEN-LAST:event_mantenimientoDepartamentosActionPerformed

    private void mantenimientoConceptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoConceptosActionPerformed
        // TODO add your handling code here:
        Conceptos ventana = new Conceptos();
        jDesktopPane1.add(ventana);
    }//GEN-LAST:event_mantenimientoConceptosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mantenimientoConceptos;
    private javax.swing.JMenuItem mantenimientoDepartamentos;
    private javax.swing.JMenuItem mantenimientoEmpleados;
    private javax.swing.JMenuItem mantenimientoPuestos;
    // End of variables declaration//GEN-END:variables
}