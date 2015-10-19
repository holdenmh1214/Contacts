import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by holdenhughes on 10/19/15.
 */
public class ExerciseThree {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob","Charlie","David"};
        HashMap<String , ArrayList<Contact>> people = new HashMap();

        for (String name : names) {
            for (String name2 : names) {
                if (!name.equals((name2))) {
                    Contact c = new Contact(name2, 0);
                    ArrayList<Contact> list = people.get(name);
                    if (list == null) {
                        list = new ArrayList();
                        list.add(c);
                        people.put(name, list);
                    } else{
                        list.add(c);
                    }
                }
            }
        }

        double randNum = Math.random();  // one method to generate a random number (requires casting)
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random(); // another method to generate a random number (doesn't require casting)
        index = rand.nextInt(4);
        System.out.println(names[index]);
    }
}
