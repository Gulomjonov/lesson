package com.oop.lesson_4;

// Custom Exception

// Custom exception - dasturchi tomonidan yaratiladigan exception klass
// bu biznes logikani aniq ko'rsatish, aniq xatoliklarni tartibli boshqarish va kodni tushunarli qilish uchun ishlatiladi
public class DogIsNotReadyException extends Exception {

    public DogIsNotReadyException(String message) {
        super(message);
    }
}