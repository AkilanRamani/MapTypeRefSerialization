package MapDeserialization;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Distance21 {
	
	  
	KILOMETER("km", 1000),  
    METER("meters", 1),   
    MILLIMETER("mm", 0.001),   
    INCH("inches", 0.0254),  
    CENTIMETER("cm", 0.01),   
    MILE("miles", 1609.34),  
    UNKNOWN("unkown", 0);  
// instance variable  
    public String unit;  
public final double meters;  
//parameterized constructor  
    private Distance21(String unit, double meters) {  
        this.unit = unit;  
        this.meters = meters;  
    }  
    // getter method annotated with @JsonValue  
    @JsonValue  
public double getEnumValue() {  
        return meters;  
    }  

}
