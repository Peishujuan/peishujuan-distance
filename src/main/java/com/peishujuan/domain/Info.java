package com.peishujuan.domain;

public class Info {

	private Integer id;
	private String cardno;
	private String created;
	private Double jd;
	private Double wd;
	private Double distance;
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Info(Integer id, String cardno, String created, Double jd, Double wd, Double distance) {
		super();
		this.id = id;
		this.cardno = cardno;
		this.created = created;
		this.jd = jd;
		this.wd = wd;
		this.distance = distance;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public Double getJd() {
		return jd;
	}
	public void setJd(Double jd) {
		this.jd = jd;
	}
	public Double getWd() {
		return wd;
	}
	public void setWd(Double wd) {
		this.wd = wd;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", cardno=" + cardno + ", created=" + created + ", jd=" + jd + ", wd=" + wd
				+ ", distance=" + distance + "]";
	}
	
	
}
