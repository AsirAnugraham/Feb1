package feb1;

public class StringEquals   
{  
public static void main(String args[])  
{   
String str = "a";  
String str1 = "123";  
String str2 = "45.89";  
String str3 = "false";  
Character c = new Character('a');  
Integer i = new Integer(123);  
Float f = new Float(45.89);  
Boolean b = new Boolean(false);  
System.out.println(str.equals(c));    
System.out.println(str1.equals(i));   
System.out.println(str2.equals(f));    
System.out.println(str3.equals(b));  
//The above values are false because we cannot compare a string with different datatypes
// the different data types into the string using the toString() method  
System.out.println(str.equals(c.toString()));  
System.out.println(str1.equals(i.toString()));  
System.out.println(str2.equals(f.toString()));  
System.out.println(str3.equals(b.toString()));  
}  
} 