package com.entity.view;

import com.entity.YaopinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 药物信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yaopin")
public class YaopinView extends YaopinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 药物类型的值
		*/
		private String yaopinValue;
		/**
		* 药物剂型的值
		*/
		private String jixingValue;



	public YaopinView() {

	}

	public YaopinView(YaopinEntity yaopinEntity) {
		try {
			BeanUtils.copyProperties(this, yaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 药物类型的值
			*/
			public String getYaopinValue() {
				return yaopinValue;
			}
			/**
			* 设置： 药物类型的值
			*/
			public void setYaopinValue(String yaopinValue) {
				this.yaopinValue = yaopinValue;
			}
			/**
			* 获取： 药物剂型的值
			*/
			public String getJixingValue() {
				return jixingValue;
			}
			/**
			* 设置： 药物剂型的值
			*/
			public void setJixingValue(String jixingValue) {
				this.jixingValue = jixingValue;
			}











}
