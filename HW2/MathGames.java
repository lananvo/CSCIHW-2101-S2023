package HW2;


public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    // Example 1: pythagorean(3,4) would return 5

static double PythagoreanTheorem(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    static double CalcMissingSide(double a, double b, double c) {
        double missingSide = 0;
        if (a != 0 && b != 0 && c != 0) {
            System.out.println("You have entered all 3 sides of the triangle");
        } else if (a == 0 && b == 0 && c == 0) {
            System.out.println("You have not entered any sides of the triangle");
        } else if (c != 0) {
            missingSide = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2) - Math.pow(b, 2));
        } else {
            missingSide = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));}
        
        return missingSide;
           
    }
    
       
    
    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements required here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method
        // Example: grade(69.3) would return a D

    static String calcGrade(double grade) {
        String letterGrade = "";
        grade = Math.ceil(grade);
        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80 && grade <= 89) {
            letterGrade = "B";
        } else if (grade >= 70 && grade <=79) {
            letterGrade = "C";
        } else if (grade >= 60 && grade <= 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }


    



    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method
    //      Example: tip(100, 4, 18) would return 5.0

    static double tip(double bill, double people, double tip) {
        double tipPercent = tip / 100;
        double tipAmount = bill * tipPercent;
        double total = bill + tipAmount;
        double totalPerPerson = total / people;
        double totalPerPersonRounded = Math.ceil(totalPerPerson);
        return totalPerPersonRounded;
    }
 


    // You can either create a tester class or put your code here
     public static void main(String[] args){
        System.out.println(MathGames.PythagoreanTheorem(3, 4));
        System.out.println(MathGames.CalcMissingSide(0, 3, 5));
        System.out.println(MathGames.calcGrade(89.9));
        System.out.println(MathGames.tip(200, 6, 20));
    }
}
