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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.sbi.wms.service.ClpSerializer;
import com.sbi.wms.service.WMS_INB_BRANCH_MASTERLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Syed
 */
public class WMS_INB_BRANCH_MASTERClp extends BaseModelImpl<WMS_INB_BRANCH_MASTER>
	implements WMS_INB_BRANCH_MASTER {
	public WMS_INB_BRANCH_MASTERClp() {
	}

	public Class<?> getModelClass() {
		return WMS_INB_BRANCH_MASTER.class;
	}

	public String getModelClassName() {
		return WMS_INB_BRANCH_MASTER.class.getName();
	}

	public long getPrimaryKey() {
		return _REC_ID;
	}

	public void setPrimaryKey(long primaryKey) {
		setREC_ID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_REC_ID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("REC_ID", getREC_ID());
		attributes.put("BRANCH_CODE", getBRANCH_CODE());
		attributes.put("BRANCH_NAME", getBRANCH_NAME());
		attributes.put("MAIL_ADDRESS1", getMAIL_ADDRESS1());
		attributes.put("MAIL_ADDRESS2", getMAIL_ADDRESS2());
		attributes.put("MAIL_ADDRESS3", getMAIL_ADDRESS3());
		attributes.put("CITY", getCITY());
		attributes.put("DISTRICT", getDISTRICT());
		attributes.put("STATE", getSTATE());
		attributes.put("PIN", getPIN());
		attributes.put("CIRCLE", getCIRCLE());
		attributes.put("FOREX_TYPE", getFOREX_TYPE());
		attributes.put("BRANCH_MANAGER", getBRANCH_MANAGER());
		attributes.put("NO_OF_ATM", getNO_OF_ATM());
		attributes.put("IFSC_CODE", getIFSC_CODE());
		attributes.put("STD_CODE", getSTD_CODE());
		attributes.put("TELEPHONE", getTELEPHONE());
		attributes.put("FAX_NO", getFAX_NO());
		attributes.put("EMAIL_ID", getEMAIL_ID());
		attributes.put("BUSSINESS_HOURS", getBUSSINESS_HOURS());
		attributes.put("WEEKLY_HOLIDAY", getWEEKLY_HOLIDAY());
		attributes.put("NON_BANKING_DAY", getNON_BANKING_DAY());
		attributes.put("SUNDAY_BANKING", getSUNDAY_BANKING());
		attributes.put("SUNDAY_BANKING_BUSSINESS", getSUNDAY_BANKING_BUSSINESS());
		attributes.put("SWIFT_ENABLED", getSWIFT_ENABLED());
		attributes.put("SWIFT_CODE", getSWIFT_CODE());
		attributes.put("BRANCH_TYPE", getBRANCH_TYPE());
		attributes.put("LOCKER", getLOCKER());
		attributes.put("GOLD_COIN", getGOLD_COIN());
		attributes.put("LAST_MOD_TIME", getLAST_MOD_TIME());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long REC_ID = (Long)attributes.get("REC_ID");

		if (REC_ID != null) {
			setREC_ID(REC_ID);
		}

		String BRANCH_CODE = (String)attributes.get("BRANCH_CODE");

		if (BRANCH_CODE != null) {
			setBRANCH_CODE(BRANCH_CODE);
		}

		String BRANCH_NAME = (String)attributes.get("BRANCH_NAME");

		if (BRANCH_NAME != null) {
			setBRANCH_NAME(BRANCH_NAME);
		}

		String MAIL_ADDRESS1 = (String)attributes.get("MAIL_ADDRESS1");

		if (MAIL_ADDRESS1 != null) {
			setMAIL_ADDRESS1(MAIL_ADDRESS1);
		}

		String MAIL_ADDRESS2 = (String)attributes.get("MAIL_ADDRESS2");

		if (MAIL_ADDRESS2 != null) {
			setMAIL_ADDRESS2(MAIL_ADDRESS2);
		}

		String MAIL_ADDRESS3 = (String)attributes.get("MAIL_ADDRESS3");

		if (MAIL_ADDRESS3 != null) {
			setMAIL_ADDRESS3(MAIL_ADDRESS3);
		}

		String CITY = (String)attributes.get("CITY");

		if (CITY != null) {
			setCITY(CITY);
		}

		String DISTRICT = (String)attributes.get("DISTRICT");

		if (DISTRICT != null) {
			setDISTRICT(DISTRICT);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		String PIN = (String)attributes.get("PIN");

		if (PIN != null) {
			setPIN(PIN);
		}

		String CIRCLE = (String)attributes.get("CIRCLE");

		if (CIRCLE != null) {
			setCIRCLE(CIRCLE);
		}

		String FOREX_TYPE = (String)attributes.get("FOREX_TYPE");

		if (FOREX_TYPE != null) {
			setFOREX_TYPE(FOREX_TYPE);
		}

		String BRANCH_MANAGER = (String)attributes.get("BRANCH_MANAGER");

		if (BRANCH_MANAGER != null) {
			setBRANCH_MANAGER(BRANCH_MANAGER);
		}

		String NO_OF_ATM = (String)attributes.get("NO_OF_ATM");

		if (NO_OF_ATM != null) {
			setNO_OF_ATM(NO_OF_ATM);
		}

		String IFSC_CODE = (String)attributes.get("IFSC_CODE");

		if (IFSC_CODE != null) {
			setIFSC_CODE(IFSC_CODE);
		}

		String STD_CODE = (String)attributes.get("STD_CODE");

		if (STD_CODE != null) {
			setSTD_CODE(STD_CODE);
		}

		String TELEPHONE = (String)attributes.get("TELEPHONE");

		if (TELEPHONE != null) {
			setTELEPHONE(TELEPHONE);
		}

		String FAX_NO = (String)attributes.get("FAX_NO");

		if (FAX_NO != null) {
			setFAX_NO(FAX_NO);
		}

		String EMAIL_ID = (String)attributes.get("EMAIL_ID");

		if (EMAIL_ID != null) {
			setEMAIL_ID(EMAIL_ID);
		}

		String BUSSINESS_HOURS = (String)attributes.get("BUSSINESS_HOURS");

		if (BUSSINESS_HOURS != null) {
			setBUSSINESS_HOURS(BUSSINESS_HOURS);
		}

		String WEEKLY_HOLIDAY = (String)attributes.get("WEEKLY_HOLIDAY");

		if (WEEKLY_HOLIDAY != null) {
			setWEEKLY_HOLIDAY(WEEKLY_HOLIDAY);
		}

		String NON_BANKING_DAY = (String)attributes.get("NON_BANKING_DAY");

		if (NON_BANKING_DAY != null) {
			setNON_BANKING_DAY(NON_BANKING_DAY);
		}

		String SUNDAY_BANKING = (String)attributes.get("SUNDAY_BANKING");

		if (SUNDAY_BANKING != null) {
			setSUNDAY_BANKING(SUNDAY_BANKING);
		}

		String SUNDAY_BANKING_BUSSINESS = (String)attributes.get(
				"SUNDAY_BANKING_BUSSINESS");

		if (SUNDAY_BANKING_BUSSINESS != null) {
			setSUNDAY_BANKING_BUSSINESS(SUNDAY_BANKING_BUSSINESS);
		}

		String SWIFT_ENABLED = (String)attributes.get("SWIFT_ENABLED");

		if (SWIFT_ENABLED != null) {
			setSWIFT_ENABLED(SWIFT_ENABLED);
		}

		String SWIFT_CODE = (String)attributes.get("SWIFT_CODE");

		if (SWIFT_CODE != null) {
			setSWIFT_CODE(SWIFT_CODE);
		}

		String BRANCH_TYPE = (String)attributes.get("BRANCH_TYPE");

		if (BRANCH_TYPE != null) {
			setBRANCH_TYPE(BRANCH_TYPE);
		}

		String LOCKER = (String)attributes.get("LOCKER");

		if (LOCKER != null) {
			setLOCKER(LOCKER);
		}

		String GOLD_COIN = (String)attributes.get("GOLD_COIN");

		if (GOLD_COIN != null) {
			setGOLD_COIN(GOLD_COIN);
		}

		Date LAST_MOD_TIME = (Date)attributes.get("LAST_MOD_TIME");

		if (LAST_MOD_TIME != null) {
			setLAST_MOD_TIME(LAST_MOD_TIME);
		}
	}

	public long getREC_ID() {
		return _REC_ID;
	}

	public void setREC_ID(long REC_ID) {
		_REC_ID = REC_ID;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setREC_ID", long.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, REC_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBRANCH_CODE() {
		return _BRANCH_CODE;
	}

	public void setBRANCH_CODE(String BRANCH_CODE) {
		_BRANCH_CODE = BRANCH_CODE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_CODE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, BRANCH_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBRANCH_NAME() {
		return _BRANCH_NAME;
	}

	public void setBRANCH_NAME(String BRANCH_NAME) {
		_BRANCH_NAME = BRANCH_NAME;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_NAME", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, BRANCH_NAME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getMAIL_ADDRESS1() {
		return _MAIL_ADDRESS1;
	}

	public void setMAIL_ADDRESS1(String MAIL_ADDRESS1) {
		_MAIL_ADDRESS1 = MAIL_ADDRESS1;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setMAIL_ADDRESS1", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, MAIL_ADDRESS1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getMAIL_ADDRESS2() {
		return _MAIL_ADDRESS2;
	}

	public void setMAIL_ADDRESS2(String MAIL_ADDRESS2) {
		_MAIL_ADDRESS2 = MAIL_ADDRESS2;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setMAIL_ADDRESS2", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, MAIL_ADDRESS2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getMAIL_ADDRESS3() {
		return _MAIL_ADDRESS3;
	}

	public void setMAIL_ADDRESS3(String MAIL_ADDRESS3) {
		_MAIL_ADDRESS3 = MAIL_ADDRESS3;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setMAIL_ADDRESS3", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, MAIL_ADDRESS3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getCITY() {
		return _CITY;
	}

	public void setCITY(String CITY) {
		_CITY = CITY;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setCITY", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, CITY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getDISTRICT() {
		return _DISTRICT;
	}

	public void setDISTRICT(String DISTRICT) {
		_DISTRICT = DISTRICT;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setDISTRICT", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, DISTRICT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getSTATE() {
		return _STATE;
	}

	public void setSTATE(String STATE) {
		_STATE = STATE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setSTATE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, STATE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getPIN() {
		return _PIN;
	}

	public void setPIN(String PIN) {
		_PIN = PIN;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setPIN", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, PIN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getCIRCLE() {
		return _CIRCLE;
	}

	public void setCIRCLE(String CIRCLE) {
		_CIRCLE = CIRCLE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setCIRCLE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, CIRCLE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getFOREX_TYPE() {
		return _FOREX_TYPE;
	}

	public void setFOREX_TYPE(String FOREX_TYPE) {
		_FOREX_TYPE = FOREX_TYPE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setFOREX_TYPE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, FOREX_TYPE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBRANCH_MANAGER() {
		return _BRANCH_MANAGER;
	}

	public void setBRANCH_MANAGER(String BRANCH_MANAGER) {
		_BRANCH_MANAGER = BRANCH_MANAGER;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_MANAGER",
						String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, BRANCH_MANAGER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getNO_OF_ATM() {
		return _NO_OF_ATM;
	}

	public void setNO_OF_ATM(String NO_OF_ATM) {
		_NO_OF_ATM = NO_OF_ATM;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setNO_OF_ATM", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, NO_OF_ATM);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getIFSC_CODE() {
		return _IFSC_CODE;
	}

	public void setIFSC_CODE(String IFSC_CODE) {
		_IFSC_CODE = IFSC_CODE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setIFSC_CODE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, IFSC_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getSTD_CODE() {
		return _STD_CODE;
	}

	public void setSTD_CODE(String STD_CODE) {
		_STD_CODE = STD_CODE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setSTD_CODE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, STD_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getTELEPHONE() {
		return _TELEPHONE;
	}

	public void setTELEPHONE(String TELEPHONE) {
		_TELEPHONE = TELEPHONE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setTELEPHONE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, TELEPHONE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getFAX_NO() {
		return _FAX_NO;
	}

	public void setFAX_NO(String FAX_NO) {
		_FAX_NO = FAX_NO;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setFAX_NO", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, FAX_NO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getEMAIL_ID() {
		return _EMAIL_ID;
	}

	public void setEMAIL_ID(String EMAIL_ID) {
		_EMAIL_ID = EMAIL_ID;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setEMAIL_ID", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, EMAIL_ID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBUSSINESS_HOURS() {
		return _BUSSINESS_HOURS;
	}

	public void setBUSSINESS_HOURS(String BUSSINESS_HOURS) {
		_BUSSINESS_HOURS = BUSSINESS_HOURS;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setBUSSINESS_HOURS",
						String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, BUSSINESS_HOURS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getWEEKLY_HOLIDAY() {
		return _WEEKLY_HOLIDAY;
	}

	public void setWEEKLY_HOLIDAY(String WEEKLY_HOLIDAY) {
		_WEEKLY_HOLIDAY = WEEKLY_HOLIDAY;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setWEEKLY_HOLIDAY",
						String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, WEEKLY_HOLIDAY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getNON_BANKING_DAY() {
		return _NON_BANKING_DAY;
	}

	public void setNON_BANKING_DAY(String NON_BANKING_DAY) {
		_NON_BANKING_DAY = NON_BANKING_DAY;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setNON_BANKING_DAY",
						String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, NON_BANKING_DAY);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getSUNDAY_BANKING() {
		return _SUNDAY_BANKING;
	}

	public void setSUNDAY_BANKING(String SUNDAY_BANKING) {
		_SUNDAY_BANKING = SUNDAY_BANKING;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setSUNDAY_BANKING",
						String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, SUNDAY_BANKING);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getSUNDAY_BANKING_BUSSINESS() {
		return _SUNDAY_BANKING_BUSSINESS;
	}

	public void setSUNDAY_BANKING_BUSSINESS(String SUNDAY_BANKING_BUSSINESS) {
		_SUNDAY_BANKING_BUSSINESS = SUNDAY_BANKING_BUSSINESS;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setSUNDAY_BANKING_BUSSINESS",
						String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel,
					SUNDAY_BANKING_BUSSINESS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getSWIFT_ENABLED() {
		return _SWIFT_ENABLED;
	}

	public void setSWIFT_ENABLED(String SWIFT_ENABLED) {
		_SWIFT_ENABLED = SWIFT_ENABLED;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setSWIFT_ENABLED", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, SWIFT_ENABLED);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getSWIFT_CODE() {
		return _SWIFT_CODE;
	}

	public void setSWIFT_CODE(String SWIFT_CODE) {
		_SWIFT_CODE = SWIFT_CODE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setSWIFT_CODE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, SWIFT_CODE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBRANCH_TYPE() {
		return _BRANCH_TYPE;
	}

	public void setBRANCH_TYPE(String BRANCH_TYPE) {
		_BRANCH_TYPE = BRANCH_TYPE;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setBRANCH_TYPE", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, BRANCH_TYPE);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getLOCKER() {
		return _LOCKER;
	}

	public void setLOCKER(String LOCKER) {
		_LOCKER = LOCKER;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setLOCKER", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, LOCKER);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getGOLD_COIN() {
		return _GOLD_COIN;
	}

	public void setGOLD_COIN(String GOLD_COIN) {
		_GOLD_COIN = GOLD_COIN;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setGOLD_COIN", String.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, GOLD_COIN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getLAST_MOD_TIME() {
		return _LAST_MOD_TIME;
	}

	public void setLAST_MOD_TIME(Date LAST_MOD_TIME) {
		_LAST_MOD_TIME = LAST_MOD_TIME;

		if (_wms_inb_branch_masterRemoteModel != null) {
			try {
				Class<?> clazz = _wms_inb_branch_masterRemoteModel.getClass();

				Method method = clazz.getMethod("setLAST_MOD_TIME", Date.class);

				method.invoke(_wms_inb_branch_masterRemoteModel, LAST_MOD_TIME);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWMS_INB_BRANCH_MASTERRemoteModel() {
		return _wms_inb_branch_masterRemoteModel;
	}

	public void setWMS_INB_BRANCH_MASTERRemoteModel(
		BaseModel<?> wms_inb_branch_masterRemoteModel) {
		_wms_inb_branch_masterRemoteModel = wms_inb_branch_masterRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _wms_inb_branch_masterRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_wms_inb_branch_masterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			WMS_INB_BRANCH_MASTERLocalServiceUtil.addWMS_INB_BRANCH_MASTER(this);
		}
		else {
			WMS_INB_BRANCH_MASTERLocalServiceUtil.updateWMS_INB_BRANCH_MASTER(this);
		}
	}

	@Override
	public WMS_INB_BRANCH_MASTER toEscapedModel() {
		return (WMS_INB_BRANCH_MASTER)ProxyUtil.newProxyInstance(WMS_INB_BRANCH_MASTER.class.getClassLoader(),
			new Class[] { WMS_INB_BRANCH_MASTER.class },
			new AutoEscapeBeanHandler(this));
	}

	public WMS_INB_BRANCH_MASTER toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		WMS_INB_BRANCH_MASTERClp clone = new WMS_INB_BRANCH_MASTERClp();

		clone.setREC_ID(getREC_ID());
		clone.setBRANCH_CODE(getBRANCH_CODE());
		clone.setBRANCH_NAME(getBRANCH_NAME());
		clone.setMAIL_ADDRESS1(getMAIL_ADDRESS1());
		clone.setMAIL_ADDRESS2(getMAIL_ADDRESS2());
		clone.setMAIL_ADDRESS3(getMAIL_ADDRESS3());
		clone.setCITY(getCITY());
		clone.setDISTRICT(getDISTRICT());
		clone.setSTATE(getSTATE());
		clone.setPIN(getPIN());
		clone.setCIRCLE(getCIRCLE());
		clone.setFOREX_TYPE(getFOREX_TYPE());
		clone.setBRANCH_MANAGER(getBRANCH_MANAGER());
		clone.setNO_OF_ATM(getNO_OF_ATM());
		clone.setIFSC_CODE(getIFSC_CODE());
		clone.setSTD_CODE(getSTD_CODE());
		clone.setTELEPHONE(getTELEPHONE());
		clone.setFAX_NO(getFAX_NO());
		clone.setEMAIL_ID(getEMAIL_ID());
		clone.setBUSSINESS_HOURS(getBUSSINESS_HOURS());
		clone.setWEEKLY_HOLIDAY(getWEEKLY_HOLIDAY());
		clone.setNON_BANKING_DAY(getNON_BANKING_DAY());
		clone.setSUNDAY_BANKING(getSUNDAY_BANKING());
		clone.setSUNDAY_BANKING_BUSSINESS(getSUNDAY_BANKING_BUSSINESS());
		clone.setSWIFT_ENABLED(getSWIFT_ENABLED());
		clone.setSWIFT_CODE(getSWIFT_CODE());
		clone.setBRANCH_TYPE(getBRANCH_TYPE());
		clone.setLOCKER(getLOCKER());
		clone.setGOLD_COIN(getGOLD_COIN());
		clone.setLAST_MOD_TIME(getLAST_MOD_TIME());

		return clone;
	}

	public int compareTo(WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		int value = 0;

		if (getREC_ID() < wms_inb_branch_master.getREC_ID()) {
			value = -1;
		}
		else if (getREC_ID() > wms_inb_branch_master.getREC_ID()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WMS_INB_BRANCH_MASTERClp)) {
			return false;
		}

		WMS_INB_BRANCH_MASTERClp wms_inb_branch_master = (WMS_INB_BRANCH_MASTERClp)obj;

		long primaryKey = wms_inb_branch_master.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{REC_ID=");
		sb.append(getREC_ID());
		sb.append(", BRANCH_CODE=");
		sb.append(getBRANCH_CODE());
		sb.append(", BRANCH_NAME=");
		sb.append(getBRANCH_NAME());
		sb.append(", MAIL_ADDRESS1=");
		sb.append(getMAIL_ADDRESS1());
		sb.append(", MAIL_ADDRESS2=");
		sb.append(getMAIL_ADDRESS2());
		sb.append(", MAIL_ADDRESS3=");
		sb.append(getMAIL_ADDRESS3());
		sb.append(", CITY=");
		sb.append(getCITY());
		sb.append(", DISTRICT=");
		sb.append(getDISTRICT());
		sb.append(", STATE=");
		sb.append(getSTATE());
		sb.append(", PIN=");
		sb.append(getPIN());
		sb.append(", CIRCLE=");
		sb.append(getCIRCLE());
		sb.append(", FOREX_TYPE=");
		sb.append(getFOREX_TYPE());
		sb.append(", BRANCH_MANAGER=");
		sb.append(getBRANCH_MANAGER());
		sb.append(", NO_OF_ATM=");
		sb.append(getNO_OF_ATM());
		sb.append(", IFSC_CODE=");
		sb.append(getIFSC_CODE());
		sb.append(", STD_CODE=");
		sb.append(getSTD_CODE());
		sb.append(", TELEPHONE=");
		sb.append(getTELEPHONE());
		sb.append(", FAX_NO=");
		sb.append(getFAX_NO());
		sb.append(", EMAIL_ID=");
		sb.append(getEMAIL_ID());
		sb.append(", BUSSINESS_HOURS=");
		sb.append(getBUSSINESS_HOURS());
		sb.append(", WEEKLY_HOLIDAY=");
		sb.append(getWEEKLY_HOLIDAY());
		sb.append(", NON_BANKING_DAY=");
		sb.append(getNON_BANKING_DAY());
		sb.append(", SUNDAY_BANKING=");
		sb.append(getSUNDAY_BANKING());
		sb.append(", SUNDAY_BANKING_BUSSINESS=");
		sb.append(getSUNDAY_BANKING_BUSSINESS());
		sb.append(", SWIFT_ENABLED=");
		sb.append(getSWIFT_ENABLED());
		sb.append(", SWIFT_CODE=");
		sb.append(getSWIFT_CODE());
		sb.append(", BRANCH_TYPE=");
		sb.append(getBRANCH_TYPE());
		sb.append(", LOCKER=");
		sb.append(getLOCKER());
		sb.append(", GOLD_COIN=");
		sb.append(getGOLD_COIN());
		sb.append(", LAST_MOD_TIME=");
		sb.append(getLAST_MOD_TIME());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(94);

		sb.append("<model><model-name>");
		sb.append("com.sbi.wms.model.WMS_INB_BRANCH_MASTER");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>REC_ID</column-name><column-value><![CDATA[");
		sb.append(getREC_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_CODE</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_NAME</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_NAME());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MAIL_ADDRESS1</column-name><column-value><![CDATA[");
		sb.append(getMAIL_ADDRESS1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MAIL_ADDRESS2</column-name><column-value><![CDATA[");
		sb.append(getMAIL_ADDRESS2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MAIL_ADDRESS3</column-name><column-value><![CDATA[");
		sb.append(getMAIL_ADDRESS3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CITY</column-name><column-value><![CDATA[");
		sb.append(getCITY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DISTRICT</column-name><column-value><![CDATA[");
		sb.append(getDISTRICT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STATE</column-name><column-value><![CDATA[");
		sb.append(getSTATE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PIN</column-name><column-value><![CDATA[");
		sb.append(getPIN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CIRCLE</column-name><column-value><![CDATA[");
		sb.append(getCIRCLE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FOREX_TYPE</column-name><column-value><![CDATA[");
		sb.append(getFOREX_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_MANAGER</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_MANAGER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NO_OF_ATM</column-name><column-value><![CDATA[");
		sb.append(getNO_OF_ATM());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>IFSC_CODE</column-name><column-value><![CDATA[");
		sb.append(getIFSC_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>STD_CODE</column-name><column-value><![CDATA[");
		sb.append(getSTD_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TELEPHONE</column-name><column-value><![CDATA[");
		sb.append(getTELEPHONE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FAX_NO</column-name><column-value><![CDATA[");
		sb.append(getFAX_NO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EMAIL_ID</column-name><column-value><![CDATA[");
		sb.append(getEMAIL_ID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BUSSINESS_HOURS</column-name><column-value><![CDATA[");
		sb.append(getBUSSINESS_HOURS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WEEKLY_HOLIDAY</column-name><column-value><![CDATA[");
		sb.append(getWEEKLY_HOLIDAY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NON_BANKING_DAY</column-name><column-value><![CDATA[");
		sb.append(getNON_BANKING_DAY());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUNDAY_BANKING</column-name><column-value><![CDATA[");
		sb.append(getSUNDAY_BANKING());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SUNDAY_BANKING_BUSSINESS</column-name><column-value><![CDATA[");
		sb.append(getSUNDAY_BANKING_BUSSINESS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SWIFT_ENABLED</column-name><column-value><![CDATA[");
		sb.append(getSWIFT_ENABLED());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SWIFT_CODE</column-name><column-value><![CDATA[");
		sb.append(getSWIFT_CODE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>BRANCH_TYPE</column-name><column-value><![CDATA[");
		sb.append(getBRANCH_TYPE());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LOCKER</column-name><column-value><![CDATA[");
		sb.append(getLOCKER());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>GOLD_COIN</column-name><column-value><![CDATA[");
		sb.append(getGOLD_COIN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LAST_MOD_TIME</column-name><column-value><![CDATA[");
		sb.append(getLAST_MOD_TIME());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _wms_inb_branch_masterRemoteModel;
}