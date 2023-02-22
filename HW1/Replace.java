package HW1;
// Make a method that accepts a string an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,'T')
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
    public String charReplace(String s, int x, char z) {
        
        int length = s.length();
        String sub1= s.substring(0,x);
        String sub2= s.substring(x+1,length);

        String str2 = sub1 + z + sub2;
        return str2;
        
    }
    
}
