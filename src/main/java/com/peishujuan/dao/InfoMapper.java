package com.peishujuan.dao;

import java.util.List;

import com.peishujuan.domain.Info;
import com.peishujuan.domain.Vo;

public interface InfoMapper {

	int insert(List<Info> list);

	List<Info> getInfoList();

}
