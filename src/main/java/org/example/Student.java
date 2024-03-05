package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    public String imie;
    public String nazwisko;
    public int numerIndeksu;
    public int rokStudiow;
    public ArrayList<Przedmiot> listaPrzedmiotow = new ArrayList<>();

    public Student(String imie, String nazwisko, int numerIndeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public ArrayList<Przedmiot> getListaPrzedmiotow() {
        return listaPrzedmiotow;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerIndeksu=" + numerIndeksu +
                ", rokStudiow=" + rokStudiow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerIndeksu == student.numerIndeksu && rokStudiow == student.rokStudiow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(listaPrzedmiotow, student.listaPrzedmiotow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerIndeksu, rokStudiow, listaPrzedmiotow);
    }

    public void dodajDoListy(){
        
    }
}
