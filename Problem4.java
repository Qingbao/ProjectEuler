import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Qingbao.Guo
 */

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

//Answer: 906609

public class Problem4 {

    public static void main(String[] args) {

        List<Integer> palindromes = new ArrayList<>();

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int k = i * j;
                String palindrome = String.valueOf(k);
                if (palindrome.equals(new StringBuilder(palindrome).reverse().toString())) {
                    palindromes.add(k);
                }
            }
        }
        System.out.println(Collections.max(palindromes));
    }
}
