import java.util.Scanner;

public class soundFestKiosk {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // Harga Tiket
        int hargaVIP = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;

        // Stok Tiket
        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        boolean mesin = true;

        while (mesin) {

            System.out.println("\n===== MENU TIKET =====");
            System.out.println("1. VIP");
            System.out.println("2. Festival");
            System.out.println("3. Tribune");
            System.out.println("4. Matikan Mesin");
            System.out.print("Pilih menu: ");

            int pilihan = input.nextInt();

            int harga = 0;
            int stok = 0;
            int batasUsia = 0;
            String kategori = " ";

            switch (pilihan) {
                case 1:
                    kategori = "VIP";
                    harga = hargaVIP;
                    stok = stokVIP;
                    batasUsia = 18;
                    break;

                case 2:
                    kategori = "Festival";
                    harga = hargaFestival;
                    stok = stokFestival;
                    batasUsia = 15;
                    break;

                case 3:
                    kategori = "Tribune";
                    harga = hargaTribune;
                    stok = stokTribune;
                    batasUsia = 0;
                    break;

                case 4:
                    mesin = false;
                    System.out.println("Mesin dimatikan teknisi.");
                    continue;

                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            System.out.println("Anda memilih tiket " + kategori);

            //User Input Jumlah Tiket
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlah = input.nextInt();

            if (jumlah <= 0) {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }

            if (jumlah > stok) {
                System.out.println("Maaf, stok tidak mencukupi. Stok tersedia: " + stok);
                continue;
            }

            int tiketBerhasil = 0;
            //Looping untuk input usia setiap tiket
            for (int i = 1; i <= jumlah; i++) {

                System.out.print("Masukkan usia untuk tiket ke-" + i + ": ");
                int usia = input.nextInt();

                if (usia == -1) {
                    System.out.println("Pembelian dibatalkan. Kembali ke Menu Utama.");
                    tiketBerhasil = 0;
                    break; 
                }

                // Usia tidak logis
                if (usia > 120) {
                    System.out.println("Usia tidak logis. Silakan masukkan usia kembali.");
                    i--;
                    continue;
                }

                // Usia tidak memenuhi syarat
                if (batasUsia > 0 && usia < batasUsia) {
                    System.out.println("Maaf, usia anda tidak memenuhi syarat untuk tiket " + kategori);
                    continue;
                }

                System.out.println("Tiket ke-" + i + " berhasil diproses.");
                tiketBerhasil++;
            }

            if (tiketBerhasil == 0) {
                System.out.println("Tidak ada tiket yang berhasil diproses.");
                continue;
            }

            int totalHarga = harga * tiketBerhasil;
            System.out.println("Total harga: Rp " + totalHarga);

            //User Input Pembayaran
            System.out.print("Masukkan jumlah pembayaran: Rp ");
            int bayar = input.nextInt();

            if (bayar < totalHarga) {
                System.out.println("Pembayaran kurang. Transaksi dibatalkan.");
                continue;
            }

            int kembalian = bayar - totalHarga;

            System.out.println("Pembayaran berhasil!");
            System.out.println("Kembalian: Rp " + kembalian);
            System.out.println("Tiket berhasil dibeli: " + tiketBerhasil);

            // Update Stok Tiket
            if (pilihan == 1) {
                stokVIP = stokVIP - tiketBerhasil;
            } else if (pilihan == 2) {
                stokFestival = stokFestival - tiketBerhasil;
            } else if (pilihan == 3) {
                stokTribune = stokTribune - tiketBerhasil;
            }
        }

        input.close();
    }
}