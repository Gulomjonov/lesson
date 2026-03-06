package com.oop.lesson_3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);

        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Pavilion\\OneDrive\\Desktop\\save.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(savedGame);
            System.out.println("Done!");
        } catch (Exception e) {
            throw new RuntimeException("Error saving game", e);
        }
    }
}

// Serialization -> Objectlarni byte streamga aylantirib faylga yoki network orgali yuborish jarayoni hisoblanadi

// Java Object -> Byte Stream -> File/Network

// Transient -> serialization vaqtida File yoki Networkga obyekt tomonidan yuborilmaslik uchun ishlatiladigan field