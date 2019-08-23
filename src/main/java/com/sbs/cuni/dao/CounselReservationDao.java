package com.sbs.cuni.dao;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.cuni.dto.CounselReservation;

@Mapper
public interface CounselReservationDao {
	public CounselReservation getOneReservation(long loginedMemberId);
}			
