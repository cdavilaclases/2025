/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1b;

import java.util.HashMap;


/**
 *
 * @author carlos
 */
public class RewardPointsTable {
    
    private HashMap<String,Integer> users = new HashMap<>();
    
    public void earnPoints(String name, int points){
        if(users.containsKey(name)){
            //existe
            int userPoints = users.get(name);
            userPoints += points;
            users.put(name, userPoints);
        }
        else{
            //no existe
            if(points >= 1){
                points += 500;
            }
            users.put(name, points);
        }
    }
    
    public int spendPoints(String name, int points){
        if(users.containsKey(name)){
            int userPoints = users.get(name);
            if(userPoints>=points){
                userPoints -= points;
                users.put(name, points);
            }
            return userPoints;
        }
        
        return 0;
    }
    
    
}
