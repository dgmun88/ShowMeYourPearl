package com.pearl.service;

import java.util.List;

import com.pearl.domain.FundVO;
import com.pearl.domain.GalleryVO;

public interface MainService {
	List<GalleryVO> list(GalleryVO vo);
	List<FundVO> fundlist();
	FundVO get(Long fundNum);
	GalleryVO galleryget(Long boardNum);
}
