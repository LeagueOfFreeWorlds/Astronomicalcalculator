package Gravitation;

public class NewtonsUniGrav {

    public static void OrbitalPeriod(double m, double r){
        double result = (2 * 3.1415) * Math.sqrt(Math.pow(r, 3) / (6.67e-11 * m));
        System.out.println("T = " + result);
    }
    public static void starMass(double T, double r){
        double result = (Math.pow(r, 3) / ((T/(2*3.1415)) * 6.67e-11));
        System.out.println("Stellar mass = " + result);
    }

}