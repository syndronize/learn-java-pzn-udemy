package basic;

public class BooleanOperate {
    public static void main(String[] args) {
        // && = dan,  || = atau, ! = kebalikan
        boolean x = true;
        boolean y = false;

        if (!x){
            System.out.println('a');
        }else{
            System.out.println('b');
        }

        if(x && y ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if (x || y){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
