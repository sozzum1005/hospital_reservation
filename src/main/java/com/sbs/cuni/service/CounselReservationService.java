package com.sbs.cuni.service;

import com.sbs.cuni.dto.CounselReservation;

public interface CounselReservationService {
	public CounselReservation getOneReservation(long loginedMemberId);
}
