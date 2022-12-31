package chapters.chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {
        createNewFile();
        createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("D:\\Proyectos intellij\\Java\\java_course\\src\\resources\\numbers.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        numbersExceptionHandling(file);
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("D:\\Proyectos intellij\\Java\\java_course\\src\\resources\\numbers2.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling(File file) {
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.printf("%.2f%n", num);
            }

        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
