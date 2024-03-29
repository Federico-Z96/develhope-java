package it.develhope.JavaAdvancedExercise.Es1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Es4ReadAndWriteAFile { private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) throws IOException {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;



        try {
            //Files.deleteIfExists(MY_PATH);
            Files.createFile(MY_PATH);
            Files.writeString(MY_PATH,myString);
           System.out.println(Files.readString(MY_PATH));



            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            // Your code here
            Files.readString(MY_PATH);
            System.out.println(Files.readString(MY_PATH));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() throws IOException {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split


        try {
            // Your code here
             List<String> lines = new ArrayList<>(List.of(Files.readString(MY_PATH).split("\n")));
            int count = 0;
            for (String line : lines) {
                count++;

            }
            System.out.println(count);
            System.out.println(lines.size());


        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() throws IOException {
        System.out.println("\nExercise 4: ");
            List<String> words = List.of(Files.readString(MY_PATH).split(" "));
            try {
                System.out.println(words.size());
                Files.delete(MY_PATH);

                // Your code here
            } catch (Exception exception) {
                System.err.println("There was an error!");
                exception.printStackTrace();
                System.exit(0);
            }

    }


    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() throws IOException{
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {

            // Your code
            //Files.createDirectory(myDirectoryPath);
            Files.createDirectories(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
            System.out.println(Files.readString(PATH_IN_A_FOLDER));
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
