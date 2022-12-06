package com.mychurch.service.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mychurch.service.db.model.MomentInfo;
import com.mychurch.service.db.model.MomentInfoPK;

public interface MomentInfoRepository extends JpaRepository<MomentInfo, MomentInfoPK> {

}
