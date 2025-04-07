/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1a;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class RewardPoints {
    
    private ArrayList<User> users = new ArrayList<>();
    
    public void earnPoints(String name, int points){
    
        User u = findUserByName(name);
        if(u == null){
            if(points>=1){
                points += 500;
            }
            u = new User();
            u.name = name;
            u.points = points;
            users.add(u);
        }
        else{
            u.points+=points;
        }
        
    }
    
    public int spendPoints(String name, int points){
        User u = findUserByName(name);
        if(u != null){
            if(u.points>=points){
                u.points -= points;
            }
            return u.points;
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
