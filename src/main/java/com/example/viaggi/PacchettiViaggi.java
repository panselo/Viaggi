package com.example.viaggi;

import java.util.Objects;

public class PacchettiViaggi {

    private String destinazione;
    private int durata;
    private double costo;

    public PacchettiViaggi(){
        this.destinazione = "Sconosciuta";
        this.durata = 0;
        this.costo = 0.0;
    }

    public PacchettiViaggi (String destinazione, int durata, double costo){
        this.destinazione = destinazione;
        this.durata = durata;
        this.costo = costo;
    }

    public String getDestinazione(){
        return destinazione;
    }
    public void setDestinazione(String destinazione){
        this.destinazione = destinazione;
    }

    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String toString(){
        return "Destinazione: " + destinazione + " Costo: " + costo + " Durata: " + durata;
    }

    public double calcolaCosto(){
        return getCosto();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PacchettiViaggi that)) return false;
        return durata == that.durata && Double.compare(costo, that.costo) == 0 && Objects.equals(destinazione, that.destinazione);
    }
    
}
