package com.psl.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.psl.bo.service.MenuService;
import com.psl.model.Menu;


@Path("/Menu")
public class RestMenuService {

	
	MenuService menuService;
 
	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	@GET
	@Path("/getMenuList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenuList() {
 
	return menuService.getMenuList();
	
	}
 
    @GET
    @Path("/getMenu/{item}")
    @Produces(MediaType.APPLICATION_JSON)
	public Menu getMenu(@PathParam("item") String item) {
 
	return menuService.getMenu(item);
	
	}

    @GET
    @Path("/deleteMenu/{menuId}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteMenu(@PathParam("menuId") long menuId) {
 
	menuService.deleteMenu(menuId);
	
	}

    @POST
    @Path("/addMenu")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public void deleteMenu(Menu menu) {
 
	menuService.addMenu(menu);
	
	}
}