package com.sbs.cuni.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.cuni.dto.CounselReservation;
import com.sbs.cuni.dto.Member;
import com.sbs.cuni.service.CounselReservationService;
import com.sbs.cuni.service.MemberService;




@Controller
public class CounselReservationController {
	@Autowired
	MemberService memberService;
	@Autowired
	CounselReservationService crs;
	
	
	@RequestMapping("reservation/reservationSearch")
	public String reservationSerach(@RequestParam(value = "id", defaultValue = "0") long id, Model model, HttpSession session) {
		long loginedMemberId = (long) session.getAttribute("loginedMemberId");
		Member member = memberService.getOne(loginedMemberId);
		CounselReservation counselReservation = crs.getOneReservation(loginedMemberId);
		model.addAttribute("member", member);
		model.addAttribute("cr", counselReservation);
		
		
		return "reservation/reservationSearch";
	}
}
