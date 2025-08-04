package Interface;
import javax.swing.*;
import java.awt.*;

//Frame3
public class SignUpFrame extends JFrame {
    private JLabel registrationLabel;
    private JLabel IINLabel;
    private JLabel nameLabel;
    private JLabel lastnameLabel;
    private JLabel phoneNumberLabel;
    private JTextField IINField;
    private JTextField nameField;
    private JTextField lastnameField;
    private JTextField phoneNumberField;
    private JButton backButton;
    private JButton nextButton;


    public SignUpFrame() {
        registrationLabel = new JLabel("Enter your personal data\n");
        IINLabel = new JLabel("\nIIN: ");
        IINField = new JTextField(10);

        nameLabel = new JLabel("\nName: ");
        nameField = new JTextField(10);

        lastnameLabel = new JLabel("\nLast name: ");
        lastnameField = new JTextField(10);

        phoneNumberLabel = new JLabel("\nPhone number: ");
        phoneNumberField = new JTextField(10);

        backButton = new JButton("Back");
        nextButton = new JButton("Next");
        backButton.addActionListener(e -> showBackButton());
        nextButton.addActionListener(e -> showNextButton());

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(IINLabel);
        panel.add(IINField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(lastnameLabel);
        panel.add(lastnameField);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumberField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(registrationLabel, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.WEST);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Sign up");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void showBackButton() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.setVisible(true);
        dispose(); // Close the main frame
    }

    private void showNextButton() {
        //Просто для примера, дальше класс "счета" создадим, нанего будем переходить

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.setVisible(true);
        dispose(); // Close the main frame
    }
}
