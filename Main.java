import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int nopil=0;//default nopil = 0
		int pilih;

		System.out.println (" System running...");
		Scanner scan = new Scanner (System.in);

		Industri ti = new Industri();
		Informatika tif = new Informatika();
		Design dkv = new Design();

		while ((nopil < 1) || (nopil >3))
		{

		System.out.println ("==================================================");
		System.out.println ("");
		System.out.println ("HALAMAN UTAMA");
		System.out.println ("Selamat Datang di System Akademik");
		System.out.println ("Sekolah Tinggi Teknologi Bandung");
		System.out.println ("==================================================");
		System.out.println ("");
		System.out.println ("Selamat datang di System Akademik STT Bandung 2018/2019");
		System.out.println ("");
		
		System.out.println ("Masukan Nomor access anda : ");
		System.out.println ("1. Pendaftaran Mahasiswa Baru");
		System.out.println ("2. Perwalian Mahasiswa Lanjutan");
		System.out.println ("3. Keluar dari sistem");
		System.out.println ("");
		System.out.println ("Masukan nomor pilihan anda : 1/2/3");
		System.out.print ("Nomor Pilihan : ");
		nopil = scan.nextInt();
		System.out.println ("");
		System.out.println ("");

		if (nopil==1)
		{
 		//pendaftaran mahasiswa baru
 		System.out.println ("Selamat datang di Pendaftaran Mahasiswa Baru STT Bandung 2018/2019");
		System.out.println ("==================================================================");
		System.out.println ("");
 		System.out.println ("Pilih Jurusan Mahasiswa Baru: ");
 		System.out.println ("1. Jurusan Mahasiswa TI (Teknik Industri)");
 		System.out.println ("2. Jurusan Mahasiswa TIF (Teknik Informatika)");
 		System.out.println ("3. Jurusan Mahasiswa DKV (Design Komunikasi Visual)");
 		System.out.println ("4. Kembali ke Menu Utama");
 		System.out.print ("Pilih Kelas Jurusan: ");
 		nopil = scan.nextInt();
 		System.out.println ("");
 			if (nopil==1){
 			//ti.pendaftaran();
 			pilih = 0;
 			System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa TI (Teknik Industri)");
	 		ti.pendaftaranti();
	 		
 			}
 			else if (nopil==2){
 			//tik.pendaftaran();
 			pilih = 0;
 			System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa TIF (Teknik Informatika)");
	 		tif.pendaftarantif();
 			}
 			else if (nopil==3){
 			//dkv.pendaftaran();
 			pilih = 0;
 			System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa DKV (Design Komunikasi Visual)");
	 		dkv.pendaftarandkv();
 			}
 			else if (nopil==4){
 			System.out.println ("Terima kasih, System kembali ke Halaman utama,");
 			}
 			else{
	 			System.out.println ("Permintaan tidak ada !");
				System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
				System.out.println ("System Out...");
				System.out.println ("");
	 		}
	 		System.out.println ("Terima kasih, System kembali keHalaman utama,");
	  		System.out.println ("");
	  		nopil=0;//sistem back to menu home
 		}//end if nopil 1 = pendaftaran mhs baru
 		else if (nopil==2)
		{
 		//pendaftaran mahasiswa baru
 		System.out.println ("Selamat datang di Perwalian Mahasiswa Lannjutan STT Bandung 2018/2019");
		System.out.println ("==================================================================");
		System.out.println ("");
 		System.out.println ("Pilih Jurusan Mahasiswa Baru: ");
 		System.out.println ("1. Jurusan Mahasiswa TI (Teknik Industri)");
 		System.out.println ("2. Jurusan Mahasiswa TIF (Teknik Informatika)");
 		System.out.println ("3. Jurusan Mahasiswa DKV (Design Komunikasi Visual)");
 		System.out.println ("4. Kembali ke Menu Utama");
 		System.out.print ("Pilih Kelas Jurusan: ");
 		nopil = scan.nextInt();
 		System.out.println ("");
 			if (nopil==1){
 			//ti.pendaftaran();
 			System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa TI (Teknik Industri)");
	 		ti.pendaftaranti();
 			}
 			else if (nopil==2){
 			//tif.pendaftaran();
 			System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa TIF (Teknik Informatika)");
	 		tif.pendaftarantif();
 			}
 			else if (nopil==3){
 			//dkv.pendaftaran();
 			System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa DKV (Design Komunikasi Visual)");
	 		dkv.pendaftarandkv();
 			}
 			else if (nopil==4){
 			System.out.println ("Terima kasih, System kembali ke Halaman utama,");
 			}
 			else{
	 			System.out.println ("Permintaan tidak ada !");
				System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
				System.out.println ("System Out...");
				System.out.println ("");
	 		}
 		}//end nopil 2 = perwalian

 		else if (nopil==3){
 		System.exit(0);
 		}//end nopil 3 = keluar dari sistem

 		else {
 		System.out.println ("Permintaan tidak ada !");
		System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
		System.out.println ("System Out...");
		System.out.println ("");
 		}//end tidak ada nopil, tidak tersedia

 		}//end while all

	}//end public static
}//end class