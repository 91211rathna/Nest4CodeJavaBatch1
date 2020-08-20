import java.util.*;
public class Assignment4{
  public static void main(String args[])

  { 
    
     Scanner input= new Scanner(System.in);
     System.out.println("enter the number:"); 
     long num =input.nextLong();
    
  long result = Math.abs(num);
    E detail = new E ();
    detail.countEvenOdd((long)result); 
     
  }
}
    
class E 
    { 
          
 long countEvenOdd(Long num) 
    { 
        long evencount = 0; 
        long oddcount = 0; 
        while (num > 0)  
        { 
 Long rem = num % 10;
        if (rem % 2 == 0) 
                evencount++; 
         else
                oddcount++; 
            num = num / 10; 
        } 
        System.out.println ( " Number of Even numbers: " +  
                                  evencount); 
        System.out.println ( "Number of Odd numbers : " +  
                                  oddcount); 
        if (evencount % 2 == 0 &&  
             oddcount % 2 != 0) 
            return 1; 
        else
            return 0; 
    } 
      
}