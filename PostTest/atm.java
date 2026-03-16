import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        int saldo = 500000;
        int jumlah;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch(pilihan) {

                case 1:
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setor: ");
                    jumlah = input.nextInt();
                    saldo += jumlah;
                    System.out.println("Setor berhasil.");
                    System.out.println("Saldo sekarang: Rp " + saldo);
                    break;

                case 3:
                    System.out.print("Masukkan jumlah tarik: ");
                    jumlah = input.nextInt();

                    int sisaSaldo = saldo - jumlah;

                    if (jumlah > saldo) {
                        System.out.println("Saldo tidak mencukupi.");
                    } 
                    else if (sisaSaldo < 50000) {
                        System.out.println("Saldo minimal harus Rp 50000.");
                    } 
                    else {
                        saldo = sisaSaldo;
                        System.out.println("Penarikan berhasil.");
                        System.out.println("Saldo sekarang: Rp " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM Mandiri.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while(pilihan != 4);

        input.close();
    }
}