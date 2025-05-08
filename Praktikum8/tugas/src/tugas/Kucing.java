package tugas;

public class Kucing extends Anabul {
	
	public Kucing (String nama) {
		super.setNama(nama);
	}

	@Override
	public void Gerak() {
		System.out.println("Melata");
	}

	@Override
	public void Bersuara() {
		System.out.println("Mao");
	}
}

