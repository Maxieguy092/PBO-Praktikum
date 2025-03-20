package org.bangundatar;

public class Persegi extends BangunDatar implements IResize{
	private double sisi;

	public Persegi () {
		this.sisi = 0;
		super.warna = "White";
		super.border = "White";
	}

	public Persegi (double sisi) {
		this.sisi = sisi;
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	@Override
	public double getLuas() {
		return sisi * sisi;
	}

	@Override
	public double getKeliling() {
		return sisi * 4;
	}

	@Override
	public void zoomIn() {
		sisi *= 1.1;
	}

	@Override
	public void zoomOut() {
		sisi *= 0.9;
	}

	@Override
	public void zoomPercent(int percent) {
		sisi *= (double)(percent / 100);
	}
}
