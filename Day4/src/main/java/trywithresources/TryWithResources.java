package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        String fileName = "info.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            System.out.println(reader.readLine());
        }catch (IOException e){
            System.out.println("Error reading file");
        }

    }
}
