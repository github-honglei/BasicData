package com.hllearn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Controller
// @Controller("demo")
// 负责注册一个bean到spring上下文中，bean的id默认为类的名称开头字母小写

@Service
// @Service("demo")
// 负责注册一个bean到spring上下文中，bean的id默认为类的名称开头字母小写
public class DemoClass1 {

		
	@Autowired
	// 根据bean类型从spring上下文中进行查找 注册类型必须唯一，否则报错。
	// 与@Resource区别在于，@Resource允许通过bean名称和bean类型两种方式进行查找
	// @Autowired(required=false) 如果在上下文中没有找到该类型的bean，会使用new 类名创建bean
	// 
	private AClass aClass;
	
	
	private void method1(Model model) {
		model.addAttribute("obj", "xiao");
	}
}
