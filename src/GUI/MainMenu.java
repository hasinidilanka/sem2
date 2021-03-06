/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SwimObjects.SwimmingCompetition;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Hasini
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getAddSwimmer = new javax.swing.JButton();
        getAddSpectators = new javax.swing.JButton();
        getStartMatch = new javax.swing.JButton();
        getAddJudge = new javax.swing.JButton();
        getAddStaff = new javax.swing.JButton();
        getMatchSummary = new javax.swing.JButton();
        save = new javax.swing.JButton();
        getAddStaff1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setText("Swimming Competition");

        getAddSwimmer.setBackground(new java.awt.Color(255, 153, 153));
        getAddSwimmer.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getAddSwimmer.setText("Add Swimmers");
        getAddSwimmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAddSwimmerActionPerformed(evt);
            }
        });

        getAddSpectators.setBackground(new java.awt.Color(255, 153, 153));
        getAddSpectators.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getAddSpectators.setText("Add Spectators");
        getAddSpectators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAddSpectatorsActionPerformed(evt);
            }
        });

        getStartMatch.setBackground(new java.awt.Color(255, 153, 153));
        getStartMatch.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getStartMatch.setText("Start Match");
        getStartMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStartMatchActionPerformed(evt);
            }
        });

        getAddJudge.setBackground(new java.awt.Color(255, 153, 153));
        getAddJudge.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getAddJudge.setText("Add Judge");
        getAddJudge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAddJudgeActionPerformed(evt);
            }
        });

        getAddStaff.setBackground(new java.awt.Color(255, 153, 153));
        getAddStaff.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getAddStaff.setText("Add Supporting Staff");
        getAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAddStaffActionPerformed(evt);
            }
        });

        getMatchSummary.setBackground(new java.awt.Color(255, 153, 153));
        getMatchSummary.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getMatchSummary.setText("Match Summary");
        getMatchSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMatchSummaryActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(255, 153, 153));
        save.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        save.setText("Save Matches");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        getAddStaff1.setBackground(new java.awt.Color(255, 153, 153));
        getAddStaff1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        getAddStaff1.setText("View People");
        getAddStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAddStaff1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getAddSpectators)
                            .addComponent(getAddSwimmer)
                            .addComponent(getAddJudge)
                            .addComponent(getAddStaff)
                            .addComponent(getAddStaff1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getStartMatch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getMatchSummary, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {getAddJudge, getAddSpectators, getAddStaff, getAddStaff1, getAddSwimmer, getMatchSummary, getStartMatch, save});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAddSwimmer)
                    .addComponent(getStartMatch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAddSpectators)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAddJudge)
                    .addComponent(getMatchSummary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getAddStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getAddStaff1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {getAddJudge, getAddSpectators, getAddStaff, getAddSwimmer, getMatchSummary, save});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getAddSwimmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAddSwimmerActionPerformed
        setVisible(false);
        AddSwimmers as = new AddSwimmers();
        as.setVisible(true);
    }//GEN-LAST:event_getAddSwimmerActionPerformed

    private void getAddSpectatorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAddSpectatorsActionPerformed
        setVisible(false);
        AddSpectator as = new AddSpectator();
        as.setVisible(true);
    }//GEN-LAST:event_getAddSpectatorsActionPerformed

    private void getStartMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStartMatchActionPerformed
        setVisible(false);
        StartMatch sm = new StartMatch();
        sm.setVisible(true);
    }//GEN-LAST:event_getStartMatchActionPerformed

    private void getAddJudgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAddJudgeActionPerformed
        setVisible(false);
        AddJudge aj = new AddJudge();
        aj.setVisible(true);
    }//GEN-LAST:event_getAddJudgeActionPerformed

    private void getAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAddStaffActionPerformed
        setVisible(false);
        AddStaff as = new AddStaff();
        as.setVisible(true);
    }//GEN-LAST:event_getAddStaffActionPerformed

    private void getMatchSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMatchSummaryActionPerformed
        setVisible(false);
        MatchSummary ms = new MatchSummary();
        ms.setVisible(true);
        
    }//GEN-LAST:event_getMatchSummaryActionPerformed
    SwimmingCompetition sc = SwimmingCompetition.getSwimmingCompetition();
    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        int i =JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to save the matches.This will delete the previous saved matches", null, 0, 0);
        switch (i){
            case 0 :
                try {
                   ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("SwimmingCompetition.ser")));
                   oos.writeObject(sc.getAllMatches());
                   JOptionPane.showMessageDialog(rootPane, "Saved Successfully");
                } catch (IOException ex) {
                   JOptionPane.showMessageDialog(rootPane, "Save the file and try again");
               }
                break;
            case 1 :
                break;
            default :
                JOptionPane.showMessageDialog(rootPane, "Select one option");
                break;
        }
           
            
           
       

    }//GEN-LAST:event_saveMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void getAddStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAddStaff1ActionPerformed
        setVisible(false);
        ViewPeople vp = new ViewPeople();
        vp.setVisible(true);
    }//GEN-LAST:event_getAddStaff1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getAddJudge;
    private javax.swing.JButton getAddSpectators;
    private javax.swing.JButton getAddStaff;
    private javax.swing.JButton getAddStaff1;
    private javax.swing.JButton getAddSwimmer;
    private javax.swing.JButton getMatchSummary;
    private javax.swing.JButton getStartMatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
