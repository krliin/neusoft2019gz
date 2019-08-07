package com.neusoft.mvcweb.controal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/user")
public class UserControal {
	@RequestMapping(value="/update")
	public String update() throws Exception{
		return "更新成功";
	}
}
