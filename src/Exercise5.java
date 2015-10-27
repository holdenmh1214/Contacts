import java.util.ArrayList;

/**
 * Created by holdenhughes on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question.";

        //remove commas and periods
        //make all lower case
        String cleanedString = s.toLowerCase().replace(",", "").replace(".", "");

        //split into words
        String[] words = cleanedString.split(" ");

        //remove duplicate words
        ArrayList<String> newWords = new ArrayList<>();

        for(String word: words) {
            if (!newWords.contains(word)){
                newWords.add(word);
            }
        }

        //create a new string without duplicate words
        String newStr ="";
        for (String newWord: newWords){
            if (!newStr.isEmpty()){
                newStr +=" ";
            }
            newStr += newWord;
        }
        System.out.println(newStr);
    }
}
