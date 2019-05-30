package com.stackroute.spring.jdbc.model;

public class Movie {

	private int mid;
	private String mname;
	private int releaseyear;
	private double ratings;
	private Actor actor;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"mid=" + mid +
				", mname='" + mname + '\'' +
				", releaseyear=" + releaseyear +
				", ratings=" + ratings +
				", actor=" + actor +
				'}';
	}
}
