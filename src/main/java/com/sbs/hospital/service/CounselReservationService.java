package com.sbs.hospital.service;

import java.util.List;

import com.sbs.hospital.dto.CounselReservation;

public interface CounselReservationService {
	public CounselReservation getOneReservation(long loginedMemberId);
	public List<String> getDeptList();
	public List<String> getstaffList();
}
