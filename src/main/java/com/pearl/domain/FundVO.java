package com.pearl.domain;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Alias("fundVO")
public class FundVO {
	private Long fundNum;
	private Long memNum;
	private String memName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fundStartDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fundEndDate;
	private int fundMoney, rwrdTotal;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fundDday;
	private String fundTitle;
	private String fundIntro;
	private PictureVO pic;
	private RewardVO[] rwvo;
}
