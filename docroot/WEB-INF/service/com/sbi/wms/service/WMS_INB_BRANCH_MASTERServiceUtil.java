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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the w m s_ i n b_ b r a n c h_ m a s t e r remote service. This utility wraps {@link com.sbi.wms.service.impl.WMS_INB_BRANCH_MASTERServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTERService
 * @see com.sbi.wms.service.base.WMS_INB_BRANCH_MASTERServiceBaseImpl
 * @see com.sbi.wms.service.impl.WMS_INB_BRANCH_MASTERServiceImpl
 * @generated
 */
public class WMS_INB_BRANCH_MASTERServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.sbi.wms.service.impl.WMS_INB_BRANCH_MASTERServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static WMS_INB_BRANCH_MASTERService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					WMS_INB_BRANCH_MASTERService.class.getName());

			if (invokableService instanceof WMS_INB_BRANCH_MASTERService) {
				_service = (WMS_INB_BRANCH_MASTERService)invokableService;
			}
			else {
				_service = new WMS_INB_BRANCH_MASTERServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(WMS_INB_BRANCH_MASTERServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(WMS_INB_BRANCH_MASTERService service) {
	}

	private static WMS_INB_BRANCH_MASTERService _service;
}