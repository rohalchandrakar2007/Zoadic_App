
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
import java.rmi.*;

public class Panel extends JPanel implements ActionListener
 {
 	    private JButton aries1 = new JButton("Aries");
    	private JButton taurus1 = new JButton("Taurus");
    	private JButton gemini1 = new JButton("Gemini");
        private JButton cancer1 = new JButton("Cancer");
        private JButton leo1 = new JButton("Leo");
    	private JButton virgo1 = new JButton("Virgo");
    	private JButton libra1 = new JButton("Libra");
        private JButton scorpio1 = new JButton("Scorpio");
        private JButton sagittarius1 = new JButton("Sagittarius");
    	private JButton capricorn1 = new JButton("Capricorn");
    	private JButton aquarius1 = new JButton("Aquarius");
        private JButton pisces1 = new JButton("Pisces");
        private String hname= new String("");
        Insets insets1 = this.getInsets();
    public Panel() 
    {
    	
    	Dimension size = aries1.getPreferredSize();
        //JTabbedPane tabbedPane = new JTabbedPane();
        //tabbedPane.setSize(800,450);
        //ImageIcon iconaries = createImageIcon("images/aries.gif");
          setLayout(null);
       setSize(800,500);
        add(aries1);
         aries1.setBounds( 10+insets1.left,  10+insets1.top,
              100, size.height);
              aries1.addActionListener(this);
        ////Taurus//////////////////////////////
        
        size = taurus1.getPreferredSize();
        //ImageIcon icontaurus = createImageIcon("images/taurus.gif");
      add(taurus1);
        taurus1.setBounds( 10+insets1.left,  40+insets1.top,
              100, size.height);
                      taurus1.addActionListener(this);

        /////////Gemini////////////////////////////////
        
        size = gemini1.getPreferredSize();
        //ImageIcon icongemini = createImageIcon("images/taurus.gif");
        add(gemini1);
        gemini1.setBounds( 10+insets1.left,  70+insets1.top,
              100, size.height);
                          gemini1.addActionListener(this);
  
        ///////Cancer////////////////////////
       
       size = cancer1.getPreferredSize();
        //ImageIcon iconcancer = createImageIcon("images/cancer.gif");
        add(cancer1);
        cancer1.setBounds( 10+insets1.left,  100+insets1.top,
              100, size.height);
                       cancer1.addActionListener(this);
     
              
              
        ///////////Leo////////////////////////
              
              size = leo1.getPreferredSize();
        //ImageIcon iconleo = createImageIcon("images/leo.gif");
        add(leo1);
        leo1.setBounds( 10+insets1.left,  130+insets1.top,
              100, size.height);
                      leo1.addActionListener(this);
      
              
        //////////Virgo////////////////////
       
       
       size = virgo1.getPreferredSize();
        //ImageIcon iconvirgo = createImageIcon("images/virgo.gif");
        add(virgo1);
        virgo1.setBounds( 10+insets1.left,  160+insets1.top,
              100, size.height);
                     virgo1.addActionListener(this);
       
       /////////////libra////////////////////////////
              
              size = libra1.getPreferredSize();
        //ImageIcon iconlibra = createImageIcon("images/libra.gif");
        add(libra1);
        libra1.setBounds( 10+insets1.left,  190+insets1.top,
              100, size.height);
                    libra1.addActionListener(this);
        
              
        /////////////scorpio1/////////////////////////reygur
        
              
            size = scorpio1.getPreferredSize();
        //ImageIcon iconscorpio = createImageIcon("images/scorpio.gif");
        add(scorpio1);
        scorpio1.setBounds( 10+insets1.left,  220+insets1.top,
              100, size.height);  
                      scorpio1.addActionListener(this);

        
        ///////////sagittarius1///////////////////////
              
       size = sagittarius1.getPreferredSize();
        //ImageIcon iconsagittarius = createImageIcon("images/sagittarius.gif");
        add(sagittarius1);
        sagittarius1.setBounds( 10+insets1.left,  250+insets1.top,
              100, size.height);
                        sagittarius1.addActionListener(this);
    
              
        /////////capricorn1///////////////////////////
              
              size = capricorn1.getPreferredSize();
        //ImageIcon iconcapricorn = createImageIcon("images/capricorn.gif");
        add(capricorn1);
        capricorn1.setBounds( 10+insets1.left,  280+insets1.top,
              100, size.height);
                         capricorn1.addActionListener(this);
   
              
        ////////aquarius1//////////////////////////////
        size = aquarius1.getPreferredSize();
        //ImageIcon iconaquarius = createImageIcon("images/aquarius.gif");
        add(aquarius1);
        aquarius1.setBounds( 10+insets1.left,  310+insets1.top,
        100, size.height);
              
                            aquarius1.addActionListener(this);

        ////////////pisces1/////////////////////////
        size = pisces1.getPreferredSize();
        //ImageIcon iconpisces = createImageIcon("images/pisces.gif");
        add(pisces1);
        pisces1.setBounds( 10+insets1.left,  340+insets1.top,
              100, size.height);
                      pisces1.addActionListener(this);

        }
        
         public void actionPerformed(ActionEvent e) {
        if (e.getSource()==aries1)
        	 {
        	 	
        	 	hname="Aries";
            }
            if (e.getSource()==taurus1)
        	 {
        	 	
        	 	hname="Taurus";
            }
            if (e.getSource()==gemini1)
        	 {
        	 	
        	 	hname="Gemini";
            }
            if (e.getSource()==cancer1)
        	 {
        	 	
        	 	hname="Cancer";
            }
            if (e.getSource()==leo1)
        	 {
        	 	
        	 	hname="Leo";
            }
            if (e.getSource()==virgo1)
        	 {
        	 	
        	 	hname="Virgo";
            }
             
             if (e.getSource()==libra1)
        	 {
        	 	
        	 	hname="Libra";
            }
            if (e.getSource()==scorpio1)
        	 {
        	 	
        	 	hname="Scorpio";
            }
            if (e.getSource()==sagittarius1)
        	 {
        	 	
        	 	hname="Sagittarius";
            }
            if (e.getSource()==capricorn1)
        	 {
        	 	
        	 	hname="Capricorn";
            }
            if (e.getSource()==aquarius1)
        	 {
        	 	
        	 	hname="Aquarius";
            }
            if (e.getSource()==pisces1)
        	 {
        	 	
        	 	hname="Pisces";
            }
            try{
    	
        Aserver server =(Aserver)Naming.lookup("rmi://201.1.1.34/Aserver");
        JOptionPane.showMessageDialog(null,server.student(hname));
        //System.out.println (server.student("Aries"));
    	}
    	catch(Exception en){System.out.println (en);}
    	
    }
    
    
}