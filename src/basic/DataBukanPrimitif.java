package basic;

public class DataBukanPrimitif {
    public static void main(String[] args) {
        Integer testInteger = 100;
        Long testLong = 100L;

        Byte testByte = null;
        Byte testByte2 ;

        testByte = 1;
        testByte2 = 3;


        //Convert Bukan Primitif ke Primitif dan sebaliknya
        //primitif ke bukan
        int age = 30; //primitif
        Integer ageObject = age; // bukan primitif

        //bukan ke primitif
        Integer iniObject = age; // bukan primitif

        short testShort = iniObject.shortValue();
        System.out.println(testShort);

        System.out.println(age);

        System.out.println(testByte2);
        System.out.println(testByte);
        System.out.println(testInteger);
        System.out.println(testLong);

    }
}
