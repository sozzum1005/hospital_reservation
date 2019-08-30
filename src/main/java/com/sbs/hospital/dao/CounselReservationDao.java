package com.sbs.hospital.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.hospital.dto.CounselReservation;

@Mapper
public interface CounselReservationDao {
	public CounselReservation getOneReservation(long loginedMemberId);
	public List<String> getDeptList();
	public List<String> getstaffList();
}			
