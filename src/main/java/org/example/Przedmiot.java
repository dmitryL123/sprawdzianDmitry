package org.example;

import java.util.Objects;

public class Przedmiot {
    String nazwaPrzedmiotu;
    int licbaPunktowECTS;

    public Przedmiot(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public int getLicbaPunktowECTS() {
        return licbaPunktowECTS;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public void setLicbaPunktowECTS(int licbaPunktowECTS) {
        this.licbaPunktowECTS = licbaPunktowECTS;
    }

    @Override
    public String toString() {
        return nazwaPrzedmiotu + '-' + licbaPunktowECTS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return licbaPunktowECTS == przedmiot.licbaPunktowECTS && Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, licbaPunktowECTS);
    }
}
