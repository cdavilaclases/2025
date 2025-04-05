/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1b;

/**
 *
 * @author carlos
 */
public class Problema1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RewardPoints rewardsPoints = new RewardPoints();
        rewardsPoints.earnPoints("Jhon", 520);
        System.out.println(rewardsPoints.spendPoints("Jhon", 200));
        
        RewardPointsTable rewardsPointsTable = new RewardPointsTable();
        String user = "Jhon";
        rewardsPointsTable.earnPoints(user, 520);
        System.out.println(rewardsPointsTable.spendPoints(user, 200));
    }
    
}
