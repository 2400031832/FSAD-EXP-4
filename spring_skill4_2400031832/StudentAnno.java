
package com.example;

import org.springframework.stereotype.Component;

@Component
public class StudentAnno {
    private int studentId = 102;
    private String name = "Charan";
    private String course = "DI";
    private int year = 2026;

    public String toString() {
        return studentId + " " + name + " " + course + " " + year;
    }
}
