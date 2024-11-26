import java.util.*;
//Arjun Rajesh Khamkar
//10/08/2024
//CSE 123
// This class uses the CaesarKey and the substitution encryption algorithm to encode
// and decode the given text.
public class CaesarShift extends Substitution{
    //Constructs a CaesarShift object using the passed shift value.
    //Exception:
    //      - if shift value is negative or zero, then throws IllegalArgumentException.
    public CaesarShift(int shift){
        if(shift <= 0){
            throw new IllegalArgumentException();
        }


        Queue<Character> shiftQueue = new LinkedList<>();

        for(int i= MIN_CHAR; i<=MAX_CHAR; i++){
            shiftQueue.add((char)i);
        }
        super.setShifter( setCaesarShiftShifter(shiftQueue, shift) );
        }

    //Behavior:
    //      This helper method creates the CaesarShiftShifter string using the shift value.
    //Returns:
    //      - String: the shifter string which can be used for encoding/decoding using the substitution algorithm.
    //Exceptions:
    //      - if queue is empty, throws IllegalStateException()
    private String setCaesarShiftShifter(Queue<Character> queue, int shift) {
        if(queue == null){
            throw new IllegalStateException();
        }
        String shifter = "";
        for (int i = 0; i < shift; i++) {
            char frontChar = queue.remove();
            queue.add(frontChar);
        }
        for (char c : queue) {
            shifter = shifter + c;
        } return shifter;

    }
}