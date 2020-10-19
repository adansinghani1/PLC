package lol;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question10 {
   public static void main(String[] args) throws IOException {

       //Create a Buffer Reader
       BufferedReader buff = new BufferedReader(new FileReader("Question10code.txt")); //Open and reads the file

       String string = buff.readLine(); // Read line by line data from text file

       // Declare and initialize abnormal characters so the system knows what they are
       String abnormalCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
       while(string != null) {

          String[] string_split = string.split(" "); // Split the string with space

          // loop through each string
          for(int i = 0 ; i < string_split.length ; i++) {  // loop through each string
             String lexeme = string_split[i];
               int count = 0;
               while(count < lexeme.length()) {// Check if the String contains abnormal characters
                   if(abnormalCharacters.contains(Character.toString(lexeme.charAt(count)))) {
                       if(!abnormalCharacters.contains(Character.toString(lexeme.charAt(count-1)))){
                           System.out.println();
                       }
                       // If string contains abnormal characters then print it in the next line
                       System.out.println(lexeme.charAt(count));
                   }
                   else
                   {

                       System.out.print(lexeme.charAt(count));

                   }
                   count++;

               }
               System.out.println();

           }

           string = buff.readLine();

       }

   }

}
