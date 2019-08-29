package com.sbs.hospital.service;

import java.util.Map;

import com.sbs.hospital.dto.Member;

public interface MemberService {
	public Member getOne(long id);

	public Map<String, Object> login(Map<String, Object> param);

	public void add(Map<String, Object> param);
}
