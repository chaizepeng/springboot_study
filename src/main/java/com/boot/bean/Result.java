package com.boot.bean;

import java.io.Serializable;

public class Result implements Serializable{

	private String msg;
	private Object object; 
	
	
	public static Result ok(Object object) {
		Result result = new Result();
		result.object = object;
		result.msg = "操作成功";
		return result;
	}
	
	public static Result error() {
		Result result = new Result();
		result.msg = "操作失败";
		return result;
	}
	
	public String getMsg() {
		return msg;
	}
}
