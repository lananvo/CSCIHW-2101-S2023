package HW1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");

        Scanner scan = new Scanner(System.in);
        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)

        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)

        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
       System.out.print("Number for Pyramid: ");
       int number = Integer.parseInt(scan.nextLine());

       Pyramid.Output(number);
       
       System.out.print("Name: "); 
       String name = scan.nextLine();
       
       System.out.print("Age: ");
       int age = Integer.parseInt(scan.nextLine());
       
       System.out.print("Favorite Color: ");
       String favoriteColor = scan.nextLine();
       
       Adlibs adlib = new Adlibs();
       String story = adlib.story(name, age, favoriteColor);
       System.out.println(story);
       
       System.out.print("String: ");
       String s = scan.nextLine();
       
       System.out.print("Index: ");
       int x = Integer.parseInt(scan.nextLine());

       System.out.print("Character: ");
       char z = scan.nextLine().charAt(0);
       
       Replace rep = new Replace();
       String replacedStr = rep.charReplace(s, x, z);
       System.out.println(replacedStr);

       scan.close();

    
    }
}
