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
 * This class is used by SOAP remote services, specifically {@link com.sbi.wms.service.http.Exclusif_WMSServiceSoap}.
 *
 * @author    Syed
 * @see       com.sbi.wms.service.http.Exclusif_WMSServiceSoap
 * @generated
 */
public class Exclusif_WMSSoap implements Serializable {
	public static Exclusif_WMSSoap toSoapModel(Exclusif_WMS model) {
		Exclusif_WMSSoap soapModel = new Exclusif_WMSSoap();

		soapModel.setRecId(model.getRecId());
		soapModel.setName(model.getName());
		soapModel.setCity(model.getCity());
		soapModel.setMobileno(model.getMobileno());
		soapModel.setEmail(model.getEmail());
		soapModel.setAgree(model.getAgree());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static Exclusif_WMSSoap[] toSoapModels(Exclusif_WMS[] models) {
		Exclusif_WMSSoap[] soapModels = new Exclusif_WMSSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Exclusif_WMSSoap[][] toSoapModels(Exclusif_WMS[][] models) {
		Exclusif_WMSSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Exclusif_WMSSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Exclusif_WMSSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Exclusif_WMSSoap[] toSoapModels(List<Exclusif_WMS> models) {
		List<Exclusif_WMSSoap> soapModels = new ArrayList<Exclusif_WMSSoap>(models.size());

		for (Exclusif_WMS model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Exclusif_WMSSoap[soapModels.size()]);
	}

	public Exclusif_WMSSoap() {
	}

	public long getPrimaryKey() {
		return _recId;
	}

	public void setPrimaryKey(long pk) {
		setRecId(pk);
	}

	public long getRecId() {
		return _recId;
	}

	public void setRecId(long recId) {
		_recId = recId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public long getMobileno() {
		return _mobileno;
	}

	public void setMobileno(long mobileno) {
		_mobileno = mobileno;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getAgree() {
		return _agree;
	}

	public void setAgree(String agree) {
		_agree = agree;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _recId;
	private String _name;
	private String _city;
	private long _mobileno;
	private String _email;
	private String _agree;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
}