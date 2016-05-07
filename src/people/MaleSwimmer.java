/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Hasini
 */
public class MaleSwimmer extends Swimmer implements Serializable{
    private static int no_maleSwimmer=0;                                        //Total number of male swimmers in the simulation
    Random r = new Random();
    
    public MaleSwimmer(int index_number,String name, boolean gender,int age) {  //constructor
        super(index_number,name, gender,age);                                   //Gain by super class Swimmer and Person
        no_maleSwimmer++;                                                       //Increase the total number of male swimmers
    }
    
    public static int getTotalMaleSwimmers(){                                   //This method return the total number of male swimmers in simulation
        return no_maleSwimmer;
    }
    
    public int freeStyle() {                                                    //Return the speed for free Style     
       speed = r.nextInt(8);
        if (speed <2){
           return 2;
       }
       return speed;
    }
   
    public int butterflyStroke() {                                              //Return the speed for butterfly stroke
       speed = r.nextInt(7);
        if (speed <1){
           return 1;
       }
       return speed;
    }
    
    public int backStroke() {                                                   //Return the speed for back stroke
       speed= r.nextInt(6);
        if (speed <1){
           return 1;
       }
       return speed;
    }
    
    public int breastStroke() {                                                 //Return the speed for breast stroke
       speed= r.nextInt(5);
        if (speed <1){
           return 1;
       }
       return speed;
    }
   
    public void decreaseTotalSwimmers() {                                       //This method will decrese the total of female swimmers and swimmers when a swimmer is removed
        no_maleSwimmer--;
        decreasePeople();
        decreaseSwimmers();
    }
    
    public String wear() {                                                      //this method will return the colour
        return "Blue";
    }


    
}
