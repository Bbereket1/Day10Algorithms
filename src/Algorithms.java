import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class Algorithms {
    public static void main(String[] args) {
        /*

        Question 1.
        Create a method that takes first name and last name
        and returns a greeting that says hello to that person.

         */

        /*

        Question 2
        Create a method that takes an integer. Print numbers from 0 up to that number.

        
         */


        /*

        Question 3

        Create a method that takes an array of names.
        Loop through the names and return true if all
        names have a length of 3.
        Example input: "For", "Bob", "Sam"
        Output: true
        Example input 2: "Fr", "Bob", "Sam"
        Output: false
        Example input 3: "For", "Bob", "Samuel"
        Output: false

         */

        /*

        Question 4

        Create a method that takes an integer and checks if it is a prime number.
        A prime number is a number greater than 1 that is not divisible by any
        number between 1 and itself.
        Examples of prime numbers: 2, 3, 5, 7, 11, 13
        If the number passed is less than 1, just return false.

         */



        /*

        Question 5

        Part 1: Smart Light Switch for Alexa

        Let's say you're creating an application for a Smart light switch to work with Alexa.
        Newer light switches will often connect with a virtual home assistant such as Alexa or Google.
        The way this works is, a user should be able to say a command such as, "Alexa, turn on light switch" and
        the light switch should be turned on. Let's implement this.

        Create a class called LightSwitch. Give it the following fields:

        id (unique number ID of the light switch. If your company is creating thousands of these,
        you'll need to identify them with a unique ID)
        isOn (this is a boolean to represent whether the light switch is on)
        Next, create getters and setters.

        Next, modify the setter for isOn. Here's how it should work: regardless of the current status of isOn,
        when this method is invoked it should change from the current status.
        For example, if isOn is true it should be changed to false. If isOn is false, set it to true.

         */

        // Greeting User

        greetingUser("Dan", "John");
        System.out.println(greetingUser("Dan", "John"));

        // Integer

        integerNums(10);

        // Array of Names

        String[] namesOne = {"For", "Bob", "Sam"};
        String[] nameTwo = {"Fr", "Bob", "Sam"};
        String[] nameThree = {"For", "Bob", "Samuel"};

        System.out.println(isUserNamesLength3(namesOne));
        System.out.println(isUserNamesLength3(nameTwo));
        System.out.println(isUserNamesLength3(nameThree));
        

        // Prime Number Checking

        System.out.println(isPrimeNumber(11));




        // Light switch for Alexa

        String uniqueID = UUID.randomUUID().toString();
        LightSwitch userID = new LightSwitch(uniqueID, true);

            System.out.println((userID.id + " " + "= Alexa, turn on light switch"));

            System.out.println(userID.isOn);

    }





    public static String greetingUser(String firstName, String lastName) {
        return ("Hello " + firstName + " " + lastName);

    }

    public static void integerNums(int nums) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static boolean isUserNamesLength3(String[] names) {
        //boolean result = true;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() != 3) {
                return false;
            //System.out.println(false);
                //System.out.println(names[i]);
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(int nums) {
        for (int i=2; i<nums; i++) {
            if((nums%i == 0)) {
                return false;
            }
        }
        return true;
    }

}



