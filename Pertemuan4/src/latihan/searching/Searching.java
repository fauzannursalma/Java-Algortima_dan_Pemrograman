package latihan.searching;

public class Searching {
	int [] himpunan = new int[8];
	
	void isiHImpunan() {
		himpunan[0]= 1;
		himpunan[1]= 3;
		himpunan[2]= 4;
		himpunan[3]= 5;
		himpunan[4]= 7;
		himpunan[5]= 9;
		himpunan[6]= 9;
		himpunan[7]= 9;
	}
	
	void tampilHimpunan() {
		System.out.printf("Elemen Array Himpunan: ");
		for (int i = 0; i < himpunan.length; i++) {
			System.out.print(himpunan[i]);
		}
		System.out.println("");
	}

	// Sequential Search
	public void pencarianSequential(int x){
		String hasil = " ";
		boolean ketemu = false;
		for (int i = 0; i < himpunan.length; i ++){
			if (himpunan[i] == x){
				ketemu = true;
				hasil = hasil + " " + i;
			}
		}
		if (ketemu == true){
			System.out.println("Data ada di Index ke-" + hasil);
		} else {
			System.out.println("Data tidak ditemukan");
		}
	}

	// Binary search
	void pencarianBinary(int x){
		int akhir, tengah;
		boolean ketemu;
		int awal = 0;
		tengah = 0;
		akhir = himpunan.length - 1;
		ketemu= false;

		while (awal <= akhir && ketemu == false){
			tengah = (awal + akhir) / 2;
			if(x == himpunan[tengah]){
				ketemu = true;
			} else {
				if (himpunan[tengah] <= x){
					awal = tengah + 1;
				} else {
					akhir = tengah - 1;
				}
			}
		}
		if (ketemu){
			System.out.println("Data ada di index ke- " + tengah);
		} else {
			System.out.println("Data tidak ditemukan");
		}
	}
}
