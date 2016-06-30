package org.ksr;

import java.util.ArrayList;
import java.util.List;

import org.ksr.dao.BaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/admin")
@Controller
public class TestController {
		
		@Autowired
		BaseDAO baseDao;
		
		@RequestMapping("/getdata")
		public String getData(){
			baseDao.getData();
			return "index";
		}
		
		@RequestMapping("/getjson")
		@ResponseBody
		public List<String> getjson(){
			List<String> list=new ArrayList<String>();
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			
			return list;
		}
}
