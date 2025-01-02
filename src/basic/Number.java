package basic;

public class Number {
    public static void main(String[] args) {
        byte testByte = 100;
        short testShort = 1000;
        int testInt = 10000;
        long testLong = 1000000000;
        long testLong2 = 100000010329400L;

        float testFloat = 10.50F;
        double testDouble = 10.921;

        //Literals basic.Number
        int decimalInt = 25;
        int hexInt = 0xA132B; // Hexa basic.Number
        int binInt =0b01010101; // Binary basic.Number

        //Underscore
        int amount = 1_000_000_000;
        long test = 1_000_000_000_000_000L;

        //Konversi basic.Number

        // byte -> double
        byte convByte = 10;
        short convShort = convByte;
        int convInt = convShort;
        long convLong = convInt;
        float convFloat = convLong;
        double convDouble = convFloat;

        //double -> byte
        float revFloat = (float) convDouble;
        long revLong = (long) revFloat;
        int revInt = (int)revLong;
        short revShort = (short) revInt;
        byte revByte = (byte) revShort;
        System.out.println(revShort);
    }
}
