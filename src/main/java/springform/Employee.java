package springform;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Employee {  
		
		@Size(min=8,message="required")  
		@NotNull(message = "is required")
	    private String name;  
	    
		@NotNull(message = "is required")
	    @Size(min=10,message="required")  
	    private String pass;  
	    
	    @NotNull(message = "is required")
	    @Min(value = 0, message = "must be greater than or equal to zero")
	    @Max(value = 10, message = "must be less than or equal to 10")
	    private Integer freePasses;
	    
	    
	    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	    @NotNull(message = "is required")
	    private String postalCode;
	      
	    public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public String getPass() {  
	        return pass;  
	    }  
	    public void setpostalCode(String postalCode) {  
	        this.postalCode = postalCode;  
	    }  
	    
	    public String getPostalCode() {
	        return postalCode;
	    }
	    
	    public void setfreePasses(Integer freePasses) {  
	        this.freePasses = freePasses;  
	    }  
	    
	    public Integer getfreePasses() {
	        return freePasses;
	    }
	}  

