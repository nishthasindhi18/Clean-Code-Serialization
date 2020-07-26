package pack;

import static java.lang.Math.pow;
import java.util.Scanner;

public class SI_CI {
    
    public static double simpleInterest(double p, double r, double t){
        double si = (p * r * t) / 100;
        return si;
    }
    
    public static double compoundInterest(double p,double r, double t){
       double a = pow(p*(1 + r/100),t); 
       double ci = a-p;
       return ci;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle, rate and time respectively: ");
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        
        System.out.println("Simple Interest: "+simpleInterest(principle,rate,time));
        System.out.println("Compound Interest: "+compoundInterest(principle, rate, time));
    }   
}
