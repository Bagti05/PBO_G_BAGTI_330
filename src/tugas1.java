import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        int pilihan;
        String username;
        String password;
        String nama;
        String nim;
        Scanner objInput = new Scanner(System.in);

        do {
            System.out.println("pilih login: ");
            System.out.println("1. admin");
            System.out.println("2. mahasiswa");
            System.out.println("masukan pilihan: ");

            if(objInput.hasNext()){
                pilihan = objInput.nextInt();
                objInput.nextLine();

                if (pilihan == 1) {
                    System.out.println("masukkan username");
                    username = objInput.nextLine();
                    System.out.println("masukkan psssword");
                    password = objInput.nextLine();

                    if (((username.equals("Admin306")) || (username.equals("admin306"))) && password.equals("password306")) {
                        System.out.println("login berhasi");
                    } else {
                        System.out.println("username atau password salah, silahkan masukkan ulang");
                    }
                }else if (pilihan == 2){
                    System.out.println("masukkan nama:");
                    nama = objInput.nextLine();
                    System.out.println("masukkan nim: ");
                    nim = objInput.nextLine();

                    if (nama.equals("Bagti") && nim.equals("202410370110330")){
                        System.out.println("login mahasiswa berhasil!");
                        nama = objInput.nextLine();
                        nim = objInput.nextLine();
                    }else{
                        System.out.println("login gagal! atau nim salah");
                    }
                }else {
                    System.out.println("pilihan tidak valid");
                }

            }else {
                System.out.println("input tidak valid masukkan angka");
            }

        }while (true);

}

}