package com.entity.model;

import com.entity.RukuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 入库信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
public class RukuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料类型
	 */
	
	private String cailiaoleixing;
		
	/**
	 * 材料品牌
	 */
	
	private String cailiaopinpai;
		
	/**
	 * 入库数量
	 */
	
	private Integer cailiaoshuliang;
		
	/**
	 * 入库日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukuriqi;
		
	/**
	 * 入库备注
	 */
	
	private String rukubeizhu;
				
	
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
	 * 设置：入库数量
	 */
	 
	public void setCailiaoshuliang(Integer cailiaoshuliang) {
		this.cailiaoshuliang = cailiaoshuliang;
	}
	
	/**
	 * 获取：入库数量
	 */
	public Integer getCailiaoshuliang() {
		return cailiaoshuliang;
	}
				
	
	/**
	 * 设置：入库日期
	 */
	 
	public void setRukuriqi(Date rukuriqi) {
		this.rukuriqi = rukuriqi;
	}
	
	/**
	 * 获取：入库日期
	 */
	public Date getRukuriqi() {
		return rukuriqi;
	}
				
	
	/**
	 * 设置：入库备注
	 */
	 
	public void setRukubeizhu(String rukubeizhu) {
		this.rukubeizhu = rukubeizhu;
	}
	
	/**
	 * 获取：入库备注
	 */
	public String getRukubeizhu() {
		return rukubeizhu;
	}
			
}
