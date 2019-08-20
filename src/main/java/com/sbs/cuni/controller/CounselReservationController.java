package com.sbs.cuni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounselReservationController {
	@RequestMapping("/reservation/counselReservation")
	public String Reservation() {
		return "reservation/counselReservation";
	}
}
