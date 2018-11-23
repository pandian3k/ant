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

package com.sbi.wms.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sbi.wms.model.WMS_INB_BRANCH_MASTER;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing WMS_INB_BRANCH_MASTER in entity cache.
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTER
 * @generated
 */
public class WMS_INB_BRANCH_MASTERCacheModel implements CacheModel<WMS_INB_BRANCH_MASTER>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{REC_ID=");
		sb.append(REC_ID);
		sb.append(", BRANCH_CODE=");
		sb.append(BRANCH_CODE);
		sb.append(", BRANCH_NAME=");
		sb.append(BRANCH_NAME);
		sb.append(", MAIL_ADDRESS1=");
		sb.append(MAIL_ADDRESS1);
		sb.append(", MAIL_ADDRESS2=");
		sb.append(MAIL_ADDRESS2);
		sb.append(", MAIL_ADDRESS3=");
		sb.append(MAIL_ADDRESS3);
		sb.append(", CITY=");
		sb.append(CITY);
		sb.append(", DISTRICT=");
		sb.append(DISTRICT);
		sb.append(", STATE=");
		sb.append(STATE);
		sb.append(", PIN=");
		sb.append(PIN);
		sb.append(", CIRCLE=");
		sb.append(CIRCLE);
		sb.append(", FOREX_TYPE=");
		sb.append(FOREX_TYPE);
		sb.append(", BRANCH_MANAGER=");
		sb.append(BRANCH_MANAGER);
		sb.append(", NO_OF_ATM=");
		sb.append(NO_OF_ATM);
		sb.append(", IFSC_CODE=");
		sb.append(IFSC_CODE);
		sb.append(", STD_CODE=");
		sb.append(STD_CODE);
		sb.append(", TELEPHONE=");
		sb.append(TELEPHONE);
		sb.append(", FAX_NO=");
		sb.append(FAX_NO);
		sb.append(", EMAIL_ID=");
		sb.append(EMAIL_ID);
		sb.append(", BUSSINESS_HOURS=");
		sb.append(BUSSINESS_HOURS);
		sb.append(", WEEKLY_HOLIDAY=");
		sb.append(WEEKLY_HOLIDAY);
		sb.append(", NON_BANKING_DAY=");
		sb.append(NON_BANKING_DAY);
		sb.append(", SUNDAY_BANKING=");
		sb.append(SUNDAY_BANKING);
		sb.append(", SUNDAY_BANKING_BUSSINESS=");
		sb.append(SUNDAY_BANKING_BUSSINESS);
		sb.append(", SWIFT_ENABLED=");
		sb.append(SWIFT_ENABLED);
		sb.append(", SWIFT_CODE=");
		sb.append(SWIFT_CODE);
		sb.append(", BRANCH_TYPE=");
		sb.append(BRANCH_TYPE);
		sb.append(", LOCKER=");
		sb.append(LOCKER);
		sb.append(", GOLD_COIN=");
		sb.append(GOLD_COIN);
		sb.append(", LAST_MOD_TIME=");
		sb.append(LAST_MOD_TIME);
		sb.append("}");

		return sb.toString();
	}

	public WMS_INB_BRANCH_MASTER toEntityModel() {
		WMS_INB_BRANCH_MASTERImpl wms_inb_branch_masterImpl = new WMS_INB_BRANCH_MASTERImpl();

		wms_inb_branch_masterImpl.setREC_ID(REC_ID);

		if (BRANCH_CODE == null) {
			wms_inb_branch_masterImpl.setBRANCH_CODE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setBRANCH_CODE(BRANCH_CODE);
		}

		if (BRANCH_NAME == null) {
			wms_inb_branch_masterImpl.setBRANCH_NAME(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setBRANCH_NAME(BRANCH_NAME);
		}

		if (MAIL_ADDRESS1 == null) {
			wms_inb_branch_masterImpl.setMAIL_ADDRESS1(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setMAIL_ADDRESS1(MAIL_ADDRESS1);
		}

		if (MAIL_ADDRESS2 == null) {
			wms_inb_branch_masterImpl.setMAIL_ADDRESS2(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setMAIL_ADDRESS2(MAIL_ADDRESS2);
		}

		if (MAIL_ADDRESS3 == null) {
			wms_inb_branch_masterImpl.setMAIL_ADDRESS3(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setMAIL_ADDRESS3(MAIL_ADDRESS3);
		}

		if (CITY == null) {
			wms_inb_branch_masterImpl.setCITY(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setCITY(CITY);
		}

		if (DISTRICT == null) {
			wms_inb_branch_masterImpl.setDISTRICT(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setDISTRICT(DISTRICT);
		}

		if (STATE == null) {
			wms_inb_branch_masterImpl.setSTATE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setSTATE(STATE);
		}

		if (PIN == null) {
			wms_inb_branch_masterImpl.setPIN(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setPIN(PIN);
		}

		if (CIRCLE == null) {
			wms_inb_branch_masterImpl.setCIRCLE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setCIRCLE(CIRCLE);
		}

		if (FOREX_TYPE == null) {
			wms_inb_branch_masterImpl.setFOREX_TYPE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setFOREX_TYPE(FOREX_TYPE);
		}

		if (BRANCH_MANAGER == null) {
			wms_inb_branch_masterImpl.setBRANCH_MANAGER(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setBRANCH_MANAGER(BRANCH_MANAGER);
		}

		if (NO_OF_ATM == null) {
			wms_inb_branch_masterImpl.setNO_OF_ATM(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setNO_OF_ATM(NO_OF_ATM);
		}

		if (IFSC_CODE == null) {
			wms_inb_branch_masterImpl.setIFSC_CODE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setIFSC_CODE(IFSC_CODE);
		}

		if (STD_CODE == null) {
			wms_inb_branch_masterImpl.setSTD_CODE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setSTD_CODE(STD_CODE);
		}

		if (TELEPHONE == null) {
			wms_inb_branch_masterImpl.setTELEPHONE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setTELEPHONE(TELEPHONE);
		}

		if (FAX_NO == null) {
			wms_inb_branch_masterImpl.setFAX_NO(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setFAX_NO(FAX_NO);
		}

		if (EMAIL_ID == null) {
			wms_inb_branch_masterImpl.setEMAIL_ID(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setEMAIL_ID(EMAIL_ID);
		}

		if (BUSSINESS_HOURS == null) {
			wms_inb_branch_masterImpl.setBUSSINESS_HOURS(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setBUSSINESS_HOURS(BUSSINESS_HOURS);
		}

		if (WEEKLY_HOLIDAY == null) {
			wms_inb_branch_masterImpl.setWEEKLY_HOLIDAY(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setWEEKLY_HOLIDAY(WEEKLY_HOLIDAY);
		}

		if (NON_BANKING_DAY == null) {
			wms_inb_branch_masterImpl.setNON_BANKING_DAY(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setNON_BANKING_DAY(NON_BANKING_DAY);
		}

		if (SUNDAY_BANKING == null) {
			wms_inb_branch_masterImpl.setSUNDAY_BANKING(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setSUNDAY_BANKING(SUNDAY_BANKING);
		}

		if (SUNDAY_BANKING_BUSSINESS == null) {
			wms_inb_branch_masterImpl.setSUNDAY_BANKING_BUSSINESS(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setSUNDAY_BANKING_BUSSINESS(SUNDAY_BANKING_BUSSINESS);
		}

		if (SWIFT_ENABLED == null) {
			wms_inb_branch_masterImpl.setSWIFT_ENABLED(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setSWIFT_ENABLED(SWIFT_ENABLED);
		}

		if (SWIFT_CODE == null) {
			wms_inb_branch_masterImpl.setSWIFT_CODE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setSWIFT_CODE(SWIFT_CODE);
		}

		if (BRANCH_TYPE == null) {
			wms_inb_branch_masterImpl.setBRANCH_TYPE(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setBRANCH_TYPE(BRANCH_TYPE);
		}

		if (LOCKER == null) {
			wms_inb_branch_masterImpl.setLOCKER(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setLOCKER(LOCKER);
		}

		if (GOLD_COIN == null) {
			wms_inb_branch_masterImpl.setGOLD_COIN(StringPool.BLANK);
		}
		else {
			wms_inb_branch_masterImpl.setGOLD_COIN(GOLD_COIN);
		}

		if (LAST_MOD_TIME == Long.MIN_VALUE) {
			wms_inb_branch_masterImpl.setLAST_MOD_TIME(null);
		}
		else {
			wms_inb_branch_masterImpl.setLAST_MOD_TIME(new Date(LAST_MOD_TIME));
		}

		wms_inb_branch_masterImpl.resetOriginalValues();

		return wms_inb_branch_masterImpl;
	}

	public long REC_ID;
	public String BRANCH_CODE;
	public String BRANCH_NAME;
	public String MAIL_ADDRESS1;
	public String MAIL_ADDRESS2;
	public String MAIL_ADDRESS3;
	public String CITY;
	public String DISTRICT;
	public String STATE;
	public String PIN;
	public String CIRCLE;
	public String FOREX_TYPE;
	public String BRANCH_MANAGER;
	public String NO_OF_ATM;
	public String IFSC_CODE;
	public String STD_CODE;
	public String TELEPHONE;
	public String FAX_NO;
	public String EMAIL_ID;
	public String BUSSINESS_HOURS;
	public String WEEKLY_HOLIDAY;
	public String NON_BANKING_DAY;
	public String SUNDAY_BANKING;
	public String SUNDAY_BANKING_BUSSINESS;
	public String SWIFT_ENABLED;
	public String SWIFT_CODE;
	public String BRANCH_TYPE;
	public String LOCKER;
	public String GOLD_COIN;
	public long LAST_MOD_TIME;
}