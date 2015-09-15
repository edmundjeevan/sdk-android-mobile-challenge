package com.anypresence.anypresence_inc.citi_mobile_challenge.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.APCachedRequest;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.APObjectsAPCachedRequests;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsActivity;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsContact;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsContentService;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsLogin;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsOrder;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsRevenue;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsAccount;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsBeneficiary;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxBooking;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxPayment;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxQuote;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsLogin;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsPayment;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccount;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountBalance;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountFundTransfer;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountTransaction;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingForeignCurrency;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingLocation;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingLogin;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingPayee;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingPayeeType;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingRewardsCatalog;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingRewardsRedemption;

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.APCachedRequestDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.APObjectsAPCachedRequestsDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsActivityDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsContactDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsContentServiceDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsLoginDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsOrderDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsRevenueDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsAccountDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsBeneficiaryDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxBookingDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxPaymentDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxQuoteDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsLoginDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsPaymentDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountBalanceDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountFundTransferDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingAccountTransactionDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingForeignCurrencyDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingLocationDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingLoginDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingPayeeDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingPayeeTypeDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingRewardsCatalogDao;
import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.RetailBankingRewardsRedemptionDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

	private final DaoConfig aPCachedRequestDaoConfig;
	private final DaoConfig aPObjectsAPCachedRequestsDaoConfig;
	private final DaoConfig capitalMarketsActivityDaoConfig;
	private final DaoConfig capitalMarketsContactDaoConfig;
	private final DaoConfig capitalMarketsContentServiceDaoConfig;
	private final DaoConfig capitalMarketsLoginDaoConfig;
	private final DaoConfig capitalMarketsOrderDaoConfig;
	private final DaoConfig capitalMarketsRevenueDaoConfig;
	private final DaoConfig corporatePaymentsAccountDaoConfig;
	private final DaoConfig corporatePaymentsBeneficiaryDaoConfig;
	private final DaoConfig corporatePaymentsCrossBorderFxBookingDaoConfig;
	private final DaoConfig corporatePaymentsCrossBorderFxPaymentDaoConfig;
	private final DaoConfig corporatePaymentsCrossBorderFxQuoteDaoConfig;
	private final DaoConfig corporatePaymentsLoginDaoConfig;
	private final DaoConfig corporatePaymentsPaymentDaoConfig;
	private final DaoConfig retailBankingAccountDaoConfig;
	private final DaoConfig retailBankingAccountBalanceDaoConfig;
	private final DaoConfig retailBankingAccountFundTransferDaoConfig;
	private final DaoConfig retailBankingAccountTransactionDaoConfig;
	private final DaoConfig retailBankingForeignCurrencyDaoConfig;
	private final DaoConfig retailBankingLocationDaoConfig;
	private final DaoConfig retailBankingLoginDaoConfig;
	private final DaoConfig retailBankingPayeeDaoConfig;
	private final DaoConfig retailBankingPayeeTypeDaoConfig;
	private final DaoConfig retailBankingRewardsCatalogDaoConfig;
	private final DaoConfig retailBankingRewardsRedemptionDaoConfig;

	private final APCachedRequestDao aPCachedRequestDao;
	private final APObjectsAPCachedRequestsDao aPObjectsAPCachedRequestsDao;
	private final CapitalMarketsActivityDao capitalMarketsActivityDao;
	private final CapitalMarketsContactDao capitalMarketsContactDao;
	private final CapitalMarketsContentServiceDao capitalMarketsContentServiceDao;
	private final CapitalMarketsLoginDao capitalMarketsLoginDao;
	private final CapitalMarketsOrderDao capitalMarketsOrderDao;
	private final CapitalMarketsRevenueDao capitalMarketsRevenueDao;
	private final CorporatePaymentsAccountDao corporatePaymentsAccountDao;
	private final CorporatePaymentsBeneficiaryDao corporatePaymentsBeneficiaryDao;
	private final CorporatePaymentsCrossBorderFxBookingDao corporatePaymentsCrossBorderFxBookingDao;
	private final CorporatePaymentsCrossBorderFxPaymentDao corporatePaymentsCrossBorderFxPaymentDao;
	private final CorporatePaymentsCrossBorderFxQuoteDao corporatePaymentsCrossBorderFxQuoteDao;
	private final CorporatePaymentsLoginDao corporatePaymentsLoginDao;
	private final CorporatePaymentsPaymentDao corporatePaymentsPaymentDao;
	private final RetailBankingAccountDao retailBankingAccountDao;
	private final RetailBankingAccountBalanceDao retailBankingAccountBalanceDao;
	private final RetailBankingAccountFundTransferDao retailBankingAccountFundTransferDao;
	private final RetailBankingAccountTransactionDao retailBankingAccountTransactionDao;
	private final RetailBankingForeignCurrencyDao retailBankingForeignCurrencyDao;
	private final RetailBankingLocationDao retailBankingLocationDao;
	private final RetailBankingLoginDao retailBankingLoginDao;
	private final RetailBankingPayeeDao retailBankingPayeeDao;
	private final RetailBankingPayeeTypeDao retailBankingPayeeTypeDao;
	private final RetailBankingRewardsCatalogDao retailBankingRewardsCatalogDao;
	private final RetailBankingRewardsRedemptionDao retailBankingRewardsRedemptionDao;

	public DaoSession(SQLiteDatabase db, IdentityScopeType type,
			Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap) {
		super(db);

		aPCachedRequestDaoConfig = daoConfigMap.get(APCachedRequestDao.class)
				.clone();
		aPCachedRequestDaoConfig.initIdentityScope(type);

		aPObjectsAPCachedRequestsDaoConfig = daoConfigMap.get(
				APObjectsAPCachedRequestsDao.class).clone();
		aPObjectsAPCachedRequestsDaoConfig.initIdentityScope(type);

		capitalMarketsActivityDaoConfig = daoConfigMap.get(
				CapitalMarketsActivityDao.class).clone();
		capitalMarketsActivityDaoConfig.initIdentityScope(type);

		capitalMarketsContactDaoConfig = daoConfigMap.get(
				CapitalMarketsContactDao.class).clone();
		capitalMarketsContactDaoConfig.initIdentityScope(type);

		capitalMarketsContentServiceDaoConfig = daoConfigMap.get(
				CapitalMarketsContentServiceDao.class).clone();
		capitalMarketsContentServiceDaoConfig.initIdentityScope(type);

		capitalMarketsLoginDaoConfig = daoConfigMap.get(
				CapitalMarketsLoginDao.class).clone();
		capitalMarketsLoginDaoConfig.initIdentityScope(type);

		capitalMarketsOrderDaoConfig = daoConfigMap.get(
				CapitalMarketsOrderDao.class).clone();
		capitalMarketsOrderDaoConfig.initIdentityScope(type);

		capitalMarketsRevenueDaoConfig = daoConfigMap.get(
				CapitalMarketsRevenueDao.class).clone();
		capitalMarketsRevenueDaoConfig.initIdentityScope(type);

		corporatePaymentsAccountDaoConfig = daoConfigMap.get(
				CorporatePaymentsAccountDao.class).clone();
		corporatePaymentsAccountDaoConfig.initIdentityScope(type);

		corporatePaymentsBeneficiaryDaoConfig = daoConfigMap.get(
				CorporatePaymentsBeneficiaryDao.class).clone();
		corporatePaymentsBeneficiaryDaoConfig.initIdentityScope(type);

		corporatePaymentsCrossBorderFxBookingDaoConfig = daoConfigMap.get(
				CorporatePaymentsCrossBorderFxBookingDao.class).clone();
		corporatePaymentsCrossBorderFxBookingDaoConfig.initIdentityScope(type);

		corporatePaymentsCrossBorderFxPaymentDaoConfig = daoConfigMap.get(
				CorporatePaymentsCrossBorderFxPaymentDao.class).clone();
		corporatePaymentsCrossBorderFxPaymentDaoConfig.initIdentityScope(type);

		corporatePaymentsCrossBorderFxQuoteDaoConfig = daoConfigMap.get(
				CorporatePaymentsCrossBorderFxQuoteDao.class).clone();
		corporatePaymentsCrossBorderFxQuoteDaoConfig.initIdentityScope(type);

		corporatePaymentsLoginDaoConfig = daoConfigMap.get(
				CorporatePaymentsLoginDao.class).clone();
		corporatePaymentsLoginDaoConfig.initIdentityScope(type);

		corporatePaymentsPaymentDaoConfig = daoConfigMap.get(
				CorporatePaymentsPaymentDao.class).clone();
		corporatePaymentsPaymentDaoConfig.initIdentityScope(type);

		retailBankingAccountDaoConfig = daoConfigMap.get(
				RetailBankingAccountDao.class).clone();
		retailBankingAccountDaoConfig.initIdentityScope(type);

		retailBankingAccountBalanceDaoConfig = daoConfigMap.get(
				RetailBankingAccountBalanceDao.class).clone();
		retailBankingAccountBalanceDaoConfig.initIdentityScope(type);

		retailBankingAccountFundTransferDaoConfig = daoConfigMap.get(
				RetailBankingAccountFundTransferDao.class).clone();
		retailBankingAccountFundTransferDaoConfig.initIdentityScope(type);

		retailBankingAccountTransactionDaoConfig = daoConfigMap.get(
				RetailBankingAccountTransactionDao.class).clone();
		retailBankingAccountTransactionDaoConfig.initIdentityScope(type);

		retailBankingForeignCurrencyDaoConfig = daoConfigMap.get(
				RetailBankingForeignCurrencyDao.class).clone();
		retailBankingForeignCurrencyDaoConfig.initIdentityScope(type);

		retailBankingLocationDaoConfig = daoConfigMap.get(
				RetailBankingLocationDao.class).clone();
		retailBankingLocationDaoConfig.initIdentityScope(type);

		retailBankingLoginDaoConfig = daoConfigMap.get(
				RetailBankingLoginDao.class).clone();
		retailBankingLoginDaoConfig.initIdentityScope(type);

		retailBankingPayeeDaoConfig = daoConfigMap.get(
				RetailBankingPayeeDao.class).clone();
		retailBankingPayeeDaoConfig.initIdentityScope(type);

		retailBankingPayeeTypeDaoConfig = daoConfigMap.get(
				RetailBankingPayeeTypeDao.class).clone();
		retailBankingPayeeTypeDaoConfig.initIdentityScope(type);

		retailBankingRewardsCatalogDaoConfig = daoConfigMap.get(
				RetailBankingRewardsCatalogDao.class).clone();
		retailBankingRewardsCatalogDaoConfig.initIdentityScope(type);

		retailBankingRewardsRedemptionDaoConfig = daoConfigMap.get(
				RetailBankingRewardsRedemptionDao.class).clone();
		retailBankingRewardsRedemptionDaoConfig.initIdentityScope(type);

		aPCachedRequestDao = new APCachedRequestDao(aPCachedRequestDaoConfig,
				this);
		aPObjectsAPCachedRequestsDao = new APObjectsAPCachedRequestsDao(
				aPObjectsAPCachedRequestsDaoConfig, this);
		capitalMarketsActivityDao = new CapitalMarketsActivityDao(
				capitalMarketsActivityDaoConfig, this);
		capitalMarketsContactDao = new CapitalMarketsContactDao(
				capitalMarketsContactDaoConfig, this);
		capitalMarketsContentServiceDao = new CapitalMarketsContentServiceDao(
				capitalMarketsContentServiceDaoConfig, this);
		capitalMarketsLoginDao = new CapitalMarketsLoginDao(
				capitalMarketsLoginDaoConfig, this);
		capitalMarketsOrderDao = new CapitalMarketsOrderDao(
				capitalMarketsOrderDaoConfig, this);
		capitalMarketsRevenueDao = new CapitalMarketsRevenueDao(
				capitalMarketsRevenueDaoConfig, this);
		corporatePaymentsAccountDao = new CorporatePaymentsAccountDao(
				corporatePaymentsAccountDaoConfig, this);
		corporatePaymentsBeneficiaryDao = new CorporatePaymentsBeneficiaryDao(
				corporatePaymentsBeneficiaryDaoConfig, this);
		corporatePaymentsCrossBorderFxBookingDao = new CorporatePaymentsCrossBorderFxBookingDao(
				corporatePaymentsCrossBorderFxBookingDaoConfig, this);
		corporatePaymentsCrossBorderFxPaymentDao = new CorporatePaymentsCrossBorderFxPaymentDao(
				corporatePaymentsCrossBorderFxPaymentDaoConfig, this);
		corporatePaymentsCrossBorderFxQuoteDao = new CorporatePaymentsCrossBorderFxQuoteDao(
				corporatePaymentsCrossBorderFxQuoteDaoConfig, this);
		corporatePaymentsLoginDao = new CorporatePaymentsLoginDao(
				corporatePaymentsLoginDaoConfig, this);
		corporatePaymentsPaymentDao = new CorporatePaymentsPaymentDao(
				corporatePaymentsPaymentDaoConfig, this);
		retailBankingAccountDao = new RetailBankingAccountDao(
				retailBankingAccountDaoConfig, this);
		retailBankingAccountBalanceDao = new RetailBankingAccountBalanceDao(
				retailBankingAccountBalanceDaoConfig, this);
		retailBankingAccountFundTransferDao = new RetailBankingAccountFundTransferDao(
				retailBankingAccountFundTransferDaoConfig, this);
		retailBankingAccountTransactionDao = new RetailBankingAccountTransactionDao(
				retailBankingAccountTransactionDaoConfig, this);
		retailBankingForeignCurrencyDao = new RetailBankingForeignCurrencyDao(
				retailBankingForeignCurrencyDaoConfig, this);
		retailBankingLocationDao = new RetailBankingLocationDao(
				retailBankingLocationDaoConfig, this);
		retailBankingLoginDao = new RetailBankingLoginDao(
				retailBankingLoginDaoConfig, this);
		retailBankingPayeeDao = new RetailBankingPayeeDao(
				retailBankingPayeeDaoConfig, this);
		retailBankingPayeeTypeDao = new RetailBankingPayeeTypeDao(
				retailBankingPayeeTypeDaoConfig, this);
		retailBankingRewardsCatalogDao = new RetailBankingRewardsCatalogDao(
				retailBankingRewardsCatalogDaoConfig, this);
		retailBankingRewardsRedemptionDao = new RetailBankingRewardsRedemptionDao(
				retailBankingRewardsRedemptionDaoConfig, this);

		registerDao(APCachedRequest.class, aPCachedRequestDao);
		registerDao(APObjectsAPCachedRequests.class,
				aPObjectsAPCachedRequestsDao);
		registerDao(CapitalMarketsActivity.class, capitalMarketsActivityDao);
		registerDao(CapitalMarketsContact.class, capitalMarketsContactDao);
		registerDao(CapitalMarketsContentService.class,
				capitalMarketsContentServiceDao);
		registerDao(CapitalMarketsLogin.class, capitalMarketsLoginDao);
		registerDao(CapitalMarketsOrder.class, capitalMarketsOrderDao);
		registerDao(CapitalMarketsRevenue.class, capitalMarketsRevenueDao);
		registerDao(CorporatePaymentsAccount.class, corporatePaymentsAccountDao);
		registerDao(CorporatePaymentsBeneficiary.class,
				corporatePaymentsBeneficiaryDao);
		registerDao(CorporatePaymentsCrossBorderFxBooking.class,
				corporatePaymentsCrossBorderFxBookingDao);
		registerDao(CorporatePaymentsCrossBorderFxPayment.class,
				corporatePaymentsCrossBorderFxPaymentDao);
		registerDao(CorporatePaymentsCrossBorderFxQuote.class,
				corporatePaymentsCrossBorderFxQuoteDao);
		registerDao(CorporatePaymentsLogin.class, corporatePaymentsLoginDao);
		registerDao(CorporatePaymentsPayment.class, corporatePaymentsPaymentDao);
		registerDao(RetailBankingAccount.class, retailBankingAccountDao);
		registerDao(RetailBankingAccountBalance.class,
				retailBankingAccountBalanceDao);
		registerDao(RetailBankingAccountFundTransfer.class,
				retailBankingAccountFundTransferDao);
		registerDao(RetailBankingAccountTransaction.class,
				retailBankingAccountTransactionDao);
		registerDao(RetailBankingForeignCurrency.class,
				retailBankingForeignCurrencyDao);
		registerDao(RetailBankingLocation.class, retailBankingLocationDao);
		registerDao(RetailBankingLogin.class, retailBankingLoginDao);
		registerDao(RetailBankingPayee.class, retailBankingPayeeDao);
		registerDao(RetailBankingPayeeType.class, retailBankingPayeeTypeDao);
		registerDao(RetailBankingRewardsCatalog.class,
				retailBankingRewardsCatalogDao);
		registerDao(RetailBankingRewardsRedemption.class,
				retailBankingRewardsRedemptionDao);
	}

	public void clear() {
		aPCachedRequestDaoConfig.getIdentityScope().clear();
		aPObjectsAPCachedRequestsDaoConfig.getIdentityScope().clear();
		capitalMarketsActivityDaoConfig.getIdentityScope().clear();
		capitalMarketsContactDaoConfig.getIdentityScope().clear();
		capitalMarketsContentServiceDaoConfig.getIdentityScope().clear();
		capitalMarketsLoginDaoConfig.getIdentityScope().clear();
		capitalMarketsOrderDaoConfig.getIdentityScope().clear();
		capitalMarketsRevenueDaoConfig.getIdentityScope().clear();
		corporatePaymentsAccountDaoConfig.getIdentityScope().clear();
		corporatePaymentsBeneficiaryDaoConfig.getIdentityScope().clear();
		corporatePaymentsCrossBorderFxBookingDaoConfig.getIdentityScope()
				.clear();
		corporatePaymentsCrossBorderFxPaymentDaoConfig.getIdentityScope()
				.clear();
		corporatePaymentsCrossBorderFxQuoteDaoConfig.getIdentityScope().clear();
		corporatePaymentsLoginDaoConfig.getIdentityScope().clear();
		corporatePaymentsPaymentDaoConfig.getIdentityScope().clear();
		retailBankingAccountDaoConfig.getIdentityScope().clear();
		retailBankingAccountBalanceDaoConfig.getIdentityScope().clear();
		retailBankingAccountFundTransferDaoConfig.getIdentityScope().clear();
		retailBankingAccountTransactionDaoConfig.getIdentityScope().clear();
		retailBankingForeignCurrencyDaoConfig.getIdentityScope().clear();
		retailBankingLocationDaoConfig.getIdentityScope().clear();
		retailBankingLoginDaoConfig.getIdentityScope().clear();
		retailBankingPayeeDaoConfig.getIdentityScope().clear();
		retailBankingPayeeTypeDaoConfig.getIdentityScope().clear();
		retailBankingRewardsCatalogDaoConfig.getIdentityScope().clear();
		retailBankingRewardsRedemptionDaoConfig.getIdentityScope().clear();
	}

	public APCachedRequestDao getAPCachedRequestDao() {
		return aPCachedRequestDao;
	}

	public APObjectsAPCachedRequestsDao getAPObjectsAPCachedRequestsDao() {
		return aPObjectsAPCachedRequestsDao;
	}

	public CapitalMarketsActivityDao getCapitalMarketsActivityDao() {
		return capitalMarketsActivityDao;
	}

	public CapitalMarketsContactDao getCapitalMarketsContactDao() {
		return capitalMarketsContactDao;
	}

	public CapitalMarketsContentServiceDao getCapitalMarketsContentServiceDao() {
		return capitalMarketsContentServiceDao;
	}

	public CapitalMarketsLoginDao getCapitalMarketsLoginDao() {
		return capitalMarketsLoginDao;
	}

	public CapitalMarketsOrderDao getCapitalMarketsOrderDao() {
		return capitalMarketsOrderDao;
	}

	public CapitalMarketsRevenueDao getCapitalMarketsRevenueDao() {
		return capitalMarketsRevenueDao;
	}

	public CorporatePaymentsAccountDao getCorporatePaymentsAccountDao() {
		return corporatePaymentsAccountDao;
	}

	public CorporatePaymentsBeneficiaryDao getCorporatePaymentsBeneficiaryDao() {
		return corporatePaymentsBeneficiaryDao;
	}

	public CorporatePaymentsCrossBorderFxBookingDao getCorporatePaymentsCrossBorderFxBookingDao() {
		return corporatePaymentsCrossBorderFxBookingDao;
	}

	public CorporatePaymentsCrossBorderFxPaymentDao getCorporatePaymentsCrossBorderFxPaymentDao() {
		return corporatePaymentsCrossBorderFxPaymentDao;
	}

	public CorporatePaymentsCrossBorderFxQuoteDao getCorporatePaymentsCrossBorderFxQuoteDao() {
		return corporatePaymentsCrossBorderFxQuoteDao;
	}

	public CorporatePaymentsLoginDao getCorporatePaymentsLoginDao() {
		return corporatePaymentsLoginDao;
	}

	public CorporatePaymentsPaymentDao getCorporatePaymentsPaymentDao() {
		return corporatePaymentsPaymentDao;
	}

	public RetailBankingAccountDao getRetailBankingAccountDao() {
		return retailBankingAccountDao;
	}

	public RetailBankingAccountBalanceDao getRetailBankingAccountBalanceDao() {
		return retailBankingAccountBalanceDao;
	}

	public RetailBankingAccountFundTransferDao getRetailBankingAccountFundTransferDao() {
		return retailBankingAccountFundTransferDao;
	}

	public RetailBankingAccountTransactionDao getRetailBankingAccountTransactionDao() {
		return retailBankingAccountTransactionDao;
	}

	public RetailBankingForeignCurrencyDao getRetailBankingForeignCurrencyDao() {
		return retailBankingForeignCurrencyDao;
	}

	public RetailBankingLocationDao getRetailBankingLocationDao() {
		return retailBankingLocationDao;
	}

	public RetailBankingLoginDao getRetailBankingLoginDao() {
		return retailBankingLoginDao;
	}

	public RetailBankingPayeeDao getRetailBankingPayeeDao() {
		return retailBankingPayeeDao;
	}

	public RetailBankingPayeeTypeDao getRetailBankingPayeeTypeDao() {
		return retailBankingPayeeTypeDao;
	}

	public RetailBankingRewardsCatalogDao getRetailBankingRewardsCatalogDao() {
		return retailBankingRewardsCatalogDao;
	}

	public RetailBankingRewardsRedemptionDao getRetailBankingRewardsRedemptionDao() {
		return retailBankingRewardsRedemptionDao;
	}

}
