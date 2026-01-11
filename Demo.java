public class Demo{
    public static void main(String[] args){
        int a=5;
        int b=7;
        Calculator calc=new Calculator();// way of creating an object of a class
        int sum=calc.add(a,b);//calling the method using by reference variable calc
        System.out.println("The sum is:"+sum);
    }
}
class Calculator{
    public int add(int x,int y){
        int sum=x+y;
        return sum;
    }
}