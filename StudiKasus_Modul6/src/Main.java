import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== DAFTAR MAHASISWA ===");
        System.out.print("Input Nama  :");
        String nama = input.nextLine();
        System.out.print("Input Nim   :");
        String nim = input.nextLine();
        System.out.print("Input Prodi :");
        String prodi = input.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi);
        
        String pilih;
        do{
            System.out.println("\n=== PILIH MATA KULIAH ===");
            System.out.println("1. Pemrograman Berorientasi Objek");
            System.out.println("2. Algoritma dan Pemrograman 2");
            System.out.println("3. Jaringan Komputer");
            System.out.println("4. Selesai");
            System.out.print("Pilih MataKuliah :");
            pilih = input.nextLine();
            
            switch(pilih){
                case "1":
                    MataKuliah pbo = new MataKuliah("Pemrograman Berorientasi Objek", 3);
                    mahasiswa.tambahMataKuliah(pbo);
                    System.out.println("Berhasil di Tambhkan Ke MataKuliah");
                    break;
                case "2":
                    MataKuliah alpro = new MataKuliah("Algorima dan Pemrograman 2", 3);
                    mahasiswa.tambahMataKuliah(alpro);
                    System.out.println("Berhasil di Tambahkan Ke MataKuliah");
                    break;
                case "3":
                    MataKuliah jarkom = new MataKuliah("Jaringan Komputer", 3);
                    mahasiswa.tambahMataKuliah(jarkom);
                    System.out.println("Berhasil di Tambahakan di Matakuliah");
                    break;
                default:
                    System.out.println("Menu Tidak ditemukan");
                    break;
            }
        }while(!pilih.equals("4"));
        
        System.out.println("\n");
        mahasiswa.informasiMahasiswa();
    }
}
