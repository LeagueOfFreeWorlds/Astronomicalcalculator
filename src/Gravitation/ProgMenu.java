package Gravitation;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
public class ProgMenu extends JFrame{
    ///////////// MENU IMPORTS //////////////////////////////////
    static KeplersThirdLawMenu kepmen = new KeplersThirdLawMenu();
    static LawOfGravMenu gravmen = new LawOfGravMenu();
    static Newtonsmenu newmen = new Newtonsmenu();
    /////////////////////////////////////////////////////////////
    public static void printMenu(){
        int choiceMen = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Astronomical Calculator. Java Edition!");
        while(choiceMen != 9){
            /////Selection ///
            System.out.println("1. Kepler's Calculator");
            System.out.println("2. Law of Universal Gravitation");
            System.out.println("3. Newton's Calculator");
            System.out.println("4. Satellite Stuff");
            System.out.println("5. Satellite Speeds");
            System.out.println("6. Gravitational Field");
            System.out.println("7. Inertial Mass");
            System.out.println("8. Gravitational Mass");
            System.out.println("9. Quit Astronomical Calculator.");
            /// ////
            System.out.println("Please select the respective calculator you want to use.");
            choiceMen = sc.nextInt();
            if(choiceMen == 1){
                KeplersThirdLawMenu.menuPrint();
            } else if (choiceMen == 2){
                gravmen.GmenuPrint();
            } else if (choiceMen ==3){
                newmen.NmenuPrint();
            }
            
        }
    }
    }

