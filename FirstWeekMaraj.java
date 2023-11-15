/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstweekmaraj;

/**
 *
 * @author matth
 */
public class FirstWeekMaraj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //first part of lab
        //declaring variables
        int n1 = 16;
        int n2 = 3;
        
        //value
        int ans;
        
        
        //calculations
        ans = n1 + n2;
        System.out.println("The addition is:" + ans);
        
        ans = n1- n2;
        System.out.println("The subtraction is:" + ans);
        
        ans = n1 * n2;
        System.out.println("The multiplication is:" + ans);
        
        ans = n1 / n2;
        System.out.println("The division is:" + ans);
        
        ans = n1 % n2;
        System.out.println("The remainder is:" + ans);
        
        ans++;
        System.out.println("The value increment is:" + ans);
        
        //second part of lab1
        
        //declaration
        double nn1 = 16;
        
        double nn2 = 3; 
        
        //answer
        double anss;
        
        //calculations
        anss = nn1 / nn2 ;
        System.out.println("The division with doubles is:\n" + anss);
        
        anss = Math.round(nn1 / nn2);
        System.out.println("The rounded value is:\n" + anss);
        
        anss = Math.pow(nn1, 3);
        System.out.println("The first value cubed is:\n" + anss);
        
        anss = Math.sqrt(nn2);
        System.out.println("The square root of second value is:\n" + anss);
    }
    
}
