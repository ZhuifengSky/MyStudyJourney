package com.main.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * <p>Title:   PropertyUtil.java</p>
 * <p>Description:  读取资源文件工具类 </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015年8月21日下午2:47:15
 * @version  1.0
 */
public class PropertyUtil {
	
	/**
	 * 根据资源文件中的属性名称获取其value值
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
