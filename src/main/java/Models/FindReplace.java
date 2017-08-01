package Models;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class FindReplace {
    public String answer;

    public String wordReplacer(String word, String search, String swap){
        String[] splitWord = word.split(" ");

        for (int i =0; i < splitWord.length; i++){
           splitWord[i] = splitWord[i].replace(search, swap);
        }
        answer = String.join(" ", splitWord);
        return  answer;
    }


}
