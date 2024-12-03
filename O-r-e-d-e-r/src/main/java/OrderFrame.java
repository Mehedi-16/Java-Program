import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderFrame extends JFrame implements ActionListener {
    private String userName, userMobile, userAddress, restaurantName;
    private JComboBox<String> menuComboBox;
    private JLabel nameLabel, priceLabel;
    private JButton addToCartButton, placeOrderButton;
    private JTextArea cartTextArea;

    private double totalOrderPrice;

    public OrderFrame(String userName, String userMobile, String userAddress, String restaurantName) {
        this.userName = userName;
        this.userMobile = userMobile;
        this.userAddress = userAddress;
        this.restaurantName = restaurantName;

        setTitle("Place Order at " + restaurantName);
        setSize(360, 640);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        String[] menuItems = {"Pizza", "Burger", "Salad", "Pasta", "Sandwich"};
        menuComboBox = new JComboBox<>(menuItems);
        menuComboBox.setBounds(50, 20, 200, 30);
        menuComboBox.addActionListener(this);
        add(menuComboBox);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(60, 50, 100, 30);
        add(nameLabel);

        priceLabel = new JLabel("Price:");
        priceLabel.setBounds(60, 75, 100, 30);
        add(priceLabel);

        addToCartButton = new JButton("Add to Cart");
        addToCartButton.setBounds(50, 100, 200, 30);
        addToCartButton.addActionListener(this);
        add(addToCartButton);

        cartTextArea = new JTextArea();
        cartTextArea.setBounds(50, 130, 290, 120);
        add(cartTextArea);

        placeOrderButton = new JButton("Place Order");
        placeOrderButton.setBounds(150, 280, 120, 30);
        placeOrderButton.addActionListener(this);
        add(placeOrderButton);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuComboBox) {
            String selectedItem = (String) menuComboBox.getSelectedItem();
            double price = getPrice(selectedItem);
            nameLabel.setText("Name: " + selectedItem);
            priceLabel.setText("Price: ৳" + price);
        } else if (e.getSource() == addToCartButton) {
            String selectedItem = (String) menuComboBox.getSelectedItem();
            cartTextArea.append(selectedItem + "\n");
        } else if (e.getSource() == placeOrderButton) {
            calculateTotalOrderPrice();
            JOptionPane.showMessageDialog(this, "Total Order Price at " + restaurantName + ": ৳" + totalOrderPrice);
            showPaymentMethodDialog();
        }
    }

    private double getPrice(String item) {
        switch (item) {
            case "Pizza":
                return 499;
            case "Burger":
                return 249;
            case "Salad":
                return 5;
            case "Pasta":
                return 217;
            case "Sandwich":
                return 138;
            default:
                return 0.0;
        }
    }

    private void calculateTotalOrderPrice() {
        totalOrderPrice = 0.0;
        String[] cartItems = cartTextArea.getText().split("\n");
        for (String item : cartItems) {
            totalOrderPrice += getPrice(item.trim());
        }
    }

    private void showPaymentMethodDialog() {
        String[] options = {"Nagad", "Debit Card", "Bkash", "Cash on Delivery"};
        int choice = JOptionPane.showOptionDialog(this, "Choose a Payment Method", "Payment", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice != JOptionPane.CLOSED_OPTION) {
            String paymentMethod = options[choice];
            JOptionPane.showMessageDialog(this, "Thank you for your order! Your payment has been received via " + paymentMethod +
                    ".\n" + restaurantName + " has been notified. Your food will be delivered shortly.");
            dispose();
        }
    }
}
