public class MAHASISWA extends USER {
    public MAHASISWA(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return super.getNama().equalsIgnoreCase(inputNama) && super.getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama: " + super.getNama());
        System.out.println("NIM: " + super.getNim());
    }
}