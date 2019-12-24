package com.peishujuan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peishujuan.common.utils.DistanceUtil;
import com.peishujuan.dao.InfoMapper;
import com.peishujuan.domain.Info;
import com.peishujuan.domain.Vo;
import com.peishujuan.service.InfoService;


@Service
public class InfoServiceImpl implements InfoService{

	@Autowired
	private InfoMapper mapper;

	public int insert(List<Info> list) {
	
		return mapper.insert(list);
	}

	@Override
	public List<Info> getInfoList(Vo vo) {
		List<Info> info2 = new ArrayList<Info>();
		//1.先查询出所有数据
		List<Info> list = mapper.getInfoList();
		if (null != vo && null != vo.getJd() && null != vo.getWd()) {
			for (Info info : list) {
				Double j2 = info.getJd();
				Double w2 = info.getWd();
				double d = DistanceUtil.getDistance(vo.getJd(), vo.getWd(), j2, w2);
//			System.out.println(info.getCardno()+":"+d);
				if(d>=vo.getStart() && d<=vo.getEnd()) {
					info.setDistance(d);//封装距离
					info2.add(info);
					
				}
			}
			
			return info2;
		}
		return list;//返回所有的数据
	}
	
	
}
