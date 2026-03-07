package com.oop.lesson_4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) throws IOException {

        String str = "Exception.txt";

        readFile(str);
        System.out.println("\n");
        readFileAndGetToConsole(str);
        System.out.println("\n");
        readFileAndGet(str);
        System.out.println("\n");
        String destination = "try-with-resources.txt";
        copyFileContent(str, destination);
    }

    // Oddiy try-catch bloki
    public static void readFileAndGetToConsole(String fileName) {
        try {
            Path path = Paths.get(fileName);
            String content = Files.readString(path);
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // try-catch-finally
    public static void readFileAndGet(String fileName) {
        try {
            Path path = Paths.get(fileName);
            String content = Files.readString(path);
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fayl o‘qish jarayoni tugadi");
        }
    }

    //  Multiple catch
    public static void readFile(String filename) {
        Path path = Paths.get(filename);

        try {
            String content = Files.readString(path, StandardCharsets.UTF_8);

            int number = Integer.parseInt(content.trim());
            System.out.println("Fayldan raqam: " + number);

        } catch (NoSuchFileException | SecurityException e) {
            System.out.println("Faylga kirish imkoni yo‘q: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Faylda yaroqli raqam mavjud emas.");

        } catch (IOException e) {
            System.out.println("Faylni o‘qishda xatolik yuz berdi: " + e.getMessage());
        }
    }

    // try-with-resources
    // Bir fayldi ichidagi ma'lumotlarni olib boshqasiga joylash
    public static void copyFileContent(String source, String destination) throws IOException {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);

        try (Scanner scanner = new Scanner(Files.newInputStream(sourcePath));
             PrintWriter writer = new PrintWriter(Files.newOutputStream(destPath))) {

            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine());
            }
        }
    }
}