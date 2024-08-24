package com.entity.vo;

import com.entity.ChukuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 出库信息
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
public class ChukuxinxiVO  implements Serializable {
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
	 * 出库数量
	 */
	
	private Integer cailiaoshuliang;
		
	/**
	 * 出库日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukuriqi;
		
	/**
	 * 出库备注
	 */
	
	private String chukubeizhu;
				
	
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
	 * 设置：出库数量
	 */
	 
	public void setCailiaoshuliang(Integer cailiaoshuliang) {
		this.cailiaoshuliang = cailiaoshuliang;
	}
	
	/**
	 * 获取：出库数量
	 */
	public Integer getCailiaoshuliang() {
		return cailiaoshuliang;
	}
				
	
	/**
	 * 设置：出库日期
	 */
	 
	public void setChukuriqi(Date chukuriqi) {
		this.chukuriqi = chukuriqi;
	}
	
	/**
	 * 获取：出库日期
	 */
	public Date getChukuriqi() {
		return chukuriqi;
	}
				
	
	/**
	 * 设置：出库备注
	 */
	 
	public void setChukubeizhu(String chukubeizhu) {
		this.chukubeizhu = chukubeizhu;
	}
	
	/**
	 * 获取：出库备注
	 */
	public String getChukubeizhu() {
		return chukubeizhu;
	}
			
}
