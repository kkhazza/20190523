package kr.gudi.web;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	SqlSession session;
	
	@RequestMapping("/select")
	public String select() {
		logger.info("Welcome home! The client locale is " + 1 + ".");
		List<HashMap<String, Object>> resultList = session.selectList("test.select");
		logger.info("Count : {}", resultList.size());
		return "home";
	}
	
}
