package nyc.c4q.Yojana;

import javax.xml.soap.Node;
import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.HashSet;

public class Main {


//    1) Write a function called wordToArray(String word) that takes in a string as an argument and
//    returns an array that contains all of the letters of that word.

    public static void main(String[] args) {
        String string = "YojanaSharma";
        char[] myChar = string.toCharArray();

//        String strArray[] = new String[myChar.length];

        for (int i = 0; i < myChar.length; i++) {
//            strArray[i] = String.valueOf(myChar[i]);


            System.out.println(myChar[i]);
        }
        xToNum(2, 4);

    }

//    2) Write a function truncate(String input, int truncateBy) to truncate a string if it is
//    longer than the specified number of characters. The function should take two arguments,
//    the first argument being the string and the second argument being the number of characters
//    to truncate the string by. Truncated strings should end with an ellipsis sequence ("...").
//    If the specified number is large than the length of the string, the entire string should be
//    returned.

    public String truncate(String input, int truncateBy) {

        if (input.length() < truncateBy) {
            return input;
        } else {
            return (input.substring(0, truncateBy) + "...");
        }
    }

//    3) Write a function called checkUnique(String input) that takes in a string as an argument and checks
//    if the string has all unique characters. In other words, the function should check to make sure there
//    are no duplicate characters in the string. If the string's characters are all unique, the function should
//            return true. Otherwise it should return false.


    public static boolean checkUnique(String string) {
        HashSet<Character> hs = new HashSet<Character>(string.length());
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (!hs.add(string.charAt(i)))
                return false;
        }
        return true;
    }


//    4) Write a method that takes a string parameter. For longer strings, the method returns a new string constructed
//            out of the first three letters of the argument, followed by three periods ("..."), followed by the last
//            letter of the argument. However, if the resulting string is not shorter than the argument, the method
//            should return the argument instead.

    public static String shorterString(String string) {
        Integer stringLength = string.length();
        String resultString = string.substring(0, 3) + "..." + string.charAt(stringLength - 1);

        if (resultString.length() >= stringLength)
            return (string);
        else {
            return (resultString);
        }
    }
//    5) Write a function xToNum(x, num) that takes as arguments two numbers: x and num and returns the sum of all
//    numbers from x to num (including both). For example:

    public static void xToNum(int x, int num) {
        int adder = x+1;


        if (x >= num)
            System.out.println(x + num);

        while(x<num){
            adder++;


        }

        System.out.println(adder + num);
    }
}


//    Write a method listLength(Node list) that receives the head of a singly linked list and returns the number of
//    nodes in the linked list. What is the worst-case runtime complexity of your algorithm?











