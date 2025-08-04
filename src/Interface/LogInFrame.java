package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Frame 2
public class LogInFrame extends JFrame{
    private JLabel enterIIN;
    private JButton backButton;
    private JButton nextButton;
    private JTextField IINTextField;

    public LogInFrame() {
        enterIIN = new JLabel("Please, enter your IIN:\n");
        IINTextField = new JTextField(10);

        backButton = new JButton("Back");
        nextButton = new JButton("Next");
        backButton.addActionListener(e -> showBackButton());
        nextButton.addActionListener(e -> showNextButton());

        // Add the label to the welcome frame
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(enterIIN);
        panel.add(IINTextField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(backButton);
        buttonPanel.add(nextButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panel, BorderLayout.WEST);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);


        // Set the welcome frame properties
        setTitle("Log in");
        setSize(400, 150);
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
