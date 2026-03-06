package com.oop.lesson_3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        //создаем наш объект
        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Pavilion\\OneDrive\\Desktop\\save.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            // сохраняем игру в файл
            objectOutputStream.writeObject(savedGame);
            System.out.println("Done!");
        } catch (Exception e) {
            throw new RuntimeException("Error saving game", e);
        }
    }
}