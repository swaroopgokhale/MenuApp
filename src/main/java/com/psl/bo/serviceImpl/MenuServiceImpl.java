package com.psl.bo.serviceImpl;

import java.util.List;

import com.psl.bo.service.MenuService;
import com.psl.dao.service.MenuServiceDao;
import com.psl.model.Menu;

public class MenuServiceImpl implements MenuService {
	
	MenuServiceDao menuServiceDao;
	

	public MenuServiceDao getMenuServiceDao() {
		return menuServiceDao;
	}

	public void setMenuServiceDao(MenuServiceDao menuServiceDao) {
		this.menuServiceDao = menuServiceDao;
	}

	public Menu getMenu(String name) {

		return menuServiceDao.getMenu(name);
	}

	public List<Menu> getMenuList() {

		return menuServiceDao.getMenuList();
	}

	public void updateMenu(Menu menu) {
		menuServiceDao.updateMenu(menu);
		
	}

	public void deleteMenu(Menu menu) {
		menuServiceDao.deleteMenu(menu);
		
	}

}
