package com.psl.dao.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.psl.dao.service.MenuServiceDao;
import com.psl.model.Menu;

public class MenuServiceDaoImpl extends HibernateDaoSupport implements MenuServiceDao {

	public Menu getMenu(String name) {
		List<Menu> menuList = getHibernateTemplate().find("from Menu where name =?", name );
		return menuList.get(0);
	}

	public List<Menu> getMenuList() {
		List<Menu> menuList = getHibernateTemplate().find(" From Menu" );
		return menuList;
	}

	public void addMenu(Menu menu) {
		
		getHibernateTemplate().save(menu);
		
	}

	public void deleteMenu(long id) {
		getHibernateTemplate().delete(getHibernateTemplate().get(Menu.class, id));
		
	}

}
