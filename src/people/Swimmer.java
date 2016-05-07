/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import SwimObjects.TouchPad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hasini
 */
public abstract class Swimmer  extends Person implements SwimStyle , Serializable  {
    
    private transient int index_number;                                         //Index number is unique to swimmers
    private transient int age;                                                  //There are age ranges considerd as 0-under 12,1-under 15,2-under 17,3-under 19,4-Open catagory
    private transient int style;                                                //Style preferences of swimmers 0-freestyle,1-backstroke,2-butterflystroke,3-breaststroke                                
    protected transient int speed;                                              //Speed varies from style and gender
    private static int no_totalSwimmer=0;                                       //Total swimmers in the simulation
        
    private transient int swimlane;
    private transient long time;
    private int rank;

    public Swimmer(int index_number,String name, boolean gender,int age) {      //This is the constructor
        super(name, gender); 
        this.age=age;
        this.index_number=index_number;                       
        no_totalSwimmer++;
    }
    public void setStyle(int style){
        this.style = style;
    }
    
    public void setTime(Long time){
        this.time=time;
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    
    public int getRank(){
        return rank;
    }
    
    public Long getTime(){
        return time;
    }
    
    public int getStyle(){
        
        return style;
    }
    
    public static int getTotalSwimmers(){                                       //This method return the total number of swimmers in simulation
        return no_totalSwimmer;
    }
        

    public int getAge(){                                                        //This method will return the age range
        return age;
    }
    
    public int getIndexNumber(){                                                //This method will return the index number
        return index_number;
    }
    
   
    
  
    
      
    public int getSpeed(int style) {                                            //This method will return speeds of a swimmer in a particular style.
        
            if(style==1){
                return freeStyle();
            }
            if(style==2){
                return backStroke();
            }
            if(style==3){
                return butterflyStroke();
            }
            if(style==4){
                return breastStroke();
            }
       return 0; 
    }
     public static void decreaseSwimmers(){                                     //This method will decrease total number of swimmwers in simulation
        no_totalSwimmer--;
    }
     public void setSwimLane(int swimlane){
         this.swimlane=swimlane;
     }
     
     public int getSwimLane(){
         return swimlane;
     }
     
     public int swim(final int style){
       
        return getSpeed(style);
     }
     
     public void touchTouchPad(TouchPad tp){
         tp.notifyScoreBoard();
     }
     
     
    public abstract void decreaseTotalSwimmers();
    
    public abstract String wear();

   
    

    
    
    
   
    
    
}
