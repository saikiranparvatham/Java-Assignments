import java.text.SimpleDateFormat;  
import java.util.Date;  
public class dateFormat {  
public static void main(String[] args) {  
	
    String sDate1="31,12,1998";  
	
   //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); 
	Date d1=new Date(sDate1);
	 
    System.out.println(d1);  
	//System.out.println(new SimpleDateFormat("MMMM").format(date1));
}  
}  