package com.mychurch.service.db.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_info database table.
 * 
 */
@Entity
@Table(name="user_info")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String auth;

	private String city;

	@Column(name="country_code")
	private String countryCode;

	private Timestamp createtime;

	@Column(name="display_name")
	private String displayName;

	@Column(name="fcm_id")
	private String fcmId;

	@Column(name="last_on_time")
	private Timestamp lastOnTime;

	private String memo;

	@Column(name="province_code")
	private String provinceCode;

	@Column(name="seq_id")
	private String seqId;

	private int status;

	private String token;

	private int type;

	private String updateopr;

	private Timestamp updatetime;

	public UserInfo() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFcmId() {
		return this.fcmId;
	}

	public void setFcmId(String fcmId) {
		this.fcmId = fcmId;
	}

	public Timestamp getLastOnTime() {
		return this.lastOnTime;
	}

	public void setLastOnTime(Timestamp lastOnTime) {
		this.lastOnTime = lastOnTime;
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

	public String getSeqId() {
		return this.seqId;
	}

	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
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

}