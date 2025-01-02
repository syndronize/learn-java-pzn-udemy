public class IfElse {
    public static void main(String[] args) {
        var x = 90;
        var y = 70;

        if (x>= 80 && y<=80){
            System.out.println("Done");
        }

        var a = "abc";
        var b = "xyz";
        var c = "abc";

        if (a == b ){
            System.out.println("a sama dengan b");

        } else if (a == c) {
            System.out.println("a sama dengan c");
        } else if (b == c) {
            System.out.println("b sama dengan c");
        }else{
            System.out.println("tidak ada yang sama");
        }
    }
}
