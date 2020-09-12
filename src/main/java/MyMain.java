import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 10;
        double m = 100;
        while (Math.abs(n - m) >= 0.00001) {
            m = n;
            n = (n + x/n) / 2;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        for (int i = x-1; i > 0; i--) {
            x*=i;
        }
        return (x == 0) ? 1 : x;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    // e = 1/factorial(0) + 1/factorial(1) + 1/factorial(2) + 1/factorial(3) + ... + 1/factorial(infinity).
    public static double calculateE() {
        double e = 0;
        int i = 0;
        while (Math.E - e > 0.00000000001) {
            e += (1/factorial(i));
            i++;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find the square root of: ");
        double number = scan.nextDouble();
        System.out.println("The square root of " + number + " is " + babylonian(number));
        System.out.println("The value of e is roughly : " + calculateE());
        scan.close();
    }
}
