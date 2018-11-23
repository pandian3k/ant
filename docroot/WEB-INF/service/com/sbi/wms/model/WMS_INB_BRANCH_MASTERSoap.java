/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sbi.wms.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sbi.wms.service.http.WMS_INB_BRANCH_MASTERServiceSoap}.
 *
 * @author    Syed
 * @see       com.sbi.wms.service.http.WMS_INB_BRANCH_MASTERServiceSoap
 * @generated
 */
public class WMS_INB_BRANCH_MASTERSoap implements Serializable {
	public static WMS_INB_BRANCH_MASTERSoap toSoapModel(
		WMS_INB_BRANCH_MASTER model) {
		WMS_INB_BRANCH_MASTERSoap soapModel = new WMS_INB_BRANCH_MASTERSoap();

		soapModel.setREC_ID(model.getREC_ID());
		soapModel.setBRANCH_CODE(model.getBRANCH_CODE());
		soapModel.setBRANCH_NAME(model.getBRANCH_NAME());
		soapModel.setMAIL_ADDRESS1(model.getMAIL_ADDRESS1());
		soapModel.setMAIL_ADDRESS2(model.getMAIL_ADDRESS2());
		soapModel.setMAIL_ADDRESS3(model.getMAIL_ADDRESS3());
		soapModel.setCITY(model.getCITY());
		soapModel.setDISTRICT(model.getDISTRICT());
		soapModel.setSTATE(model.getSTATE());
		soapModel.setPIN(model.getPIN());
		soapModel.setCIRCLE(model.getCIRCLE());
		soapModel.setFOREX_TYPE(model.getFOREX_TYPE());
		soapModel.setBRANCH_MANAGER(model.getBRANCH_MANAGER());
		soapModel.setNO_OF_ATM(model.getNO_OF_ATM());
		soapModel.setIFSC_CODE(model.getIFSC_CODE());
		soapModel.setSTD_CODE(model.getSTD_CODE());
		soapModel.setTELEPHONE(model.getTELEPHONE());
		soapModel.setFAX_NO(model.getFAX_NO());
		soapModel.setEMAIL_ID(model.getEMAIL_ID());
		soapModel.setBUSSINESS_HOURS(model.getBUSSINESS_HOURS());
		soapModel.setWEEKLY_HOLIDAY(model.getWEEKLY_HOLIDAY());
		soapModel.setNON_BANKING_DAY(model.getNON_BANKING_DAY());
		soapModel.setSUNDAY_BANKING(model.getSUNDAY_BANKING());
		soapModel.setSUNDAY_BANKING_BUSSINESS(model.getSUNDAY_BANKING_BUSSINESS());
		soapModel.setSWIFT_ENABLED(model.getSWIFT_ENABLED());
		soapModel.setSWIFT_CODE(model.getSWIFT_CODE());
		soapModel.setBRANCH_TYPE(model.getBRANCH_TYPE());
		soapModel.setLOCKER(model.getLOCKER());
		soapModel.setGOLD_COIN(model.getGOLD_COIN());
		soapModel.setLAST_MOD_TIME(model.getLAST_MOD_TIME());

		return soapModel;
	}

	public static WMS_INB_BRANCH_MASTERSoap[] toSoapModels(
		WMS_INB_BRANCH_MASTER[] models) {
		WMS_INB_BRANCH_MASTERSoap[] soapModels = new WMS_INB_BRANCH_MASTERSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WMS_INB_BRANCH_MASTERSoap[][] toSoapModels(
		WMS_INB_BRANCH_MASTER[][] models) {
		WMS_INB_BRANCH_MASTERSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WMS_INB_BRANCH_MASTERSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WMS_INB_BRANCH_MASTERSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WMS_INB_BRANCH_MASTERSoap[] toSoapModels(
		List<WMS_INB_BRANCH_MASTER> models) {
		List<WMS_INB_BRANCH_MASTERSoap> soapModels = new ArrayList<WMS_INB_BRANCH_MASTERSoap>(models.size());

		for (WMS_INB_BRANCH_MASTER model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WMS_INB_BRANCH_MASTERSoap[soapModels.size()]);
	}

	public WMS_INB_BRANCH_MASTERSoap() {
	}

	public long getPrimaryKey() {
		return _REC_ID;
	}

	public void setPrimaryKey(long pk) {
		setREC_ID(pk);
	}

	public long getREC_ID() {
		return _REC_ID;
	}

	public void setREC_ID(long REC_ID) {
		_REC_ID = REC_ID;
	}

	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;
	}

	public String getBRANCH_NAME() {
		return _BRANCH_NAME;
	}

	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;
	}

	public String getMAIL_ADDRESS1() {
		return _MAIL_ADDRESS1;
	}

	public void setMAIL_ADDRESS1(String MAIL_ADDRESS1) {
		_MAIL_ADDRESS1 = MAIL_ADDRESS1;
	}

	public String getMAIL_ADDRESS2() {
		return _MAIL_ADDRESS2;
	}

	public void setMAIL_ADDRESS2(String MAIL_ADDRESS2) {
		_MAIL_ADDRESS2 = MAIL_ADDRESS2;
	}

	public String getMAIL_ADDRESS3() {
		return _MAIL_ADDRESS3;
	}

	public void setMAIL_ADDRESS3(String MAIL_ADDRESS3) {
		_MAIL_ADDRESS3 = MAIL_ADDRESS3;
	}

	public String getCITY() {
		return _CITY;
	}

	public void setCITY(String CITY) {
		_CITY = CITY;
	}

	public String getDISTRICT() {
		return _DISTRICT;
	}

	public void setDISTRICT(String DISTRICT) {
		_DISTRICT = DISTRICT;
	}

	public String getSTATE() {
		return _STATE;
	}

	public void setSTATE(String STATE) {
		_STATE = STATE;
	}

	public String getPIN() {
		return _PIN;
	}

	public void setPIN(String PIN) {
		_PIN = PIN;
	}

	public String getCIRCLE() {
		return _CIRCLE;
	}

	public void setCIRCLE(String CIRCLE) {
		_CIRCLE = CIRCLE;
	}

	public String getFOREX_TYPE() {
		return _FOREX_TYPE;
	}

	public void setFOREX_TYPE(String FOREX_TYPE) {
		_FOREX_TYPE = FOREX_TYPE;
	}

	public String getBRANCH_MANAGER() {
		return _BRANCH_MANAGER;
	}

	public void setBRANCH_MANAGER(String BRANCH_MANAGER) {
		_BRANCH_MANAGER = BRANCH_MANAGER;
	}

	public String getNO_OF_ATM() {
		return _NO_OF_ATM;
	}

	public void setNO_OF_ATM(String NO_OF_ATM) {
		_NO_OF_ATM = NO_OF_ATM;
	}

	public String getIFSC_CODE() {
		return _IFSC_CODE;
	}

	public void setIFSC_CODE(String IFSC_CODE) {
		_IFSC_CODE = IFSC_CODE;
	}

	public String getSTD_CODE() {
		return _STD_CODE;
	}

	public void setSTD_CODE(String STD_CODE) {
		_STD_CODE = STD_CODE;
	}

	public String getTELEPHONE() {
		return _TELEPHONE;
	}

	public void setTELEPHONE(String TELEPHONE) {
		_TELEPHONE = TELEPHONE;
	}

	public String getFAX_NO() {
		return _FAX_NO;
	}

	public void setFAX_NO(String FAX_NO) {
		_FAX_NO = FAX_NO;
	}

	public String getEMAIL_ID() {
		return _EMAIL_ID;
	}

	public void setEMAIL_ID(String EMAIL_ID) {
		_EMAIL_ID = EMAIL_ID;
	}

	public String getBUSSINESS_HOURS() {
		return _BUSSINESS_HOURS;
	}

	public void setBUSSINESS_HOURS(String BUSSINESS_HOURS) {
		_BUSSINESS_HOURS = BUSSINESS_HOURS;
	}

	public String getWEEKLY_HOLIDAY() {
		return _WEEKLY_HOLIDAY;
	}

	public void setWEEKLY_HOLIDAY(String WEEKLY_HOLIDAY) {
		_WEEKLY_HOLIDAY = WEEKLY_HOLIDAY;
	}

	public String getNON_BANKING_DAY() {
		return _NON_BANKING_DAY;
	}

	public void setNON_BANKING_DAY(String NON_BANKING_DAY) {
		_NON_BANKING_DAY = NON_BANKING_DAY;
	}

	public String getSUNDAY_BANKING() {
		return _SUNDAY_BANKING;
	}

	public void setSUNDAY_BANKING(String SUNDAY_BANKING) {
		_SUNDAY_BANKING = SUNDAY_BANKING;
	}

	public String getSUNDAY_BANKING_BUSSINESS() {
		return _SUNDAY_BANKING_BUSSINESS;
	}

	public void setSUNDAY_BANKING_BUSSINESS(String SUNDAY_BANKING_BUSSINESS) {
		_SUNDAY_BANKING_BUSSINESS = SUNDAY_BANKING_BUSSINESS;
	}

	public String getSWIFT_ENABLED() {
		return _SWIFT_ENABLED;
	}

	public void setSWIFT_ENABLED(String SWIFT_ENABLED) {
		_SWIFT_ENABLED = SWIFT_ENABLED;
	}

	public String getSWIFT_CODE() {
		return _SWIFT_CODE;
	}

	public void setSWIFT_CODE(String SWIFT_CODE) {
		_SWIFT_CODE = SWIFT_CODE;
	}

	public String getBRANCH_TYPE() {
		return _BRANCH_TYPE;
	}

	public void setBRANCH_TYPE(String BRANCH_TYPE) {
		_BRANCH_TYPE = BRANCH_TYPE;
	}

	public String getLOCKER() {
		return _LOCKER;
	}

	public void setLOCKER(String LOCKER) {
		_LOCKER = LOCKER;
	}

	public String getGOLD_COIN() {
		return _GOLD_COIN;
	}

	public void setGOLD_COIN(String GOLD_COIN) {
		_GOLD_COIN = GOLD_COIN;
	}

	public Date getLAST_MOD_TIME() {
		return _LAST_MOD_TIME;
	}

	public void setLAST_MOD_TIME(Date LAST_MOD_TIME) {
		_LAST_MOD_TIME = LAST_MOD_TIME;
	}

	private long _REC_ID;
	private String _BRANCH_CODE;
	private String _BRANCH_NAME;
	private String _MAIL_ADDRESS1;
	private String _MAIL_ADDRESS2;
	private String _MAIL_ADDRESS3;
	private String _CITY;
	private String _DISTRICT;
	private String _STATE;
	private String _PIN;
	private String _CIRCLE;
	private String _FOREX_TYPE;
	private String _BRANCH_MANAGER;
	private String _NO_OF_ATM;
	private String _IFSC_CODE;
	private String _STD_CODE;
	private String _TELEPHONE;
	private String _FAX_NO;
	private String _EMAIL_ID;
	private String _BUSSINESS_HOURS;
	private String _WEEKLY_HOLIDAY;
	private String _NON_BANKING_DAY;
	private String _SUNDAY_BANKING;
	private String _SUNDAY_BANKING_BUSSINESS;
	private String _SWIFT_ENABLED;
	private String _SWIFT_CODE;
	private String _BRANCH_TYPE;
	private String _LOCKER;
	private String _GOLD_COIN;
	private Date _LAST_MOD_TIME;
}