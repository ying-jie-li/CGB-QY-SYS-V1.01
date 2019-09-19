package com.cy.pj.sys.dao;

import java.util.List;
import java.util.Map;

public interface SysDeptDao {	
	public List<Map<String,Object>> findObjects();
	public int  getChildCount(Integer id);
	public int deleteObject(Integer id);
}
