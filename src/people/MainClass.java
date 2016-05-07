/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import SwimObjects.Match;
import SwimObjects.SwimmingCompetition;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class MainClass {
     public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(0);
        a1.add(1);
        a1.add(2);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(0);
        a2.add(2);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(3);
        a3.add(1);
        int[] a = {1,2,3};
        //create judges
        Judge J1 = new Judge("John",false);
        Judge J2 = new Judge("Smith",false);
        Judge J3 = new Judge("Ann", true);
        Judge J4 = new Judge("Ben", false);
        //create female swimmers
        FemaleSwimmer F1 = new FemaleSwimmer(1,"Hasini",true,2);
        FemaleSwimmer F2 = new FemaleSwimmer(2,"Dilanka",true,2);
        FemaleSwimmer F3 = new FemaleSwimmer(3,"Chathurika",true,2);
        FemaleSwimmer F4 = new FemaleSwimmer(4,"Rasangika",true,2);
        FemaleSwimmer F5 = new FemaleSwimmer(5,"Deshani",true,2);
        FemaleSwimmer F6 = new FemaleSwimmer(6,"Dilanka",true,2);
        FemaleSwimmer F7 = new FemaleSwimmer(7,"Dilanka",true,1);
        //create male awimmers
        MaleSwimmer M1 = new MaleSwimmer(8,"Nisal",false,1);     
        MaleSwimmer M2 = new MaleSwimmer(9,"Dileepa",false,2);
        MaleSwimmer M3 = new MaleSwimmer(10,"Thisal",false,0);
        MaleSwimmer M4 = new MaleSwimmer(11,"Chirath",false,1);
        MaleSwimmer M5 = new MaleSwimmer(12,"Deelaka",false,1);
        MaleSwimmer M6 = new MaleSwimmer(13,"Nisanga",false,2);
        MaleSwimmer M7 = new MaleSwimmer(14,"Bovindu",false,1);
        //create spectators
        Spectator s1 = new Spectator("Bemal", true);
        Spectator s2 = new Spectator("Chithra", true);
        Spectator s3 = new Spectator("Witharana", false);
        Spectator s4 = new Spectator("Thilanka", true);
        //create surporting staff
        SupportingStaff ss1= new SupportingStaff("Ramya",true);
        SupportingStaff ss2= new SupportingStaff("Ramyani",true);
        SupportingStaff ss3= new SupportingStaff("Jagath",false);
        SupportingStaff ss4= new SupportingStaff("Namal",false);
        //create matches
         Match m1 = new Match(true,3,2); 
         Match m2 = new Match(true,2,2);
         Match m3 = new Match(true,1,2);
         Match m4 = new Match(true,0,2);
        //create swimming competition     
        SwimmingCompetition sc = SwimmingCompetition.getSwimmingCompetition();
        //add swimmers
         sc.addSwimmer(F1);
         sc.addSwimmer(F2);
         sc.addSwimmer(F3);
         sc.addSwimmer(F4);
         sc.addSwimmer(F5);
         sc.addSwimmer(F6);
         sc.addSwimmer(F7);
         sc.addSwimmer(M1);
         sc.addSwimmer(M2);
         sc.addSwimmer(M3);
         sc.addSwimmer(M4);
         sc.addSwimmer(M5);
         sc.addSwimmer(M6);
         sc.addSwimmer(M7);
         //add judges
         sc.addJudge(J1);
         sc.addJudge(J2);
         sc.addJudge(J3);
         sc.addJudge(J4);
         //add spectators
         sc.addSpectator(s1);
         sc.addSpectator(s2);
         sc.addSpectator(s3);
         sc.addSpectator(s4);
         //add staff
         sc.addStaff(ss1);
         sc.addStaff(ss2);
         sc.addStaff(ss3);
         sc.addStaff(ss4);
        //add matches
         sc.addMatch(m1);
         sc.addMatch(m2);
         sc.addMatch(m3);
         sc.addMatch(m4);
        //Print total number of people in the simulation         
        System.out.println("Number of staff : "+SupportingStaff.getTotalSupportingStaff());
        System.out.println("Number of spectators : "+Spectator.getTotalSpectators());
        System.out.println("Number of judges : "+Judge.getTotalJudges());
        System.out.println("Number of male swimmers : "+MaleSwimmer.getTotalMaleSwimmers());
        System.out.println("Number of female swimmers : "+FemaleSwimmer.getTotalFemaleSwimmers());
        System.out.println("Number of total swimmers : "+Swimmer.getTotalSwimmers());
        System.out.println("Total number of people in the simulation : "+Person.getTotalPeople());
        //get F1 swimmer's match numbers that F1 is particpating
         //System.out.println("F1's match numbers : "+sc.getMatch(F1));
         //get m1 match's swimmers
         m1.setPlayers(sc.getSwimmers(m1));
         System.out.println("m1's swimmers : "+m1.getPlayers());
         sc.removeSwimmer(M1);
         sc.removeJudge(J4);
         sc.removeSpectator(s4);
         sc.removeStaff(ss4);
         System.out.println("Total swimmers :"+Swimmer.getTotalSwimmers());
         System.out.println("Total female swimmers : "+FemaleSwimmer.getTotalFemaleSwimmers());
         System.out.println("Totla male swimmers : "+MaleSwimmer.getTotalMaleSwimmers());
         System.out.println("Total judegs: "+Judge.getTotalJudges());
         System.out.println("Total spec : "+Spectator.getTotalSpectators());
         System.out.println("Total staff : "+SupportingStaff.getTotalSupportingStaff());
         System.out.println("Total people : "+Person.getTotalPeople());
    }
}
