package com.psl.dao.service;

import java.util.List;

import com.psl.model.Menu;

public interface MenuServiceDao {
	
	Menu getMenu(String name);
	List<Menu> getMenuList();
	void updateMenu(Menu menu);
	void deleteMenu(Menu menu);

}
