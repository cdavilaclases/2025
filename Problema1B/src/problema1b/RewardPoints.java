/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1b;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class RewardPoints {
    
    private ArrayList<User> users = new ArrayList<>();
    
    public void earnPoints(String name, int points){
        
        User user = findUserByName(name);
        if(user == null){
            //usuario nuevo
            if(points>=1){
                //points = points + 500;
                points += 500;                
            }
            user = new User();
            user.name = name;
            user.points = points;
            users.add(user);
        }
        else{
            user.points += points;
        }
        
    
    }
    
    public int spendPoints(String name, int points){
        User user = findUserByName(name);
        if(user != null){
            if(user.points >= points){
                user.points -= points;
                return user.points;
            }
            return user.points;
            
        }
        return 0;
    }
    
    private User findUserByName(String name){
        for(User u : users){
            if(u.name.equals(name)){
                return u;
            }
        }
        return null;
    }
    
}
