package checkedexception;

import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        String fileName = "data.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File does not exist");
        }

    }
}
