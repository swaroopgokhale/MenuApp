package com.psl.dao.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.psl.dao.service.MenuServiceDao;
import com.psl.model.Menu;

public class MenuServiceDaoImpl extends HibernateDaoSupport implements MenuServiceDao {

	public Menu getMenu(String name) {
		List<Menu> menuList = getHibernateTemplate().find("from menu where name =?", name );
		return menuList.get(0);
	}

	public List<Menu> getMenuList() {
		List<Menu> menuList = getHibernateTemplate().find("from menu" );
		return menuList;
	}

	public void updateMenu(Menu menu) {
		getHibernateTemplate().update(menu);
		
	}

	public void deleteMenu(Menu menu) {
		getHibernateTemplate().delete(menu);
		
	}

}
