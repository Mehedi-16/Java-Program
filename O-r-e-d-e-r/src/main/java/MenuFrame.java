import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame implements ActionListener {
    private String userName, userMobile, userAddress, restaurantName;
    private JButton viewMenuButton, placeOrderButton, leaveReviewButton, logoutButton, trackOrderButton;
    private JPanel panel;

    public MenuFrame(String userName, String userMobile, String userAddress, String restaurantName) {
        this.userName = userName;
        this.userMobile = userMobile;
        this.userAddress = userAddress;
        this.restaurantName = restaurantName;

        setTitle(restaurantName + " - Menu");
        setSize(360, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 204, 204));

        JLabel restaurantLabel = new JLabel("Welcome, " + userName + "!");
        restaurantLabel.setBounds(100, 30, 250, 50);
        panel.add(restaurantLabel);

        viewMenuButton = new JButton("View Menu");
        viewMenuButton.setBounds(50, 100, 260, 50);
        viewMenuButton.addActionListener(this);
        panel.add(viewMenuButton);

        placeOrderButton = new JButton("Place Order");
        placeOrderButton.setBounds(50, 200, 260, 50);
        placeOrderButton.addActionListener(this);
        panel.add(placeOrderButton);

         trackOrderButton = new JButton("Track Order");
        trackOrderButton.setBounds(50, 400, 260, 50);
        trackOrderButton.addActionListener(this);
        panel.add(trackOrderButton);
        
        leaveReviewButton = new JButton("Leave a Review");
        leaveReviewButton.setBounds(50, 300, 260, 50);
        leaveReviewButton.addActionListener(this);
        panel.add(leaveReviewButton);

       

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 500, 260, 50);
        logoutButton.addActionListener(this);
        panel.add(logoutButton);

        setContentPane(panel);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewMenuButton) {
            String menu = "Menu for " + restaurantName + ":\n";
            menu += "1. Pizza - ৳499\n";
            menu += "2. Burger - ৳249\n";
            menu += "3. Pasta - ৳217\n";
            menu += "4. Sandwich - ৳138\n";
            menu += "5. Salad - ৳5.00\n";

            JOptionPane.showMessageDialog(this, menu);
        } else if (e.getSource() == placeOrderButton) {
            OrderFrame orderFrame = new OrderFrame(userName, userMobile, userAddress, restaurantName);
            orderFrame.setVisible(true);
            dispose();
        } else if (e.getSource() == leaveReviewButton) {
            String review = JOptionPane.showInputDialog(this, "Leave your review for " + restaurantName + ":");
            if (review != null && !review.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Thank you for your review!");
            }
        } else if (e.getSource() == trackOrderButton) {
            trackOrder();
        } else if (e.getSource() == logoutButton) {
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                RegistrationFrame registrationFrame = new RegistrationFrame();
                registrationFrame.setVisible(true);
                dispose();
            }
        }
    }

    private void trackOrder() {
        String trackingInfo = "1.Order is being prepared...\n";
        trackingInfo += "2.Order is out for delivery...\n";
        trackingInfo += "3.Order has been delivered!";

        JOptionPane.showMessageDialog(this, trackingInfo, "Order Tracking", JOptionPane.INFORMATION_MESSAGE);
    }
}
