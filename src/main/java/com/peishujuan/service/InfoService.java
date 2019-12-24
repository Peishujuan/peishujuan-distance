package com.peishujuan.service;

import java.util.List;

import com.peishujuan.domain.Info;
import com.peishujuan.domain.Vo;

public interface InfoService {

	//批量添加
	int insert(List<Info> list);

	//查询
	List<Info> getInfoList(Vo vo);
}
