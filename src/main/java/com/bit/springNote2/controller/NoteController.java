package com.bit.springNote2.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

// ibatis 가 mybatis 의 최초 명칭이었으므로 ibatis 들이 남아있음 
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.springNote2.dao.IDao;
import com.bit.springNote2.dto.NoteDto;

@Controller
public class NoteController {
	
	@Autowired // 주입 (injection) 의도된 객체 생성
	private SqlSession sqlSession;
	
	@RequestMapping(value="noteForm")
	public String noteForm() {
		return "noteForm";
	}
	
	@RequestMapping(value="write")
	public String write(HttpServletRequest req) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.writeDao(req.getParameter("writer"), req.getParameter("content"));
		return "redirect:list";
	}
	
	@RequestMapping(value="list")
	public String list(Model model){
		IDao dao = sqlSession.getMapper(IDao.class);
		ArrayList<NoteDto> nList = dao.listDao();
		model.addAttribute("list", (Object)nList);
		
		return "noteList";
	}
	
	@RequestMapping(value="delete")
	public String delete(HttpServletRequest req, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.deleteDao(req.getParameter("id"));
		
		return "redirect:list";   // redirect 로 client 가 다시 DispatcherServlet에게 요청을 새로 보냄
	}
}
