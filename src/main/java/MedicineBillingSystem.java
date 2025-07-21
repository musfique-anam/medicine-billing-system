import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MedicineBillingSystem extends JFrame {

    private HashMap<String, Double> medicineHM;
    private double totalPrice = 0.0;
    
    public MedicineBillingSystem() {
        initComponents();// This initializes the GUI components
        initMedicinePrices();
    }
    
    private void initMedicinePrices() {
        medicineHM = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/medicine_prices.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    Double price = Double.parseDouble(parts[1].trim());
                    medicineHM.put(name, price);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading medicine prices", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        inputPanel = new javax.swing.JPanel();
        medicineName = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        inputQuantity = new javax.swing.JTextField();
        billButton = new javax.swing.JButton();
        inputMedicine = new javax.swing.JTextField();
        outputpanel = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        billTextField = new java.awt.TextField();
        title = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medicine Billing System");

        inputPanel.setBackground(new java.awt.Color(204, 204, 255));

        medicineName.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        medicineName.setText("Medicine Name                    :");

        quantity.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        quantity.setText("Quantity                                 :");

        inputQuantity.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        inputQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantityActionPerformed(evt);
            }
        });

        billButton.setBackground(new java.awt.Color(153, 204, 255));
        billButton.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        billButton.setText("Add to Bill");
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });

        inputMedicine.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        inputMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMedicineActionPerformed(evt);
            }
        });

        outputpanel.setBackground(new java.awt.Color(255, 153, 153));

        total.setBackground(new java.awt.Color(153, 153, 255));
        total.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        total.setText("Total Price                            :");
        total.setPreferredSize(new java.awt.Dimension(150, 25));

        billTextField.setBackground(new java.awt.Color(255, 204, 204));
        billTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        billTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        billTextField.setText("                         0.0 BDT");
        billTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outputpanelLayout = new javax.swing.GroupLayout(outputpanel);
        outputpanel.setLayout(outputpanelLayout);
        outputpanelLayout.setHorizontalGroup(
            outputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputpanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(billTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        outputpanelLayout.setVerticalGroup(
            outputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputpanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(outputpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(billTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        title.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(102, 102, 102));
        title.setText("    Medicine Billing System");
        title.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        title.setMaximumSize(new java.awt.Dimension(130, 20));
        title.setMinimumSize(new java.awt.Dimension(130, 20));

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outputpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(medicineName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billButton, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(inputQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(inputMedicine))
                .addGap(42, 42, 42))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicineName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity))
                .addGap(39, 39, 39)
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(outputpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(inputPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTextFieldActionPerformed
        //event handling code
    }//GEN-LAST:event_billTextFieldActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
    String medicineName = inputMedicine.getText();
    int quantity = Integer.parseInt(inputQuantity.getText());
    Double price = medicineHM.get(medicineName);
    if (price != null) {
        double itemTotal = price * quantity;
        totalPrice += itemTotal; // Add the item's total to the overall bill
        billTextField.setText(totalPrice + "BDT");
    } else {
        JOptionPane.showMessageDialog(this, "Medicine not found", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_billButtonActionPerformed

    private void inputQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantityActionPerformed
        //event handling code
    }//GEN-LAST:event_inputQuantityActionPerformed

    private void inputMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMedicineActionPerformed
        //event handling code
    }//GEN-LAST:event_inputMedicineActionPerformed
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedicineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }                
        // Create and display the form         
        java.awt.EventQueue.invokeLater(new Runnable() { 
        public void run() {
            new MedicineBillingSystem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billButton;
    private java.awt.TextField billTextField;
    private javax.swing.JTextField inputMedicine;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JTextField inputQuantity;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel medicineName;
    private javax.swing.JPanel outputpanel;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
