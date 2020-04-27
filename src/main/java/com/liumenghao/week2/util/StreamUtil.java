package com.liumenghao.week2.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	//读取InputStream 放入集合
    public static List<String> read(InputStream InputStream) throws IOException{
    	
    	//声明集合
    	List<String> list = new ArrayList<String>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
    	String line="";
		while((line=reader.readLine())!=null) {
			list.add(line);
		}
		return list;
	}
	//根据文件的地址读取文件放入 集合中
	public static List<String> read(String filePath) throws IOException{
		//声明集合
         FileInputStream inputStream = new FileInputStream(filePath);
		return read(inputStream);
		
	}
	
	//读取文件内容放入集合
	
	public static List<String> read(File file) throws IOException{
		FileInputStream inputStream = new FileInputStream(file);
	    return read(inputStream);
		
	}
	public static String readTextFile(InputStream src) {
		byte[]b=new byte[1024];
		int len;
		try {
			while((len=src.read(b))!=-1) {
				return new String(b,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
