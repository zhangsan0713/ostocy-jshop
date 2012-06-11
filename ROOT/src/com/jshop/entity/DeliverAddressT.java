package com.jshop.entity;

// Generated 2012-6-7 14:23:05 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * DeliverAddressT generated by hbm2java
 */
public class DeliverAddressT implements java.io.Serializable {

	private String addressid;
	private String userid;
	private String username;
	private String province;
	private String city;
	private String district;
	private String street;
	private String postcode;
	private String telno;
	private String mobile;
	private String email;
	private Date createtime;
	private String state;
	private String country;

	public DeliverAddressT() {
	}

	public DeliverAddressT(String addressid, String userid, String username,
			String province, String city, String district, String street,
			String postcode, String mobile, Date createtime, String state) {
		this.addressid = addressid;
		this.userid = userid;
		this.username = username;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postcode = postcode;
		this.mobile = mobile;
		this.createtime = createtime;
		this.state = state;
	}

	public DeliverAddressT(String addressid, String userid, String username,
			String province, String city, String district, String street,
			String postcode, String telno, String mobile, String email,
			Date createtime, String state, String country) {
		this.addressid = addressid;
		this.userid = userid;
		this.username = username;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postcode = postcode;
		this.telno = telno;
		this.mobile = mobile;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.country = country;
	}

	public String getAddressid() {
		return this.addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
