package com.neusoft.mvcweb.controal;

/*
 * 此模块为测试使用.
 * 用户:lkr
 * 表:usercontroal
*/
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
