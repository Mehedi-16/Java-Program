import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BloodDonationApp extends JFrame implements ActionListener {
    // Components
    private JLabel nameLabel, ageLabel, genderLabel, bloodGroupLabel, weightLabel, phoneNumberLabel, donationDateLabel;
    private JTextField nameField, ageField, weightField, phoneNumberField, donationDateField;
    private JComboBox<String> genderComboBox, bloodGroupComboBox;
    private JButton registerButton, donorListButton;

    // Donor list
    private ArrayList<Donor> donorList;

    // Constructor
    public BloodDonationApp() {
        // Set frame properties
        setTitle("Blood Donation Registration");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize donor list
        donorList = new ArrayList<>();

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 200, 20);
        add(nameField);

        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(30, 60, 80, 20);
        add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(120, 60, 100, 20);
        add(ageField);

        weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(30, 90, 80, 20);
        add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(120, 90, 100, 20);
        add(weightField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 120, 80, 20);
        add(genderLabel);

        String[] genders = {"Male", "Female", "Other"};
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(120, 120, 100, 20);
        add(genderComboBox);

        bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupLabel.setBounds(30, 150, 80, 20);
        add(bloodGroupLabel);

        String[] bloodGroups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        bloodGroupComboBox = new JComboBox<>(bloodGroups);
        bloodGroupComboBox.setBounds(120, 150, 100, 20);
        add(bloodGroupComboBox);

        phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setBounds(30, 180, 100, 20);
        add(phoneNumberLabel);

        phoneNumberField = new JTextField();
        phoneNumberField.setBounds(120, 180, 200, 20);
        add(phoneNumberField);

        donationDateLabel = new JLabel("Last Donation Date:");
        donationDateLabel.setBounds(30, 210, 120, 20);
        add(donationDateLabel);

        donationDateField = new JTextField();
        donationDateField.setBounds(160, 210, 100, 20);
        add(donationDateField);

        registerButton = new JButton("Register");
        registerButton.setBounds(50, 240, 100, 30);
        registerButton.addActionListener(this);
        add(registerButton);

        donorListButton = new JButton("Donor List");
        donorListButton.setBounds(200, 240, 100, 30);
        donorListButton.addActionListener(this);
        add(donorListButton);

        // Set frame visibility
        setVisible(true);
    } 

    // ActionPerformed method for buttons
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Get user inputs
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String gender = (String) genderComboBox.getSelectedItem();
            String bloodGroup = (String) bloodGroupComboBox.getSelectedItem();
            String phoneNumber = phoneNumberField.getText();
            String donationDate = donationDateField.getText();
            // Validate age and weight
            if (age < 18 && (age < 18 && weight < 50)) {
                JOptionPane.showMessageDialog(this, "You must be at least 18 years old and weigh at least 50 kg to donate blood.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Add user to donor list
                donorList.add(new Donor(name, age, weight, gender, bloodGroup, phoneNumber, donationDate));
                // Clear input fields
                nameField.setText("");
                ageField.setText("");
                weightField.setText("");
                genderComboBox.setSelectedIndex(0);
                bloodGroupComboBox.setSelectedIndex(0);
                phoneNumberField.setText("");
                donationDateField.setText("");
                JOptionPane.showMessageDialog(this, "Registration Successful!");
            }
        } else if (e.getSource() == donorListButton) {
            // Display donor list
            showDonorList();
        }
    }

    // Method to display donor list
    private void showDonorList() {
        StringBuilder donorListText = new StringBuilder("<html><body><h2>Donor List</h2><table border='1'><tr><th>Name</th><th>Blood Group</th><th>Phone Number</th><th>Last Donation Date</th></tr>");
        for (Donor donor : donorList) {
            donorListText.append("<tr><td>").append(donor.getName()).append("</td><td>").append(donor.getBloodGroup()).append("</td><td>").append(donor.getPhoneNumber()).append("</td><td>").append(donor.getLastDonationDate()).append("</td></tr>");
        }
        donorListText.append("</table></body></html>");
        JOptionPane.showMessageDialog(this, donorListText.toString(), "Donor List", JOptionPane.PLAIN_MESSAGE);
    }

    // Donor class
    private static class Donor {
        private String name;
        private int age;
        private int weight;
        private String gender;
        private String bloodGroup;
        private String phoneNumber;
        private String lastDonationDate;

        // Constructor
        public Donor(String name, int age, int weight, String gender, String bloodGroup, String phoneNumber, String donationDate) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.gender = gender;
            this.bloodGroup = bloodGroup;
            this.phoneNumber = phoneNumber;
            this.lastDonationDate = donationDate;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public String getBloodGroup() {
            return bloodGroup;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getLastDonationDate() {
            return lastDonationDate;
        }
    }

    // Main method
    public static void main(String[] args) {
        new BloodDonationApp();
    }
}
