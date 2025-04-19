import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RekeningBank rekening1 = new RekeningBank();
        rekening1.nomorRekening = "202410370110330";
        rekening1.namaPemilik = "Bagti Putra Pratama";
        rekening1.saldo = 500000.0;

        RekeningBank rekening2 = new RekeningBank();
        rekening2.nomorRekening = "202410370110001";
        rekening2.namaPemilik = "MAMA";
        rekening2.saldo = 1000000.0;

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        System.out.println("Masukkan jumlah setor tunai untuk Bagti Putra Pratama: ");
        double setorBagti = scanner.nextDouble();
        rekening1.setorUang(setorBagti);

        System.out.println("Masukkan jumlah setor tunai untuk MAMA: ");
        double MAMA = scanner.nextDouble();
        rekening1.setorUang(MAMA);

        System.out.println("Masukkan jumlah tarik tunai untunk Bagti Putra Pratama: ");
        double tarikBagti = scanner.nextDouble();
        rekening1.tarikSaldo(tarikBagti);

        System.out.println("Masukkan jumlah tarik tunai untunk MAMA: ");
        double tarikMAMA = scanner.nextDouble();
        rekening1.tarikSaldo(tarikMAMA);

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        scanner.close();
    }
}