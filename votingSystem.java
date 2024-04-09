import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class votingSystem {

    private JFrame Frame;
    private Label sideBarLabel1;
    private Panel home;
    private Button vote;

    public votingSystem() {
        Frame = new JFrame("Voting System");
        Frame.setSize(1000, 600); //dimensions
        Frame.setResizable(false);
        Frame.setLocationRelativeTo(null); //puts frame to middle of screen
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLayout(null);



        // labels
        sideBarLabel1 = new Label("Voting");
        sideBarLabel1.setBounds(10, 10, 220, 50);
        sideBarLabel1.setFont(new Font("Verdana", Font.PLAIN, 34));

        // button box
        vote = new Button("Vote");
        vote.setBounds(890, 515, 90, 40);
        vote.setFont(new Font("Verdana", Font.PLAIN, 28));


        // panel
        home = new Panel();
        home.setLayout(null);
        Frame.add(home); // this stays here
        Frame.add(sideBarLabel1);
        Frame.add(vote);
        Frame.setVisible(true);

    }

    public void showResult() {
    }

    public static void main(String[] args) {

        votingSystem vs = new votingSystem();
        vs.showResult();

    }
}
