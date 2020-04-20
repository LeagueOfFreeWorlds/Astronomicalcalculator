package Gravitation;
import java.util.Scanner;
public class LawOfGravMenu {
    static LawOfUniGrav grav = new LawOfUniGrav();
    public static void GmenuPrint(){
        Scanner sc = new Scanner(System.in);
        int Gchoice = 0;
        System.out.println("Welcome to The Law Of Universal Gravitation Calculator. Make a selection!");
        while(Gchoice != 2){
            System.out.println("1. Solving for Gravitational Force");
            System.out.println("2. Quit The Law Of Universal Gravitation Calculator.");
            Gchoice = sc.nextInt();
            if(Gchoice == 1){
                System.out.println("Enter m1");
                double m1 = sc.nextDouble();
                System.out.println("Enter m2");
                double m2 = sc.nextDouble();
                System.out.println("Enter r");
                double r = sc.nextDouble();
                grav.Fsol(m1, m2, r);
            }
        }
    }
}