public class Nilai {
    int NIM;
    String nama;
    int nilaiA,nilaiT,nilaiUT,nilaiUA;
    double nilaiAkhir;

    void nilai(){
        nilaiAkhir = (nilaiA * 0.1) + (nilaiT * 0.2) + (nilaiUT * 0.3) + (nilaiUA * 0.4);
    }

    void cetakNilai(){
        System.out.println("NAMA              : "+ this.nama);
        System.out.println("NIM               : "+ this.NIM);
        System.out.println("NILAI ABSEN (10%) : "+ this.nilaiA);
        System.out.println("NILAI TUGAS (20%) : "+ this.nilaiT);
        System.out.println("NILAI UTS (30%)   : "+ this.nilaiUT);
        System.out.println("NILAI UAS (40%)   : "+ this.nilaiUA);
        System.out.println("NILAI Akhir       : "+ this.nilaiAkhir);
    }
}
