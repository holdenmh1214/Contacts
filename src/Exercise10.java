/**
 * Created by holdenhughes on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {

        int num = 12345;

        //int numReversed = 54321;

        String number = String.valueOf(num);
        String numberReversed = new StringBuilder(number).reverse().toString();
        int numberRev = Integer.valueOf(numberReversed);
        System.out.println(numberRev);

    }
}
