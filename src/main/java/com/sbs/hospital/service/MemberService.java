package com.sbs.hospital.service;

import java.util.Map;

import com.sbs.hospital.dto.Member;

public interface MemberService {
	public Member getOne(long id);

	public Map<String, Object> login(Map<String, Object> param);

	public void add(Map<String, Object> param);

	public Map<String, Object> doubleCheck(Map<String, Object> param);

	public Map<String, Object> updateAuthStatus(Map<String, Object> param);

	public Map<String, Object> updateDelStatus(Map<String, Object> param);

	public Map<String, Object> update(Map<String, Object> param);

	public Map<String, Object> updatepassword(Map<String, Object> param);
}
