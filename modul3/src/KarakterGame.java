// Superclass KarakterGame
class KarakterGame {
    protected String nama;
    protected int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.nama);
        target.kesehatan -= 10; // Serangan default mengurangi 10 kesehatan
        System.out.println(target.nama + " sekarang memiliki kesehatan " + target.kesehatan);
    }

    public void tampilkanStatus() {
        System.out.println(nama + " memiliki kesehatan: " + kesehatan);
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.nama + " menggunakan Orbital Strike!");
        target.kesehatan -= 20; // Serangan spesial Pahlawan mengurangi 20 kesehatan
        System.out.println(target.nama + " sekarang memiliki kesehatan " + target.kesehatan);
    }
}

// Subclass Musuh
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.nama + " menggunakan Snake Bite!");
        target.kesehatan -= 15; // Serangan spesial Musuh mengurangi 15 kesehatan
        System.out.println(target.nama + " sekarang memiliki kesehatan " + target.kesehatan);
    }
}