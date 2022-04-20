/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import DTO.JugadorDTO;
import controlador.DepartamentoController;
import controlador.JugadorController;
import controlador.ProvinciaController;
import entidad.Departamento;
import entidad.Provincia;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dario
 */
public class VentanaListarSeleccionado extends javax.swing.JFrame {
 
  JugadorController jc;
   DepartamentoController  dc;
    ProvinciaController pc;
    public VentanaListarSeleccionado() {
        initComponents();
        this.setLocationRelativeTo(null);
        jc = new JugadorController();
         dc= new DepartamentoController();
         pc= new ProvinciaController();
         Provincia p= new Provincia();
         DefaultComboBoxModel modeloProvincia = new DefaultComboBoxModel(pc.obtenerProvincia());
     cboProvincias.setModel(modeloProvincia);
     
    }
  public void CargarTabla()
    {
       Departamento departamento = (Departamento) cboDepartamentos.getSelectedItem();
        ArrayList<JugadorDTO> listaJugador = jc.obtenerJugadorSeleccionado(departamento.getIdDepartamento());
        String cols[] = {"NOMBRE","APELLIDO","DOCUMENTO","FECHA DE NACIMIENTO","DIVSION","DIRECCION","TELEFONO","TELEFONO DEL TUTOR","OBSERVACIONES"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cols);
        
        for (JugadorDTO dto : listaJugador) {
            modelo.addRow(new Object[]{dto.getNombre(), dto.getApellido(),dto.getDocumento() ,dto.getFechaDeNacimiento(),dto.getDivision(),
            dto.getDireccion(),dto.getTelefono(),dto.getTelefonoTutor(),dto.getObservaciones()});
        }
        tblJugadores.setModel(modelo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        cboProvincias = new javax.swing.JComboBox<>();
        cboDepartamentos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblJugadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblJugadores.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
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
        tblJugadores.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jScrollPane1.setViewportView(tblJugadores);
        if (tblJugadores.getColumnModel().getColumnCount() > 0) {
            tblJugadores.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tblJugadores.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tblJugadores.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tblJugadores.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        cboProvincias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciasItemStateChanged(evt);
            }
        });

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(cboProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(cboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(907, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProvinciasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciasItemStateChanged
           if(evt.getStateChange()== ItemEvent.SELECTED){
            Provincia p= (Provincia) cboProvincias.getSelectedItem();
            Departamento d= new Departamento();
              DefaultComboBoxModel modeloDepartamento = new DefaultComboBoxModel(dc.obtenerDepartamento(p.getIdProvincia()));
              cboDepartamentos.setModel(modeloDepartamento);
        }
    }//GEN-LAST:event_cboProvinciasItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(cboProvincias.getSelectedIndex()==0){
              JOptionPane.showMessageDialog(this, "Debe Seleccionar una Provincia");
                return;
     }
      if(cboDepartamentos.getSelectedIndex()==0){
              JOptionPane.showMessageDialog(this, "Debe Seleccionar un Departamento ");
                return;
     }
          
        CargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDepartamentos;
    private javax.swing.JComboBox<String> cboProvincias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJugadores;
    // End of variables declaration//GEN-END:variables
}
