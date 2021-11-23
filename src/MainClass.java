
/**
 *
 * @author Τεο
 */
public class MainClass {
    
    public static void main(String[] args) {    
            int  first = 100;
            int  second = 1540;
        showMyText();
        System.out.println("SumOfTwo is : " + sumOfTwo(first,second));
        System.out.println("I just MADE i change");
    }
    
    public static void showMyText(){
        System.out.println("Hello World!");
    }
    
    public static int sumOfTwo(int one , int two){
        int sum = 0;
        sum = one + two;
        return sum;
    }
    
}
