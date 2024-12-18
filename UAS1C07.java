import java.util.Scanner;

public class UAS1C07 {
    static int jumlahTim07 = (39 % 3) + 4 ;
    static int[][] skorTim07 = new int[jumlahTim07][2];
    static String[] tim07 = new String[jumlahTim07];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ulangi07 =  true;

        while ( ulangi ) {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.println("Pilih menu (1-4): ");
            int pilihMenu07 = sc.nextInt();
            System.out.println();

            if (pilihMenu07 < 1 || pilihMenu07 > 4) {
                System.out.println("Input salah, Pilih menu (1-4): ");
                continue;
            }
            switch (pilihMenu07) {
                case 1:
                    inputData07();
                    break;
                case 2:
                    tampilkanTabel();
                    break;
                case 3:
                    tentukanJuara07();
                    break;
                case 4:
                    System.out.println("Apakah Anda yakin ingin keluar? (y/n): ");
                    sc.nextLine();
            }
        }
    }
    public static void inputData07() {
        String[][] namaTim07 = new String[4][8];

        for (int i = 0; i < jumlahTim07; i++) {
            System.out.print("Masukkan nama  ke-" + (i + 1) + ": ");
            tim07[i] = sc.nextLine();
        }

        do {
            System.out.print("Masukkan skor " + tim07[i] + " untuk level 1: " );
            int level107 =  new Scanner(Syetem.in);

            if (level107 < 0) {
                Sytem.out.println("Skor harus bilangan positif");
            } else if (level107 < 35) {
                level107 = 0;
            }
        } while (level107 > 0);

        do {
            System.out.println("Masukkan skor " + tim07[i] + " untuk level 2: ");
            int level207 = new Scanner(System.in);
        } while (level207 > 0);
    }
}