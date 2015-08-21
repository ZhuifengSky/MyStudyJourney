package com.main.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * <p>Title:   PropertyUtil.java</p>
 * <p>Description:  ��ȡ��Դ�ļ������� </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015��8��21������2:47:15
 * @version  1.0
 */
public class PropertyUtil {
	
	/**
	 * ������Դ�ļ��е��������ƻ�ȡ��valueֵ
	 * @param propertyName
	 * @return
	 */
	public static String getPropertyValue(String propertyName){
		 Properties prop =  new  Properties();
		 String propertyValue = null;
	     InputStream stream =PropertyUtil.class.getClass().getResourceAsStream("config.properties");;       
	     try {
			prop.load(stream);
			propertyValue = prop.getProperty(propertyName).trim();		    
		} catch (IOException e) {
			e.printStackTrace();
		} 
	     return propertyValue;		
	}

	
}
