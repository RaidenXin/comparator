package demo;

import compare.CompareHandler;
import compare.annotation.NoCompareField;
import compare.annotation.NoCompareFieldOfClass;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author Raiden
 * model的包装类
 */
@NoCompareFieldOfClass
public abstract class FullData {
	
	protected String delFlag;
	protected String docType;
	protected String batchNo;//批次号
	protected String handleStatus;//处理状态
	protected String updateFlag;//跟新标识
	// 备用字段
	protected String extOne;
	protected String extTwo;
	protected String extThree;
	protected String extFour;
	protected String extFive;
	protected String extSix;
	protected String extSeven;
	protected String extEight;
	protected String extNine;
	protected String extTen;
	
	// 备用时间字段
	protected Date extDate;
	@NoCompareField
	protected Integer version;
	@NoCompareField
	protected String sendStatus;// 发送状态：S成功，F失败，P准备发送，N无需发送
	@NoCompareField
	protected String showStatus;// 显示状态：Y显示，N不显示
	//备份接口字段
	@NoCompareField
	protected String extStatus;

	public boolean compare(FullData fullData) {
		return CompareHandler.compare(this, fullData);
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public Date getExtDate() {
		return extDate;
	}

	public void setExtDate(Date extDate) {
		this.extDate = extDate;
	}

	public String getExtOne() {
		return extOne;
	}

	public void setExtOne(String extOne) {
		this.extOne = extOne;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(String showStatus) {
		this.showStatus = showStatus;
	}

	public String getExtStatus() {
		return extStatus;
	}

	public void setExtStatus(String extStatus) {
		this.extStatus = extStatus;
	}
	
	
	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNumber) {
		this.batchNo = batchNumber;
	}
	
	public String getHandleStatus() {
		return handleStatus;
	}

	public void setHandleStatus(String handleStatus) {
		this.handleStatus = handleStatus;
	}

	public String getUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(String updateFlag) {
		this.updateFlag = updateFlag;
	}

	public String getExtTwo() {
		return extTwo;
	}

	public void setExtTwo(String extTwo) {
		this.extTwo = extTwo;
	}

	public String getExtThree() {
		return extThree;
	}

	public void setExtThree(String extThree) {
		this.extThree = extThree;
	}

	public String getExtFour() {
		return extFour;
	}

	public void setExtFour(String extFour) {
		this.extFour = extFour;
	}

	public String getExtFive() {
		return extFive;
	}

	public void setExtFive(String extFive) {
		this.extFive = extFive;
	}

	public String getExtSix() {
		return extSix;
	}

	public void setExtSix(String extSix) {
		this.extSix = extSix;
	}

	public String getExtSeven() {
		return extSeven;
	}

	public void setExtSeven(String extSeven) {
		this.extSeven = extSeven;
	}

	public String getExtEight() {
		return extEight;
	}

	public void setExtEight(String extEight) {
		this.extEight = extEight;
	}

	public String getExtNine() {
		return extNine;
	}

	public void setExtNine(String extNine) {
		this.extNine = extNine;
	}

	public String getExtTen() {
		return extTen;
	}

	public void setExtTen(String extTen) {
		this.extTen = extTen;
	}

	/**
	 * 比较数字
	 * @param b1
	 * @param b2
	 * @return
	 */
	protected final boolean bigDecimalEquals(BigDecimal b1,BigDecimal b2) {
		if (null != b1 && null != b2 ) {
			return b1.compareTo(b2) == 0;
		}else if(null == b1 && null == b2) {
			return true;
		}
		return false;
	}
	/**
	 * 比较时间
	 * @param b1
	 * @param b2
	 * @return
	 */
	protected final boolean dateEquals(Date b1,Date b2) {
		if (null != b1 && null != b2 ) {
			return b1.compareTo(b2) == 0;
		}else if(null == b1 && null == b2) {
			return true;
		}
		return false;
	}
	
	public abstract String getOnlyId();
}
