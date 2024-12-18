import java.util.Scanner;

public class UAS1C07 {
    static int jumlahTim07 = (39 % 3) + 4;
    static int[][] skorTim07 = new int[jumlahTim07][2];
    static String[] tim07 = new String[jumlahTim07];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih07;
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilih07 = sc.nextInt();
            sc.nextLine(); 
            System.out.println();

            switch (pilih07) {
                case 1:
                    inputData07();
                    break;
                case 2:
                    tampilkanTabel07();
                    break;
                case 3:
                    juara07();
                    break;
                case 4:
                    System.out.print("Anda keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih07 != 4);
    } 
    public static void inputData07(){
        for (int i = 0; i < jumlahTim07; i++) {
            System.out.print("Masukkan nama tim ke-" + (i+1) + ": ");
            tim07[i] = sc.nextLine();
            int level107;
            do {
                System.out.print("Masukkan skor " + tim07[i] + " untuk level 1: ");
                level107 = sc.nextInt();
                if (level107 < 0) {
                    System.out.println("Skor harus billangan positif");
                } else if (level107 < 35) {
                    level107 = 0;
                }
            } while (level107 < 0);

            int level207;
            do {
                System.out.print("Masukkan skor " + tim07[i] + " untuk level 2: ");
                level207 = sc.nextInt();
                if (level207 < 0) {
                    System.out.println("Skor harus bilangan positif");
                }
            } while (level207 < 0);

            skorTim07[i][0] = level107;
            skorTim07[i][1] = level207;
            sc.nextLine();
        }
    }
    public static void tampilkanTabel07() {
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        int totalSkor07;

        for (int i = 0; i < jumlahTim07; i++) {
            totalSkor07 = skorTim07[i][0] + skorTim07[i][1];

            if (skorTim07[i][0] > 50 && skorTim07[i][1] > 50) {
                totalSkor07 += 7;
            }

            if (totalSkor07 % 2 == 0) {
                totalSkor07 -= 15;
            }
            System.out.printf("%-20s %-10d %-10d %-10d%n", tim07[i], skorTim07[i][0], skorTim07[i][1], totalSkor07);
        }
    }
    public static void juara07() {
        int skorMaks07 = -1;
        String Juara07 = "";
        boolean seri = false;
        int skorLevel207 = -1;

        for (int i = 0; i < jumlahTim07; i++) {
            int totalSkor07 = skorTim07[i][0] + skorTim07[i][1];

            if (skorTim07[i][0] > 50 && skorTim07[i][1] > 50) {
                totalSkor07 += 7;
            }

            if (totalSkor07 % 2 == 0) {
                totalSkor07 -= 15;
            }

            if (totalSkor07 > skorMaks07) {
                skorMaks07 = totalSkor07;
                Juara07 = tim07[i];
                skorLevel207 = skorTim07[i][1];
                seri = false;
            } else if (totalSkor07 == skorMaks07) {
                if (skorTim07[i][1] > skorLevel207) {
                    Juara07 = tim07[i];
                    skorLevel207 = skorTim07[i][1];
                    seri = false;
                } else if (skorTim07[i][1] == skorLevel207) {
                    seri = true;
                }
            }
        }
        if (seri) {
            System.out.println("Turnamen berakhir seri, Tim terbaik adalah " + Juara07 );
        } else {
            System.out.println("Selamat kepada tim " + Juara07 + " yang telah memenangkan kompetisi");
        }
    }
}
