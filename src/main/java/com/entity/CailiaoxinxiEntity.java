package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 材料信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
@TableName("cailiaoxinxi")
public class CailiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CailiaoxinxiEntity() {
		
	}
	
	public CailiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 材料名称
	 */
					
	private String cailiaomingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：材料名称
	 */
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
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
