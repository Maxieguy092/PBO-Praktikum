package org.bangundatar;

import java.lang.Math;

public class Lingkaran extends BangunDatar implements IResize {
	private double radius;

	public Lingkaran() {
		this.radius = 0;
		super.warna = "White";
		super.border = "White";
	}

	public Lingkaran(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getLuas() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getKeliling() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void zoomIn() {
		radius *= 1.1;
	}

	@Override
	public void zoomOut() {
		radius *= 0.9;
	}

	@Override
	public void zoomPercent(int percent) {
		radius *= (double) (percent / 100);
	}
}
