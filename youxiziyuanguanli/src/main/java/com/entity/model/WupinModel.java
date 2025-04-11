package com.entity.model;

import com.entity.WupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WupinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 物品名称
     */
    private String wupinName;


    /**
     * 物品照片
     */
    private String wupinPhoto;


    /**
     * 所属游戏
     */
    private Integer youxiTypes;


    /**
     * 物品类型
     */
    private Integer wupinTypes;


    /**
     * 数量
     */
    private Integer shuliangNumber;


    /**
     * 物品详情
     */
    private String wupinContent;


    /**
     * 获取方式
     */
    private String huoquText;


    /**
     * 培养方式
     */
    private String peiyangText;


    /**
     * 使用方式
     */
    private String shiyongText;


    /**
     * 物品添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：物品名称
	 */
    public String getWupinName() {
        return wupinName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setWupinName(String wupinName) {
        this.wupinName = wupinName;
    }
    /**
	 * 获取：物品照片
	 */
    public String getWupinPhoto() {
        return wupinPhoto;
    }


    /**
	 * 设置：物品照片
	 */
    public void setWupinPhoto(String wupinPhoto) {
        this.wupinPhoto = wupinPhoto;
    }
    /**
	 * 获取：所属游戏
	 */
    public Integer getYouxiTypes() {
        return youxiTypes;
    }


    /**
	 * 设置：所属游戏
	 */
    public void setYouxiTypes(Integer youxiTypes) {
        this.youxiTypes = youxiTypes;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getWupinTypes() {
        return wupinTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setWupinTypes(Integer wupinTypes) {
        this.wupinTypes = wupinTypes;
    }
    /**
	 * 获取：数量
	 */
    public Integer getShuliangNumber() {
        return shuliangNumber;
    }


    /**
	 * 设置：数量
	 */
    public void setShuliangNumber(Integer shuliangNumber) {
        this.shuliangNumber = shuliangNumber;
    }
    /**
	 * 获取：物品详情
	 */
    public String getWupinContent() {
        return wupinContent;
    }


    /**
	 * 设置：物品详情
	 */
    public void setWupinContent(String wupinContent) {
        this.wupinContent = wupinContent;
    }
    /**
	 * 获取：获取方式
	 */
    public String getHuoquText() {
        return huoquText;
    }


    /**
	 * 设置：获取方式
	 */
    public void setHuoquText(String huoquText) {
        this.huoquText = huoquText;
    }
    /**
	 * 获取：培养方式
	 */
    public String getPeiyangText() {
        return peiyangText;
    }


    /**
	 * 设置：培养方式
	 */
    public void setPeiyangText(String peiyangText) {
        this.peiyangText = peiyangText;
    }
    /**
	 * 获取：使用方式
	 */
    public String getShiyongText() {
        return shiyongText;
    }


    /**
	 * 设置：使用方式
	 */
    public void setShiyongText(String shiyongText) {
        this.shiyongText = shiyongText;
    }
    /**
	 * 获取：物品添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：物品添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：最后更新时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
