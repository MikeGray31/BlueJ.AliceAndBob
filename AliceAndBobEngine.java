
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author Mike Gray
 * @version (a version number or a date)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        if (input.equals("Bob")){
            result = "Hello Bob";
        }
        
        else if (input.equals("Alice")){
            result = "Hello Alice";
        }
        
        else {
            result = "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        
        return result;
    }
}
