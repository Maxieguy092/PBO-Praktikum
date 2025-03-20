package org.bangundatar;

public abstract class BangunDatar {
	
	protected String warna;
	protected String border;

	public boolean isEqualLuas(BangunDatar X){
		return this.getLuas() == X.getLuas();
	}

	public String getWarna() {
		return warna;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public abstract double getLuas();
	public abstract double getKeliling();
}
