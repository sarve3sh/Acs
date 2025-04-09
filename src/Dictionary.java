
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        BufferedReader inputStream = null;
        String line = null;

        try {  //reads file
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));
            HashSet<String> dictionary = new HashSet<String>();
            while ((line = inputStream.readLine()) != null) {
                dictionary.add(line);// adds the read line into the Hashset with a while loop
            }
            System.out.println("Please enter a line in English:");// asks for an input
            String sentence = keyboard.nextLine();
            keyboard.close();
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (dictionary.contains(word)) {
                    System.out.println("<valid>");
                } else {
                    System.out.println("<invalid>");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.print("Error opening file");

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}

/*Objectives:
 *Read the file (only once) ✅
 * ask the user for a sentence in english✅
 * check if the words are valid or not and label[confusing but I think I have to use boolean for this]✅
 */
