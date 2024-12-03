import javax.swing.SwingUtilities;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationFrame registrationFrame = new RegistrationFrame();
            registrationFrame.setVisible(true);
        });
    }
}
