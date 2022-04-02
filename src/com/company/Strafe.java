package com.company;

public class Strafe {
    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;



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
        anzahl +=1;
    }

    public void verbandspaket() {
        strafe += 25;
        anzahl+= 1;
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
        anzahl+=2;
    }
    public void sonstiges ( double wert) {
        strafe += wert;
        anzahl +=1;
    }
    public double getStrafe(){
        System.out.println(strafe);
        if (anzahl == 1) {
            strafe = (30/strafe)*100;
        }
        if (anzahl ==2) {
            strafe = (20/strafe)*100;
        }
        if (anzahl ==3) {
            strafe = (10/strafe)*100;
        }
        return strafe;
    }

}
