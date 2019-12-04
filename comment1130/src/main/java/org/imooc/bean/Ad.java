package org.imooc.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//实体类与json互转的时候，属性为null的不参与序列化
@JsonInclude(Include.NON_NULL)
public class Ad extends BaseBean{
	
	
	
//	@Override
//	public String toString() {
//		return "Ad [id=" + id + ", title=" + title + ", imgFileName=" + imgFileName + ", link=" + link + ", weight="
//				+ weight +  ", page="+ getPage().toString()  +"]";
//		
//	}
	private Long id;
	private String title;
	private String imgFileName;
	private String link;
	private Long weight;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgFileName() {
		return imgFileName;
	}
	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}	
	
	
}
