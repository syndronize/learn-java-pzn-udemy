package todolist;

public class AplikasiTodolist {

    public static String[] data = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShow();

    }

    //show to do list
    public static void show(){
        System.out.println("----To Do List---");
        for (var i=0; i < data.length; i++){
            var todo = data[i];
            var no = i + 1;
            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }

    }

    public static void testShow(){
        data[0] = "Belajar Study Case";
        data[1] = "Belajar Agama";
        show();
    }

    //add to do  on list
    public static void addTodolist(String todo){
        //check data is full
        var full =  true;
        for (int i = 0; i <data.length; i++){
            if (data[i] == null){
                full = false;
                break;
            }
        }
        // if the dataa full, then array resize *2
        if (full){
            var temp = data;

            data = new String[data.length * 2];

            for (int i =0; i<temp.length;i++){
                data[i] = temp[i];
            }
        }
        // add data if index null
        for (var i = 0; i<data.length; i++){
            if (data[i] == null){
                data[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 1; i<25; i++){
            addTodolist("Todo List ke - " + i);
        }
    }
    //remove to do on list
    public static boolean removeTodolist(Integer index){
        if (data.length <= (index -1 )){
             return false;
        }
        else if (data[index-1] == null){
            return false;
        }
        else {
            for (int i =(index-1); i<data.length;i++){
                if (i == (data.length - 1)){
                    data[i] = null;
                }else{
                    data[i] = data[i+1];
                }
            }
            return true;
        }

    }

    public static void testRemoveTodolist(){
        addTodolist("test 1");
        addTodolist("test 2");
        addTodolist("test 3");
        addTodolist("test 4");
        addTodolist("test 5");

        var result = removeTodolist(20);
        System.out.println(result);
        result = removeTodolist(2);
        System.out.println(result);
        show();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi , " + name + " !");

        var channel = input("Channel");
        System.out.println(channel);
    }
    //view data on to do list
    public static void viewShow(){
        while (true){
            show();
            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("exit");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAdd();
            } else if (input.equals("2")) {
                viewRemove();
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }

    public static void testView(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("4");
        addTodolist("5");
        viewShow();
    }

    //view add screen on to do list
    public static void viewAdd(){
        System.out.println("Add To Do List");

        var todo = input("Todo (type exit if cancel)");

        if (todo.equals("exit")){
            //cancel
        }else {
            addTodolist(todo);
        }
    }

    public static void testViewAdd(){
        addTodolist("1");
        addTodolist("2");
        addTodolist("3");
        viewAdd();
        show();
    }

    //view remove on to do list
    public static void viewRemove(){
        System.out.println("Remove To Do List");
        var index = input("Type Number to Remove (type exit if cancel)");
        if (index.equals("exit")){
            //cancel
        }else {
            boolean success = removeTodolist(Integer.valueOf(index));
            if (!success){
                System.out.println("Failed to Remove To Do List number : " + index);
            }else{
                System.out.println("Success to Reove To Do List");
            }
        }
    }

    public static void testViewRemove(){
        addTodolist("1");
        addTodolist("2");
        addTodolist("3");
        addTodolist("4");
        show();
        viewRemove();
        show();
    }

}
