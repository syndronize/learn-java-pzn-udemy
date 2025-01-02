package basic;

public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "abc","efg","hij","klm","nop","qrs","tuv","wxyz"
        };
        for(var name: array){
            System.out.println(name);
        }
    }

}
