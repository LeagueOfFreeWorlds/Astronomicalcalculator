package Gravitation;
import java.lang.Math;

class KeplersThirdLawCalc {
    double TTa;
    double TTb;
    double Tra;
    double Trb;
    public static void KeplerTa(double tb, double ra, double rb){
        double result = Math.cbrt(Math.pow(tb, 2) * (Math.pow(ra, 3) / Math.pow(rb, 3)));
        System.out.println("TA = " + result);
    }
    public static void KeplerTb(double ta, double ra, double rb){
        double result = Math.cbrt(Math.pow(ta, 2) * (Math.pow(rb, 3) / Math.pow(ra, 3)));
        System.out.println("TB = " + result);

    }
    public static void KeplerRa(double rb, double ta, double tb){ // Used for calculating the distance of body A from center
        double result = Math.cbrt(Math.pow(rb, 3) * (Math.pow(ta, 2)/Math.pow(tb, 2)));
        System.out.println("RA= " + result);

    }
    public static void KeplerRb(double ra, double ta, double tb){
        double result = Math.cbrt(Math.pow(ra, 3) * (Math.pow(tb, 2) / Math.pow(ta, 2)));
        System.out.println("RB = " + result);
    }
}