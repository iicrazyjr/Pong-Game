import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	
	GamePanel panel;
	
	GameFrame() {
		panel = new GamePanel();
		
		this.add(panel);
		this.setTitle("Ping Pong");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); //adjust size acording our game panel
		this.setVisible(true); //make frame visible
		this.setLocationRelativeTo(null); //make frame appear in the middle of screen
	}
}
