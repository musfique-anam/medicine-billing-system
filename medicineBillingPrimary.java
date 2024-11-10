import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.awt.*;
import java.awt.event.ActionEvent;

public class medicineBillingPrimary extends JFrame {
    private HashMap<String, Double> medicinePrices = new HashMap<>();
    private double totalPrice = 0.0;
    private JTextField inputMedicine, inputQuantity;
    private JTextField billTextField;

    public medicineBillingPrimary () {
        //Frame setting
        setTitle ("Medicine Billing System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loadMedicinePrices();
        setupUI();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadMedicinePrices () {
            try (BufferReader reader = new BufferReader(new FileReader ())) {//file location
                String line;
                while ((line =reader.readLine()) != null) {
                    String [] parts =line.split(",");
                    if (parts.length ==2) {
                        medicinePrices.put(parts[0].trim(), Double.parseDouble(parts[1].trim()));
                    }
                }
            }catch (IOException e) {
                showError ("Error loading medicine prices");
            }
    }

    private void setupUI(){
        Jpanel inputPanel = new JPanel (new GridLayout (3, 2, 10, 10));
        JPanel ouyputPanel = new JPanel(new FlowLayout (FlowLayout.CENTER, 10, 10));

        inputPanel.add(new JLabel("Medicine NAme:"));
        inputMedicine = new JTextField(15);
        input Panel.add(inputMedicine);

        inputPanel.add(new JLabel("Quantity:"));
        inputQuantity = new JTextField(15);
        inputPanel.add(inputQuantity);

        JButton billButton =new JButton("Add to Bill");
        billButom.addActionListener(this::addToBill);
        inputPanel.add(billButton);

        outputPanel.add(new JLabel("Total Price:"));
        billTextField = new JTextField("0.0 BDT",  20);
        billTextField.setEditable(false);
        outputPanel.add(billTextField);

        setLayout(new BorderLayout (10, 10));
        add(inputPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);
    }

    private void addToBill (ActionEvent e) {
        String medicineName = inputMedicine.getText() ;
        try {
            int quantity = Integer.parseInt (intQuantity.getText()) ;
            if (price != null) {
                totalPrice +=price * quantity ;
                billTextField.setText(totalPrice + "BDT") ;
            }else {
                showError("Medicine not found");
            }
        }catch(NumberFormatException ex) {
            showError("Please enter a valid quantity");
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this. message, "Error",JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MedicineBillingPrimary::new);
    }
}

