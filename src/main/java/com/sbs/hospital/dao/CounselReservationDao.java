package com.sbs.hospital.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.hospital.dto.Dept;

@Mapper
public interface CounselReservationDao {

	public List<String> getDeptList();

}
