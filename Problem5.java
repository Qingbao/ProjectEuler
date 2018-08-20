/**
 *
 * @author Qingbao.Guo
 */
 
/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
 
 //answer: 232792560
public class Problem5 {

    public static void main(String[] args) {

        for (int i = 20; i <= 999999999; i++) {
            int count = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 20) {
                System.out.println(i);
                break;
            }
        }
    }
}
