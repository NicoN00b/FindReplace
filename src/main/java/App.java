import Models.FindReplace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

     try {
         System.out.println("Please enter a sentence, any sentence:");
         String answer = bufferedReader.readLine();
         String lowAnswer = answer.toLowerCase();
         System.out.println("What would you like to replace?");
         String answerTwo = bufferedReader.readLine();
         String lowAnswerTwo = answerTwo.toLowerCase();
         System.out.println("With which word would you like to replace it?");
         String answerThree = bufferedReader.readLine();
         String lowAnswerThree = answerThree.toLowerCase();

         FindReplace newReplace = new FindReplace();
         String findResult = newReplace.wordReplacer(lowAnswer, lowAnswerTwo, lowAnswerThree);

         System.out.println(findResult);

     } catch (IOException e) {
         e.printStackTrace();
     }
    }
}
