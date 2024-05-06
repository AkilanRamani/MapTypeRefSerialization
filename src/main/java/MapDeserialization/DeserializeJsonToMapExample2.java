package MapDeserialization;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeJsonToMapExample2 {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		   ObjectMapper mapper = new ObjectMapper();  
	          
	        // create json string  
	        String studentString = "{\"BCA\": \"001 and Nicholas and Clemens\", \"MCA\": \"002 and Sharon and Lorenz\"}";  
	          
	        // create TypeReference of type HashMap<String, Student>  
	        TypeReference<HashMap<String, Student>> typeRef = new TypeReference<HashMap<String, Student>>() {};  
	          
	        // deserialize studentString into Map<String, Student>  
	        Map<String, Student> studentMap = mapper.readValue(studentString, typeRef);  
	          
	        System.out.println("Student Map======>"+studentMap);  
	          
	    }  
	}


