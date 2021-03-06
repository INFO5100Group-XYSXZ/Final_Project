/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OperationEnterpriseAdminRole;


import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrganizationDirectory directory;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        organizationJComboBox.addItem(Organization.Type.IncidentManagement);
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        int admin = 0;
        int coor = 0;
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[4];
            row[0] = organization.getType();
            row[1] = organization.getName();
            
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getRole().toString().equals(Role.RoleType.CoordinatorAdmin.getValue())) {
                    admin++;
                }
                if (ua.getRole().toString().equals(Role.RoleType.Coordinator.getValue())) {
                    coor++;
                }
            }
            row[2] = admin;
            row[3] = coor;
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setText("Add Organization");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Organization Type ");

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Type", "Organization Name", "# of Admin", "# of Coordinator"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(organizationJTable);

        jLabel3.setText("Organization Name");

        txtOrgName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrgNameFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Manage Organization in Operation Enterprise");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/incidentOrg.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel4)))
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(btnAdd)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
Organization.Type type = (Organization.Type) organizationJComboBox.getSelectedItem();
        if (txtOrgName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter organization name!");
            return;
        }
        if (directory.getOrganizationList().isEmpty()) {
            Organization org = directory.createOrganization(type);
            org.setName(txtOrgName.getText());
            populateTable();
            txtOrgName.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "The operation enterprise only has one organizaiton.","information",JOptionPane.INFORMATION_MESSAGE);
            txtOrgName.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtOrgNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrgNameFocusLost

    }//GEN-LAST:event_txtOrgNameFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtOrgName;
    // End of variables declaration//GEN-END:variables
}
