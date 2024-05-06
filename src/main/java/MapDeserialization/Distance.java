package MapDeserialization;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)  

public enum Distance {
	 KILOMETER("km", 1000),   
     MILE("miles", 1609.34),  
     METER("meters", 1),   
     INCH("inches", 0.0254),  
     CENTIMETER("cm", 0.01),   
     MILLIMETER("mm", 0.001),  
     UNKNOWN("unkown", 0);  
   
	   @JsonValue  
	    public double getEnumValue() { // When Serializing , it would look For the Specified ENUM Value and Return the value that is associated with it. 
	        return meters;  
	   }
	public String unit;  
     public final double meters;  
   
     private Distance(String unit, double meters) {  
         this.unit = unit;  
         this.meters = meters;  
     }  
}
