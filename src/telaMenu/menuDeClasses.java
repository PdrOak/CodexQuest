/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaMenu;

/**
 *
 * @author Usuario
 */
public class menuDeClasses extends javax.swing.JFrame {

    /**
     * Creates new form menuDeClasses
     */
    public menuDeClasses() {
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

        chooseClass = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cButtonChoose = new javax.swing.JButton();
        cPlusButtonChoose = new javax.swing.JButton();
        pythonButtonChoose = new javax.swing.JButton();
        javaScriptButtonChoose = new javax.swing.JButton();
        javaButtonChoose = new javax.swing.JButton();
        backMenu = new javax.swing.JButton();
        cClassStatus = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backButtonC = new javax.swing.JButton();
        continueButtonC = new javax.swing.JButton();
        cPlusClassStatus = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backButtonCPlus = new javax.swing.JButton();
        continueButtonCPlus = new javax.swing.JButton();
        pythonClassStatus = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        backButtonPython = new javax.swing.JButton();
        continueButtonPython = new javax.swing.JButton();
        javaScriptClassStatus = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        backButtonJavaScript = new javax.swing.JButton();
        continueButtonJavaScript = new javax.swing.JButton();
        javaClassStatus = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        backButtonJava = new javax.swing.JButton();
        continueButtonJava = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chooseClass.setBackground(new java.awt.Color(0, 0, 0));
        chooseClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        chooseClass.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Escolha sua classe");

        cButtonChoose.setText("C#");
        cButtonChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonChooseActionPerformed(evt);
            }
        });

        cPlusButtonChoose.setText("C++");
        cPlusButtonChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPlusButtonChooseActionPerformed(evt);
            }
        });

        pythonButtonChoose.setText("Python");
        pythonButtonChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pythonButtonChooseActionPerformed(evt);
            }
        });

        javaScriptButtonChoose.setText("JavaScript");
        javaScriptButtonChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaScriptButtonChooseActionPerformed(evt);
            }
        });

        javaButtonChoose.setText("Java");
        javaButtonChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaButtonChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooseClassLayout = new javax.swing.GroupLayout(chooseClass);
        chooseClass.setLayout(chooseClassLayout);
        chooseClassLayout.setHorizontalGroup(
            chooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cButtonChoose)
                .addGap(50, 50, 50)
                .addComponent(cPlusButtonChoose)
                .addGap(43, 43, 43)
                .addComponent(pythonButtonChoose)
                .addGap(71, 71, 71)
                .addComponent(javaScriptButtonChoose)
                .addGap(60, 60, 60)
                .addComponent(javaButtonChoose)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chooseClassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
        );
        chooseClassLayout.setVerticalGroup(
            chooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooseClassLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(chooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cButtonChoose)
                    .addComponent(cPlusButtonChoose)
                    .addComponent(pythonButtonChoose)
                    .addComponent(javaScriptButtonChoose)
                    .addComponent(javaButtonChoose))
                .addGap(0, 139, Short.MAX_VALUE))
        );

        getContentPane().add(chooseClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 640, -1));

        backMenu.setText("Voltar");
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });
        getContentPane().add(backMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        cClassStatus.setBackground(new java.awt.Color(0, 0, 0));
        cClassStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        cClassStatus.setPreferredSize(new java.awt.Dimension(638, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("C#");

        backButtonC.setText("Voltar");
        backButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonCActionPerformed(evt);
            }
        });

        continueButtonC.setText("Continuar");

        javax.swing.GroupLayout cClassStatusLayout = new javax.swing.GroupLayout(cClassStatus);
        cClassStatus.setLayout(cClassStatusLayout);
        cClassStatusLayout.setHorizontalGroup(
            cClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cClassStatusLayout.createSequentialGroup()
                .addGroup(cClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cClassStatusLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 444, Short.MAX_VALUE))
                    .addGroup(cClassStatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButtonC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueButtonC)))
                .addContainerGap())
        );
        cClassStatusLayout.setVerticalGroup(
            cClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cClassStatusLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(cClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButtonC)
                    .addComponent(continueButtonC))
                .addContainerGap())
        );

        getContentPane().add(cClassStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 640, 300));
        cClassStatus.setVisible(false);

        cPlusClassStatus.setBackground(new java.awt.Color(0, 0, 0));
        cPlusClassStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        cPlusClassStatus.setPreferredSize(new java.awt.Dimension(638, 300));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("C++");

        backButtonCPlus.setText("Voltar");
        backButtonCPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonCPlusActionPerformed(evt);
            }
        });

        continueButtonCPlus.setText("Continuar");

        javax.swing.GroupLayout cPlusClassStatusLayout = new javax.swing.GroupLayout(cPlusClassStatus);
        cPlusClassStatus.setLayout(cPlusClassStatusLayout);
        cPlusClassStatusLayout.setHorizontalGroup(
            cPlusClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPlusClassStatusLayout.createSequentialGroup()
                .addGroup(cPlusClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cPlusClassStatusLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 444, Short.MAX_VALUE))
                    .addGroup(cPlusClassStatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButtonCPlus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueButtonCPlus)))
                .addContainerGap())
        );
        cPlusClassStatusLayout.setVerticalGroup(
            cPlusClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPlusClassStatusLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(cPlusClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButtonCPlus)
                    .addComponent(continueButtonCPlus))
                .addContainerGap())
        );

        getContentPane().add(cPlusClassStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 640, 300));
        cPlusClassStatus.setVisible(false);

        pythonClassStatus.setBackground(new java.awt.Color(0, 0, 0));
        pythonClassStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        pythonClassStatus.setPreferredSize(new java.awt.Dimension(638, 300));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Python");

        backButtonPython.setText("Voltar");
        backButtonPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonPythonActionPerformed(evt);
            }
        });

        continueButtonPython.setText("Continuar");

        javax.swing.GroupLayout pythonClassStatusLayout = new javax.swing.GroupLayout(pythonClassStatus);
        pythonClassStatus.setLayout(pythonClassStatusLayout);
        pythonClassStatusLayout.setHorizontalGroup(
            pythonClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pythonClassStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtonPython)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addComponent(continueButtonPython)
                .addContainerGap())
            .addGroup(pythonClassStatusLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pythonClassStatusLayout.setVerticalGroup(
            pythonClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pythonClassStatusLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(pythonClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButtonPython)
                    .addComponent(continueButtonPython))
                .addContainerGap())
        );

        getContentPane().add(pythonClassStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 640, 300));
        pythonClassStatus.setVisible(false);

        javaScriptClassStatus.setBackground(new java.awt.Color(0, 0, 0));
        javaScriptClassStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        javaScriptClassStatus.setPreferredSize(new java.awt.Dimension(638, 300));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("JavaScript");

        backButtonJavaScript.setText("Voltar");
        backButtonJavaScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonJavaScriptActionPerformed(evt);
            }
        });

        continueButtonJavaScript.setText("Continuar");

        javax.swing.GroupLayout javaScriptClassStatusLayout = new javax.swing.GroupLayout(javaScriptClassStatus);
        javaScriptClassStatus.setLayout(javaScriptClassStatusLayout);
        javaScriptClassStatusLayout.setHorizontalGroup(
            javaScriptClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaScriptClassStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtonJavaScript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addComponent(continueButtonJavaScript)
                .addContainerGap())
            .addGroup(javaScriptClassStatusLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        javaScriptClassStatusLayout.setVerticalGroup(
            javaScriptClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaScriptClassStatusLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(javaScriptClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButtonJavaScript)
                    .addComponent(continueButtonJavaScript))
                .addContainerGap())
        );

        getContentPane().add(javaScriptClassStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 640, 300));
        javaScriptClassStatus.setVisible(false);

        javaClassStatus.setBackground(new java.awt.Color(0, 0, 0));
        javaClassStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 0), 3));
        javaClassStatus.setPreferredSize(new java.awt.Dimension(638, 300));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setText("Java");

        backButtonJava.setText("Voltar");
        backButtonJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonJavaActionPerformed(evt);
            }
        });

        continueButtonJava.setText("Continuar");

        javax.swing.GroupLayout javaClassStatusLayout = new javax.swing.GroupLayout(javaClassStatus);
        javaClassStatus.setLayout(javaClassStatusLayout);
        javaClassStatusLayout.setHorizontalGroup(
            javaClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaClassStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButtonJava)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addComponent(continueButtonJava)
                .addContainerGap())
            .addGroup(javaClassStatusLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        javaClassStatusLayout.setVerticalGroup(
            javaClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javaClassStatusLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(javaClassStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButtonJava)
                    .addComponent(continueButtonJava))
                .addContainerGap())
        );

        getContentPane().add(javaClassStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 640, 300));
        javaClassStatus.setVisible(false);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Classes.jpeg"))); // NOI18N
        getContentPane().add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        menu telaDeMenu = new menu();
        telaDeMenu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_backMenuActionPerformed
    
   
    private void cButtonChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonChooseActionPerformed
        cClassStatus.setVisible(true);
        cPlusClassStatus.setVisible(false);
        pythonClassStatus.setVisible(false);
        javaScriptClassStatus.setVisible(false);
        javaClassStatus.setVisible(false);
    }//GEN-LAST:event_cButtonChooseActionPerformed

    private void backButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonCActionPerformed
        cClassStatus.setVisible(false);
    }//GEN-LAST:event_backButtonCActionPerformed

    private void backButtonCPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonCPlusActionPerformed
        cPlusClassStatus.setVisible(false);
    }//GEN-LAST:event_backButtonCPlusActionPerformed

    private void cPlusButtonChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPlusButtonChooseActionPerformed
        cPlusClassStatus.setVisible(true);
        pythonClassStatus.setVisible(false);
        javaScriptClassStatus.setVisible(false);
        javaClassStatus.setVisible(false);
        cClassStatus.setVisible(false);
    }//GEN-LAST:event_cPlusButtonChooseActionPerformed

    private void backButtonPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonPythonActionPerformed
        pythonClassStatus.setVisible(false);
    }//GEN-LAST:event_backButtonPythonActionPerformed

    private void pythonButtonChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pythonButtonChooseActionPerformed
        pythonClassStatus.setVisible(true);
        javaScriptClassStatus.setVisible(false);
        javaClassStatus.setVisible(false);
        cClassStatus.setVisible(false);
        cPlusClassStatus.setVisible(false);
    }//GEN-LAST:event_pythonButtonChooseActionPerformed

    private void backButtonJavaScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonJavaScriptActionPerformed
        javaScriptClassStatus.setVisible(false);
    }//GEN-LAST:event_backButtonJavaScriptActionPerformed

    private void javaScriptButtonChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaScriptButtonChooseActionPerformed
        javaScriptClassStatus.setVisible(true);
        javaClassStatus.setVisible(false);
        cClassStatus.setVisible(false);
        cPlusClassStatus.setVisible(false);
        pythonClassStatus.setVisible(false);
    }//GEN-LAST:event_javaScriptButtonChooseActionPerformed

    private void backButtonJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonJavaActionPerformed
        javaClassStatus.setVisible(false);
    }//GEN-LAST:event_backButtonJavaActionPerformed

    private void javaButtonChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaButtonChooseActionPerformed
        javaClassStatus.setVisible(true);
        cClassStatus.setVisible(false);
        cPlusClassStatus.setVisible(false);
        pythonClassStatus.setVisible(false);
        javaScriptClassStatus.setVisible(false);
    }//GEN-LAST:event_javaButtonChooseActionPerformed

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
            java.util.logging.Logger.getLogger(menuDeClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuDeClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuDeClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuDeClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuDeClasses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonC;
    private javax.swing.JButton backButtonCPlus;
    private javax.swing.JButton backButtonJava;
    private javax.swing.JButton backButtonJavaScript;
    private javax.swing.JButton backButtonPython;
    private javax.swing.JLabel backGround;
    private javax.swing.JButton backMenu;
    private javax.swing.JButton cButtonChoose;
    private javax.swing.JPanel cClassStatus;
    private javax.swing.JButton cPlusButtonChoose;
    private javax.swing.JPanel cPlusClassStatus;
    private javax.swing.JPanel chooseClass;
    private javax.swing.JButton continueButtonC;
    private javax.swing.JButton continueButtonCPlus;
    private javax.swing.JButton continueButtonJava;
    private javax.swing.JButton continueButtonJavaScript;
    private javax.swing.JButton continueButtonPython;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton javaButtonChoose;
    private javax.swing.JPanel javaClassStatus;
    private javax.swing.JButton javaScriptButtonChoose;
    private javax.swing.JPanel javaScriptClassStatus;
    private javax.swing.JButton pythonButtonChoose;
    private javax.swing.JPanel pythonClassStatus;
    // End of variables declaration//GEN-END:variables
}
