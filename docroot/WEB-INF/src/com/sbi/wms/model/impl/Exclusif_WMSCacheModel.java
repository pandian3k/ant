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

import com.sbi.wms.model.Exclusif_WMS;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Exclusif_WMS in entity cache.
 *
 * @author Syed
 * @see Exclusif_WMS
 * @generated
 */
public class Exclusif_WMSCacheModel implements CacheModel<Exclusif_WMS>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{recId=");
		sb.append(recId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", city=");
		sb.append(city);
		sb.append(", mobileno=");
		sb.append(mobileno);
		sb.append(", email=");
		sb.append(email);
		sb.append(", agree=");
		sb.append(agree);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	public Exclusif_WMS toEntityModel() {
		Exclusif_WMSImpl exclusif_WMSImpl = new Exclusif_WMSImpl();

		exclusif_WMSImpl.setRecId(recId);

		if (name == null) {
			exclusif_WMSImpl.setName(StringPool.BLANK);
		}
		else {
			exclusif_WMSImpl.setName(name);
		}

		if (city == null) {
			exclusif_WMSImpl.setCity(StringPool.BLANK);
		}
		else {
			exclusif_WMSImpl.setCity(city);
		}

		exclusif_WMSImpl.setMobileno(mobileno);

		if (email == null) {
			exclusif_WMSImpl.setEmail(StringPool.BLANK);
		}
		else {
			exclusif_WMSImpl.setEmail(email);
		}

		if (agree == null) {
			exclusif_WMSImpl.setAgree(StringPool.BLANK);
		}
		else {
			exclusif_WMSImpl.setAgree(agree);
		}

		exclusif_WMSImpl.setCompanyId(companyId);
		exclusif_WMSImpl.setGroupId(groupId);
		exclusif_WMSImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			exclusif_WMSImpl.setCreateDate(null);
		}
		else {
			exclusif_WMSImpl.setCreateDate(new Date(createDate));
		}

		exclusif_WMSImpl.resetOriginalValues();

		return exclusif_WMSImpl;
	}

	public long recId;
	public String name;
	public String city;
	public long mobileno;
	public String email;
	public String agree;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
}