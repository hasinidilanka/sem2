/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimObjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import people.Spectator;
import people.Swimmer;

/**
 *
 * @author Hasini
 */
public class ScoreBoard implements Serializable{
    private static ScoreBoard board;
                                                                                
    private Match match;                                                        //Object from Match
    private Swimmer s;                                                          //Object from Swimmer
    private ArrayList<Swimmer> swimmers = new ArrayList<>();                    //this is to take swimmers in a particular match
    private ArrayList<Long> time = new ArrayList<>() ;
    private  transient Spectator spectator ;
    private ArrayList<Integer> rank = new ArrayList<>();
    
    
    private ScoreBoard(){                                                       //constructor     
    }
    public static ScoreBoard getScoreBoard() {                                  //This method will create an object from the scoreboard only if there is no object created previously
        if(board==null){
            board = new ScoreBoard();
            return board;
        }
        return board;
    }
    
    public void clearScoreBorad(){
        time = new ArrayList<>();
        swimmers=new ArrayList<>();
        rank = new ArrayList<>();
        
    }
    
    public void setMatch(Match match){                                          //this method will take the match number as input and return the swimmers participating in the match
        this.match=match;
        match.setWinners(swimmers);
        
        match.setRanks(rank);
                
    } 
    
    public Match getMatch(){
        return match;
    }
    
    
    public void setTotalTime(Long t){
        getTotalTime().add(t);
    }
    
    public void setSwimmers(Swimmer s){
        getSwimmer().add(s);
        
    }
    
    public ArrayList<Long> getTotalTime() {        
            return time; 
        
    }
    
    public ArrayList<Swimmer> getSwimmer() {       
            return swimmers;
        
    }
    
    public void setWinners(){
        
        sortTime();
     
        
        for(int i=0;i<time.size();i++){
            int t = (time.get(i).intValue());
            for(Swimmer s : swimmers){
                
                if(t == s.getTime().intValue()){
                   
                    s.setRank(i+1);
                    rank.add(i+1);
                }
            }
        }
    
      
        
          
     
        
        
    
    }
    public void sortTime(){
        Set<Long> set = new TreeSet<Long>();
        set.addAll(time);
        time = new ArrayList<Long>(set);       
    }
    public void print(){
        System.out.println(getSwimmer().isEmpty());
        
        for(Swimmer s: getSwimmer()){
            System.out.println(s.getIndexNumber()+" "+s.getRank());
        }
    }

    public String notifySpectator(Spectator spectator) {
       return  spectator.setIsNotify(true);
    }
    
    
 
    
    
    
    
    
}
