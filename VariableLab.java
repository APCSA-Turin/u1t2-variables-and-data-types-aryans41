/* 
This is about Steph Curry's profile and his threes that made him famous. 
*/
public class VariableLab {
    public static void main(String[] args) {
        final double FEET_CONVERSION = 12.0;
        double height; 
        height = 75.6; 
        String firstName = "Steph"; 
        String lastName = "Curry"; 
        int weight = 185; 
        int totalThrees = 166; 
        boolean isPointGuard = true; 
        // all my variables are set for the program
        System.out.println(firstName + " " + lastName + " is " + height + " inches tall." );
        System.out.println("There are " + FEET_CONVERSION + " inches in one foot.");
        // conversion from inches to feet
        double feetHeight = height / FEET_CONVERSION;
        System.out.println(lastName + " is " + feetHeight + " feet tall.");
        System.out.println(firstName + " weighs " + weight + " pounds.");
        System.out.println(firstName + " " + lastName + " had " + totalThrees + " threes in his first season.");
        System.out.println("True or false? Steph Curry is a point guard: " + isPointGuard);
        // updating variables's value
        totalThrees = 3747;
        System.out.println(lastName + " now has " + totalThrees + " total threes in the NBA!");
        int remainingThrees = totalThrees - 166;
        System.out.println("Therefore, he scored " + remainingThrees + " threes in the next 14 seasons."); 
        if (totalThrees > 2973) {
          System.out.println("This makes him the leader in all-time threes in NBA history!");
        } else { 
            System.out.println("He is second place in the all-time three pointer list. ");
        }
    } 
} 