/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimObjects;

import java.io.Serializable;
import java.util.ArrayList;
import people.Judge;
import people.Person;
import people.Spectator;
import people.SupportingStaff;
import people.Swimmer;

/**
 *
 * @author Hasini
 */
public class SwimmingCompetition implements Serializable{
    
    private static SwimmingCompetition s;                                       //s is a object from SwimmingCompetition
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Swimmer> swimmers = new ArrayList<>();
    private ArrayList<Match> matches = new ArrayList<>();
    private ArrayList<Judge> judges = new ArrayList<>();
    private ArrayList<Spectator> spectators = new ArrayList<>();
    private ArrayList<SupportingStaff> staff = new ArrayList<>();
    private ArrayList<TouchPad> touchpad = new ArrayList<>();
    
    private SwimmingCompetition(){                                              //Make the constructor private.So it wont create more than one Swimming Competition       
    }
    
    public static SwimmingCompetition getSwimmingCompetition() {                //This method will create an object from the swimmingCompetition only if there is no object created previously
        if(s==null){
            s = new SwimmingCompetition();
            return s;
        }
        return s;
    }
    
    public void addSwimmer(Swimmer s){                                          //this method will add swimmers to an array list
        swimmers.add(s);
        people.add(s);
    }    
    public void addSwimmer(ArrayList s){                                        //this method will add swimmers to an array list
        swimmers = s;
        people = s;
    }    
    public boolean removeSwimmer(Swimmer s){                                    //this method will remove swimmers from array list and decrease the total
        boolean b= swimmers.remove(s);
        if(b){            
            s.decreaseTotalSwimmers();
            return true;
        }
        return false;
    }    
    public void addJudge(Judge j){                                              //this method will add judges to an array list
        judges.add(j);
        people.add(j);
    }    
    public void addJudge(ArrayList j){                                          //this method will add judges to an array list
        judges=j;
        people=j;
    }    
    public boolean removeJudge(Judge j){                                        //this method will remove swimmers from array list and decrease the total
        boolean b = judges.remove(j);
        if(b){
            j.decreaseJudge();
            return true;
        }
        return false;
    }
    
    public void addSpectator(Spectator s){                                      //this method will add spectators to an array list
        spectators.add(s);
        people.add(s);
    }    
    public void addSpectator(ArrayList s){                                      //this method will add spectators to an array list
        spectators=s;
        people=s;
    }    
    public boolean removeSpectator(Spectator s){                                    //this method will remove spectators from array list and decrease the total
        boolean b = spectators.remove(s);
        if(b){
            s.decreaseSpectators();           
            return true;
        }
        return false;
    }
    
    public void addStaff(SupportingStaff s){                                    //this method will add staff to an array list
        staff.add(s);
        people.add(s);
    }    
    public void addStaff(ArrayList s){                                          //this method will add staff to an array list
        staff=s;
        people=s;
    }    
    public boolean removeStaff(SupportingStaff s){                              //this method will remove staff from array list and decrease the total
        boolean b = staff.remove(s);
        if(b){
            s.decreaseSupportingStaff();
            return true;
        }
        return false;
    }
    
    public void addMatch(Match m){                                              //this method will add matches to an array list
        matches.add(m);
    }
    
    public void addMatch(ArrayList m){                                          //this method will add matches to an array list
        matches=m;
    }
    
    public void removeMatch(Match m){                                           //this method will remove matches from an array list
        matches.remove(m);
    }
    
    public void addTouchPad(TouchPad t){
        touchpad.add(t);
    }
    
    public void removeTouchPad(){
        for(TouchPad t: touchpad){
            touchpad.remove(t);
        }
    }
    
  
    
    
    

    
    public ArrayList<Swimmer> getSwimmers(Match m){                             //this method will give the swimmers that are participating in a match 
        
        ArrayList<Swimmer> swimmers =getAllSwimmers();
        ArrayList<Swimmer> players = new ArrayList<>();                         //create a new array list to store swimmers in a match
        for(int i =0;i<swimmers.size();i++){                                    //Loop to check in all swimmers
            Swimmer s = swimmers.get(i);                                        //Take the ekements in array list swimmers
            if(s.getGender()==m.getMatchGender()){                              //check whether the gender is equal
                if(s.getAge()==m.getAgeRange()){                                //check whether the age range is equal
                        players.add(s);                           
                                                                    
                }
            }            
        }
        return players;
    }
    
 
    
  
    
    public ArrayList<Match> getAllMatches(){
        return matches;
    }
    
     public ArrayList<Swimmer> getAllSwimmers(){
        return swimmers;
    }
     
     public ArrayList<Spectator> getAllSpectator(){
        return spectators;
    }
     
    public ArrayList<Judge> getAllJudges(){
        return judges;
    }
    
    public ArrayList<SupportingStaff> getAllStaff(){
        return staff;
    }
    
    public ArrayList<Person> getAllPeople(){
        return people;
    }
    
}
