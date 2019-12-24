package com.peishujuan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.peishujuan.common.utils.StreamUtil;
import com.peishujuan.domain.Info;
import com.peishujuan.domain.Vo;
import com.peishujuan.service.InfoService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class InfoServiceImplTest {

	@Autowired 
	private InfoService service;
	@Test
	public void testInsert() throws Exception {
		List<Info> list = new ArrayList<Info>();
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String string : read) {
			String[] s = string.split(",");
			Info info = new Info();
			info.setCardno(s[0]);
			info.setCreated(s[1]);
			info.setJd(Double.parseDouble(s[2]));
			info.setWd(Double.parseDouble(s[3]));
			list.add(info);
		}
		service.insert(list);
	}
	
	@Test
	public void testgetInfoList() {
		Vo vo = new Vo();
		vo.setJd(116.38);
		vo.setWd(39.90);
		
		vo.setStart(5000.0);
		vo.setEnd(20000.0);
		service.getInfoList(vo);
	}

}
