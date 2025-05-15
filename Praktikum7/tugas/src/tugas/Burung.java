package tugas;

public class Burung extends Anabul {
	
	public Burung (String nama) {
		super.setNama(nama);
	}

	@Override
	public void Gerak() {
		System.out.println("Terbang");
	}

	@Override
	public void Bersuara() {
		System.out.println("Cuit");
	}
}