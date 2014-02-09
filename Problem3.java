/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Qingbao.Guo
 */

//The prime factors of 13195 are 5, 7, 13 and 29.

//What is the largest prime factor of the number 600851475143 ?

//Answer: 6857

public class Problem3 {
    public static void main(String[] args) {
         
    
                long limit = 600851475143L;
                             
                for(long i=2; i < limit; i++){
                       
                        boolean isPrime = true;
                       
                        //check to see if the number is prime
                        for(long j=2; j < i ; j++){
                               
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                        // print the prime factor
                        if(isPrime && limit % i ==0)
                                System.out.println("The prime factor of given number is " + i);
                }
                    
        
    
}
}