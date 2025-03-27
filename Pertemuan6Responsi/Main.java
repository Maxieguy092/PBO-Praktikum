package org.ruang;

public class Main {
	public static void main(String[] args) {
		Departemen departemen = new Departemen("Biologi", "Yanto", 5000.0);
		RuangDept ruangdept = new RuangDept(5.0,5.0,5.0,50, 15, 15,20, departemen);
		RuangDosen ruangdosen = new RuangDosen(5.0, 5.0, 5.0, 50, "Yusril", 15, 15, departemen);
		RuangKelas ruangKelas = new RuangKelas(5.0, 5.0, 5.0, 50, 15, 5, 5000.0);
		Lab lab = new Lab(5.0, 5.0, 5.0, 10, "Lab Kimia", "Metalurgi", 5000.0);
		LabKom labKom = new LabKom(5.0,5.0,5.0,10, "Lab GKV", 15, 5000.0);

		ruangdept.printInfo();
		System.out.println("==========================================");
		ruangdosen.printInfo();
		System.out.println("==========================================");
		ruangKelas.printInfo();
		System.out.println("==========================================");
		lab.printInfo();
		System.out.println("==========================================");
		labKom.printInfo();
	}
}
