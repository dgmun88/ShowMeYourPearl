package com.pearl.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pearl.domain.MemberVO;

@Mapper
public interface MemberMapper {
	List<MemberVO> list();
	String get(MemberVO vo);
	int insert(MemberVO vo);
	int update(MemberVO vo);
	int updateLevel(MemberVO vo);
	int delete(int memNum);
}