import org.w3c.dom.ls.LSOutput;

public class Method {
    public static void main(String[] args) {
        sayHelloWorld();

        withParam(123123, "Anjay");

        var result = withReturnValue(90,80);
        System.out.println(result);
        withArgue("Anjay", 80,90,79,90);

        var recursive = withRecursive(2);
        System.out.println(recursive);
        stackOverflow(10000);
    }

    static void sayHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
    }

    static void withParam(Integer params, String nama){
        System.out.println(params);
        System.out.println(nama);
    }

    static int withReturnValue(int x , int y){
        int a = x + y;
        return a;
    }

    static void withArgue(String name, int... nilai){
        System.out.println(name);
        var total = 0;
        for (var nilais : nilai){
            total += nilais;

        }
        System.out.println("total nilai : "  + total);
    }

    static int withRecursive(int value){
        // use case factorial
        if (value == 1 || value == 0 ){
            return value;
        }else{
            return value * withRecursive(value - 1);
        }
    }

    // stackoverflow
    // It’s better to avoid using this approach if the dataset is large.
    static void stackOverflow(int value){
        if (value == 0 ){
            System.out.println("done");;
        }else{
            System.out.println("Loop " + value);
            stackOverflow(value -1 );
        }
    }

}
