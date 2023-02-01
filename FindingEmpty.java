package strings;

public class FindingEmpty {  
    public static void main(String[] args) {  
        String s1="";    
        String s2="Javatpoint";             
        if(s1.length()==0 || s1.isEmpty())  
            System.out.println("String s1 is empty");  
        else System.out.println("s1");        
        if(s2.length()==0 || s2.isEmpty())  
            System.out.println("String s2 is empty");  
        else System.out.println(s2);  
    }  
}  

//isEmpty() method checks if the input string is empty or not
// and in this program we use || operator to check that the string is empty or not