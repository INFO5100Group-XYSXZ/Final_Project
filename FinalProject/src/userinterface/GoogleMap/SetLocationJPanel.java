/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GoogleMap;

import Business.Location.LocationPoint;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import userinterface.RescueEnterpriseAdminRole.ManageOrganizationJPanel;
import userinterface.WitnessRole.ReportStrayAnimalJPanel;

/**
 *
 * @author suoxiyue
 */
public class SetLocationJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LocationPoint locationPoint;
    Browser browser;
    /**
     * Creates new form SetLocationJPanel
     */
    public SetLocationJPanel(JPanel container) {
        initComponents();
        this.userProcessContainer = container;
        locationPoint = new LocationPoint();
        
        EngineOptions options = 
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDJDKIKHVL2Q2VI3E34XQZ5G211LU05I6XP5A8BT27CM3NEWADPZS16TNTCXIKJI0G0N").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");
        
        map.add(view, "a");
        //map.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnSetLocation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        map = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(45);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(240, 232, 179));

        btnSetLocation.setBackground(new java.awt.Color(255, 255, 255));
        btnSetLocation.setText("Set Location ");
        btnSetLocation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSetLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetLocationActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-maps.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnSetLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        map.setBackground(new java.awt.Color(255, 255, 255));
        map.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        map.setPreferredSize(new java.awt.Dimension(0, 0));
        map.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(map);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetLocationActionPerformed
        // TODO add your handling code here:
        try {

            if (browser.url()!= null) {

                System.out.println(browser.url());
                String[] a = browser.url().split("!3d", 0);
                //System.out.println(a.length);
                String[] b = a[1].split("!4d");
                System.out.println("Lat" + b[0] + "  " + "Lon" + b[1]);
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
                locationPoint.setLatitude(lat);
                locationPoint.setLongitude(lon);
            }
            System.out.println("Lat" + locationPoint.getLatitude() + locationPoint.getLongitude());

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            
            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof ReportStrayAnimalJPanel) {
                ReportStrayAnimalJPanel jp = (ReportStrayAnimalJPanel)userProcessContainer.getComponent(componentArray.length - 1);
                jp.populateLongituteLatitude(locationPoint);
            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof ManageOrganizationJPanel) {
                ManageOrganizationJPanel jp = (ManageOrganizationJPanel)userProcessContainer.getComponent(componentArray.length - 1);
                jp.populateLongituteLatitude(locationPoint);
            } else {
                 System.out.println("ELSE LOCATION " + componentArray.length);
                 System.out.println("ELSE CONTAINER " + userProcessContainer.toString());
            }
            
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Set Position first");         
        }
    }//GEN-LAST:event_btnSetLocationActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel map;
    // End of variables declaration//GEN-END:variables
}
