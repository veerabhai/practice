package com.WareHouse.ProducerHouse1.Pojo;

public class WareHousePojo {
	
	private Integer W_Id;
	private Integer W_ProductId;
	private String  W_ProductNAme;
	private Integer W_Productprice;
	public WareHousePojo(Integer w_Id, Integer w_ProductId, String w_ProductNAme, Integer w_Productprice) {
		super();
		this.W_Id = w_Id;
		this.W_ProductId = w_ProductId;
		this.W_ProductNAme = w_ProductNAme;
		this.W_Productprice = w_Productprice;
	}
	public WareHousePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getW_Id() {
		return W_Id;
	}
	public void setW_Id(Integer w_Id) {
		W_Id = w_Id;
	}
	public Integer getW_ProductId() {
		return W_ProductId;
	}
	public void setW_ProductId(Integer w_ProductId) {
		W_ProductId = w_ProductId;
	}
	public String getW_ProductNAme() {
		return W_ProductNAme;
	}
	public void setW_ProductNAme(String w_ProductNAme) {
		W_ProductNAme = w_ProductNAme;
	}
	public Integer getW_Productprice() {
		return W_Productprice;
	}
	public void setW_Productprice(Integer w_Productprice) {
		W_Productprice = w_Productprice;
	}
	@Override
	public String toString() {
		return "WareHousePojo [W_Id=" + W_Id + ", W_ProductId=" + W_ProductId + ", W_ProductNAme=" + W_ProductNAme
				+ ", W_Productprice=" + W_Productprice + "]";
	}

}
