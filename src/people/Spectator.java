/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Hasini
 */
public class Spectator extends Person { 
    private static int no_spectators;                                           //Total number of spectators in the simulation 
    private boolean isNotified;
    
    public Spectator(String name, boolean gender) {                             //constructor
        super(name, gender);
        no_spectators++;                                                        //Increase number of spectators by 1
    }
    
    public static int getTotalSpectators(){                                     //This method return the total number of spectators in simulation
        return no_spectators;
    }
    
     public  void decreaseSpectators(){                                         //This method will decrease total number of spectators in simulation
         decreasePeople();
         no_spectators--;
    }
    
     public String updateByScoreBoard(Boolean isNotified){
        if(isNotified){            
            return "/GUI/spectator_winning.jpg";
        }return "/GUI/spectator_watch.jpg";
     }
     
     public String setIsNotify(Boolean isNotified){
         this.isNotified=isNotified;
          return updateByScoreBoard(isNotified);
     }
     
     public boolean getIsNotify(){
         return isNotified;
     }
}
