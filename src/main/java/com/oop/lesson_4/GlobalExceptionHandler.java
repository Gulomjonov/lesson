package com.oop.lesson_4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Global exception butun application bo'yicha barcha exceptionlarni bitta joyda ushlab (habdle qilib) boshqarish mexanizmi
// bu dasturlarda mavjud va muhim mexanizm hisoblanadi
// Masalan API da xatolik chiqsa har joyda try-catch yozish o‘rniga bitta global handler ishlatiladi.
// Global exception barcha xatolarni bitta joyda boshqarish, kodni tozalash (try-catch kamayadi), API da bir xil formatdagi error response qaytarish, Logging qilish
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DogIsNotReadyException.class)
    public ResponseEntity<?> handleException(Exception e) {

        return ResponseEntity
                .status(500)
                .body("Serverda xatolik yuz berdi");
    }
}