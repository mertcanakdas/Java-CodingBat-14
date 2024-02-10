
package codingbat_14;

import java.util.Arrays;

public class CodingBat_14 {
    
public static String []fizzBuzz(int start,int end){
    String []fizzBuzz = new String[end];
    
    for(int i=0;i<fizzBuzz.length;i++){
        
        int c = i +start;
        
        if(c%15==0){
            fizzBuzz[i] = "FizzBuzz";
            
        }else if(c%5==0){
            fizzBuzz[i] = "buzz";
        }else if(c%3==0){
            fizzBuzz[i] = "Fizz";
        }else{
            fizzBuzz[i] = String.valueOf(start+i);
        }
    }
    
    
    
    
    
    System.out.println(Arrays.toString(fizzBuzz));
     
    return  fizzBuzz;
    
}    

    
    public static void main(String[] args) {
        fizzBuzz(1, 30);
    }
    
}
