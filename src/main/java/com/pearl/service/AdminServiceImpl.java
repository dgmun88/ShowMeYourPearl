package com.pearl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearl.domain.AdminBoardVO;
import com.pearl.domain.AdminFundVO;
import com.pearl.domain.MemberVO;
import com.pearl.mapper.AdminMapper;
import com.pearl.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService {
	
	@Setter(onMethod_ = @Autowired)
	private AdminMapper mapper;

	@Override
	public List<AdminBoardVO> boardList() {
		return mapper.boardList();
	}

	@Override
	public List<AdminFundVO> fundList() {
		return mapper.fundList();
	}

	@Override
	public int fundDelete(Long[] arrFundNum) {
		return mapper.fundDelete(arrFundNum);
	}

	@Override
	public int memberDelete(Long[] arrMemNum) {
		return mapper.memberDelete(arrMemNum);
	}

	@Override
	public int postDelete(Long[] arrPostNum) {
		return mapper.postDelete(arrPostNum);
	}

}
