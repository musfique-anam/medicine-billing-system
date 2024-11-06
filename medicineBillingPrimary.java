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
    
}
