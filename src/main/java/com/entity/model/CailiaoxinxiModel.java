package com.entity.model;

import com.entity.CailiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 材料信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
public class CailiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料类型
	 */
	
	private String cailiaoleixing;
		
	/**
	 * 材料规格
	 */
	
	private String cailiaoguige;
		
	/**
	 * 材料品牌
	 */
	
	private String cailiaopinpai;
		
	/**
	 * 材料数量
	 */
	
	private Integer cailiaoshuliang;
		
	/**
	 * 材料说明
	 */
	
	private String cailiaoshuoming;
				
	
	/**
	 * 设置：材料类型
	 */
	 
	public void setCailiaoleixing(String cailiaoleixing) {
		this.cailiaoleixing = cailiaoleixing;
	}
	
	/**
	 * 获取：材料类型
	 */
	public String getCailiaoleixing() {
		return cailiaoleixing;
	}
				
	
	/**
	 * 设置：材料规格
	 */
	 
	public void setCailiaoguige(String cailiaoguige) {
		this.cailiaoguige = cailiaoguige;
	}
	
	/**
	 * 获取：材料规格
	 */
	public String getCailiaoguige() {
		return cailiaoguige;
	}
				
	
	/**
	 * 设置：材料品牌
	 */
	 
	public void setCailiaopinpai(String cailiaopinpai) {
		this.cailiaopinpai = cailiaopinpai;
	}
	
	/**
	 * 获取：材料品牌
	 */
	public String getCailiaopinpai() {
		return cailiaopinpai;
	}
				
	
	/**
	 * 设置：材料数量
	 */
	 
	public void setCailiaoshuliang(Integer cailiaoshuliang) {
		this.cailiaoshuliang = cailiaoshuliang;
	}
	
	/**
	 * 获取：材料数量
	 */
	public Integer getCailiaoshuliang() {
		return cailiaoshuliang;
	}
				
	
	/**
	 * 设置：材料说明
	 */
	 
	public void setCailiaoshuoming(String cailiaoshuoming) {
		this.cailiaoshuoming = cailiaoshuoming;
	}
	
	/**
	 * 获取：材料说明
	 */
	public String getCailiaoshuoming() {
		return cailiaoshuoming;
	}
			
}
