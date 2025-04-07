/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1a;

/**
 *
 * @author carlos
 */
public class Problema1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RewardPoints rewardPoints = new RewardPoints();
        rewardPoints.earnPoints("Jhon", 520);
        System.out.println(rewardPoints.spendPoints("Jhon", 200));
        
        RewardPointsTable rewardPointsTable = new RewardPointsTable();
        rewardPointsTable.earnPoints("Jhon", 520);
        System.out.println(rewardPointsTable.spendPoints("Jhon", 200));
        
    }
    
}
