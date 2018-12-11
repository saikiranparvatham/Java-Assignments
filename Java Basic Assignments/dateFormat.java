import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.*;  
class dateFormat {  
public static void main(String[] args) {  
	 String sDate1="31/12/1998";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	   //Calendar cal=Calendar.getInstance();
SimpleDateFormat month_date = new SimpleDateFormat("dd/MM/yyyy");
String month_name = month_date.format(date1);
System.out.println("Month :: " + month_name);
}  
}  