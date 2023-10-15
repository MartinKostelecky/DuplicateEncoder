import java.util.*;
public class Main {
    public static void main(String[] args) {
        String word = "Success";
        System.out.println(encode(word));
    }
    public static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder encodedWord = new StringBuilder();
        //Creating a HashMap containing char as key and it's occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        //Converting given string to char array and checking each char of word
        for (char ch : word.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(ch, 1);
            }
        }
        //Iterating through the given word
        //If a character is presented once in given word encode it as '(' otherwise as ')'
        for (char ch : word.toCharArray()) {
            if(charCountMap.get(ch) == 1) {
                encodedWord.append("(");
            } else if(charCountMap.get(ch) > 1) {
                encodedWord.append(")");
            }
        }
        return encodedWord.toString();
    }
}