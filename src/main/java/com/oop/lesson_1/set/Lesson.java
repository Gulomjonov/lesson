package com.oop.lesson_1.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Lesson {

    private String subject;
    private Set<String> tags = new HashSet<>();

    public Lesson(String subject) {
        this.subject = subject;
    }

    public void addTag(String... newTag) {
        Collections.addAll(tags, newTag);
    }

    public boolean haveTag(String tag) {
        return tags.contains(tag);
    }

    @Override
    public String toString() {
        return subject + " | Tags: " + tags;
    }
}
