package org.ruang;

public class Departemen {
	private String namaDept;
	private String ketuaDept;
	private double tarifRuang;

	public Departemen(){
		this.namaDept = "TEMPNAME";
		this.ketuaDept = "TEMPNAME";
		this.tarifRuang = 0.0;
	}

	public Departemen(String namaDept, String ketuaDept, double tarifRuang){
		this.namaDept = namaDept;
		this.ketuaDept = ketuaDept;
		this.tarifRuang = tarifRuang;
	}

	public String getNamaDept() {
		return namaDept;
	}

	public String getKetuaDept() {
		return ketuaDept;
	}

	public double getTarifRuang() {
		return tarifRuang;
	}

	public void setNamaDept(String namaDept) {
		this.namaDept = namaDept;
	}

	public void setKetuaDept(String ketuaDept) {
	  this.ketuaDept = ketuaDept;
	}

	public void setTarifRuang(double tarifRuang) {
		this.tarifRuang = tarifRuang;
	}
} 
