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

package com.sbi.wms.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sbi.wms.model.WMS_INB_BRANCH_MASTER;

/**
 * The persistence interface for the w m s_ i n b_ b r a n c h_ m a s t e r service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTERPersistenceImpl
 * @see WMS_INB_BRANCH_MASTERUtil
 * @generated
 */
public interface WMS_INB_BRANCH_MASTERPersistence extends BasePersistence<WMS_INB_BRANCH_MASTER> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WMS_INB_BRANCH_MASTERUtil} to access the w m s_ i n b_ b r a n c h_ m a s t e r persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the w m s_ i n b_ b r a n c h_ m a s t e r in the entity cache if it is enabled.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public void cacheResult(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master);

	/**
	* Caches the w m s_ i n b_ b r a n c h_ m a s t e rs in the entity cache if it is enabled.
	*
	* @param wms_inb_branch_masters the w m s_ i n b_ b r a n c h_ m a s t e rs
	*/
	public void cacheResult(
		java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> wms_inb_branch_masters);

	/**
	* Creates a new w m s_ i n b_ b r a n c h_ m a s t e r with the primary key. Does not add the w m s_ i n b_ b r a n c h_ m a s t e r to the database.
	*
	* @param REC_ID the primary key for the new w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the new w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER create(long REC_ID);

	/**
	* Removes the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	* @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER remove(long REC_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException;

	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER updateImpl(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or throws a {@link com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException} if it could not be found.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r
	* @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER findByPrimaryKey(long REC_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException;

	/**
	* Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r, or <code>null</code> if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER fetchByPrimaryKey(
		long REC_ID) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* @return the w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @param end the upper bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs (not inclusive)
	* @return the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @param end the upper bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the w m s_ i n b_ b r a n c h_ m a s t e rs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* @return the number of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}