import java.util.*;

public class AKBMICalculator {
    String name;
    int height;
    float weight;

    public static double getBMI(int height, float weight) {  // function header. Use "height" and "weight" variables in your code below
        double bmi = 0;     // Declares a variable named "bmi" of type double. Temporarily stores the value 0.

        // 2️⃣ SECOND
        // 🔴 Calculate BMI and store the result in the variable "bmi"
        // 🔴 Hint: height needs to be converted to appropriate type before being used in the bmi equation
        // ⬇️------------Write your code below (approx. 2 lines of code)-----------⬇️
        bmi = weight / Math.pow(height / 100.0, 2);

        // ⬆️--------------------------------END HERE------------------------------⬆️
        return bmi;     // Returns bmi value. This is the result when getBMI() method is called
    }

    public static void main(String[] args) {
        AKBMICalculator user = new AKBMICalculator();   // Creates a new BMICalulator object named "user"
        Scanner scanner = new Scanner(System.in);   // Creates a new Scanner object named "scanner"

        testBMI();                                  // Checks if the getBMI() method is correct

        System.out.print("Enter your name: ");    // Prints a statement asking the user to input their name
        user.name = scanner.nextLine();             // Reads user input and stores the value in the object attribute "name"

        // 1️⃣ FIRST
        // 🔴 Use a print statement to ask the user to input their height in the required format (as shown in the tutorial's "input" section)
        // 🔴 Read user input and store the value in the object attribute "height"
        // 🔴 Repeat the same for "weight"
        // ⬇️------------Write your code below (approx. 4 lines of code)-----------⬇️

        System.out.print("Enter your height (in cm): ");
        user.height = scanner.nextInt();
        
       System.out.print("Enter your weight (in kg): ");
       user.weight = scanner.nextFloat();



        // ⬆️--------------------------------END HERE------------------------------⬆️

        
        double bmi = getBMI(user.height, user.weight);  // Calls the getBMI() method and stores the reult in a variable named "bmi"

        // 3️⃣ THIRD
        // 🔴 Print the user's BMI in the required format (as shown in the tutorial's "output" section)
        // ⬇️------------Write your code below (approx. 1 lines of code)-----------

        System.out.print("Bmi of " + user.name + " is " + Double.toString(bmi));


        // ⬆️--------------------------------END HERE------------------------------⬆️

        scanner.close();
    }

    // Ignore the method below. This is simply for checking your getBMI() method.
    public static void testBMI() {
        double test = getBMI(150,45);
        if (test==20.0) {
            System.out.println("Your bmi calculation is correct");
        } else {
            System.out.println("Your bmi calculation is incorrect");
        }
    }
}