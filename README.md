## Я вибрав завдання:
### Перевірити чи задане слово є анаграмою іншого заданого слова (метод Calculate має повернути булевське значення)

Дане завдання було виконанно за такою структурою:
![Image](https://github.com/ppc-ntu-khpi/34---static-methods-DmitryKryachun/blob/master/computation.png)

Що таке анаграма можна дізнатися в [Wikipedia](https://uk.wikipedia.org/wiki/Анаграма)

Завдання не важке, потрібно було просто відсортувати букви з яких складаються слова, зробити всі букви строковими, і перевірити чи вони однакові.

## Код

**class Exercise**

```java

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
```

**class TestResult**
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String text1="hello";
        String text2="llohe";
        System.out.println("Are these anagram words? - "+ Exercise.isAnagram(text1,text2));
    }
}
```
## Приклад виконання роботи:
![Image](https://github.com/ppc-ntu-khpi/34---static-methods-DmitryKryachun/blob/master/images/result.jpg)
