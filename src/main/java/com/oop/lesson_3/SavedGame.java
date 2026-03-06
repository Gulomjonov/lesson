package com.oop.lesson_3;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Arrays;

@Getter
@Setter
public class SavedGame implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] territoriesInfo;
    private String[] resourcesInfo;
    private String[] diplomacyInfo;

    public SavedGame(String[] territoriesInfo, String[] resourcesInfo, String[] diplomacyInfo) {
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    @Override
    public String toString() {
        return "SavedGame { " + "\n" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo) + "\n" +
                "resourcesInfo=" + Arrays.toString(resourcesInfo) + "\n" +
                "diplomacyInfo=" + Arrays.toString(diplomacyInfo) + "\n" +
                '}';
    }
}
