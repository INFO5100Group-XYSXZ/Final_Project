/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CoordinatorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueEnterprise;
import Business.Network.Network;
import Business.Organization.AnimalHospitalOrganization;
import Business.Organization.AnimalShelterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnimalRecord;
import Business.WorkQueue.HospitalRequest;
import Business.WorkQueue.ShelterRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxi
 */
public class AssignShelterJPanel extends javax.swing.JPanel {

    private JPanel container;
    EcoSystem system;
    AnimalRecord animalRecord;
    /**
     * Creates new form AssignShelterJPanel
     */
    public AssignShelterJPanel(JPanel container, EcoSystem sys, AnimalRecord ar) {
        initComponents();
        this.container = container;
        this.system = sys;
        this.animalRecord = ar;
        
        popTable();
        displayInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShelter = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        comboAdmin = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblShelter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Animal Shelter", "Organization ID", "# of Task"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblShelter);

        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dog_house.png"))); // NOI18N
        btnAssign.setBorderPainted(false);
        btnAssign.setContentAreaFilled(false);
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Message to Shelter");

        jLabel2.setText("Please Choose A Shelter Admin");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assignShelter.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(427, 427, 427))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80)))
                                    .addComponent(comboAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(578, 578, 578))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(732, 732, 732)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void displayInfo(){
        ListSelectionModel model = tblShelter.getSelectionModel();
        model.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tblShelter.getSelectedRow();
                if(row>=0) {

                Organization org = (Organization)tblShelter.getValueAt(row, 0);
                comboAdmin.removeAllItems();;
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println("combo role: " + ua.getRole()); //test
                    if (ua.getRole().toString().equals("ShelterAdmin") ) {
                        comboAdmin.addItem(ua);
                    }
                }
            }
            }
        });
    }
    
    
        public void popTable(){
        DefaultTableModel model = (DefaultTableModel)tblShelter.getModel();
        model.setRowCount(0);
        
        for (Network n : system.getNetworkList()) {        
        
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                //System.out.println(e.getWorkQueue().getWorkRequestList().size());
                if (e instanceof RescueEnterprise) {
                    //System.out.println("in rescue enterprise"); //test
                    for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof AnimalShelterOrganization) {                             
                                        Object row[] = new Object[3];
                                        row[0] = org;
                                        row[1] = org.getOrganizationID();
//                                        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
//                                            //System.out.println("ua role: " + ua.getRole()); //test
//                                            if (ua.getRole().toString().equals("ShelterAdmin") ) {
//                                                row[2] = ua;
//                                                break;
//                                            } else {
//                                                row[2] = "Shelter has no administrator";
//                                            }
//                                        }
                                        row[2] = org.getWorkQueue().getWorkRequestList().size();
                                        ((DefaultTableModel)tblShelter.getModel()).addRow(row);
                        }
                    }
                }
            }
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignedCaseJPanel nacjp = (AssignedCaseJPanel) component;
        nacjp.popTable();
        nacjp.reset();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int row = tblShelter.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a shelter from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtMessage.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please write a message to shelter", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Organization org = (Organization)tblShelter.getValueAt(row, 0);        
        UserAccount ua = (UserAccount)comboAdmin.getSelectedItem();  
        if (ua == null) {
             JOptionPane.showMessageDialog(null, "Please select a shelter administrator to request", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        animalRecord.getShelterRequest().setShelterOrg(org);
        animalRecord.addMessage("Coordinator assign shelter. Message to shelter: " + txtMessage.getText());
        animalRecord.getShelterRequest().setLatestMessage(txtMessage.getText());
        animalRecord.getShelterRequest().setStatus("Shelter Assigned");
        org.getWorkQueue().getWorkRequestList().add(animalRecord);
        ua.getWorkQueue().getWorkRequestList().add(animalRecord);
        
        JOptionPane.showMessageDialog(null, "Request sent to Shelter Administrator !");
        txtMessage.setEnabled(false);
        btnAssign.setEnabled(false);
        
        popTable();
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShelter;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
