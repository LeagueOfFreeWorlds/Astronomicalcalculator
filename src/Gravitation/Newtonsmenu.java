package Gravitation;
import java.util.Scanner;
public class Newtonsmenu {
    static NewtonsUniGrav ngrav = new NewtonsUniGrav();
    public static void NmenuPrint(){
        Scanner sc = new Scanner(System.in);
        int Nchoice = 0;
        System.out.println("Welcome to Newton's Calculator. Please make a selection!");
        while(Nchoice != 4){
            System.out.println("1. Period of a planet.");
            System.out.println("2. Mass of star planet is orbiting");
            System.out.println("3. Orbital Radius");
            System.out.println("4. Quit Newton's Calculator. ");
            Nchoice = sc.nextInt();
            if(Nchoice == 1){
                System.out.println("Enter the value for m");
                double m = sc.nextDouble();
                System.out.println("Enter the value for r");
                double r = sc.nextDouble();
                ngrav.OrbitalPeriod(m, r);
            } else if (Nchoice == 2){
                System.out.println("Enter the value for t");
                double t = sc.nextDouble();
                System.out.println("Enter the value for r");
                double r = sc.nextDouble();
                ngrav.starMass(t, r);
            }
        }

    }
}