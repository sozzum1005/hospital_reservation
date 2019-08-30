package com.sbs.hospital.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.hospital.dto.CounselReservation;
import com.sbs.hospital.dto.Member;
import com.sbs.hospital.service.CounselReservationService;
import com.sbs.hospital.service.MemberService;



@Controller
public class CounselReservationController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private CounselReservationService crs;
	
	@RequestMapping("/reservation/counselReservation")
	public String Reservation(Model model, Model model2) {
		List<String> d = crs.getDeptList();
		model.addAttribute("deptList", d);
		List<String> s = crs.getstaffList();
		model2.addAttribute("staffList", s);
		return "reservation/counselReservation";
	}
	
	
	@RequestMapping("reservation/reservationSearch")
	public String reservationSerach(@RequestParam(value = "id", defaultValue = "0") long id, Model model, HttpServletRequest req) {
		Member loginedMember = (Member)req.getAttribute("loginedMember");
		long loginedMemberId = (long)req.getAttribute("loginedMemberId");
		CounselReservation counselReservation = crs.getOneReservation(loginedMemberId);
		
		model.addAttribute("cr", counselReservation);
		
		return "reservation/reservationSearch";
	}
}
