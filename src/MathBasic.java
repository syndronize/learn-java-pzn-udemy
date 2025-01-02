public class MathBasic {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //augmented Assignment
       a += 10;
        System.out.println(a);
       a -= 10;
        System.out.println(a);
       a *= 10;
        System.out.println(a);
       a /= 10;
        System.out.println(a);
       a %= 10;
        System.out.println(a);

       //Unary Operator
        int d = 100;
        d++;
        System.out.println(d);
        d--;
        System.out.println(d);

    }
}
