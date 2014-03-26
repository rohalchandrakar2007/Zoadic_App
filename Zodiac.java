
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
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.Insets;
public class Zodiac extends JFrame //implements ActionListener
{Insets insets1 = this.getInsets();
      JPanel  p1 = new Panel();
      JPanel  p2 = new Panelf();
      JLabel pl =new JLabel();
      ImageIcon ic1 = new ImageIcon("0.png");
     // Anipanel pl = new Anipanel();
   //ImageIcon iconpisces = createImageIcon("images/pisces.gif");
    public Zodiac() 
    {
    	super("Zodiac");
    	setLayout(null);
    	JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setSize(300,450);
        ImageIcon ic = createImageIcon("images/Aries.gif");
    	tabbedPane.addTab("Student", ic, p1,"Does nothing");
       tabbedPane.addTab("Tab", ic, p2,"Does nothing");
       tabbedPane.setBounds(0,0,200,450);
        //p1.addAncestorListener()(this));
        //p2.addAncestorListener(this);
        //add(pl);
        add(tabbedPane);
        //size=pl.getPreferredSize();
//pl.setBackground(cl);

//pl.setBounds()
//pl.setSize(400,400);
        pl.setBounds( 220+insets1.left,  20+insets1.top,400,400);
        pl.setIcon(ic1);
        add(pl);
        //JOptionPane.showInputDialog("hi");
        setSize(600,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
      protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Zodiac.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

   
    public static void main(String[] args)
    {
       Zodiac z=new Zodiac();
    }
}
