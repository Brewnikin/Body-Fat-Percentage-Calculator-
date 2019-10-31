
package programmingassignment2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Arrays;
/**
 *
 * @author christianhernandez
 */
public class ProgrammingAssignment2 {
static double[] bfpArray = new double[1];


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Please enter number of customers:");
        Scanner scnr = new Scanner(System.in);
        
        int customerNum = scnr.nextInt();
        DecimalFormat df = new DecimalFormat("####.##");
for(int x = 0; x < customerNum; x++){
        getName();
        int userGender = getGender();
        int userAge = getAge();
        double userBMI = getBMI();
        double userBFP = calculateBFP(userGender, userAge, userBMI);
        
        System.out.println("Your BFP is " + df.format(userBFP));
        for (int i = 0; i < bfpArray.length; i++) {
            bfpArray[i]=calculateBFP(userGender, userAge, userBMI);
            
            
            
        }
        
        
        
        
        
        
        
}

double userAvg = calculateAverage(bfpArray);
        System.out.println("The average BFP of all " + customerNum + " customers is " + df.format(userAvg) + "%");
        

    }

    
    public static String getName() {
       
        String userName;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter name:");
        userName = scnr.nextLine();
        return userName;
    }
    
    
    public static int getGender(){
    
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your Gender: (1 for Male, 0 for Female):");
        int userGender = scnr.nextInt();
        return userGender;
    }
    
    
    public static int getAge(){
       
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter age:");
        int userAge = scnr.nextInt();
        return userAge;
    }
  
    
    public static double getBMI(){
       
       Scanner scnr = new Scanner(System.in);
       System.out.println("Please enter your BMI:");
       double userBMI = scnr.nextDouble();
       return userBMI;
    }
    
    public static double calculateBFP(int userGender, int userAge, double userBMI){
      double userBFP;
   if(userGender == 0){ 
        //child female
        if(userAge <= 15){
            userBFP = ((1.51 * userBMI) + (0.70 * userAge) - (3.6 * 0 )+ 1.4);
             }
        //adult female
        else { 
           userBFP = ((1.20 * userBMI) + (0.23 * userAge) - (10.8 * 0 ) - 5.4);
             }
    }
    
   else{
        //child male
        if (userAge <= 15) { 
             userBFP = ((1.51 * userBMI) + (0.70 * userAge) - (3.6 * 1 )+ 1.4);
             } 
        //adult male
        else { 
             userBFP = ((1.20 * userBMI) + (0.23 * userAge) - (10.8 * 1 ) - 5.4);
             }
   }
   for (int i = 0; i<bfpArray.length; i++)
   {
       if(bfpArray[i]==0.0)
       {
          bfpArray[i] = userBFP;
          break;
       }
   }
   
   return userBFP;
   
} 
    
    public static double calculateAverage(double[]bfpArray){
      
     double sum = 0;
     double avgBFP = 0;
             
     for(int i = 0; i < bfpArray.length; i++ ){
        sum += bfpArray[i];
    }
     
     avgBFP = sum / bfpArray.length; 
     
     return avgBFP;   
    }

}
