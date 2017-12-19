import java.util.Scanner;
class Design {

		//status mahasiswa
		String namamhsdkv;
		String namamhsdkv2;
		String alamatmhsdkv;
		int umurmhsdkv;
		String pendidikanterakhir;
		String jeniskelamin;
		String notelpon;
		int pilih;
		int noreg;
		int nopil;

	void pendaftarandkv (){
		Scanner scan = new Scanner (System.in);

		while (pilih==0)
		{
			System.out.println("Silahkan isi Form Pendaftaran Mahasiswa Design Komunikasi Visual");
			System.out.println("=================================");
			System.out.println();
			System.out.print ("Masukan Nama Lengkap : ");
			//namamhsti = scan.nextLine();
			namamhsdkv = scan.nextLine();
			namamhsdkv2 = scan.nextLine();
			System.out.print ("Jenis Kelamin : ");
			jeniskelamin = scan.nextLine();
			System.out.print ("Masukan Umur : ");
			umurmhsdkv = scan.nextInt();
			System.out.print ("Masukan Status Pendidikan Terakhir : ");
			pendidikanterakhir = scan.nextLine();
			pendidikanterakhir = scan.nextLine();
			System.out.print ("Masukan Alamat : ");
			alamatmhsdkv = scan.nextLine();
			System.out.print ("Nomor Telphone : ");
			notelpon = scan.nextLine();
			System.out.println ("");

			System.out.println ("");
			System.out.println ("Terima kasih telah menginput data.");
			System.out.println ("");
			System.out.println("berikut data yang anda input");
			System.out.println("=================================");
			System.out.println();
			System.out.println("Nama : " + namamhsdkv + namamhsdkv2);
			System.out.println("Jenis Kelamin : " + jeniskelamin);
			System.out.println("Umur : " + umurmhsdkv);
			System.out.println("Status Pendidikan Terakhir : " + pendidikanterakhir);
			System.out.println("Alamat : " + alamatmhsdkv);
			System.out.println("Nomor Telphone : " + notelpon);
			System.out.println ("");

			System.out.println("Anda Yakin Akan menyimpan data? (1/2)");
			System.out.println("1. Yakin");
			System.out.println("2. Ulangi");
			System.out.print("Pilihan : ");
			pilih = scan.nextInt();
			if (pilih==1){
			System.out.println ("");
			System.out.println ("Data Anda tersimpan .");
			System.out.println ("Silahkan melakukan Transaksi Pembayaran");
			System.out.println ("ke Nomor Rekening Akademik yang tersedia : ");
			System.out.println ("Nomor Rekening : 451 900 9026 0040050054");
			System.out.println();
			System.out.println ("Silahkan memasukan Nomor Registrasi Akhir Transaksi dibawah ini ");
			System.out.println("=================================");
			System.out.print("Nomor Registrasi (6 digit) : ");
			noreg = scan.nextInt();
			System.out.println();
			System.out.println();
			System.out.println("Nomor Registrasi Sedang diProses..");
			System.out.println("Terima Kasih telah melakukan Pendaftaran Di STT Bandung");
			System.out.println("=================================");
			System.out.println("Nomor Induk Mahasiswa Anda adalah : 15 111 477");
			System.out.println();
			System.out.println();
			System.out.println ("Info Lebih lanjut dapat dilihat di SttBandung.ac.id");
			System.out.println("=================================");
			System.out.println("=================================");
			System.out.println();
			System.out.println();
			System.out.println ("Menu Pilihan : ");
			System.out.println ("2. kembali ke Halaman Utama");
 			System.out.println ("3. Keluar dari System");
 			System.out.print("Pilihan : ");
			pilih = scan.nextInt();
				if (pilih==2){
					System.out.println ("Terima kasih, System kembali ke Halaman utama,");
					
				}
				else if (pilih==3){
					System.exit(0);
				}
				else{
					System.out.println ("Permintaan tidak ada !");
					System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
					System.out.println ("System Out...");
					System.out.println ("");
				}//end menu pilihan

			}//end nopil 1
			else if (pilih==2){
				System.out.println("=================================");
				System.out.println("=================================");
				System.out.println ("Terima Kasih");
				System.out.println ("Silahkan ulangi data Pendaftaran");
				System.out.println ("");
				pilih = 0;
			}//end nopil 2
			else {
				System.out.println ("Permintaan tidak ada !");
				System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
				System.out.println ("System Out...");
				System.out.println ("");
				System.out.println ("System kembali ke Halaman utama,");
			}//end pendaftaranti
		}//end while all

	}//end void pendaftaran
	void perwaliandkv (){

	}
}