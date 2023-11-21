package recursion;

public class Recursion {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    //阶乘
    public static int factorial(Integer n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
