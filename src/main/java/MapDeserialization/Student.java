package MapDeserialization;

public class Student {
	private String id;  
    private String fName;  
        private String lName;  
      
        Student(String data){  
            String[] allData = data.split("and");  
            this.id = allData[0].trim();  
            this.fName = allData[1].trim();  
            this.lName = allData[2].trim();  
        }  
      
        public String toString() {  
            return "Student Id = "+id+" Name = "+fName + " " +lName;  
        }  
      
        public String getId() {  
            return id;  
        }  
        public String getFName() {  
            return fName;  
        }  
      
        public String getLName() {  
            return lName;  
        }  
}
