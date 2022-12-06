package com.mychurch.service.db.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the moment_info database table.
 * 
 */
@Embeddable
public class MomentInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createtime;

	public MomentInfoPK() {
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.util.Date getCreatetime() {
		return this.createtime;
	}
	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MomentInfoPK)) {
			return false;
		}
		MomentInfoPK castOther = (MomentInfoPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.createtime.equals(castOther.createtime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.createtime.hashCode();
		
		return hash;
	}
}