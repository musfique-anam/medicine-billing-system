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



    }
    
}
