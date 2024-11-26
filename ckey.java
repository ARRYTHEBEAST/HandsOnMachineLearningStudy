import java.util.*;

//Arjun Rajesh Khamkar
//10/08/2024
//CSE 123
// This class uses the CaesarKey and the substitution encryption algorithm to encode
// and decode the given text.
public class CaesarKey extends Substitution{
        
    //Constructs a CeasarKey object using the passed key string.
    //Exception:
    //      - if key is empty, then throws IllegalArgumentException.
    //      - if any character in key is outside the encodable range, 
    //        then throws IllegalArgumentException.
    //      - if a character is repeated in the key, then throws IllegalArgumentException.

    public CaesarKey(String key){
        
        if(key.length() == 0){
            throw new IllegalArgumentException();
        }

        for (int i=0; i<key.length();i++) {
            if (key.charAt(i) < Cipher.MIN_CHAR || key.charAt(i) > Cipher.MAX_CHAR) {
                throw new IllegalArgumentException("Attempting to swap character outside of Cipher range");
            }
        }
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (map.containsKey(c)) {
                throw new IllegalArgumentException();
            }
            map.put(c, 1);
        }

        super.setShifter( createCaesarShifter(key) );
    }

    //Behavior:
    //      This is a helper method which creats the caesar shifter.
    //      This method creates the caesar shifter string using the Caesar Key field.
    //Returns:
    //      - String: the shifter string which can be used for encoding/decoding 
    //                using the substitution algorithm.
    //Exceptions:
    //      - if Caesar key is empty, throws IllegalStateException()

    private String createCaesarShifter (String key) {
        if(key == null){
            throw new IllegalStateException();
        }
        String ret = "";  
        ret += key;  
        for (int i = Cipher.MIN_CHAR; i <= Cipher.MAX_CHAR; i++) {
            char currentChar = (char) i;
            if (key.indexOf(currentChar) == -1) {
                ret += currentChar; 
            }
        }
        return ret;  
    } 

}