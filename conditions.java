public class conditions {
 
    public static void main(String[] args){
        int a=6;
        int b=8;
        int c=10;
        if(a>b &&a>c ){
            System.out.println(a);
            System.out.println("Yes A is greater than B and C");
        }
        else if(b>c&& b>a){
            System.out.println(b);
            System.out.println("Yes B is greater than C and A");
        }
        else{
            System.out.println(c);
            System.out.println("Yes C is greater than A and B");
        }
        
    }
}
