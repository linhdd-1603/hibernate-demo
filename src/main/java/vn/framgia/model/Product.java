package vn.framgia.model;
// Generated Nov 15, 2018 2:38:22 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private String productCd;
	private ProductType productType;
	private Date dateOffered;
	private Date dateRetired;
	private String name;
	private Set accounts = new HashSet(0);

	public Product() {
	}

	public Product(String productCd, String name) {
		this.productCd = productCd;
		this.name = name;
	}

	public Product(String productCd, ProductType productType, Date dateOffered, Date dateRetired, String name,
			Set accounts) {
		this.productCd = productCd;
		this.productType = productType;
		this.dateOffered = dateOffered;
		this.dateRetired = dateRetired;
		this.name = name;
		this.accounts = accounts;
	}

	public String getProductCd() {
		return this.productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Date getDateOffered() {
		return this.dateOffered;
	}

	public void setDateOffered(Date dateOffered) {
		this.dateOffered = dateOffered;
	}

	public Date getDateRetired() {
		return this.dateRetired;
	}

	public void setDateRetired(Date dateRetired) {
		this.dateRetired = dateRetired;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}