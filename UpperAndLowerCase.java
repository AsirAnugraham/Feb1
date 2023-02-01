package feb1;

public class UpperAndLowerCase {
    public static void main(String args[]) {
        String S1 = new String("UPPERCASE CONVERTED TO LOWERCASE");
        System.out.println(S1.toLowerCase());
        //here we use toLowerCase()to make uppercases to lowercase
        {
        	String S2 = new String("lowercase converted to uppercase");
            System.out.println(S1.toUpperCase());
            //here we use toUpperCase() to make lowercase letter into uppercase letter
        }

    }
}