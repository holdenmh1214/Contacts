import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by holdenhughes on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(new File("people.csv"));

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            //split line into array of columns
            String[] columns = line.split(",");
            //add first and last name to "names"
            names.add(columns[1] + " " + columns[2]);
        }

        String searchTerm="ali";
        ArrayList<String> results = new ArrayList<>();

        //fill up "results" with all the names that contain searchTerm (case-sensitive);
        for (String name: names){
            if (name.toLowerCase().contains(searchTerm)){
                results.add(name);
            }
        }
        System.out.println(results);


        //use streams

        final String searchTerm2 = searchTerm;
        List<String> results2=
                names
                .stream()
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm);
                })
                .collect(Collectors.toList());
        System.out.println(results2);

    }
}
