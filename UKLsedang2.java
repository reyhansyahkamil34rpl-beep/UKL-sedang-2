import java.util.Scanner;

public class UKLsedang2 {
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- PROGRAM MENGHITUNG VOLUME TABUNG ---");
        System.out.print("Masukkan jari-jari tabung (Cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (Cm): ");
        double t = input.nextDouble();

        double hasil = hitungVolume(r, t);

        System.out.println("\n--- HASIL ---");
        System.out.println("Volume tabung: " + hasil + " Cm³ ");

        input.close();
    }
}