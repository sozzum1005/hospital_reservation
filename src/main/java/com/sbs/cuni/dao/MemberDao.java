package com.sbs.cuni.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.cuni.dto.Member;


@Mapper
public interface MemberDao {
	
	public Member getOne(long loginedMemberId);

	public Member getMatchedOne(Map<String, Object> param);

}
