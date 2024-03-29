/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI_Control;

import com.mycompany.motordrivinglicensetest.Question;
import javax.swing.JOptionPane;

/**
 *
 * @author vygir
 */
public class AddQuestion extends javax.swing.JDialog {

    /**
     * Creates new form AddQuestion
     */
    Question q;

    public Question getQ() {
        return q;
    }
    
    public AddQuestion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        qusText = new javax.swing.JTextField();
        AText = new javax.swing.JTextField();
        BText = new javax.swing.JTextField();
        CText = new javax.swing.JTextField();
        DText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        KeyText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm câu hỏi");
        setIconImages(null);

        jPanel3.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel3.setLayout(new java.awt.GridLayout(7, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Câu hỏi:");
        jPanel3.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Câu trả lời:");
        jPanel3.add(jLabel2);
        jPanel3.add(jLabel5);
        jPanel3.add(jLabel6);
        jPanel3.add(jLabel7);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Đáp án:");
        jPanel3.add(jLabel3);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thêm câu hỏi mới");
        jPanel4.add(jLabel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel5.setLayout(new java.awt.GridLayout(7, 1));

        qusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qusTextActionPerformed(evt);
            }
        });
        jPanel5.add(qusText);
        jPanel5.add(AText);
        jPanel5.add(BText);
        jPanel5.add(CText);
        jPanel5.add(DText);

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 600;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel2.add(KeyText, gridBagConstraints);

        jPanel5.add(jPanel2);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        AddButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddButton.setText("Thêm");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(AddButton, gridBagConstraints);

        jPanel5.add(jPanel1);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qusTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qusTextActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        addQuestion();
        JOptionPane.showMessageDialog(null, "Successful");
        this.dispose();
    }//GEN-LAST:event_AddButtonActionPerformed
    public void addQuestion(){
        String qus = qusText.getText();
        String a = AText.getText();
        String b = BText.getText();
        String c = CText.getText();
        String d = DText.getText();
        String key = KeyText.getText();
        q = new Question(qus, a, b, c, d, key,"ad");
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
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddQuestion dialog = new AddQuestion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AText;
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField BText;
    private javax.swing.JTextField CText;
    private javax.swing.JTextField DText;
    private javax.swing.JTextField KeyText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField qusText;
    // End of variables declaration//GEN-END:variables
}
