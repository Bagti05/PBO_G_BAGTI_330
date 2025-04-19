import java.util.Scanner;

public class LOGINSYSTEM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Perbaikan: hapus kata 'class'

        Admin admin = new Admin("admin", "0505", "admin", "1234");
        MAHASISWA mahasiswa = new MAHASISWA("BAGTI PUTRA", "202410370110330");

        System.out.println("=== Sistem Login ===");

        while (true) {
            System.out.print("\nLogin sebagai (Admin/Mahasiswa), atau ketik 'q' untuk keluar: ");
            String pilihan = scanner.nextLine();

            if (pilihan.equalsIgnoreCase("q")) {
                System.out.println("Keluar dari program. Bye!");
                break;
            }

            if (pilihan.equalsIgnoreCase("Admin")) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (admin.login(username, password)) {
                    System.out.println("Login Admin berhasil!");
                    admin.displayInfo();
                } else {
                    System.out.println("Username atau password salah!");
                }

            } else if (pilihan.equalsIgnoreCase("Mahasiswa")) {
                System.out.print("Masukkan nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    System.out.println("Login Mahasiswa berhasil!");
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Nama atau NIM salah!");
                }

            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}