import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class RegistrationFrame extends JFrame implements ActionListener {
    public JTextField nameField, mobileField, addressField;
    public JButton registerButton, getLocationButton;
    public  JPanel panel;
    public  JComboBox<String> divisionComboBox;
    public  Map<String, String> divisionAddressMap;

    public RegistrationFrame() {
        setTitle("User Registration");
        setSize(360, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(176, 224, 230));

        JLabel headingLabel = new JLabel("-----𝐔𝐬𝐞𝐫 𝐑𝐞𝐠𝐢𝐬𝐭𝐫𝐚𝐭𝐢𝐨𝐧-----");
        headingLabel.setBounds(100, 30, 250, 50);
        panel.add(headingLabel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 120, 100, 25);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(120, 120, 200, 25);
        panel.add(nameField);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(20, 160, 100, 25);
        panel.add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(120, 160, 200, 25);
        panel.add(mobileField);

        JLabel divisionLabel = new JLabel("Division:");
        divisionLabel.setBounds(20, 200, 100, 25);
        panel.add(divisionLabel);

        divisionComboBox = new JComboBox<>();
        divisionComboBox.setBounds(120, 200, 200, 25);
        panel.add(divisionComboBox);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 240, 100, 25);
        panel.add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(120, 240, 200, 25);
        panel.add(addressField);
        
        getLocationButton = new JButton("Get Location");
        getLocationButton.setBounds(120, 280, 120, 30);
        getLocationButton.addActionListener(this);
        panel.add(getLocationButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(120, 360, 150, 25);
        registerButton.addActionListener(this);
        panel.add(registerButton);

        

        populateDivisionComboBox();

        setContentPane(panel);
        setLocationRelativeTo(null);
    }

    private void populateDivisionComboBox() {
        String[] divisions = {"Dhaka", "Chittagong", "Rajshahi", "Khulna", "Barishal", "Sylhet", "Rangpur", "Mymensingh"};

        for (String division : divisions) {
            divisionComboBox.addItem(division);
        }

        divisionAddressMap = new HashMap<>();
        divisionAddressMap.put("Dhaka", "Dhaka");
        divisionAddressMap.put("Chittagong", "Chittagong");
        divisionAddressMap.put("Rajshahi", "Rajshahi");
        divisionAddressMap.put("Khulna", "Khulna");
        divisionAddressMap.put("Barishal", "Dumki");
        divisionAddressMap.put("Sylhet", "Sylhet");
        divisionAddressMap.put("Rangpur", "Kurigram");
        divisionAddressMap.put("Mymensingh", "Mymensingh");

        addressField.setText(divisionAddressMap.get(divisions[0]));

        divisionComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDivision = (String) divisionComboBox.getSelectedItem();
                addressField.setText(divisionAddressMap.get(selectedDivision));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String mobile = mobileField.getText();
            String address = addressField.getText();

            if (!name.isEmpty() && !mobile.isEmpty() && !address.isEmpty()) {
                RestaurantSelectionFrame restaurantSelectionFrame = new RestaurantSelectionFrame(name, mobile, address);
                restaurantSelectionFrame.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all the fields.");
            }
        } else if (e.getSource() == getLocationButton) {
            try {
                String googleMapsUrl = "https://www.google.com/maps/@22.4555171,90.3821418,12.89z?entry=ttu" + addressField.getText();
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI(googleMapsUrl));
                } else {
                    JOptionPane.showMessageDialog(this, "Could not open the default browser.");
                }
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error opening the browser: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        RegistrationFrame registrationFrame = new RegistrationFrame();
        registrationFrame.setVisible(true);
    }
}
