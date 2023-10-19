import java.util.Scanner;

public class PajakUtsDaspro {

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("=    UTS Semester-1 Dasar Pemrograman    =");
        System.out.println("==========================================");
        System.out.println("Nama: Key Firdausi Alfarel");
        System.out.println("Nim: 2341720186");
        System.out.println("Kelas: 1F");
        System.out.println("Presensi: 15");
        System.out.println("Prodi: D-IV Teknik Informatika");
        System.out.println("==========================================");
        System.out.println("=     Materi Nim Genap Tentang Pajak     =");
        System.out.println("==========================================\n");

        System.out.println("\n==========================================");
        System.out.println("=               System In               =");
        System.out.println("==========================================\n");

        System.out.print("Apakah Anda memiliki usaha? (y/t): ");
        String usaha = sc15.nextLine();

        double penghasilan = 0;
        if (usaha.equalsIgnoreCase("y")) {
            System.out.print("Masukkan penghasilan anda dalam 1 tahun: Rp ");
            penghasilan = sc15.nextDouble();
            sc15.nextLine();
        }

        double pajakPenghasilan = 0.15 * penghasilan;

        System.out.print("Masukkan jumlah jenis harta kekayaan yang Anda miliki: ");
        int jumlahHarta = sc15.nextInt();
        sc15.nextLine();

        int totalHarta = 0;
        double nilaiJual;
        for (int i = 0; i < jumlahHarta; i++) {
            System.out.print("\nMasukkan nama harta " + (i + 1) + ": ");
            String namaHarta = sc15.next();

            System.out.print("Masukkan nilai jual " + namaHarta + ": Rp ");
            nilaiJual = sc15.nextDouble();
            totalHarta += nilaiJual;
        }
        System.out.println(
                "Total harta yang anda miliki adalah " + jumlahHarta + " dengan total nilai jual Rp " + totalHarta);

        System.out.print("\nApakah Anda sudah memiliki keluarga? (y/t): ");
        String keluarga = sc15.next();

        double potonganPajak = 0;
        if (keluarga.equalsIgnoreCase("y")) {
            System.out.print("Jumlah anak yang berstatus mahasiswa (Kuliah): ");
            int kuliah = sc15.nextInt();

            System.out.print("Jumlah anak yang berstatus pelajar (SMA): ");
            int sma = sc15.nextInt();

            if (kuliah == 1 && sma == 1 && totalHarta >= 50000000) {
                potonganPajak = 0.10;
            } else if (kuliah == 0 && sma == 0 && totalHarta < 50000000) {
                potonganPajak = 0.05;
            }
        }

        double totalPajak = (pajakPenghasilan + totalHarta) * (1 - potonganPajak);
        double hartaKeseluruhan = (penghasilan + totalHarta);
        double hartaSetelahPajak = (hartaKeseluruhan - totalPajak);

        System.out.printf("\nJumlah harta anda sebelum terkena pajak adalah: Rp %.0f\n", hartaKeseluruhan);
        System.out.printf("Total pajak yang harus anda bayar sebesar Rp %.0f\n", totalPajak);
        System.out.printf("Jumlah harta anda setelah terkena pajak adalah: Rp %.0f\n", hartaSetelahPajak);

        System.out.println("==========================================");
        System.out.println("=               System Out               =");
        System.out.println("==========================================");

    }

}