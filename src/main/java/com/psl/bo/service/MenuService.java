package com.psl.bo.service;

import java.util.List;

import com.psl.model.Menu;

public interface MenuService {
	
	Menu getMenu(String name);
	List<Menu> getMenuList();
	void updateMenu(Menu menu);
	void deleteMenu(Menu menu);

}
