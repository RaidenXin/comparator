package demo;

import com.baomidou.mybatisplus.annotations.TableId;
import compare.annotation.CompareFieldOfClass;
import compare.annotation.NoCompareField;
import compare.utils.CompareFieldStrategy;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@CompareFieldOfClass(valus = CompareFieldStrategy.PART)
public class DemoModle extends FullData{

	@TableId
	private String debitId;
	private String id;
	private String retailercode;
	private String loginname;

	@NoCompareField
	private String salesOrg;
	@NoCompareField
	private String branchName;

	private String storeName;
	private String storeNo;

	@NoCompareField
	private String shipTo;
	@NoCompareField
	private String soldTo;

	private String payDate;
	private String ticketRebateNo;
	private String debitName;
	private String mount;
	private String remark;
	// 新增
	private Date planPayDate;
	private String settlementNo;
	private String payNo;
	private String sapNo;
	private String docNo;
	private String extOne;
	
	@NoCompareField
	private String createby;
	@NoCompareField
	private String updateby;

	@Override
	public String getOnlyId() {
		return debitId;
	}

	public String getDebitId() {
		return debitId;
	}

	public void setDebitId(String debitId) {
		this.debitId = debitId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRetailercode() {
		return retailercode;
	}

	public void setRetailercode(String retailercode) {
		this.retailercode = retailercode;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getSoldTo() {
		return soldTo;
	}

	public void setSoldTo(String soldTo) {
		this.soldTo = soldTo;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getTicketRebateNo() {
		return ticketRebateNo;
	}

	public void setTicketRebateNo(String ticketRebateNo) {
		this.ticketRebateNo = ticketRebateNo;
	}

	public String getDebitName() {
		return debitName;
	}

	public void setDebitName(String debitName) {
		this.debitName = debitName;
	}

	public String getMount() {
		return mount;
	}

	public void setMount(String mount) {
		this.mount = mount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getPlanPayDate() {
		return planPayDate;
	}

	public void setPlanPayDate(Date planPayDate) {
		this.planPayDate = planPayDate;
	}

	public String getSettlementNo() {
		return settlementNo;
	}

	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getSapNo() {
		return sapNo;
	}

	public void setSapNo(String sapNo) {
		this.sapNo = sapNo;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	@Override
	public String getExtOne() {
		return extOne;
	}

	@Override
	public void setExtOne(String extOne) {
		this.extOne = extOne;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}
}