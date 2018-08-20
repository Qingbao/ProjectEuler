/**
 *
 * @author Qingbao.Guo
 */
 
 /**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12^2 + 22^2 + ... + 102^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)^2 = 552^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
 
 //answer: 25164150
public class Problem6 {

    public static void main(String[] args) {

        int sumOfSquares = 0;
        int squareOfSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        System.out.println(squareOfSum * squareOfSum - sumOfSquares);
    }
}
