package com.anypresence.anypresence_inc.citi_mobile_challenge.dao;

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table CORPORATEPAYMENTSCROSSBORDERFXPAYMENTS.
 */
public class CorporatePaymentsCrossBorderFxPayment extends APObject {

	private Long id;
	private String beneficiaryAccount;
	private String beneficiaryAddress;
	private String beneficiaryBank;
	private String beneficiaryName;
	private String citiRef;
	private String createdBy;
	private String createdOn;
	private String customerTxnRef;
	private String debtorAccount;
	private String debtorAddress;
	private String debtorName;
	private Float fromAmount;
	private String fromCurrency;
	private String paymentDetails;
	private String rateReference;
	private String status;
	private Float toAmount;
	private String toCurrency;
	private String valueDate;
	private String scope;
	private String objectId;
	private java.util.Date _cacheUpdatedAt;
	private Long apCachedRequestId;

	/** Used to resolve relations */
	private transient DaoSession daoSession;

	/** Used for active entity operations. */
	private transient CorporatePaymentsCrossBorderFxPaymentDao myDao;

	private APCachedRequest aPCachedRequest;
	private Long aPCachedRequest__resolvedKey;

	// KEEP FIELDS - put your custom fields here
	// KEEP FIELDS END

	public CorporatePaymentsCrossBorderFxPayment() {
	}

	public CorporatePaymentsCrossBorderFxPayment(Long id) {
		this.id = id;
	}

	public CorporatePaymentsCrossBorderFxPayment(Long id,
			String beneficiaryAccount, String beneficiaryAddress,
			String beneficiaryBank, String beneficiaryName, String citiRef,
			String createdBy, String createdOn, String customerTxnRef,
			String debtorAccount, String debtorAddress, String debtorName,
			Float fromAmount, String fromCurrency, String paymentDetails,
			String rateReference, String status, Float toAmount,
			String toCurrency, String valueDate, String scope, String objectId,
			java.util.Date _cacheUpdatedAt, Long apCachedRequestId) {
		this.id = id;
		this.beneficiaryAccount = beneficiaryAccount;
		this.beneficiaryAddress = beneficiaryAddress;
		this.beneficiaryBank = beneficiaryBank;
		this.beneficiaryName = beneficiaryName;
		this.citiRef = citiRef;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.customerTxnRef = customerTxnRef;
		this.debtorAccount = debtorAccount;
		this.debtorAddress = debtorAddress;
		this.debtorName = debtorName;
		this.fromAmount = fromAmount;
		this.fromCurrency = fromCurrency;
		this.paymentDetails = paymentDetails;
		this.rateReference = rateReference;
		this.status = status;
		this.toAmount = toAmount;
		this.toCurrency = toCurrency;
		this.valueDate = valueDate;
		this.scope = scope;
		this.objectId = objectId;
		this._cacheUpdatedAt = _cacheUpdatedAt;
		this.apCachedRequestId = apCachedRequestId;
	}

	/** called by internal mechanisms, do not call yourself. */
	public void __setDaoSession(DaoSession daoSession) {
		this.daoSession = daoSession;
		myDao = daoSession != null ? daoSession
				.getCorporatePaymentsCrossBorderFxPaymentDao() : null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	public String getBeneficiaryAddress() {
		return beneficiaryAddress;
	}

	public void setBeneficiaryAddress(String beneficiaryAddress) {
		this.beneficiaryAddress = beneficiaryAddress;
	}

	public String getBeneficiaryBank() {
		return beneficiaryBank;
	}

	public void setBeneficiaryBank(String beneficiaryBank) {
		this.beneficiaryBank = beneficiaryBank;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getCitiRef() {
		return citiRef;
	}

	public void setCitiRef(String citiRef) {
		this.citiRef = citiRef;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCustomerTxnRef() {
		return customerTxnRef;
	}

	public void setCustomerTxnRef(String customerTxnRef) {
		this.customerTxnRef = customerTxnRef;
	}

	public String getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(String debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public String getDebtorAddress() {
		return debtorAddress;
	}

	public void setDebtorAddress(String debtorAddress) {
		this.debtorAddress = debtorAddress;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public Float getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(Float fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getRateReference() {
		return rateReference;
	}

	public void setRateReference(String rateReference) {
		this.rateReference = rateReference;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getToAmount() {
		return toAmount;
	}

	public void setToAmount(Float toAmount) {
		this.toAmount = toAmount;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public java.util.Date get_cacheUpdatedAt() {
		return _cacheUpdatedAt;
	}

	public void set_cacheUpdatedAt(java.util.Date _cacheUpdatedAt) {
		this._cacheUpdatedAt = _cacheUpdatedAt;
	}

	public Long getApCachedRequestId() {
		return apCachedRequestId;
	}

	public void setApCachedRequestId(Long apCachedRequestId) {
		this.apCachedRequestId = apCachedRequestId;
	}

	/** To-one relationship, resolved on first access. */
	public APCachedRequest getAPCachedRequest() {
		Long __key = this.apCachedRequestId;
		if (aPCachedRequest__resolvedKey == null
				|| !aPCachedRequest__resolvedKey.equals(__key)) {
			if (daoSession == null) {
				throw new DaoException("Entity is detached from DAO context");
			}
			APCachedRequestDao targetDao = daoSession.getAPCachedRequestDao();
			APCachedRequest aPCachedRequestNew = targetDao.load(__key);
			synchronized (this) {
				aPCachedRequest = aPCachedRequestNew;
				aPCachedRequest__resolvedKey = __key;
			}
		}
		return aPCachedRequest;
	}

	public void setAPCachedRequest(APCachedRequest aPCachedRequest) {
		synchronized (this) {
			this.aPCachedRequest = aPCachedRequest;
			apCachedRequestId = aPCachedRequest == null
					? null
					: aPCachedRequest.getId();
			aPCachedRequest__resolvedKey = apCachedRequestId;
		}
	}

	/** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
	public void delete() {
		if (myDao == null) {
			throw new DaoException("Entity is detached from DAO context");
		}
		myDao.delete(this);
	}

	/** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
	public void update() {
		if (myDao == null) {
			throw new DaoException("Entity is detached from DAO context");
		}
		myDao.update(this);
	}

	/** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
	public void refresh() {
		if (myDao == null) {
			throw new DaoException("Entity is detached from DAO context");
		}
		myDao.refresh(this);
	}

	// KEEP METHODS - put your custom methods here
	// KEEP METHODS END

}
