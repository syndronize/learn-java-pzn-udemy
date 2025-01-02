package basic;

import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
       //declare new array
        String[]  arrayString;
        // set array length
        arrayString = new String[3];
        //or
//        String[] arrayString = mew String[3];
        //array data
        arrayString[0] = "a";
        arrayString[1] = "b";
        arrayString[2] = "c";

        //another way
        int[] arrayInt = new int[]{
                10,9,8,7
        };

        //or
        long[] arrayLong = {
                90,87,19,93
        };
        System.out.println(arrayLong[3]);
        arrayLong[3] = 94;

        //basic.Array in basic.Array
        String[][] nameMembers = {
                {"basic.Array 00","basic.Array 01","basic.Array 02"},
                {"basic.Array 10","Array11"},
                {"Array20"}
        };
        System.out.println(nameMembers[0][1]);
        System.out.println(arrayLong[3]);
        System.out.println(arrayString.length);

        //Bonus from Stackoverflow
        //show all array value
        //should need add "import java.util.Arrays;" on top
        System.out.println(Arrays.deepToString(nameMembers));
    }
}
