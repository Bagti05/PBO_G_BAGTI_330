public class Main {
    public static void main(String[] args) {
        // Membuat objek karakter
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal
        System.out.println("Status awal:");
        brimstone.tampilkanStatus();
        viper.tampilkanStatus();

        // Pertarungan antara Pahlawan dan Musuh
        brimstone.serang(viper);
        viper.serang(brimstone);

    }
}