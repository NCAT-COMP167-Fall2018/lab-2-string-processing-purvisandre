/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.proccesing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author purvi
 */
public class StringProccesing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] records = new String[100];
        try{
            Scanner reader = new Scanner(new File(args[0]));
            
            int currentIndex=0;
            while(reader.hasNext()){
                String[] line = reader.nextLine().split(",");
                
                String firstname = line[0];
                String lastname = line[1];
                String gender = line[2];
                String age = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                boolean genderIsValid = false;
                if(genderIsValid(gender)){
                 System.out.println(records[currentIndex] = String.format("%-20s%-20s%-10s%10s%-30s%-30s", firstname, lastname, gender, age,email,phoneNumber )); 
            }else{
                    System.err.println(String.format("%-20s%-20s%-10s%10s%-30s%-30s", firstname, lastname, gender, age, email, phoneNumber));
                
                    }
            currentIndex++;
            
            }
            

    }catch(FileNotFoundException ex){
        System.err.println("Input file not found");
    }
    
}
private static boolean genderIsValid(String gender){
if(gender.trim().equalsIgnoreCase("male")){
return true;
}else if(gender.trim().equalsIgnoreCase("female")){
return true;
}

return false;
}
}
