package Gravitation;
import java.util.Scanner;
public class KeplersThirdLawMenu {
    static KeplersThirdLawCalc kep = new KeplersThirdLawCalc();
    public static void menuPrint(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Welcome to Kepler's Calculator, please make your selection. ");
        while(choice != 5){
            /////////////////////////////////////////////////////////////////////
            System.out.println("1. Solving for RA w/ Kepler's law");
            System.out.println("2. Solving for RB w/ Kepler's law");
            System.out.println("3. Solving for TA w/ Kepler's Law");
            System.out.println("4. Solving for TB w/ Kepler's Law");
            System.out.println("5. Quit Kepler's Calculator");
            /////////////////////////////////////////////////////////////////////
            System.out.println("Please make a selection using the respective numerical value of choice. ");
            choice = sc.nextInt();
            if(choice == 1){ // Solving for kepler RA
                System.out.println("Enter value for TA");
                double ta = sc.nextDouble();
                System.out.println("Enter value for TB");
                double tb = sc.nextDouble();
                System.out.println("Enter value for RB");
                double rb = sc.nextDouble();
                kep.KeplerRa(rb, ta, tb);
            } else if (choice == 2){ // Solving for kepler RB
                System.out.println("Enter value for TA");
                double ta = sc.nextDouble();
                System.out.println("Enter value for TB");
                double tb = sc.nextDouble();
                System.out.println("Enter value for RA");
                double ra = sc.nextDouble();
                kep.KeplerRb(ra, ta, tb);
            } else if (choice == 3){ // Solving for TA
                System.out.println("Enter value for TB");
                double tb = sc.nextDouble();
                System.out.println("Enter value for RA");
                double ra = sc.nextDouble();
                System.out.println("Enter value for RB");
                double rb = sc.nextDouble();
                kep.KeplerTa(tb, ra, rb);
            } else if (choice == 4){ // Solving for TB
                System.out.println("Enter value for TA");
                double ta = sc.nextDouble();
                System.out.println("Enter value for RA");
                double ra = sc.nextDouble();
                System.out.println("Enter value for RB");
                double rb = sc.nextDouble();
                kep.KeplerTb(ta, ra, rb);
            }


        }
    }
}