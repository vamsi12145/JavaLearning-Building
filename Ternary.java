//condition?yes:no;
public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //using ternary operator to find the maximum value
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);
    }
}

//This is a ternary operator instead of checking the condition in multiple lines  like if-else we can write in a single and check the conditions for small cases.