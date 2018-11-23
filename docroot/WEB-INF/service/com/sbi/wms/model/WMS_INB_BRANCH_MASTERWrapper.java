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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WMS_INB_BRANCH_MASTER}.
 * </p>
 *
 * @author    Syed
 * @see       WMS_INB_BRANCH_MASTER
 * @generated
 */
public class WMS_INB_BRANCH_MASTERWrapper implements WMS_INB_BRANCH_MASTER,
	ModelWrapper<WMS_INB_BRANCH_MASTER> {
	public WMS_INB_BRANCH_MASTERWrapper(
		WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		_wms_inb_branch_master = wms_inb_branch_master;
	}

	public Class<?> getModelClass() {
		return WMS_INB_BRANCH_MASTER.class;
	}

	public String getModelClassName() {
		return WMS_INB_BRANCH_MASTER.class.getName();
	}

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

	/**
	* Returns the primary key of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the primary key of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public long getPrimaryKey() {
		return _wms_inb_branch_master.getPrimaryKey();
	}

	/**
	* Sets the primary key of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param primaryKey the primary key of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setPrimaryKey(long primaryKey) {
		_wms_inb_branch_master.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the r e c_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the r e c_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public long getREC_ID() {
		return _wms_inb_branch_master.getREC_ID();
	}

	/**
	* Sets the r e c_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param REC_ID the r e c_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setREC_ID(long REC_ID) {
		_wms_inb_branch_master.setREC_ID(REC_ID);
	}

	/**
	* Returns the b r a n c h_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the b r a n c h_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getBRANCH_CODE() {
		return _wms_inb_branch_master.getBRANCH_CODE();
	}

	/**
	* Sets the b r a n c h_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param BRANCH_CODE the b r a n c h_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setBRANCH_CODE(java.lang.String BRANCH_CODE) {
		_wms_inb_branch_master.setBRANCH_CODE(BRANCH_CODE);
	}

	/**
	* Returns the b r a n c h_ n a m e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the b r a n c h_ n a m e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getBRANCH_NAME() {
		return _wms_inb_branch_master.getBRANCH_NAME();
	}

	/**
	* Sets the b r a n c h_ n a m e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param BRANCH_NAME the b r a n c h_ n a m e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setBRANCH_NAME(java.lang.String BRANCH_NAME) {
		_wms_inb_branch_master.setBRANCH_NAME(BRANCH_NAME);
	}

	/**
	* Returns the m a i l_ a d d r e s s1 of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the m a i l_ a d d r e s s1 of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getMAIL_ADDRESS1() {
		return _wms_inb_branch_master.getMAIL_ADDRESS1();
	}

	/**
	* Sets the m a i l_ a d d r e s s1 of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param MAIL_ADDRESS1 the m a i l_ a d d r e s s1 of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setMAIL_ADDRESS1(java.lang.String MAIL_ADDRESS1) {
		_wms_inb_branch_master.setMAIL_ADDRESS1(MAIL_ADDRESS1);
	}

	/**
	* Returns the m a i l_ a d d r e s s2 of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the m a i l_ a d d r e s s2 of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getMAIL_ADDRESS2() {
		return _wms_inb_branch_master.getMAIL_ADDRESS2();
	}

	/**
	* Sets the m a i l_ a d d r e s s2 of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param MAIL_ADDRESS2 the m a i l_ a d d r e s s2 of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setMAIL_ADDRESS2(java.lang.String MAIL_ADDRESS2) {
		_wms_inb_branch_master.setMAIL_ADDRESS2(MAIL_ADDRESS2);
	}

	/**
	* Returns the m a i l_ a d d r e s s3 of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the m a i l_ a d d r e s s3 of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getMAIL_ADDRESS3() {
		return _wms_inb_branch_master.getMAIL_ADDRESS3();
	}

	/**
	* Sets the m a i l_ a d d r e s s3 of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param MAIL_ADDRESS3 the m a i l_ a d d r e s s3 of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setMAIL_ADDRESS3(java.lang.String MAIL_ADDRESS3) {
		_wms_inb_branch_master.setMAIL_ADDRESS3(MAIL_ADDRESS3);
	}

	/**
	* Returns the c i t y of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the c i t y of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getCITY() {
		return _wms_inb_branch_master.getCITY();
	}

	/**
	* Sets the c i t y of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param CITY the c i t y of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setCITY(java.lang.String CITY) {
		_wms_inb_branch_master.setCITY(CITY);
	}

	/**
	* Returns the d i s t r i c t of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the d i s t r i c t of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getDISTRICT() {
		return _wms_inb_branch_master.getDISTRICT();
	}

	/**
	* Sets the d i s t r i c t of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param DISTRICT the d i s t r i c t of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setDISTRICT(java.lang.String DISTRICT) {
		_wms_inb_branch_master.setDISTRICT(DISTRICT);
	}

	/**
	* Returns the s t a t e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the s t a t e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getSTATE() {
		return _wms_inb_branch_master.getSTATE();
	}

	/**
	* Sets the s t a t e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param STATE the s t a t e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setSTATE(java.lang.String STATE) {
		_wms_inb_branch_master.setSTATE(STATE);
	}

	/**
	* Returns the p i n of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the p i n of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getPIN() {
		return _wms_inb_branch_master.getPIN();
	}

	/**
	* Sets the p i n of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param PIN the p i n of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setPIN(java.lang.String PIN) {
		_wms_inb_branch_master.setPIN(PIN);
	}

	/**
	* Returns the c i r c l e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the c i r c l e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getCIRCLE() {
		return _wms_inb_branch_master.getCIRCLE();
	}

	/**
	* Sets the c i r c l e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param CIRCLE the c i r c l e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setCIRCLE(java.lang.String CIRCLE) {
		_wms_inb_branch_master.setCIRCLE(CIRCLE);
	}

	/**
	* Returns the f o r e x_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the f o r e x_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getFOREX_TYPE() {
		return _wms_inb_branch_master.getFOREX_TYPE();
	}

	/**
	* Sets the f o r e x_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param FOREX_TYPE the f o r e x_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setFOREX_TYPE(java.lang.String FOREX_TYPE) {
		_wms_inb_branch_master.setFOREX_TYPE(FOREX_TYPE);
	}

	/**
	* Returns the b r a n c h_ m a n a g e r of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the b r a n c h_ m a n a g e r of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getBRANCH_MANAGER() {
		return _wms_inb_branch_master.getBRANCH_MANAGER();
	}

	/**
	* Sets the b r a n c h_ m a n a g e r of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param BRANCH_MANAGER the b r a n c h_ m a n a g e r of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setBRANCH_MANAGER(java.lang.String BRANCH_MANAGER) {
		_wms_inb_branch_master.setBRANCH_MANAGER(BRANCH_MANAGER);
	}

	/**
	* Returns the n o_ o f_ a t m of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the n o_ o f_ a t m of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getNO_OF_ATM() {
		return _wms_inb_branch_master.getNO_OF_ATM();
	}

	/**
	* Sets the n o_ o f_ a t m of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param NO_OF_ATM the n o_ o f_ a t m of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setNO_OF_ATM(java.lang.String NO_OF_ATM) {
		_wms_inb_branch_master.setNO_OF_ATM(NO_OF_ATM);
	}

	/**
	* Returns the i f s c_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the i f s c_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getIFSC_CODE() {
		return _wms_inb_branch_master.getIFSC_CODE();
	}

	/**
	* Sets the i f s c_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param IFSC_CODE the i f s c_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setIFSC_CODE(java.lang.String IFSC_CODE) {
		_wms_inb_branch_master.setIFSC_CODE(IFSC_CODE);
	}

	/**
	* Returns the s t d_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the s t d_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getSTD_CODE() {
		return _wms_inb_branch_master.getSTD_CODE();
	}

	/**
	* Sets the s t d_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param STD_CODE the s t d_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setSTD_CODE(java.lang.String STD_CODE) {
		_wms_inb_branch_master.setSTD_CODE(STD_CODE);
	}

	/**
	* Returns the t e l e p h o n e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the t e l e p h o n e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getTELEPHONE() {
		return _wms_inb_branch_master.getTELEPHONE();
	}

	/**
	* Sets the t e l e p h o n e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param TELEPHONE the t e l e p h o n e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setTELEPHONE(java.lang.String TELEPHONE) {
		_wms_inb_branch_master.setTELEPHONE(TELEPHONE);
	}

	/**
	* Returns the f a x_ n o of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the f a x_ n o of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getFAX_NO() {
		return _wms_inb_branch_master.getFAX_NO();
	}

	/**
	* Sets the f a x_ n o of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param FAX_NO the f a x_ n o of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setFAX_NO(java.lang.String FAX_NO) {
		_wms_inb_branch_master.setFAX_NO(FAX_NO);
	}

	/**
	* Returns the e m a i l_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the e m a i l_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getEMAIL_ID() {
		return _wms_inb_branch_master.getEMAIL_ID();
	}

	/**
	* Sets the e m a i l_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param EMAIL_ID the e m a i l_ i d of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setEMAIL_ID(java.lang.String EMAIL_ID) {
		_wms_inb_branch_master.setEMAIL_ID(EMAIL_ID);
	}

	/**
	* Returns the b u s s i n e s s_ h o u r s of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the b u s s i n e s s_ h o u r s of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getBUSSINESS_HOURS() {
		return _wms_inb_branch_master.getBUSSINESS_HOURS();
	}

	/**
	* Sets the b u s s i n e s s_ h o u r s of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param BUSSINESS_HOURS the b u s s i n e s s_ h o u r s of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setBUSSINESS_HOURS(java.lang.String BUSSINESS_HOURS) {
		_wms_inb_branch_master.setBUSSINESS_HOURS(BUSSINESS_HOURS);
	}

	/**
	* Returns the w e e k l y_ h o l i d a y of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the w e e k l y_ h o l i d a y of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getWEEKLY_HOLIDAY() {
		return _wms_inb_branch_master.getWEEKLY_HOLIDAY();
	}

	/**
	* Sets the w e e k l y_ h o l i d a y of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param WEEKLY_HOLIDAY the w e e k l y_ h o l i d a y of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setWEEKLY_HOLIDAY(java.lang.String WEEKLY_HOLIDAY) {
		_wms_inb_branch_master.setWEEKLY_HOLIDAY(WEEKLY_HOLIDAY);
	}

	/**
	* Returns the n o n_ b a n k i n g_ d a y of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the n o n_ b a n k i n g_ d a y of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getNON_BANKING_DAY() {
		return _wms_inb_branch_master.getNON_BANKING_DAY();
	}

	/**
	* Sets the n o n_ b a n k i n g_ d a y of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param NON_BANKING_DAY the n o n_ b a n k i n g_ d a y of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setNON_BANKING_DAY(java.lang.String NON_BANKING_DAY) {
		_wms_inb_branch_master.setNON_BANKING_DAY(NON_BANKING_DAY);
	}

	/**
	* Returns the s u n d a y_ b a n k i n g of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the s u n d a y_ b a n k i n g of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getSUNDAY_BANKING() {
		return _wms_inb_branch_master.getSUNDAY_BANKING();
	}

	/**
	* Sets the s u n d a y_ b a n k i n g of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param SUNDAY_BANKING the s u n d a y_ b a n k i n g of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setSUNDAY_BANKING(java.lang.String SUNDAY_BANKING) {
		_wms_inb_branch_master.setSUNDAY_BANKING(SUNDAY_BANKING);
	}

	/**
	* Returns the s u n d a y_ b a n k i n g_ b u s s i n e s s of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the s u n d a y_ b a n k i n g_ b u s s i n e s s of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getSUNDAY_BANKING_BUSSINESS() {
		return _wms_inb_branch_master.getSUNDAY_BANKING_BUSSINESS();
	}

	/**
	* Sets the s u n d a y_ b a n k i n g_ b u s s i n e s s of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param SUNDAY_BANKING_BUSSINESS the s u n d a y_ b a n k i n g_ b u s s i n e s s of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setSUNDAY_BANKING_BUSSINESS(
		java.lang.String SUNDAY_BANKING_BUSSINESS) {
		_wms_inb_branch_master.setSUNDAY_BANKING_BUSSINESS(SUNDAY_BANKING_BUSSINESS);
	}

	/**
	* Returns the s w i f t_ e n a b l e d of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the s w i f t_ e n a b l e d of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getSWIFT_ENABLED() {
		return _wms_inb_branch_master.getSWIFT_ENABLED();
	}

	/**
	* Sets the s w i f t_ e n a b l e d of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param SWIFT_ENABLED the s w i f t_ e n a b l e d of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setSWIFT_ENABLED(java.lang.String SWIFT_ENABLED) {
		_wms_inb_branch_master.setSWIFT_ENABLED(SWIFT_ENABLED);
	}

	/**
	* Returns the s w i f t_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the s w i f t_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getSWIFT_CODE() {
		return _wms_inb_branch_master.getSWIFT_CODE();
	}

	/**
	* Sets the s w i f t_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param SWIFT_CODE the s w i f t_ c o d e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setSWIFT_CODE(java.lang.String SWIFT_CODE) {
		_wms_inb_branch_master.setSWIFT_CODE(SWIFT_CODE);
	}

	/**
	* Returns the b r a n c h_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the b r a n c h_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getBRANCH_TYPE() {
		return _wms_inb_branch_master.getBRANCH_TYPE();
	}

	/**
	* Sets the b r a n c h_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param BRANCH_TYPE the b r a n c h_ t y p e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setBRANCH_TYPE(java.lang.String BRANCH_TYPE) {
		_wms_inb_branch_master.setBRANCH_TYPE(BRANCH_TYPE);
	}

	/**
	* Returns the l o c k e r of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the l o c k e r of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getLOCKER() {
		return _wms_inb_branch_master.getLOCKER();
	}

	/**
	* Sets the l o c k e r of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param LOCKER the l o c k e r of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setLOCKER(java.lang.String LOCKER) {
		_wms_inb_branch_master.setLOCKER(LOCKER);
	}

	/**
	* Returns the g o l d_ c o i n of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the g o l d_ c o i n of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.lang.String getGOLD_COIN() {
		return _wms_inb_branch_master.getGOLD_COIN();
	}

	/**
	* Sets the g o l d_ c o i n of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param GOLD_COIN the g o l d_ c o i n of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setGOLD_COIN(java.lang.String GOLD_COIN) {
		_wms_inb_branch_master.setGOLD_COIN(GOLD_COIN);
	}

	/**
	* Returns the l a s t_ m o d_ t i m e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @return the l a s t_ m o d_ t i m e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public java.util.Date getLAST_MOD_TIME() {
		return _wms_inb_branch_master.getLAST_MOD_TIME();
	}

	/**
	* Sets the l a s t_ m o d_ t i m e of this w m s_ i n b_ b r a n c h_ m a s t e r.
	*
	* @param LAST_MOD_TIME the l a s t_ m o d_ t i m e of this w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void setLAST_MOD_TIME(java.util.Date LAST_MOD_TIME) {
		_wms_inb_branch_master.setLAST_MOD_TIME(LAST_MOD_TIME);
	}

	public boolean isNew() {
		return _wms_inb_branch_master.isNew();
	}

	public void setNew(boolean n) {
		_wms_inb_branch_master.setNew(n);
	}

	public boolean isCachedModel() {
		return _wms_inb_branch_master.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_wms_inb_branch_master.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _wms_inb_branch_master.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _wms_inb_branch_master.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wms_inb_branch_master.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wms_inb_branch_master.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wms_inb_branch_master.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WMS_INB_BRANCH_MASTERWrapper((WMS_INB_BRANCH_MASTER)_wms_inb_branch_master.clone());
	}

	public int compareTo(WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		return _wms_inb_branch_master.compareTo(wms_inb_branch_master);
	}

	@Override
	public int hashCode() {
		return _wms_inb_branch_master.hashCode();
	}

	public com.liferay.portal.model.CacheModel<WMS_INB_BRANCH_MASTER> toCacheModel() {
		return _wms_inb_branch_master.toCacheModel();
	}

	public WMS_INB_BRANCH_MASTER toEscapedModel() {
		return new WMS_INB_BRANCH_MASTERWrapper(_wms_inb_branch_master.toEscapedModel());
	}

	public WMS_INB_BRANCH_MASTER toUnescapedModel() {
		return new WMS_INB_BRANCH_MASTERWrapper(_wms_inb_branch_master.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wms_inb_branch_master.toString();
	}

	public java.lang.String toXmlString() {
		return _wms_inb_branch_master.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wms_inb_branch_master.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WMS_INB_BRANCH_MASTERWrapper)) {
			return false;
		}

		WMS_INB_BRANCH_MASTERWrapper wms_inb_branch_masterWrapper = (WMS_INB_BRANCH_MASTERWrapper)obj;

		if (Validator.equals(_wms_inb_branch_master,
					wms_inb_branch_masterWrapper._wms_inb_branch_master)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public WMS_INB_BRANCH_MASTER getWrappedWMS_INB_BRANCH_MASTER() {
		return _wms_inb_branch_master;
	}

	public WMS_INB_BRANCH_MASTER getWrappedModel() {
		return _wms_inb_branch_master;
	}

	public void resetOriginalValues() {
		_wms_inb_branch_master.resetOriginalValues();
	}

	private WMS_INB_BRANCH_MASTER _wms_inb_branch_master;
}