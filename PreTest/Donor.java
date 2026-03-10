import java.util.Scanner;

public class Donor {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        System.out.print("Masukkan berat badan Anda (kg): ");
        float beratBadan = input.nextFloat();

        System.out.print("Masukkan kadar hemoglobin Anda (angka desimal misal 10,5 g/dl): ");
        float kadarHemoglobin = input.nextFloat();

        if (usia >= 17) {
            System.out.println("Usia memenuhi syarat.");

            if (beratBadan >= 50) {
                System.out.println("Berat badan memenuhi syarat.");

                if (kadarHemoglobin >= 17.5) {
                    System.out.println("Kadar hemoglobin memenuhi syarat dan Anda diperbolehkan donor darah.");
                } else {
                    System.out.println("Kadar hemoglobin tidak memenuhi syarat, dan Anda tidak diperbolehkan donor darah karena kadar hemoglobin Anda di bawah 17.5 g/dl.");
                }

            } else {
                System.out.println("Berat badan tidak memenuhi syarat. Berat badan minimal 50 kg.");
            }

        } else {
            System.out.println("Usia kurang dari 17 tahun tidak diperbolehkan donor darah minimal 17 tahun.");
        }

        input.close();
    }
}