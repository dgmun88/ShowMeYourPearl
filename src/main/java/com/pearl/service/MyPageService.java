package com.pearl.service;

import java.util.List;

import com.pearl.domain.BoardVO;
import com.pearl.domain.MyPageVO;


public interface MyPageService {
	List<MyPageVO> donaList(Long memNum);
	List<MyPageVO> myfundList(Long memNum);
	List<BoardVO> mygallery(Long memNum);
}