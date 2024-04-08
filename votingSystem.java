import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class votingSystem {

    private JFrame Frame;
    private Label Label;
    private Panel home;

    public votingSystem() {
        Frame = new JFrame("Voting System putangina");
        Frame.setSize(960, 540);
        Frame.setResizable(false);
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label = new Label("");
        Label.setBounds(220, 0, 170, 50);

        // panel
        home = new Panel();
        home.setLayout(null);
        home.add(Label);
        Frame.add(home);
        Frame.setVisible(true);
    }

    public void showResult() {
    }

    public static void main(String[] args) {
        votingSystem vs = new votingSystem();
        vs.showResult();
    }
}
