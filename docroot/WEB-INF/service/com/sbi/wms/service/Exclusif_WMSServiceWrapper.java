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

package com.sbi.wms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link Exclusif_WMSService}.
 * </p>
 *
 * @author    Syed
 * @see       Exclusif_WMSService
 * @generated
 */
public class Exclusif_WMSServiceWrapper implements Exclusif_WMSService,
	ServiceWrapper<Exclusif_WMSService> {
	public Exclusif_WMSServiceWrapper(Exclusif_WMSService exclusif_WMSService) {
		_exclusif_WMSService = exclusif_WMSService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _exclusif_WMSService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_exclusif_WMSService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _exclusif_WMSService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public Exclusif_WMSService getWrappedExclusif_WMSService() {
		return _exclusif_WMSService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedExclusif_WMSService(
		Exclusif_WMSService exclusif_WMSService) {
		_exclusif_WMSService = exclusif_WMSService;
	}

	public Exclusif_WMSService getWrappedService() {
		return _exclusif_WMSService;
	}

	public void setWrappedService(Exclusif_WMSService exclusif_WMSService) {
		_exclusif_WMSService = exclusif_WMSService;
	}

	private Exclusif_WMSService _exclusif_WMSService;
}