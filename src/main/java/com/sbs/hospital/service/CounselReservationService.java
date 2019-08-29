package com.sbs.hospital.service;

import java.util.Map;

import com.sbs.hospital.dto.CounselReservation;

public interface CounselReservationService {
	public CounselReservation getOneReservation(long loginedMemberId);
}
