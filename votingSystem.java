import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class votingSystem {

    private JFrame Frame;
    private Label sideBarLabel1, sideBarLabel2;
    private Panel sideBar;
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
        sideBarLabel1.setBounds(10, 10, 220, 35);
        sideBarLabel1.setFont(new Font("Bahnschrift", Font.PLAIN, 28));

        sideBarLabel2 = new Label("System");
        sideBarLabel2.setBounds(10, 40, 220, 35);
        sideBarLabel2.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        
        // button box
        vote = new Button("Vote");
        vote.setBounds(890, 515, 90, 35);
        vote.setFont(new Font("Bahnschrift", Font.PLAIN, 28));

        // panel
        sideBar = new Panel();
        sideBar.setLayout(null);
        Frame.add(sideBar); // this is a panel
        Frame.add(sideBarLabel1);
        Frame.add(sideBarLabel2);
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
