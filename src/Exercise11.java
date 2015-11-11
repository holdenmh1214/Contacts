/**
 * Created by holdenhughes on 11/11/15.
 */
public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello"));
        System.out.println(isPalindrome("racecar"));
        System.out.println("");
        System.out.println(isPalindrome2("Hello"));
        System.out.println(isPalindrome2("racecar"));
    }

    static boolean isPalindrome(String s){
        int p = s.length();
        for (int i = 0; i < p/2; i++){
            if (s.charAt(i) != s.charAt(p-i-1)){
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome2(String s2){
        String reverse ="";
        boolean isPalindrome2 = false;
        int length = s2.length();
        for (int i=length-1; i>=0; i--){
            reverse = reverse+s2.charAt(i);

            if(reverse.equals(s2)){
                isPalindrome2 = true;
            } else {
                isPalindrome2 = false;
            }

        }
        return isPalindrome2;
    }
}
