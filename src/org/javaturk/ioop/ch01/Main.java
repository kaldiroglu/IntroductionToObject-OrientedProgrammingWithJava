package org.javaturk.ioop.ch01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        srDev lead = new srDev("Akın Kaldıroğlu");

        // Creating and adding 5 Juniors
        lead.addJrToTeam(new jrDev("Emre"));
        lead.addJrToTeam(new jrDev("Erdem"));
        lead.addJrToTeam(new jrDev("Nuriye"));
        lead.addJrToTeam(new jrDev("Yusuf"));
        lead.addJrToTeam(new jrDev("Meral"));

        lead.workWithTeam();
        Project.getCurrentProgress();
    }
}

 class srDev {
    String name;
    int stepPower;
    int experience;

    List<jrDev> team;

    public srDev(String name) {
        this.name = name;
        this.stepPower = 3;
        this.team = new ArrayList<>();
    }

     public void addJrToTeam(jrDev jr){
         if (this.team.size() <= 5) {
             this.team.add(jr);
             System.out.println(jr.name + " Now works with sr " + srDev.this.name);
         }
         else {
             System.out.println(srDev.this.name + "'s team has no place for another jr.");
         }
     }

     public void workWithTeam(){
         System.out.println(srDev.this.name + " Is working with " + this.team.size() + " jr teams.");
         for (jrDev jr: this.team){
             jr.work(); //jr works
         }
         Project.totalProgress += this.stepPower; //Sr works
         System.out.println("while jr team is dealing small things, sr finished the heavy lift (3)");
         System.out.println("Current progress is: " + Project.totalProgress);
     }
}

class jrDev {
    public String name;
    public int stepPower;

    public jrDev(String name) {
        this.name = name;
        this.stepPower = 1;
    }

    public void work(){
        Project.totalProgress += this.stepPower;
        System.out.println(this.name + " has progressed " + this.stepPower +
                " the project. New progress level is: " + Project.totalProgress);
    }

}

class Project {
    public static int totalProgress = 0;
    public static boolean isFinished = false;
    public int goalProgress = 100;


    public static void getCurrentProgress() {
        System.out.println("Current progress is: " + Project.totalProgress);
    }

}