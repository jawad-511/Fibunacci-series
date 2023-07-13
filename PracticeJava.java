import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;
public class PracticeJava{
    //                                    0 1 2 3 4 5 6 7  8  9
   //Fibunacci = have base case 0 1  >    0 1 1 2 3 5 8 13 21 34 
  public static int fib(int f){//5
   if(f == 0 || f == 1){
    return f;
   }else {
    return fib(f-1) + fib(f-2); 
   } /*      
  function call (5) = fib(4)  = 3  + fib(3) = 2
  function call(4) =  fib(3)  = 2  + fib(2) = 1
  function call(3) =  fib(2)  = 1  + fib(1) = 1
  function call (2) = fib(1)  =  1  + fib(0) = 0           
  function call (1) = fib(1) return 1 = base case 
   */       
  }             
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("The fibunacci is: " + fib(5));
     
    }
  
      }
      
    
    
  
   
      
