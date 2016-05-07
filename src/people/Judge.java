/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hasini
 */
public class Judge extends Person implements Serializable{
                                                     
                                                   
    private boolean start_signal;                                               //If start signal is true start the match, if false do not start the match
    private static int no_judge = 0;                                            //Total number of Judges in the simulation
    private ArrayList<Swimmer> result;
    public Judge(String name, boolean gender) {                                 //Constructor
        super(name, gender);                                                    //Gain by super class Person
       
        
        no_judge++;                                                             //Increase total judges by 1
    }
    
    public static int getTotalJudges(){                                         //This method return the total number of judges in simulation
        return no_judge;
    }
    
    public void setSignal(boolean signal){                                      //This method will set signal
        this.start_signal=signal;
    }
    
    
   
    
  
    
    public boolean getStartingSignal(){                                         //This method will return signal
        return start_signal;
    }  

    public  void decreaseJudge(){                                               //This method will decrease total number of judges in simulation
        decreasePeople();
         no_judge--;
    }
    
    public void blowWhistle(){
        setSignal(true);
    }
    
  
    
     public void setResult(ArrayList<Swimmer> result){
        this.result=result;
    }
    
    public ArrayList<Swimmer> getResult(){
        return result;
    }
   
    
   
    
    
}
