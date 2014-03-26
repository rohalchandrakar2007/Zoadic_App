
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.rmi.*;
public class Client extends JFrame
 {
 	SwingAnimation p = new SwingAnimation();
 	public   Client()
 {
 	super("jhfjdb");
 	add(p);
 	setSize(400,400);
 	setVisible(true);
 	}
    public static void main(String[] args) 
    	{
    		Client c = new Client();
    	}
}
