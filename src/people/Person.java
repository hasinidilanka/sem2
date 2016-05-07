/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;

/**
 *
 * @author Hasini
 */
public abstract class Person implements Serializable{ 
    private String name;   
    private transient  boolean gender;                                          //If true -female else male
    private static int total = 0;                                               //Total number of people in simulation
    
    public Person(String name,boolean gender){                                  //Create a constructor
        this.name=name;
        this.gender=gender;
        total++;                                                                //Increase the toatal by 1 when ever a person's subclasses's object is created
    }    
    public String getName(){                                                    //Method to get name
        return name;
    }
    
    public boolean getGender(){                                                 // Method to get gender if return is true take as female if return is false take as male
        return gender;
    }
    
    public static int getTotalPeople(){                                         //This method return the total number of people in simulation
        return total;
    }
    
    public void decreasePeople(){
        total--;
    }
        
    
}
