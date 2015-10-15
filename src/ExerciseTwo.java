import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by holdenhughes on 10/15/15.
 */
public class ExerciseTwo {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       // sayHello(scanner);

        HashMap<String, ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        for (String name : words) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null){
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);
            } else {
                list.add(name);
            }
        }
        System.out.println(groups);
    }

    static void sayHello(Scanner scanner){
        Boolean check = true;

        while (check != false) {
            System.out.println("Type hello");
            String s = scanner.nextLine();

            if (s.equals("hello")) {
                System.out.println("Good Job");
                check = false;
            } else {
                check = true;
                System.out.println("Try again");
            }

        }
    }
}
