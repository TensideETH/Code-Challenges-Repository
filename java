// Example code for various tasks in Java
public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
