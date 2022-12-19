import java.util.Scanner;
public class Main {

//    public static String[] NamaBaju=new String[100];

    public  static  void Logout2(String[]args){
        System.out.println("Selamat datang kembali");
    }
    public static void DaftarBarang (String[]args){
        int printall=3;
        Scanner scanner = new Scanner(System.in);
        String[] NamaBaju = {"Kaos Polos", "Kaos Distro", "Kaos kamikaze", "Kaos Supreme"};
        String[] JenisBaju = {"Kaos oblong", "Kaos oblong", "Kaos oblong", "Kaos oblong"};
        String[] WarnaBaju = {"Merah", "Hitam", "IJO", "ungu"};
        String[] UkuranBaju = {"L", "XL", "XXL", "XXXL"};
        String[] LenganBaju = {"PANJANG", "PANJANG", "PANJANG", "PANJANG"};
        System.out.println("=======================");
        System.out.println("==== DAFTAR BARANG ====");
        System.out.println("=======================");
        for (int i = 0; i < printall; i++) {
            // System.out.println((i+1) + ". " + namaBarang[i] + " (" + jenisLengan[i] + ", " + warnaBarang[i] + ", " + ukuranBarang[i] + ")");
            // System.out.println("i tambah 1"+(i+1));
            // System.out.println((i+1) + ". " + namaBarang[i] + " (" + jenisBarang[i] + ", " + warnaBarang[i] + ", " + ukuranBarang[i] + ")");
            System.out.println((i+1)+"."+"Nama Barang: "+NamaBaju[i]);
            System.out.println("  "+"Jenis Kain : "+JenisBaju[i]);
            System.out.println("  "+"Warna : "+WarnaBaju[i]);
            System.out.println("  "+"Ukuran : "+UkuranBaju[i]);
            System.out.println("  "+"Lengan Panjang/Pendek : "+LenganBaju[i]);
            System.out.println("================================");

        }
        System.out.println("Mau kemana ? ");
        System.out.println("1. Kembali Dasboard");
        System.out.println("2. Kembali Kelola Pesanan");
        System.out.print("Pilihan: ");
        int kemana = scanner.nextInt();
        switch(kemana){
            case 1 :
                DasboardAdmin(null);
            case 2 :
                KelolaPesanan(args);
        }


    }

    public static void KelolaPesanan (String[]args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("KELOLA PESANAN");
        System.out.println("==============");
        System.out.println("");
        System.out.println("Mau kemana ? ");
        System.out.println("1. Lihat daftar barang");
        System.out.println("Mau kemana ? ");
        int kemana = scanner.nextInt();

        switch(kemana){

            case 1 :
                DaftarBarang(args);;
        }


    }

    public static void DasboardAdmin (Integer[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("==== HALAMAN DASBOARD ADMIN ====");
        System.out.println("================================");
        System.out.println("mau kemana : ");
        System.out.println("1. Tambah Barang ");
        System.out.println("2. Kelola Pesanan");
        System.out.print("Pilihan : ");
        int kemana = scanner.nextInt();

        switch(kemana){

            case 1:
                TambahBarang(null);

            case 2:
                KelolaPesanan(null);


        }

    }


    public static void TambahBarang(String[] args){
        String[] namaBarang = new String[100];
        String[] jenisKain = new String[100];
        String[] warnaBarang = new String[100];
        String[] ukuranBarang = new String[100];
        String[] jenisLengan = new String[100];

        Scanner input = new Scanner(System.in);

        int indeks = 0;

        while (true) {

            System.out.println("===================");
            System.out.println("   TAMBAH BARANG   ");
            System.out.println("===================");

            System.out.print("Masukkan nama barang: ");
            namaBarang[indeks] = input.nextLine();

            System.out.print("Masukkan jenis barang: ");
            jenisKain[indeks] = input.nextLine();

            System.out.print("Masukkan warna barang: ");
            warnaBarang[indeks] = input.nextLine();

            System.out.print("Masukkan ukuran barang: ");
            ukuranBarang[indeks] = input.nextLine();
            System.out.print("Masukkan Jenis Lengan: Panjang/Pendek : ");
            jenisLengan[indeks] = input.nextLine();
            System.out.println("===================");
            indeks++;

            System.out.print("Apakah Anda ingin menambah barang lagi (y/n)? ");
            String jawaban = input.nextLine();

            if (!jawaban.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("===== Berhasil Ditambahkan =====");
        for (int i = 0; i < indeks; i++) {
            // System.out.println((i+1) + ". " + namaBarang[i] + " (" + jenisLengan[i] + ", " + warnaBarang[i] + ", " + ukuranBarang[i] + ")");
            // System.out.println("i tambah 1"+(i+1));
            // System.out.println((i+1) + ". " + namaBarang[i] + " (" + jenisBarang[i] + ", " + warnaBarang[i] + ", " + ukuranBarang[i] + ")");
            System.out.println((i+1)+"."+"Nama Barang: "+namaBarang[i]);
            System.out.println("  "+"Jenis Kain : "+jenisKain[i]);
            System.out.println("  "+"Warna : "+warnaBarang[i]);
            System.out.println("  "+"Ukuran : "+warnaBarang[i]);
            System.out.println("  "+"Lengan Panjang/Pendek : "+warnaBarang[i]);
            System.out.println("================================");

        }
        System.out.println("");
        System.out.println("================================");
        System.out.println("================================");
        System.out.println("");
        System.out.println("1. Kembali ke menu admin");
        System.out.println("2. Logout");
        System.out.println("pilihan anda:  ");
        int pilihanAnda = input.nextInt();

        switch (pilihanAnda){
            case 1 :
                DasboardAdmin(null);
            case 2:
                System.exit(0);
        }

//        if(pilihanAnda.equals("1")){
//            DasboardAdmin(null);
//        }
//        else {
//            Logout2(String[]args);
//        }

    }  // ini penutup dari atas

    private static void exit() {
    }


    public static void Login(String[]args){
        // Ini array cuy
        String[][] users = {{"user1", "password1"}, {"user2", "password2"}, {"user3", "password3"}};

        // ini scanner
        Scanner scanner = new Scanner(System.in);

        //
        String username;
        String password;

        // deklarasi variabel untuk kesempatan login...
        int SalahTerus = 0;

        // Perulangan
        while (true) {
            //
            System.out.println("=====================");
            System.out.println("==== LOGIN ADMIN ====");
            System.out.println("=====================");

            System.out.print("Masukkan Username: ");
            username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            password = scanner.nextLine();
            System.out.print("");
            System.out.println("=====================");
            System.out.println("");

            // menyamakan
            boolean found = false;
            for (String[] user : users) {
                if (user[0].equals(username) && user[1].equals(password)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Login berhasil");
                DasboardAdmin(null);
                break;
            }

            else {
                // jika salah
                System.out.println("Username atau password salah");
                SalahTerus++;

                if (SalahTerus >= 3) {
                    System.out.println("Login salah, Tunggu 20 detik");
                    try {
                        Thread.sleep(20000); //
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SalahTerus = 0;

                }
            }
        }
    }


    public static void main(String[] args) {
        Login(args);
    }
}
