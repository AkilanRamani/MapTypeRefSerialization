package MapDeserialization;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = DistanceCustomSerializer.class)  
public enum Distance1 {
	
	        KILOMETER("km", 1000),   
	        CENTIMETER("cm", 0.01),   
	        INCH("inches", 0.0254),  
	        MILE("miles", 1609.34),  
	        MILLIMETER("mm", 0.001),  
	        METER("meters", 1),   
	        UNKNOWN("unkown", 0);  
	      
	        // instance variables  
	    public String unit;  
	        public final double meters;  
	      
	        // parameterized constructors  
	        private Distance1(String unit, double meters) {  
	            this.unit = unit;  
	            this.meters = meters;  //this.meters = 1000;
	        }  
	      
	        // standard getters and setters  
	        @JsonValue  
	        public double getMeterValue() {  
	            return meters;  
	        }  
	        @JsonValue  
	        public String getUnitValue() {  
	            return unit;  
	        }  

}
