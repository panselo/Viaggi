package com.example.viaggi;

import java.util.Objects;

public class PacchettiEscursioni extends PacchettiViaggi {

    private int numeroEscursioni;

    public int getNumeroEscursioni() {
        return numeroEscursioni;
    }

    public void setNumeroEscursioni(int numeroEscursioni) {
        this.numeroEscursioni = numeroEscursioni;
    }

    public PacchettiEscursioni(String destinazione, int durata, double costo, int numeroEscursioni) {
        super(destinazione, durata, costo);
        this.numeroEscursioni = numeroEscursioni;
    }

    public String toString() {
        return "numeroEscursioni=" + numeroEscursioni;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PacchettiEscursioni that)) return false;
        return numeroEscursioni == that.numeroEscursioni;
    }

}

