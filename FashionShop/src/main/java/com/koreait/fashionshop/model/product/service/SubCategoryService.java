package com.koreait.fashionshop.model.product.service;

import java.util.List;

import com.koreait.fashionshop.model.domain.TopCategory;

public interface SubCategoryService {
	public List selectAll(); //모든 레코드 가져오기
	public List selectAllById(int topcategory_id);//선택한 상위 카테고리에 소속된 하위카테고리 목록가져오기
	public TopCategory select(int topcategory_id);
	public void insert(TopCategory topcategory);
	public void update(TopCategory topcategory);
	public void delete(int topcategory_id);	
}
