package com.psl.rest;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestAddMenu {

	public static void main(String args[])
	{
		String myMenu="[{\"id\":10,\"name\":\"PaniPuri\",\"category\":\"snacks\",\"photo\":\"puri1\"}]";
		JSONObject jsonObject=null;
		try {
			JSONArray oJsonArray = new JSONArray(myMenu);
			jsonObject = oJsonArray.getJSONObject(0);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		URL url;
		try {
			url = new URL("http://localhost:8080/MenuApp/rest/Menu/addMenu");
	
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        out.write(jsonObject.toString());
        out.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
