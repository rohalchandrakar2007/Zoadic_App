import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingAnimation extends JPanel
{
	Thread th;
	ImageIcon images;
	//JFrame frame;
	JLabel lbl;
	int i = 0;
	int j;

	
	public SwingAnimation(){
		//frame = new JFrame("Animation Frame");
		th = new Thread();
		lbl = new JLabel();
		//JPanel panel = new JPanel();
		add(lbl);
		//frame.add(panel, BorderLayout.CENTER);
		setSize(400, 400);
		//setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(j = 1; j <= 2; j++){
			SwingAnimator();
			if (j == 2)
				j = 0;
		}
	}

	public void SwingAnimator(){
		try{
			for(i = 0; i <= 11; i++){
				images = new ImageIcon( i + ".png");
				lbl.setIcon(images);
				th.sleep(500);
			}
		}
		catch(InterruptedException e){}
	}
}