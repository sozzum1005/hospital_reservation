package com.sbs.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.hospital.dao.CounselReservationDao;
import com.sbs.hospital.dto.CounselReservation;

@Service
public class CounselReservationServiceImpl implements CounselReservationService {
	@Autowired
	CounselReservationDao crd;
	
	public CounselReservation getOneReservation(long loginedMemberId) {
		return crd.getOneReservation(loginedMemberId);
	}
	@Override
	public List<String> getDeptList() {
		return crd.getDeptList();
	}
	@Override
	public List<String> getstaffList() {
		
		return crd.getstaffList();
	}
}
