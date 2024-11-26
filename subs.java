import java.util.*;
//Arjun Rajesh Khamkar
//10/08/2024
//CSE 123
// This class uses the substitution encryption algorithm and uses encrypt
// and decrypt methods to do the encoding/decoding on given text.
public class Substitution extends Cipher{
    
    private String shifter;
    private Map<Character, Character> shifterMap;

    //Create a Substitution object when the shifter string is null. Represents 
    //cipher that is able to encrypt a plaintext into a ciphertext and
    // decrypt a ciphertext into a plaintext using the passed shifter string. 
    public Substitution(){
        this.shifter = null;
    }

    //Create a Substitution object when the shifter string is passed. Represents 
    //cipher that is able to encrypt a plaintext into a ciphertext and
    // decrypt a ciphertext into a plaintext using the passed shifter string.
    public Substitution(String shifter){
        this.setShifter(shifter);
    }

    //Behavior:
    //      This method checks the passed shifter string for any exceptions 
    //      and if clear then sets the shifter.
    //Parameters:
    //      - shifter: the shifter string that is to be used in the substitution
    //Returns:
    //      - void: it populates the map and shifter field.
    //Exceptions:
    //      - shifter's length is not equal to number of characters in encodable 
    //        range, then IllegalArgumentException is thrown.
    //      - if an individual character falls outside the encodable range, 
    //        then IllegalArgumentException is thrown.
    //      - if shifter contains a duplicate character, then 
    //        IllegalArgumentException is thrown.
    public void setShifter(String shifter){
        if(shifter.length() != TOTAL_CHARS){
            throw new IllegalArgumentException();
        }
        for (int i=0; i<shifter.length();i++) {
            if (shifter.charAt(i) < Cipher.MIN_CHAR || shifter.charAt(i) > Cipher.MAX_CHAR) {
                throw new IllegalArgumentException("Attempting to swap character outside of Cipher range");
            }
         }
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < shifter.length(); i++) {
            char c = shifter.charAt(i);
            if (charCountMap.containsKey(c)) {
                throw new IllegalArgumentException("Shifter contains a duplicate: " + c);
            }
            charCountMap.put(c, 1);
        }

        this.shifter = shifter;
        shifterMap = new HashMap<>();
        for (int i = 0; i < shifter.length(); i++) {
            shifterMap.put((char) (MIN_CHAR+i), shifter.charAt(i));
        }

         
    }


    //Behavior:
    //      This method encodes the given plain text with the substitution algorithm using the map and returns the encrypted string
    //Parameters:
    //      - input: the plaintext that needs to be encrypted
    //Returns:
    //      - String: the encrypted plaintext string.
    //Exceptions:
    //      - if shifter is not initialized, when shifter == null, then IllegalStateException is thrown.
    @Override
    public String encrypt(String input){
        
        if(this.shifter == null){
            throw new IllegalStateException();
        }
        String ret = "";
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            char swappedc = shifterMap.get(c);
            ret += swappedc;
        }

        return ret;
    
    }

    //Behavior:
    //      This method decodes the given ciphertext with the reverse substitution algorithm using the map and returns the decrypted string.
    //Parameters:
    //      - input: the ciphertext that needs to be decrypted
    //Returns:
    //      - String: the decrypted ciphertext.
    //Exceptions:
    //      - if shifter is not initialized, when shifter == null, then IllegalStateException is thrown.
    @Override
    public String decrypt(String input){
        if(this.shifter == null){
            throw new IllegalStateException();
        }
        Map<Character, Character> revMap = new HashMap<>();
        for(Map.Entry<Character, Character> entry : shifterMap.entrySet()){
         revMap.put(entry.getValue(), entry.getKey());
        }
        String ret = "";
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            char swappedc = revMap.get(c);
            ret += swappedc;
        }

        return ret;
    }
    
}




