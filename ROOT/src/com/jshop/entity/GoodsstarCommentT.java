package com.jshop.entity;

// Generated 2012-8-22 20:51:22 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * GoodsstarCommentT generated by hbm2java
 */
public class GoodsstarCommentT implements java.io.Serializable {

	private String starcommentid;
	private String goodsid;
	private int starnum;
	private String userid;
	private Date createtime;

	public GoodsstarCommentT() {
	}

	public GoodsstarCommentT(String starcommentid, String goodsid, int starnum,
			String userid, Date createtime) {
		this.starcommentid = starcommentid;
		this.goodsid = goodsid;
		this.starnum = starnum;
		this.userid = userid;
		this.createtime = createtime;
	}

	public String getStarcommentid() {
		return this.starcommentid;
	}

	public void setStarcommentid(String starcommentid) {
		this.starcommentid = starcommentid;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public int getStarnum() {
		return this.starnum;
	}

	public void setStarnum(int starnum) {
		this.starnum = starnum;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
