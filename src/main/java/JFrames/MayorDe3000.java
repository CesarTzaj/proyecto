
package JFrames;

import connection.DbaConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MayorDe3000 extends javax.swing.JPanel {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    DbaConnection dbaConnection = new DbaConnection();
    DefaultTableModel model;

    public MayorDe3000() {
        initComponents();
        
        try {
            connection= dbaConnection.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MayorDe3000.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        reporte();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();

        setBackground(new java.awt.Color(168, 161, 96));
        setPreferredSize(new java.awt.Dimension(1300, 1500));

        container.setBackground(new java.awt.Color(168, 161, 96));
        container.setMinimumSize(new java.awt.Dimension(1000, 30));
        container.setPreferredSize(new java.awt.Dimension(1350, 800));
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.LINE_AXIS));

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Planilla", "Tabajador", "CUI", "Nombre", "Posicion", "Sueldo", "Empresa", "Estado", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(tblReporte);
        if (tblReporte.getColumnModel().getColumnCount() > 0) {
            tblReporte.getColumnModel().getColumn(0).setMinWidth(65);
            tblReporte.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblReporte.getColumnModel().getColumn(0).setMaxWidth(80);
            tblReporte.getColumnModel().getColumn(1).setMinWidth(85);
            tblReporte.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblReporte.getColumnModel().getColumn(1).setMaxWidth(100);
            tblReporte.getColumnModel().getColumn(2).setMinWidth(100);
            tblReporte.getColumnModel().getColumn(2).setPreferredWidth(110);
            tblReporte.getColumnModel().getColumn(2).setMaxWidth(120);
            tblReporte.getColumnModel().getColumn(3).setMinWidth(300);
            tblReporte.getColumnModel().getColumn(3).setPreferredWidth(310);
            tblReporte.getColumnModel().getColumn(3).setMaxWidth(330);
            tblReporte.getColumnModel().getColumn(4).setMinWidth(190);
            tblReporte.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblReporte.getColumnModel().getColumn(4).setMaxWidth(210);
            tblReporte.getColumnModel().getColumn(5).setMinWidth(100);
            tblReporte.getColumnModel().getColumn(5).setPreferredWidth(110);
            tblReporte.getColumnModel().getColumn(5).setMaxWidth(120);
            tblReporte.getColumnModel().getColumn(6).setMinWidth(290);
            tblReporte.getColumnModel().getColumn(6).setPreferredWidth(300);
            tblReporte.getColumnModel().getColumn(6).setMaxWidth(310);
        }

        container.add(jScrollPane2);

        add(container);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables

    private void reporte() {
        String sql ="SELECT pt.idplanilla,tr.idtrabajador,pr.cui , pr.nombre, pt.sueldo,emp.empresa, est.descripcion, pl.mes, pl.anio, ps.posicion\n" +
"FROM EMPRESA  EMP, ESTADOPLANILLA EST, PERSONA PR, PLANILLA PL, PLANILLATRABAJADOR PT,TRABAJADOR TR, POSICION PS\n" +
"WHERE  pt.sueldo >=3000\n" +
"AND pt.trabajador_idtrabajador=tr.idtrabajador\n" +
"AND tr.persona_cui=pr.cui\n" +
"AND pt.planilla_id_planilla=pl.id_planilla\n" +
"AND emp.id_empresa=pl.empresa_id_empresa\n" +
"AND pt.estadoplanilla_idestado=est.idestado\n" +
"AND ps.idposicion = pt.posicion_idposicion";
        
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            String[] values = new String[9];
            model = (DefaultTableModel) tblReporte.getModel();
            while(rs.next()){
            values[0] = rs.getString("idplanilla");
            values[1] = rs.getString("idtrabajador");
            values[2] = rs.getString("cui");
            values[3] = rs.getString("nombre");
            values[4] = rs.getString("posicion");
            values[5] = "Q  "+rs.getString("sueldo");
            values[6] = rs.getString("empresa");
            values[7] = rs.getString("descripcion");
            values[8] = rs.getString("mes")+" / "+rs.getString("anio");
            model.addRow(values);
            }
            tblReporte.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
        
        
    }
}
