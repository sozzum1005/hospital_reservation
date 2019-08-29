package com.sbs.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.hospital.dto.Dept;
import com.sbs.hospital.service.CounselReservationService;



@Controller
public class CounselReservationController {
	@Autowired
	CounselReservationService cr;
	
	@RequestMapping("/reservation/counselReservation")
	public String Reservation(Model model, Model model2) {
		List<String> d = cr.getDeptList();
		model.addAttribute("deptList", d);
		List<String> s = cr.getstaffList();
		model2.addAttribute("staffList", s);
		return "reservation/counselReservation";
	}
}
