public class USER {
    private String nama;
    private String nim;

    public USER(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return nama.equalsIgnoreCase(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("=== Informasi User ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}