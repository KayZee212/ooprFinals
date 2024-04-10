import javax.swing.*;
import java.awt.*;

//Adjust nyo yung mga components if needed E] 
public class loginScreen {

    public static void main(String[] args) {
        JFrame loginWindow = new JFrame();
        loginWindow.setSize(1000, 800);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginWindow.setLocationRelativeTo(null);

        JPanel panel = new RoundedPanel(20); // Radius Intensity
        panel.setLayout(null);

        JLabel userdonthaveacc = new JLabel("Don't have an acccount?");
        userdonthaveacc.setBounds(230, 450, 150, 25);
        panel.add(userdonthaveacc);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(250, 250, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(340, 250, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(250, 290, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(340, 290, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(375, 330, 80, 25);
        panel.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(470, 450, 100, 25);
        panel.add(registerButton);

        loginWindow.add(panel);
        loginWindow.setVisible(true);
    }

    // rounded rectangle box
    static class RoundedPanel extends JPanel {
        private int arcRadius; // Radius for rounding corners

        public RoundedPanel(int arcRadius) {
            this.arcRadius = arcRadius;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            // (eto yung test kung makikita yung arc ng border radius tanggalin nalang if
            // needed)
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // experiment
            g2d.setColor(getBackground());
            // Smaller rectangle dimensions(basically the edge and size both above and
            // bellow ark)
            g2d.fillRoundRect(210, 200, 390, 340, arcRadius, arcRadius);
            g2d.setColor(Color.BLACK);
            // Smaller rectangle dimensions(basically the edge and size both above and
            // bellow ark)
            g2d.drawRoundRect(210, 200, 390, 340, arcRadius, arcRadius);
            g2d.dispose();
        }
        // END (jamikulgnscreen 1.0)
        //omsim

    }
}
