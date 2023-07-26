package test08;

interface MyLambda<T> {
    public T what(T t);
}

public class Test06 {
    public static void main(String[] args) {
        MyLambda<Integer> factorial = (n) -> {
        	
            int result = 1;
            
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            
            return result;
        };

        MyLambda<String> reverseString = (str) -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };

        int factorial3 = factorial.what(3);
        int factorial5 = factorial.what(5);
        String reverseHello = reverseString.what("Hello");
        String reverseWorld = reverseString.what("World");

        System.out.println("3! = " + factorial3);
        System.out.println("5! = " + factorial5);
        System.out.println("Hello 역순 : " + reverseHello);
        System.out.println("World 역순 : " + reverseWorld);
    }
}
