package Gravitation;
import java.lang.Math;
public class LawOfUniGrav {

    public static void Fsol(double m1, double m2, double r){
        double result = 6.67e-11 * ((m1 * m2) / Math.pow(r, 2));
        System.out.println("F = " + result);
    }

}