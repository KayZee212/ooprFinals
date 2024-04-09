import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class votingSystem {

    private JFrame Frame;
    private Label Label;
    private Panel home;

    public votingSystem() {
        Frame = new JFrame("Voting System");
        Frame.setSize(1000, 600); //dimensions
        Frame.setResizable(false);
        Frame.setLocationRelativeTo(null); //puts frame to middle of screen
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
