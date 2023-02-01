package feb1;

public class StringConcatination {  
    public static void main(String[] args) {      
        String str1 = "Hello";  
        String str2 = "World";  
        String str3 = "Everyone";  
        
        String str4 = str1.concat(str2);          
        System.out.println(str4);    
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5); 
        
    }  
}  