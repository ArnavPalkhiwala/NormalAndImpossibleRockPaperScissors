import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ImpossibleRockPaperScissors implements ActionListener {

	JFrame frame = new JFrame("Rock Paper Scissors");
	JPanel panel = new JPanel(new BorderLayout());
	JLabel userScoreDisplay = new JLabel();
	JLabel compScoreDisplay = new JLabel();
	JButton rock = new JButton("Rock");
	JButton paper = new JButton("Paper");
	JButton scissors = new JButton("Scissors");
	GridLayout gl = new GridLayout(0, 2);
	int aiScore;

	public static void main(String[] args) {
		ImpossibleRockPaperScissors irps = new ImpossibleRockPaperScissors();
		irps.runGame();
	}

	void runGame() {
		panel.setLayout(gl);
		aiScore = 0;
		JOptionPane.showMessageDialog(null,
				"Hello, my name is AI, and I will be your opponent.\nTry your best to win! \nFor each round, press the rock, paper, or scissors button. \nI will my choice, and we will see who wins!");
		userScoreDisplay.setText("Your Score:0");
		compScoreDisplay.setText("AI Score: " + aiScore);
		userScoreDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		compScoreDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		rock.setHorizontalAlignment(SwingConstants.CENTER);
		paper.setHorizontalAlignment(SwingConstants.CENTER);
		scissors.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(panel);
		panel.add(userScoreDisplay);
		panel.add(compScoreDisplay);
		panel.add(rock);
		panel.add(paper);
		panel.add(scissors);
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissors.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int aiValue = rand.nextInt(3);

		if (e.getSource() == rock) {
			JOptionPane.showMessageDialog(null, "Lets go, I won! I picked paper! \nClick a button to play again.");
			aiScore += 1;
			compScoreDisplay.setText("AI Score: " + aiScore);

		}

		else if (e.getSource() == paper) {

			JOptionPane.showMessageDialog(null, "Lets go, I won! I picked scissors! \nClick a button to play again.");
			aiScore += 1;
			compScoreDisplay.setText("AI Score: " + aiScore);

		}

		else {
			JOptionPane.showMessageDialog(null, "Lets go, I won! I picked rock! \nClick a button to play again.");
			aiScore += 1;
			compScoreDisplay.setText("AI Score: " + aiScore);

		}

	}
}
