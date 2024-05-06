package MapDeserialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DistanceCustomSerializer  extends JsonSerializer<Distance1> {  
@Override  
    public void serialize(Distance1 obj, JsonGenerator gen, SerializerProvider provider) throws IOException {  
          
            // form JSON using JsonGenerator  
            // writeFieldName() method is used to set the field name  
            // writeString() and writeNumber() methods are used to write String and Number values  
        gen.writeStartObject();  
        gen.writeFieldName("name");  
        gen.writeString(obj.name());  
        // check name of the field  
        /*if(obj.name().equals("UNKOWN")) {  
            gen.writeFieldName("unknown");  
            gen.writeNumber(0);  
        } else {  */
            gen.writeFieldName("unit");  
            gen.writeString(obj.getUnitValue());  
            gen.writeFieldName("meters");  
            gen.writeNumber(obj.getMeterValue());  
         
        gen.writeEndObject();  
    }  

}
