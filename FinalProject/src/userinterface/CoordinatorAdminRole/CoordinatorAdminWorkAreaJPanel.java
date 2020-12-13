/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CoordinatorAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JPanel;

/**
 *
 * @author suoxiyue
 */
public class CoordinatorAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel container;
    Enterprise enterprise;
    UserAccount userAccount;
    Network network;
    Organization organization;
    EcoSystem system;
    /**
     * Creates new form CoordinatorAdminWorkAreaJPanel
     */
    public CoordinatorAdminWorkAreaJPanel(JPanel container, Enterprise enterprise, 
                                    UserAccount ua, Network network, Organization org, EcoSystem system) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.userAccount = ua;
        this.network = network;
        this.organization = org;
        this.system = system;
        System.out.println("network size in current network = " + system.getNetworkList().size());
        
        for (Network n : system.getNetworkList()) {
            System.out.println(n.getName());
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(e.getName());
            }
        }
        
        valueLabel.setText(userAccount.getEmployee().getName());
        //System.out.println(userAccount.getState());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReportedCases = new javax.swing.JButton();
        btnViewAllAnimals = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Hello,");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Role: Coordinator Administrator");

        btnReportedCases.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnReportedCases.setText("Reported Cases");
        btnReportedCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportedCasesActionPerformed(evt);
            }
        });

        btnViewAllAnimals.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnViewAllAnimals.setText("View All Animals");
        btnViewAllAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllAnimalsActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        valueLabel.setText("<CoordinatorAdmin>");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportHistory.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportedCase.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportedCases, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewAllAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportedCases, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAllAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportedCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportedCasesActionPerformed
        // TODO add your handling code here:
        ReportedCasesJPanel jp = new ReportedCasesJPanel(container, enterprise, organization, userAccount);
        container.add("NewReportedCasesJPanel",jp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnReportedCasesActionPerformed

    private void btnViewAllAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllAnimalsActionPerformed
        // TODO add your handling code here:
        ViewAllAnimals jp = new ViewAllAnimals(container, system, userAccount);
        container.add("ViewAllAnimals",jp);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnViewAllAnimalsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportedCases;
    private javax.swing.JButton btnViewAllAnimals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
