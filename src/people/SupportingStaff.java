/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.ArrayList;

/**
 *
 * @author Hasini
 */
public class SupportingStaff extends Person {
                                                               
    private static int no_supportingStaff;                                      //Total number of staff in the simulation
    private ArrayList<Swimmer> result;
    public SupportingStaff(String name, boolean gender) {                       //constructor
        super(name, gender);                                                    //Gain by super class Person
        
        no_supportingStaff++;                                                   //Increase the total of staff by 1
    }
    public static int getTotalSupportingStaff(){                                //This method return the total number of staff in simulation
        return no_supportingStaff;
    }
    
  
    
     public void decreaseSupportingStaff(){                                     //This method will decrease total number of staff in simulation
         decreasePeople();
         no_supportingStaff--;
    }
     
    public void setResult(ArrayList<Swimmer> result){
        this.result=result;
    }
    
    public ArrayList<Swimmer> getResult(){
        return result;
    }
    
}
