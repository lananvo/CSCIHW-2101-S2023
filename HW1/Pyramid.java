package HW1;
/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) and so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
Hint3: The print statement is System.out.println();
*/
public class Pyramid {
    public static void Output(int number) {
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            int bottomNumber = number - 1;
            for (int i = 0; i < bottomNumber; i++) {
                for (int j = 0; j < bottomNumber - i; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter a number 1 or greater.");
        }
    }
}
