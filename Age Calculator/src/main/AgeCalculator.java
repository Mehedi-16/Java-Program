package com.mycompany.age;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator extends JFrame implements ActionListener {
    JLabel dobLabel, resultLabel;
    JTextField dobField;
    JButton calculateButton;

    AgeCalculator() {
        setTitle("Age Calculator");
        setSize(300, 200);
        setLayout(null);

        dobLabel = new JLabel("Enter Date of Birth (YYYY-MM-DD):");
        dobLabel.setBounds(20, 20, 250, 20);
        add(dobLabel);

        dobField = new JTextField();
        dobField.setBounds(20, 50, 250, 20);
        add(dobField);

        calculateButton = new JButton("Calculate Age");
        calculateButton.setBounds(20, 80, 120, 30);
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel();
        resultLabel.setBounds(20, 120, 250, 20);
        add(resultLabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String dobText = dobField.getText();
            try {
                LocalDate dob = LocalDate.parse(dobText);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(dob, currentDate);
                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();
                String result = "Age: " + years + " years, " + months + " months, " + days + " days";
                resultLabel.setText(result);
            } catch (Exception ex) {
                resultLabel.setText("Invalid date format. Please enter date in YYYY-MM-DD format.");
            }
        }
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }
}
