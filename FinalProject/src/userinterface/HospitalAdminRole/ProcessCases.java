/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnimalRecord;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suoxiyue
 */
public class ProcessCases extends javax.swing.JPanel {

    private JPanel container;
    UserAccount userAccount;
    /**
     * Creates new form RequestFromVet
     */
    public ProcessCases(JPanel container, UserAccount ua) {
        initComponents();
        this.container = container;
        this.userAccount = ua;
        
        popTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Case ID", "Animal Type", "Volunteer", "Vet", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequest);

        jButton1.setText("Decline");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Process Cases");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton2.setText("Accept");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void popTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        System.out.println(userAccount.getWorkQueue().getWorkRequestList().size()); // test
        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList() ) {
           System.out.println("in workrequest"); //test
           if (wr instanceof AnimalRecord) {
                System.out.println("in animalrecord"); //test
                Object row[] = new Object[5]; 
                row[0] = wr;
                row[1] = ((AnimalRecord) wr).getReportingRequest().getAnimalType();
                row[2] = ((AnimalRecord) wr).getVolunteerRequest().getVolunteer();
                row[3] = ((AnimalRecord) wr).getHospitalRequest().getAssignedVet() ==null ? "--": ((AnimalRecord) wr).getHospitalRequest().getAssignedVet();
                row[4] = ((AnimalRecord) wr).getHospitalRequest().getStatus();
                ((DefaultTableModel) tblRequest.getModel()).addRow(row);
           }
           
        }       
   
    }
        
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = tblRequest.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a request from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AnimalRecord ar = (AnimalRecord)tblRequest.getValueAt(row, 0);
        if (ar.getHospitalRequest().getStatus().equals("Hospital Accepted") || ar.getHospitalRequest().getStatus().equals("Vet Assigned")) {
            JOptionPane.showMessageDialog(null, "Please select a request from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {        
            ar.getHospitalRequest().setStatus("Hospital Accepted");
            JOptionPane.showMessageDialog(null, "Task Accepted, Animal will arrive soon");
            popTable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = tblRequest.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a request from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AnimalRecord ar = (AnimalRecord)tblRequest.getValueAt(row, 0);
        if (ar.getHospitalRequest().getStatus().equals("Hospital Accepted") || ar.getHospitalRequest().getStatus().equals("Vet Assigned")) {
            JOptionPane.showMessageDialog(null, "Can not decline this accepted request.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {        
            ar.getHospitalRequest().setStatus("Hospital Declined");
            JOptionPane.showMessageDialog(null, "Task Declined");
            userAccount.getWorkQueue().deleteRequest((WorkRequest)ar);
            popTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequest;
    // End of variables declaration//GEN-END:variables
}
