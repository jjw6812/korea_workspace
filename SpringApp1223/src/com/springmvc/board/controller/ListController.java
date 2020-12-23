package com.springmvc.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.model2.board.model.BoardDAO;

public class ListController implements Controller{
	//DI란 외부에서 객체의 인스턴스를 주입받는 방법 (주입을 받으려면, setter or 생성자를 준비해야함)
	private BoardDAO boardDAO;
	
	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//3�ܰ�: ���� ��ü�� �Ͻ�Ų��
		List boardList = boardDAO.selectAll();
		
		//4�ܰ�: ��� ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList",boardList);
		mav.setViewName("board/list");
		return mav;
	}
	
}
