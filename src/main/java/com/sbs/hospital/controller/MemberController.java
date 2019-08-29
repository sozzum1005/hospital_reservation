package com.sbs.hospital.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.hospital.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {

	@Autowired
	MemberService memberService;

	@RequestMapping("member/login")
	public String login() {
		return "member/login";
	}

	@RequestMapping("member/doLogin")
	public String doLogin(@RequestParam Map<String, Object> param, Model model, HttpSession session) {
		Map<String, Object> rs = memberService.login(param);

		String resultCode = (String) rs.get("resultCode");
		String msg = (String) rs.get("msg");

		model.addAttribute("alertMsg", msg);

		String redirectUrl = (String) param.get("redirectUrl");

		if (redirectUrl == null || redirectUrl.length() == 0) {
			redirectUrl = "/home/main";
		}

		if (resultCode.startsWith("S-")) {
			model.addAttribute("redirectUrl", redirectUrl);
			session.setAttribute("loginedMemberId", rs.get("loginedMemberId"));
		} else {
			model.addAttribute("historyBack", true);
		}

		return "common/redirect";
	}
	
	@RequestMapping("member/doLogout")
	public String doLogout(HttpSession session, Model model) {
		session.removeAttribute("loginedMemberId");
		model.addAttribute("alertMsg", "로그아웃 되었습니다.");
		model.addAttribute("redirectUrl", "/member/login");
		return "common/redirect";
	}

	@RequestMapping("member/join")
	public String join() {
		return "member/join";
	}

	@RequestMapping("member/doJoin")
	@ResponseBody
	public String showDoJoin(@RequestParam Map<String, Object> param) {
		memberService.add(param);
		return "<script> alert('회원가입 완료!'); location.replace('./login');</script>";
	}
	
}
