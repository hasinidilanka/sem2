/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwimObjects;

import java.util.ArrayList;
import people.Swimmer;

/**
 *
 * @author Hasini
 */
public class TouchPad {
    ScoreBoard sb = ScoreBoard.getScoreBoard();
    private boolean finish_signal;
    private Swimmer s;
    private Long finishingTime;
    private ArrayList<Swimmer> swimmers;
    private ArrayList<Long>time;
    
    public TouchPad(Swimmer s , Long finishingTime ,boolean finish_signal){
        this.s = s;
        this.finishingTime = finishingTime;
        this.finish_signal=finish_signal;
        
    }
    
   
    
    public boolean getFinishingSignal(){
        return finish_signal;
    }  
    
    public Long getFinishingTime() {
        
       
        if(getFinishingSignal()){
                   
            return finishingTime;
        }
        return null;
    }
    
    public Swimmer getSwimmer() {
        if(getFinishingSignal()){
            return s;
        }
        return null;
    }
    
 
    
    public void notifyScoreBoard(){
        
        
        sb.setSwimmers(getSwimmer());
        sb.setTotalTime(getFinishingTime());
    }
    
    
    
}
