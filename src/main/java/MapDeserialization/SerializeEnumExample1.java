package MapDeserialization;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeEnumExample1 {
	
	public static void main(String args[]) throws JsonProcessingException {  
        // create instance variable  
        String enumStr, jsonString;  
        // Create scanner class object   
        Scanner sc = new Scanner(System.in);  
        // create an instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();  
        System.out.println("Enter Enum to serialize.");  
        enumStr = sc.nextLine();  
        if(enumStr.equals("KILOMETER")) {  
            // serialize Enum KILOMETER  
            jsonString = mapper.writeValueAsString(Distance1.KILOMETER);  // serializing the ENUM to JSON String.
        } else if(enumStr.equals("MILE")) {  
            // serialize Enum MILE  
            jsonString = mapper.writeValueAsString(Distance1.MILE);  
        
        } else if(enumStr.equals("MILLIMETER")) {  
            // serialize Enum MILLIMETER  
            jsonString = mapper.writeValueAsString(Distance1.MILLIMETER);  
        } else {  
            // serialize Enum UNKNOWN  
            jsonString = mapper.writeValueAsString(Distance1.UNKNOWN);  
        }  
          
        // close Scanner class object  
        sc.close();  
          
        System.out.println("Serialize Enum=====>"+jsonString);  
          
    }  
      

}
