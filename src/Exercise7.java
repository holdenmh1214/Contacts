import java.util.*;

/**
 * Created by holdenhughes on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones"};

        //Reverse the array

        List<String> newNames = Arrays.asList(names);
        Collections.reverse(newNames);


        //Convert the array into a HashMap ("Jones":"Charlie","Brown":"Bob"...)

        HashMap m = new HashMap();

        for (int i=0; i < names.length; i+=2) {
            if (names.length > i + 1) {
                m.put(names[i], names[i + 1]);
            }
        }

        System.out.println(m);

    }
}
