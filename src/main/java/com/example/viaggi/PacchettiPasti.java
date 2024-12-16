package com.example.viaggi;

import java.util.Objects;

public class PacchettiPasti extends PacchettiViaggi{

    private boolean isPensione;

    public boolean getPensione() {
        return isPensione;
    }
    public void setPensione(boolean pensione) {
        isPensione = pensione;
    }

    public PacchettiPasti(String destinazione, int durata, double costo, boolean isPensione) {
        super(destinazione, durata, costo);
        this.isPensione = isPensione;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PacchettiPasti that)) return false;
        return isPensione == that.isPensione;

    }

    public String toString() {
        return "la pensione è mezza?: " + isPensione;
    }

    public double calcolaCosto () {
        if (isPensione == true) {
            return super.getCosto() + getDurata() * 35;
        } else {
            return super.getCosto() + getDurata() * 25;
        }
    }

}
