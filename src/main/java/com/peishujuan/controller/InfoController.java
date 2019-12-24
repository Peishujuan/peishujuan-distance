package com.peishujuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peishujuan.domain.Info;
import com.peishujuan.domain.Vo;
import com.peishujuan.service.InfoService;

@Controller
public class InfoController {

	@Autowired
	private InfoService service;
	
	@RequestMapping("list")
	public String list(Model m, Vo vo) {
		List<Info> info = service.getInfoList(vo);
		m.addAttribute("info", info);
		m.addAttribute("vo", vo);
		
		return "list";
 	}
}
