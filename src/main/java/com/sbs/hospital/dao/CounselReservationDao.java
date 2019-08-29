package com.sbs.hospital.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.hospital.dto.CounselReservation;

@Mapper
public interface CounselReservationDao {
	public CounselReservation getOneReservation(long loginedMemberId);
}			
