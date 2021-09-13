package Gravitation;
import javax.swing.*;
import java.awt.*;
public class ProgMenu extends JFrame{
    ///////////// MENU IMPORTS //////////////////////////////////
    static KeplersThirdLawMenu kepmen;
    static LawOfGravMenu gravmen;
    static Newtonsmenu newmen;
    /////////////////////////////////////////////////////////////
    ProgMenu(){
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("The Astronomical Calculator");
    	
    	// Class instants:
    	new KeplersThirdLawMenu();
    	new LawOfGravMenu();
    	new Newtonsmenu();
    	//////////////////////////////
    	
    	this.setVisible(true);
    }
    
}

