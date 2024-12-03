// RestaurantSelectionFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantSelectionFrame extends JFrame implements ActionListener {
    private String userName, userMobile, userAddress;
    private JComboBox<String> restaurantComboBox;
    private JButton selectButton;
    private JPanel panel;

    public RestaurantSelectionFrame(String userName, String userMobile, String userAddress) {
        this.userName = userName;
        this.userMobile = userMobile;
        this.userAddress = userAddress;

        setTitle("Select Restaurant");
        setSize(360, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 204, 204));

        JLabel selectLabel = new JLabel("Select a Restaurant:");
        selectLabel.setBounds(20, 200, 150, 25);
        panel.add(selectLabel);

        String[] restaurants = {"JAM-JAM Restaurant", "JS Restaurant", "Monir Restaurent", "Bhai Bhai Hotel","ABC Restaurant","Bismillah Hotel"};
        restaurantComboBox = new JComboBox(restaurants);
        restaurantComboBox.setBounds(170, 200, 150, 25);
        panel.add(restaurantComboBox);

        selectButton = new JButton("Select");
        selectButton.setBounds(120, 250, 100, 30);
        selectButton.addActionListener(this);
        panel.add(selectButton);

        setContentPane(panel);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectButton) {
            String selectedRestaurant = (String) restaurantComboBox.getSelectedItem();
            MenuFrame menuFrame = new MenuFrame(userName, userMobile, userAddress, selectedRestaurant);
            menuFrame.setVisible(true);
            dispose();
        }
    }
}
