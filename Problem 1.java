

package problem1;

/**
 *
 * @author QingbaoGuo
 */
public class Main {
   //If we list all the natural numbers below 10 that are multiples of 3 or 5,
   //we get 3, 5, 6 and 9. The sum of these multiples is 23.
   //Find the sum of all the multiples of 3 or 5 below 1000.
   //Answer: 233168

   
    public static void main(String[] args) {
           int a ;         
           int temp1 =0;
         
         for(a = 0;a <1000;a++){
            if(a%3 == 0 || a%5 ==0){
              temp1 = temp1 + a;
              
               System.out.println(a+"   "+temp1);
            }}
        
         
    }}
          
            
          
          



            
             

  


