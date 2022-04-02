package com.company;

public class Strafe {
    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;

    public Strafe(String vorname, String nachname, String kennzeichen, int strafnummer, double strafe, int anzahl) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kennzeichen = kennzeichen;
        this.strafnummer = strafnummer;
        this.strafe = strafe;
        this.anzahl = anzahl;
    }

    public void strafemehr(int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung <= 20) {
            strafe += 30;
        } else if (geschwindigkeitsueberschreitung <= 30) {
            strafe += 50;
        } else if (geschwindigkeitsueberschreitung <= 50) {
            strafe += 100;
        } else if (geschwindigkeitsueberschreitung <= 100) {
            strafe += 500;
        } else if (geschwindigkeitsueberschreitung <= 100) {
            strafe += 1500;
        }
    }

    public void verbandspaket() {
        strafe += 25;
    }
    public void alcohol (double wert) {
        if (wert >= 0.5 && wert < 1.0) {
            strafe += 100;
        }
        else if (wert <= 2.0) {
            strafe += 400;
        }
        else if (wert <= 3.0) {
            strafe += 1000;
        }
        else if (wert > 3.0) {
            strafe += 5000;
        }
    }
}
