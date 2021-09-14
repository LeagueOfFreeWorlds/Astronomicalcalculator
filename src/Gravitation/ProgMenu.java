package Gravitation;
import javax.swing.*;
import java.awt.*;
public class ProgMenu extends JFrame{
    ///////////// MENU IMPORTS //////////////////////////////////
    static KeplersThirdLawMenu kepmen;
    static LawOfGravMenu gravmen;
    static Newtonsmenu newmen;
    /////////////////////////////////////////////////////////////
    // JAVA OBJECTS
    JButton newtonButton, keplerButton;	
    
    /////////////////////////////////////////
    ProgMenu(){
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("The Astronomical Calculator");
    	this.setMinimumSize(new Dimension(500, 500));
    	// Class instants:
    	new KeplersThirdLawMenu();
    	new LawOfGravMenu();
    	new Newtonsmenu();
    	
    	//////////////////////////////
    	
    	this.setVisible(true);
    }
    
}

