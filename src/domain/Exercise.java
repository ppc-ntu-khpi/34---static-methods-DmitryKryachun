package domain;
/**
 * import 
 */
import java.util.Arrays;
/**
 * The class in which the words are checked for anagram
 * @author dimon
 */
public class Exercise {
    /**
     * The method in which the words are checked for anagram
     * @param s1 - first word
     * @param s2 - second word
     * @return boolean value
     */
    public static boolean isAnagram(String s1, String s2){
        /**
         * .toLowerCase() - makes all letters lowercase
         * .toCharArray() - converts a string to an array of characters
         */
        char[] c1 = s1.toLowerCase().toCharArray();
        /**
         * .toLowerCase() - makes all letters lowercase
         * .toCharArray() - converts a string to an array of characters
         */
        char[] c2 = s2.toLowerCase().toCharArray();

        /**
         * .sort - sorting an array
         */
    
        Arrays.sort(c1);
        Arrays.sort(c2);

        /**
         * .equals - identity check
         * if the arrays are the same, it returns true
         */
        if(Arrays.equals(c1, c2)){
            return true;
        }
        /**
         * if the arrays are not the same - returns false
         */
        else{
            return false;
        }
}
}
