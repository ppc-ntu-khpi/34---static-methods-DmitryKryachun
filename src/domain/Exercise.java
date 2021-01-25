package domain;

import java.util.Arrays;

public class Exercise {
    public static boolean isAnagram(String s1, String s2){
    char[] c1 = s1.toLowerCase().toCharArray();
    char[] c2 = s2.toLowerCase().toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    if(Arrays.equals(c1, c2)){
        return true;
    }
    else{
        return false;
    }
}
}
