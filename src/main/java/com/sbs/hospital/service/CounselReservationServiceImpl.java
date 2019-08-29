package com.sbs.hospital.service;

import java.util.Map;

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
}
