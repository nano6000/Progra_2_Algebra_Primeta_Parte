/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Grafica;

import Capa_Logica.Matriz;
import Capa_Logica.OpMatricial;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class Main_Window extends javax.swing.JFrame {

    Matriz base1Input;
    Matriz base2Input;
    Matriz matrizCambioBase;
    
    /**
     * Creates new form Main_Window
     */
    public Main_Window() {
        this.setResizable(false);
        initComponents();
        
        Icon icon = new ImageIcon("src\\bad.png");
        lblIcon.setIcon(icon);
        
        base1Input = new Matriz();
        base2Input = new Matriz();
        matrizCambioBase = new Matriz();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbBaseSelect = new javax.swing.JComboBox<>();
        lblBase = new javax.swing.JLabel();
        lblVectorSelect = new javax.swing.JLabel();
        cmbVectorSelect = new javax.swing.JComboBox<>();
        txtfElem1 = new javax.swing.JTextField();
        txtfElem2 = new javax.swing.JTextField();
        txtfElem3 = new javax.swing.JTextField();
        btnAgregarVector = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaBaseDisplay = new javax.swing.JTextArea();
        lblIcon = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        lblOrigen = new javax.swing.JLabel();
        cmbOrigen = new javax.swing.JComboBox<>();
        btnCalcularMatrizCambioBase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaMatrizCambioBase = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbBaseSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B1", "B2" }));

        lblBase.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblBase.setText("Base:");

        lblVectorSelect.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblVectorSelect.setText("Vector:");

        cmbVectorSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V1", "V2", "V3" }));

        txtfElem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfElem1KeyTyped(evt);
            }
        });

        txtfElem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfElem2KeyTyped(evt);
            }
        });

        txtfElem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfElem3KeyTyped(evt);
            }
        });

        btnAgregarVector.setText("Agregar");
        btnAgregarVector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarVectorMouseClicked(evt);
            }
        });

        txtaBaseDisplay.setColumns(20);
        txtaBaseDisplay.setRows(5);
        jScrollPane1.setViewportView(txtaBaseDisplay);

        lblIcon.setBackground(new java.awt.Color(204, 255, 204));
        lblIcon.setForeground(new java.awt.Color(255, 255, 255));
        lblIcon.setToolTipText("");

        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        lblOrigen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblOrigen.setText("Origen: ");

        cmbOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B1", "B2" }));
        cmbOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrigenItemStateChanged(evt);
            }
        });

        btnCalcularMatrizCambioBase.setText("Calcular");
        btnCalcularMatrizCambioBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMatrizCambioBaseMouseClicked(evt);
            }
        });

        txtaMatrizCambioBase.setColumns(20);
        txtaMatrizCambioBase.setRows(5);
        jScrollPane2.setViewportView(txtaMatrizCambioBase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfElem1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtfElem2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtfElem3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(btnAgregarVector)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBase)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbBaseSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVectorSelect)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbVectorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnCalcularMatrizCambioBase))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbBaseSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBase)
                            .addComponent(lblOrigen)
                            .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVectorSelect)
                            .addComponent(cmbVectorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularMatrizCambioBase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtfElem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfElem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfElem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarVector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separator1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfElem1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfElem1KeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c.equals(KeyEvent.VK_BACK_SPACE) || c.equals('-') ||
                c.equals('.') || c.equals(KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtfElem1KeyTyped

    private void txtfElem2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfElem2KeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c.equals(KeyEvent.VK_BACK_SPACE) || c.equals('-') ||
                c.equals('.') || c.equals(KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtfElem2KeyTyped

    private void txtfElem3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfElem3KeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c.equals(KeyEvent.VK_BACK_SPACE) || c.equals('-') ||
                c.equals('.') || c.equals(KeyEvent.VK_DELETE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtfElem3KeyTyped

    private void btnAgregarVectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVectorMouseClicked
        // TODO add your handling code here:
        double elem1Temp = Double.parseDouble(txtfElem1.getText());
        double elem2Temp = Double.parseDouble(txtfElem2.getText());
        double elem3Temp = Double.parseDouble(txtfElem3.getText());
        
        int fila = cmbVectorSelect.getSelectedIndex();
        
        if (cmbBaseSelect.getSelectedIndex()==0)
        {
            base1Input.insertElem(fila, 0, elem1Temp);
            base1Input.insertElem(fila, 1, elem2Temp);
            base1Input.insertElem(fila, 2, elem3Temp);

            double determinante = base1Input.determinante();
            System.out.println(base1Input.toString());
            System.out.println("determinante: " + determinante);
            if (determinante != 0)
            {
                Icon icon = new ImageIcon("src\\good.png");
                lblIcon.setIcon(icon);
            }
            else
            {
                Icon icon = new ImageIcon("src\\bad.png");
                lblIcon.setIcon(icon);
            }
        }
        else
        {
            base2Input.insertElem(fila, 0, elem1Temp);
            base2Input.insertElem(fila, 1, elem2Temp);
            base2Input.insertElem(fila, 2, elem3Temp);

            double determinante = base2Input.determinante();
            System.out.println(base2Input.toString());
            System.out.println("determinante: " + determinante);
            if (determinante != 0)
            {
                Icon icon = new ImageIcon("src\\good.png");
                lblIcon.setIcon(icon);
            }
            else
            {
                Icon icon = new ImageIcon("src\\bad.png");
                lblIcon.setIcon(icon);
            }
        }
        
        txtaBaseDisplay.setText(base1Input.toString() + "\n\n" + base2Input.toString());
    }//GEN-LAST:event_btnAgregarVectorMouseClicked

    private void btnCalcularMatrizCambioBaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMatrizCambioBaseMouseClicked
        // TODO add your handling code here:
        try
        {
            double[] vectorTemp;
            double[] vectorSol;
            if (cmbOrigen.getSelectedIndex()==0)
            {
                for (int i = 0; i < base1Input.getSize(); i++) 
                {
                    vectorTemp = base1Input.getFila(i);
                    vectorSol = OpMatricial.Crammer(base2Input, vectorTemp, base2Input.determinante());
                    System.out.println("Matriz: \n" + base2Input.toString() +
                        "VectorSol: \n" + Arrays.toString(vectorSol) + "\n");
                    for (int j = 0; j < vectorSol.length; j++)
                    {
                        matrizCambioBase.insertElem(i, j, vectorSol[j]);
                    }
                }
            }
            
            if (cmbOrigen.getSelectedIndex()==1)
            {
                for (int i = 0; i < base2Input.getSize(); i++) 
                {
                    vectorTemp = base2Input.getFila(i);
                    vectorSol = OpMatricial.Crammer(base1Input, vectorTemp, base1Input.determinante());
                    System.out.println("Matriz: \n" + base1Input.toString() +
                        "VectorSol: \n" + Arrays.toString(vectorSol) + "\n");
                    for (int j = 0; j < vectorSol.length; j++)
                    {
                        matrizCambioBase.insertElem(i, j, vectorSol[j]);
                    }
                }
            }

            txtaMatrizCambioBase.setText(matrizCambioBase.toString());
        }
        catch (ArithmeticException e)
        {
            JOptionPane.showMessageDialog(this, "Error, el determinante de la base es 0", "Error!", ERROR);
        }
    }//GEN-LAST:event_btnCalcularMatrizCambioBaseMouseClicked

    private void cmbOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrigenItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrigenItemStateChanged

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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVector;
    private javax.swing.JButton btnCalcularMatrizCambioBase;
    private javax.swing.JComboBox<String> cmbBaseSelect;
    private javax.swing.JComboBox<String> cmbOrigen;
    private javax.swing.JComboBox<String> cmbVectorSelect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblVectorSelect;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTextArea txtaBaseDisplay;
    private javax.swing.JTextArea txtaMatrizCambioBase;
    private javax.swing.JTextField txtfElem1;
    private javax.swing.JTextField txtfElem2;
    private javax.swing.JTextField txtfElem3;
    // End of variables declaration//GEN-END:variables
}
