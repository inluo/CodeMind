package recursion;

public class Recursion {
    public static void main(String[] args) {
//        int factorial = factorial(5);
//        System.out.println(factorial);
        String str = "abc";
        reverseString(str,0);
    }

    //阶乘
    public static int factorial(Integer n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //反向打印字符串       判断n是否等于长度，不等于就继续走递归，直到相等后就执行回来的逻辑，此时会一次次打印从后往前
    public static void reverseString(String str,int n){
        if (n==str.length()){
            return;
        }
        reverseString(str,n+1);
        System.out.println(str.charAt(n));
    }

}
