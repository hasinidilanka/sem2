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

import java.io.Serializable;
import java.util.Random;
public class FemaleSwimmer extends Swimmer implements Serializable{
    
    private static int no_femaleSwimmer=0;                                      //Total number of female swimmers in the simulation
    Random r = new Random();                                                    //r is the object from Random class in java
   
    
    public FemaleSwimmer(int index_number,String name, boolean gender,int age) {//Constructor
        super(index_number,name, gender,age);                                   //Gain by super class Swimmer and Person
        no_femaleSwimmer++;                                                     //Increase the total number of female swimmers
    }
    
    public static int getTotalFemaleSwimmers(){                                 //This method return the total number of female swimmers in simulation
        return no_femaleSwimmer;
    }

         
    public int freeStyle() {                                                    //Return the speed for free Style     
       speed = r.nextInt(7);                                                    // Speed is selected in random.So speed of swimmers vary from one another
       if (speed <2){
           return 2;
       }
       return speed;
    }
    
    public int butterflyStroke() {                                              //Return the speed for butterfly stroke
       speed = r.nextInt(6);
        if (speed <2){
           return 2;
       }
       return speed;
    }
    
    public int backStroke() {                                                   //Return the speed for back stroke
       speed = r.nextInt(5);
        if (speed <1){
           return 1;
       }
       return speed;
    }
   
    public int breastStroke() {                                                 //Return the speed for breast stroke
       speed = r.nextInt(4);
        if (speed <1){
           return 1;
       }
       return speed;
    }
    
    public void decreaseTotalSwimmers(){                                        //This method will decrese the total of female swimmers and swimmers when a swimmer is removed     
        decreasePeople();
        decreaseSwimmers();
        no_femaleSwimmer--;     
    }
      
    public String wear() {
        return "red";
    }

  

   

 
    
}
