package com.example.viaggi;

import java.util.Objects;

public class PacchettiVolo extends PacchettiViaggi{

    private boolean isAndata;

    public boolean isAndata() {
        return isAndata;
    }
    public void setAndata(boolean andata) {
        isAndata = andata;
    }

    public PacchettiVolo(String destinazione, int durata, double costo, boolean isAndata) {
        super(destinazione, durata, costo);
        this.isAndata = isAndata;
    }

    public String toString() {
        return "il viaggio è solo di andata?: " + isAndata;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PacchettiVolo that)) return false;
        return isAndata == that.isAndata;
    }

}
