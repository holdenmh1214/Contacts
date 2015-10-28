import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by holdenhughes on 10/28/15.
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "david", "allen", "barbie", "colin","dan"));

        //Take first 5 in one command
        names.subList(names.size()-(names.size()-5), names.size()).clear();

        //Make every string inside uppercase
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name: names) {
            tempNames.add(name.toUpperCase());
        }
        names = tempNames; //ALICE, BOB, DAVID, ALLEN, BARBIE

        //Remove the ones that start with A
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("A")){
                it.remove();
            }
        }

        System.out.println(names);// "BOB, DAVID, BARBIE
    }
}
