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
 * 蛋糕信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
@TableName("dangaoxinxi")
public class DangaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangaoxinxiEntity() {
		
	}
	
	public DangaoxinxiEntity(T t) {
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
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 蛋糕分类
	 */
					
	private String dangaofenlei;
	
	/**
	 * 蛋糕图片
	 */
					
	private String dangaotupian;
	
	/**
	 * 蛋糕颜色
	 */
					
	private String dangaoyanse;
	
	/**
	 * 蛋糕口味
	 */
					
	private String dangaokouwei;
	
	/**
	 * 蛋糕尺寸
	 */
					
	private String dangaochicun;
	
	/**
	 * 单次限购
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 蛋糕库存
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 商品详情
	 */
					
	private String shangpinxiangqing;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 价格
	 */
					
	private Double price;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：蛋糕分类
	 */
	public void setDangaofenlei(String dangaofenlei) {
		this.dangaofenlei = dangaofenlei;
	}
	/**
	 * 获取：蛋糕分类
	 */
	public String getDangaofenlei() {
		return dangaofenlei;
	}
	/**
	 * 设置：蛋糕图片
	 */
	public void setDangaotupian(String dangaotupian) {
		this.dangaotupian = dangaotupian;
	}
	/**
	 * 获取：蛋糕图片
	 */
	public String getDangaotupian() {
		return dangaotupian;
	}
	/**
	 * 设置：蛋糕颜色
	 */
	public void setDangaoyanse(String dangaoyanse) {
		this.dangaoyanse = dangaoyanse;
	}
	/**
	 * 获取：蛋糕颜色
	 */
	public String getDangaoyanse() {
		return dangaoyanse;
	}
	/**
	 * 设置：蛋糕口味
	 */
	public void setDangaokouwei(String dangaokouwei) {
		this.dangaokouwei = dangaokouwei;
	}
	/**
	 * 获取：蛋糕口味
	 */
	public String getDangaokouwei() {
		return dangaokouwei;
	}
	/**
	 * 设置：蛋糕尺寸
	 */
	public void setDangaochicun(String dangaochicun) {
		this.dangaochicun = dangaochicun;
	}
	/**
	 * 获取：蛋糕尺寸
	 */
	public String getDangaochicun() {
		return dangaochicun;
	}
	/**
	 * 设置：单次限购
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单次限购
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：蛋糕库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：蛋糕库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：商品详情
	 */
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
