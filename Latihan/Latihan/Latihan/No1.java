import java.util.Scanner;

public class No1 {
    public static void main(String[] args) throws Exception{
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = i.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = i.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = i.next().charAt(0);

        double hasil;
        switch(operator){
            case '+':
                hasil = a + b;
                System.out.println("Hasil: " + hasil);
                break;

            case '-':
                hasil = a - b;
                System.out.println("Hasil: " + hasil);
                break;

            case '*':
                hasil = a * b;
                System.out.println("Hasil: " + hasil);
                break;

            case '/':
                if(b != 0){
                    hasil = a / b;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Perhitungan tidak boleh bernilai 0.");
                }
                break;

            default:
                System.out.println("Operator error");
        }
    }
}

