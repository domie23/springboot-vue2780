package com.entity.vo;

import com.entity.WupinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wupin")
public class WupinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 物品名称
     */

    @TableField(value = "wupin_name")
    private String wupinName;


    /**
     * 物品照片
     */

    @TableField(value = "wupin_photo")
    private String wupinPhoto;


    /**
     * 所属游戏
     */

    @TableField(value = "youxi_types")
    private Integer youxiTypes;


    /**
     * 物品类型
     */

    @TableField(value = "wupin_types")
    private Integer wupinTypes;


    /**
     * 数量
     */

    @TableField(value = "shuliang_number")
    private Integer shuliangNumber;


    /**
     * 物品详情
     */

    @TableField(value = "wupin_content")
    private String wupinContent;


    /**
     * 获取方式
     */

    @TableField(value = "huoqu_text")
    private String huoquText;


    /**
     * 培养方式
     */

    @TableField(value = "peiyang_text")
    private String peiyangText;


    /**
     * 使用方式
     */

    @TableField(value = "shiyong_text")
    private String shiyongText;


    /**
     * 物品添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：物品名称
	 */
    public String getWupinName() {
        return wupinName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setWupinName(String wupinName) {
        this.wupinName = wupinName;
    }
    /**
	 * 设置：物品照片
	 */
    public String getWupinPhoto() {
        return wupinPhoto;
    }


    /**
	 * 获取：物品照片
	 */

    public void setWupinPhoto(String wupinPhoto) {
        this.wupinPhoto = wupinPhoto;
    }
    /**
	 * 设置：所属游戏
	 */
    public Integer getYouxiTypes() {
        return youxiTypes;
    }


    /**
	 * 获取：所属游戏
	 */

    public void setYouxiTypes(Integer youxiTypes) {
        this.youxiTypes = youxiTypes;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getWupinTypes() {
        return wupinTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setWupinTypes(Integer wupinTypes) {
        this.wupinTypes = wupinTypes;
    }
    /**
	 * 设置：数量
	 */
    public Integer getShuliangNumber() {
        return shuliangNumber;
    }


    /**
	 * 获取：数量
	 */

    public void setShuliangNumber(Integer shuliangNumber) {
        this.shuliangNumber = shuliangNumber;
    }
    /**
	 * 设置：物品详情
	 */
    public String getWupinContent() {
        return wupinContent;
    }


    /**
	 * 获取：物品详情
	 */

    public void setWupinContent(String wupinContent) {
        this.wupinContent = wupinContent;
    }
    /**
	 * 设置：获取方式
	 */
    public String getHuoquText() {
        return huoquText;
    }


    /**
	 * 获取：获取方式
	 */

    public void setHuoquText(String huoquText) {
        this.huoquText = huoquText;
    }
    /**
	 * 设置：培养方式
	 */
    public String getPeiyangText() {
        return peiyangText;
    }


    /**
	 * 获取：培养方式
	 */

    public void setPeiyangText(String peiyangText) {
        this.peiyangText = peiyangText;
    }
    /**
	 * 设置：使用方式
	 */
    public String getShiyongText() {
        return shiyongText;
    }


    /**
	 * 获取：使用方式
	 */

    public void setShiyongText(String shiyongText) {
        this.shiyongText = shiyongText;
    }
    /**
	 * 设置：物品添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：物品添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：最后更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
