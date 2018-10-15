package com.mybook.entity;

public class Pager {

	private Integer currentPage;  // 当前页码数
	private Integer pageCount;  //总页面数                                
	private Integer pageSize;  //每页显示条数
	private Integer totalRecord;  //总条数
	private String url;  //页面功能路径
	
	public Pager() {
		super();
	}

	public Pager(Integer currentPage, Integer pageCount, Integer pageSize, Integer totalRecord) {
		super();
		this.currentPage = currentPage;
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
	}
	
	public Pager(Integer currentPage, Integer pageCount, Integer pageSize, Integer totalRecord, String url) {
		super();
		this.currentPage = currentPage;
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Pager [currentPage=" + currentPage + ", pageCount=" + pageCount + ", pageSize=" + pageSize
				+ ", totalRecord=" + totalRecord + ", url=" + url + "]";
	}

	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
