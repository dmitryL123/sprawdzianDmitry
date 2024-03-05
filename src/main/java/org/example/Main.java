package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Przedmiot matematyka = new Przedmiot("matematyka");
        matematyka.setLicbaPunktowECTS(5);
        Przedmiot biologia = new Przedmiot("biologia");
        biologia.setLicbaPunktowECTS(3);

        Student student1 = new Student("Andrej", "Nowak", 1, 3);
        Student student2 = new Student("Michal", "Kowal", 2, 2);

        System.out.println(matematyka);
        System.out.println(biologia);
        System.out.println(student1);
        System.out.println(student2);
    }
}