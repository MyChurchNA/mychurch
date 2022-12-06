package com.mychurch.service.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the moment_info database table.
 * 
 */
@Entity
@Table(name="moment_info")
@NamedQuery(name="MomentInfo.findAll", query="SELECT m FROM MomentInfo m")
public class MomentInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MomentInfoPK id;

	private String city;

	private String content;

	@Column(name="country_code")
	private String countryCode;

	private String data;

	private BigDecimal lat;

	private BigDecimal lng;

	@Column(name="media_content")
	private String mediaContent;

	private String memo;

	@Column(name="province_code")
	private String provinceCode;

	private int status;

	private int type;

	private String updateopr;

	private Timestamp updatetime;

	@Column(name="user_id")
	private String userId;

	public MomentInfo() {
	}

	public MomentInfoPK getId() {
		return this.id;
	}

	public void setId(MomentInfoPK id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return this.lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public String getMediaContent() {
		return this.mediaContent;
	}

	public void setMediaContent(String mediaContent) {
		this.mediaContent = mediaContent;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUpdateopr() {
		return this.updateopr;
	}

	public void setUpdateopr(String updateopr) {
		this.updateopr = updateopr;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}