public class SwitchState {
    public static void main(String[] args) {
        // switch hanya untuk perbandingan ==
        var nilai = "F";
        switch (nilai){
            case "A" :
                System.out.println("Nilai Anda Sangat Mengesankan");
                break;
            case "B" :
                System.out.println("Nilai Anda  Mengesankan");
                break;
            case "C" :
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D" :
                System.out.println("Anda Tidak Lulus");
                break;
            case "E" :
                System.out.println("Mungkin Anda Salah Jurusan");
                break;
            default :
                System.out.println("Hanya Menerima Nilai dari A - E");
                break;
        }

        //switch lambda
        switch (nilai){
            case "A" -> System.out.println("Lambda Nilai A");
            case "B" -> System.out.println("Lambda Nilai B");
            case "C" -> System.out.println("Lambda Nilai C");
            case "D" -> System.out.println("Lambda Nilai D");
            case "E" -> System.out.println("Lambda Nilai E");
            default -> {
                System.out.println(" Lambda Default");
            }
        }

        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Ucapan Lambda Nilai A";
            case "B" -> ucapan = "Ucapan Lambda Nilai B";
            case "C" -> ucapan = "Ucapan Lambda Nilai C";
            case "D" -> ucapan = "Ucapan Lambda Nilai D";
            case "E" -> ucapan = "Ucapan Lambda Nilai E";
            default ->  ucapan = "Ucapan Lambda Default";

        }
        System.out.println(ucapan);
        //yield
       ucapan =  switch (nilai){
           case "A" : yield "Yield Lambda Nilai A";
           case "B" : yield  "Yield Lambda Nilai B";
           case "C" : yield "Yield Lambda Nilai C";
           case "D" : yield "Yield Lambda Nilai D";
            case "E" : yield "Yield Lambda Nilai E";
            default : yield "Yield Lambda Default";

        };
        System.out.println(ucapan);
    }
}
