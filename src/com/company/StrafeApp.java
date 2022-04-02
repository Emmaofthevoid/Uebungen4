package com.company;

public class StrafeApp {
    public static void main(String[] args) {
        Strafe trial = new Strafe();
        trial.getStrafe();
        trial.verbandspaket();
        System.out.println(trial.strafe);
        trial.strafemehr(20);
        System.out.println(trial.strafe);


    }


}
