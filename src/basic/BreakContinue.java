package basic;

public class BreakContinue {
    public static void main(String[] args) {
        for (var i = 1; i<= 100; i++){
            if(i % 2==0) {
                continue;
            };
            System.out.println("Bilangan Ganjil : " + i);
        }
    }
}
