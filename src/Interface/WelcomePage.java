package Interface;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

//Frame 1
public class WelcomePage extends JFrame {
    private JButton loginButton;
    private JButton signupButton;

    public WelcomePage() {
        loginButton = new JButton("Log in");
        signupButton = new JButton("Sign up");

        // Add action listeners to the buttons
        loginButton.addActionListener(e -> showLogInWindow());
        signupButton.addActionListener(e -> showSignUpWindow());

        // Add the buttons to the main frame
        JPanel panel = new JPanel();
        panel.add(loginButton);
        panel.add(signupButton);
        add(panel);

        // Set the main frame properties
        setTitle("Jusay Bank");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void showLogInWindow() {
        LogInFrame logInPage = new LogInFrame();
        logInPage.setVisible(true);
        dispose(); // Close the main frame
    }

    private void showSignUpWindow() {
        SignUpFrame registrationFrame = new SignUpFrame();
        registrationFrame.setVisible(true);
        dispose(); // Close the main frame
    }

}


