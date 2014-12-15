/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_4_rijossy;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricardojose y jossy xavier
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.respuestas.setEnabled(false);
        try {
            File archivo = new File("./nombres.txt");
            FileReader rd = new FileReader(archivo);
            BufferedReader br = new BufferedReader(rd);
            String tmp;
            String vertise_0, vertise_1, relacion;
            StringTokenizer n = null;
            int conta = 0;
            while ((tmp = br.readLine()) != null) {
                n = new StringTokenizer(tmp, "|");
                while (n.hasMoreTokens()) {
                    vertise_0 = n.nextToken();
                    vertise_1 = n.nextToken();
                    relacion = n.nextToken();
                    if (!nombres.contains(vertise_0)) {
                        nombres.add(vertise_0);
                    }
                    graph.addEdge(relacion + conta++, vertise_0, vertise_1, EdgeType.DIRECTED);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regis = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        respuestas = new javax.swing.JButton();

        regis.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                regisWindowActivated(evt);
            }
        });

        jLabel1.setText("Registro de Respuestas");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Respuesta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regisLayout = new javax.swing.GroupLayout(regis.getContentPane());
        regis.getContentPane().setLayout(regisLayout);
        regisLayout.setHorizontalGroup(
            regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regisLayout.createSequentialGroup()
                .addGroup(regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regisLayout.createSequentialGroup()
                        .addGroup(regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regisLayout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regisLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        regisLayout.setVerticalGroup(
            regisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jButton2.setText("Comenzar Llamadas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        respuestas.setText("Mostrar respuestas");
        respuestas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respuestasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(respuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 727, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(respuestas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel.removeAll();
        panel.add(pintar());
        panel.repaint();
        String respuesta;
        int grande = 0;
        String m = graph.getDest("PRIMO10");
        String mayor = null;
        for (int i = 0; i < nombres.size(); i++) {
            if (graph.degree(nombres.get(i)) > grande) {
                grande = graph.degree(nombres.get(i));
                mayor = nombres.get(i);
            }
        }
        String tmp = graph.getOutEdges(mayor).toString();
        String sin_1 = "", sin_2 = "";
        StringTokenizer tokens = null;
        tokens = new StringTokenizer(tmp, "[");
        while (tokens.hasMoreTokens()) {
            sin_1 = tokens.nextToken();
        }
        StringTokenizer tokens1 = null;
        tokens1 = new StringTokenizer(sin_1, "]");
        while (tokens1.hasMoreTokens()) {
            sin_2 = tokens1.nextToken();
        }
        String aristas[] = sin_2.split(",");
        int llamar = JOptionPane.showConfirmDialog(this, "Lamando a " + mayor, "Llamada", JOptionPane.YES_NO_OPTION);
        String h = (llamar == JOptionPane.YES_OPTION) ? "si" : "no";
        respuesta = mayor + "," + h;
        registro.add(respuesta);
        buscar(aristas);
        this.respuestas.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
            for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            }
            tabla.setModel(modelo);
            registro.clear();
        this.regis.dispose();           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void respuestasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_respuestasMouseClicked
        // TODO add your handling code here:
        limpiar();
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
         StringTokenizer tokens = null;
        for (int i = 0; i < registro.size(); i++) {
                tokens = new StringTokenizer(registro.get(i), ",");
                    String nombre=tokens.nextToken();
                    String respuesta=tokens.nextToken();
                    Object[] V = {nombre,respuesta};
                    modelo.addRow(V);
            }
        tabla.setModel(modelo);
         registro.clear();
        this.regis.setVisible(true);
        this.regis.pack();
        this.regis.setModal(true);
    }//GEN-LAST:event_respuestasMouseClicked

    private void regisWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_regisWindowActivated
       
    }//GEN-LAST:event_regisWindowActivated

    public void limpiar(){
        DefaultTableModel modelo_tabla = (DefaultTableModel)tabla.getModel();
        for (int i = 0; i < modelo_tabla.getRowCount(); i++) {
            modelo_tabla.removeRow(i);
            i -= 1;
        } 
        tabla.setModel( modelo_tabla);
           
    }
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    public BasicVisualizationServer pintar() {
        Layout<String, String> layout = new FRLayout(graph);
        layout.setSize(new Dimension(1000, 600));
        BasicVisualizationServer<String, String> vv
                = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(1000, 600));
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Renderer.VertexLabel.Position.CNTR);
        JFrame frame = new JFrame("Formula rio mapa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        return vv;
    }
    ArrayList<String> nombres = new ArrayList();
    ArrayList<String> registro = new ArrayList();
    SparseMultigraph<String, String> graph = new SparseMultigraph<String, String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JDialog regis;
    private javax.swing.JButton respuestas;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
   Random rr = new Random();

    public void buscar(String aristas[]) {
        String respuesta;
        String aristaRan = aristas[rr.nextInt(aristas.length)];
        String vertice = graph.getDest(aristaRan.replaceAll(" ", ""));
        String tmp = graph.getOutEdges(vertice).toString();
        if (tmp.length() == 2) {
            int j = JOptionPane.showConfirmDialog(this, "Lamando a " + vertice, "Ultima Llamada", JOptionPane.YES_NO_OPTION);
            String h = (j == JOptionPane.YES_OPTION) ? "si" : "no";
            respuesta = vertice + "," + h;
            registro.add(respuesta);
            JOptionPane.showMessageDialog(this, "se ha terminado el proceso de llamadas");
        } else {
            String sin_1 = "", sin_2 = "";
            StringTokenizer tokens = null;
            tokens = new StringTokenizer(tmp, "[");
            while (tokens.hasMoreTokens()) {
                sin_1 = tokens.nextToken();
            }
            StringTokenizer tokens1 = null;
            tokens1 = new StringTokenizer(sin_1, "]");
            while (tokens1.hasMoreTokens()) {
                sin_2 = tokens1.nextToken();
            }
            String aristasnuevas[] = sin_2.split(",");
            int llamar = JOptionPane.showConfirmDialog(this, "Lamando a " + vertice, "Llamada", JOptionPane.YES_NO_OPTION);
            String h = (llamar == JOptionPane.YES_OPTION) ? "si" : "no";
            respuesta = vertice + "," + h;
            registro.add(respuesta);
            buscar(aristasnuevas);
        }

    }
}
