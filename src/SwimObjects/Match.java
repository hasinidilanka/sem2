/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimObjects;

import java.io.Serializable;
import java.util.ArrayList;
import people.Judge;
import people.Swimmer;

/**
 *
 * @author Hasini
 */
public class Match implements Serializable{
    
    private boolean match_gender;                                               //If true -female else male
    private int match_style;                                                    //Style preferences of swimmers 1-freestyle,2-backstroke,3-butterflystroke,4-breaststroke
    private int age_range;                                                      //There are age ranges considerd as 1-under 12,2-under 15,3-under 17,4-under 19,5-Open catagory
    private ArrayList<Integer> swim_Index;                                      //This provide the swimmer index of swimmers that are participating in a match
    private ArrayList<Swimmer> winners;
    private ArrayList<Integer> ranks;
    private transient Judge j;
    public Match(boolean match_gender,int match_style,int age_range){           //constructor
        
        this.age_range=age_range;
        this.match_style=match_style;
        this.match_gender=match_gender;
    }
    
    public void setJudge(Judge j){
        this.j=j;
    }
    
    public Judge getJudge(){
        return j;
    }
    
    public void setWinners(ArrayList<Swimmer> winners){
        this.winners=winners;
    }
    
    public ArrayList<Swimmer> getWinners(){
        return winners;
    }
    
    public void setRanks(ArrayList<Integer> ranks ){
        this.ranks=ranks;
    }
    
    public ArrayList<Integer> getRanks(){
        return ranks;
    }
    
    public void setMatchGender(boolean g){
        match_gender=g;
    }
    
    public void setMatchAgeRange(int i){
        age_range= i;
    }
    
    public void setMatchStyle(int i){
        match_style= i;
    }
    
    public void setPlayers(ArrayList swim_Index){                               //this method set players for a match
        this.swim_Index=swim_Index;
    }
    
    public ArrayList getPlayers(){                                              //this method return players in a match
        return swim_Index;
    }   
   
    
    public boolean getMatchGender(){                                            //this will return the match gender
        return match_gender;
    }
    
    public int getMatchstyle(){                                                 //this will return the match style
        return match_style;
    }
    
    public int getAgeRange(){                                                   //this will return the age range
        return age_range;
    }
    
   
    
}
