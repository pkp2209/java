package lab1;
import java.io.Console;
import java.lang.Math;
import java.util.Scanner;

public class m {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input angle(°):");
    double x = Math.toRadians(sc.nextDouble());
    System.out.println("input accuracy:");
    double k = sc.nextInt();

    System.out.println("my sinus = " + MySin(x, k) + "\t \t" + "math sinus = " + Math.sin(x) + "\n" );
    System.out.format("my sin = %.3f%n", MySin(x, k));
    System.out.format("math sin = %.3f%n", Math.sin(x));
}

public static double MySin(double x, double k){

    double sumNeu, sum;
    int i = 1;
    sum = sumNeu = x;                 
    do              
    {
        i++; sum = sum * x * x / i / (i + 1);
        i++;
        sum = -sum;
        sumNeu = sumNeu + sum;
    }
    while( Math.abs(sum) >= Math.pow(10., -k));

    return sumNeu;
   }
}