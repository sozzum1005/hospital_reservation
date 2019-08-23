package com.sbs.cuni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.cuni.dao.CounselReservationDao;
import com.sbs.cuni.dto.CounselReservation;

@Service
public class CounselReservationServiceImpl implements CounselReservationService {
	@Autowired
	CounselReservationDao crd;
	
	public CounselReservation getOneReservation(long loginedMemberId) {
		return crd.getOneReservation(loginedMemberId);
	}
}
