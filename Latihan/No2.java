import java.util.Scanner;

public class No2 {
    public static void main(String[] args) throws Exception { 

        Scanner i = new Scanner(System.in);

        int pinBenar = 190590;
        int percobaan = 0;

        while(percobaan < 3){
            System.out.print("Masukkan PIN: ");
            int pin = i.nextInt();

            if(pin == pinBenar){
                System.out.println("Login berhasil");
                break;
            } else {
                System.out.println("PIN yang anda masukin salah");
            }
            percobaan++;

            if(percobaan == 3){
                System.out.println("Akun diblokir");
            }
        }
    }
}