package com.oop.lesson_3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Pavilion\\OneDrive\\Desktop\\save.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            SavedGame savedGame = (SavedGame) ois.readObject();
            System.out.println("Done!");
            System.out.println(savedGame.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
