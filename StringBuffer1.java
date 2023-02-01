package feb1;

class StringBuffer1{ 
	public static void main(String args[])
{  
StringBuffer sb=new StringBuffer("Hello ");  
sb.insert(1,"Java");
System.out.println(sb);
}  
}  

//Java StringBuffer class is used to create mutable (modifiable) String objects. 
//The StringBuffer class in Java is the same as String class except it is mutablei.e. it can be changed.
//Sb.insert is used to insert the string in the target location .