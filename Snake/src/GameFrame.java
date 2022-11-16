import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame() {
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //takes our jframe and fits it around all the components we add to the frame
		this.setVisible(true);
		this.setLocationRelativeTo(null); //makes window appear in middle of screen
		
	}
}
