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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sbi.wms.NoSuchExclusif_WMSException;
import com.sbi.wms.model.Exclusif_WMS;
import com.sbi.wms.model.impl.Exclusif_WMSImpl;
import com.sbi.wms.model.impl.Exclusif_WMSModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the exclusif_ w m s service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Syed
 * @see Exclusif_WMSPersistence
 * @see Exclusif_WMSUtil
 * @generated
 */
public class Exclusif_WMSPersistenceImpl extends BasePersistenceImpl<Exclusif_WMS>
	implements Exclusif_WMSPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Exclusif_WMSUtil} to access the exclusif_ w m s persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Exclusif_WMSImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
			Exclusif_WMSModelImpl.FINDER_CACHE_ENABLED, Exclusif_WMSImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
			Exclusif_WMSModelImpl.FINDER_CACHE_ENABLED, Exclusif_WMSImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
			Exclusif_WMSModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the exclusif_ w m s in the entity cache if it is enabled.
	 *
	 * @param exclusif_WMS the exclusif_ w m s
	 */
	public void cacheResult(Exclusif_WMS exclusif_WMS) {
		EntityCacheUtil.putResult(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
			Exclusif_WMSImpl.class, exclusif_WMS.getPrimaryKey(), exclusif_WMS);

		exclusif_WMS.resetOriginalValues();
	}

	/**
	 * Caches the exclusif_ w m ses in the entity cache if it is enabled.
	 *
	 * @param exclusif_WMSs the exclusif_ w m ses
	 */
	public void cacheResult(List<Exclusif_WMS> exclusif_WMSs) {
		for (Exclusif_WMS exclusif_WMS : exclusif_WMSs) {
			if (EntityCacheUtil.getResult(
						Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
						Exclusif_WMSImpl.class, exclusif_WMS.getPrimaryKey()) == null) {
				cacheResult(exclusif_WMS);
			}
			else {
				exclusif_WMS.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all exclusif_ w m ses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(Exclusif_WMSImpl.class.getName());
		}

		EntityCacheUtil.clearCache(Exclusif_WMSImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the exclusif_ w m s.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Exclusif_WMS exclusif_WMS) {
		EntityCacheUtil.removeResult(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
			Exclusif_WMSImpl.class, exclusif_WMS.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Exclusif_WMS> exclusif_WMSs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Exclusif_WMS exclusif_WMS : exclusif_WMSs) {
			EntityCacheUtil.removeResult(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
				Exclusif_WMSImpl.class, exclusif_WMS.getPrimaryKey());
		}
	}

	/**
	 * Creates a new exclusif_ w m s with the primary key. Does not add the exclusif_ w m s to the database.
	 *
	 * @param recId the primary key for the new exclusif_ w m s
	 * @return the new exclusif_ w m s
	 */
	public Exclusif_WMS create(long recId) {
		Exclusif_WMS exclusif_WMS = new Exclusif_WMSImpl();

		exclusif_WMS.setNew(true);
		exclusif_WMS.setPrimaryKey(recId);

		return exclusif_WMS;
	}

	/**
	 * Removes the exclusif_ w m s with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recId the primary key of the exclusif_ w m s
	 * @return the exclusif_ w m s that was removed
	 * @throws com.sbi.wms.NoSuchExclusif_WMSException if a exclusif_ w m s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Exclusif_WMS remove(long recId)
		throws NoSuchExclusif_WMSException, SystemException {
		return remove(Long.valueOf(recId));
	}

	/**
	 * Removes the exclusif_ w m s with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the exclusif_ w m s
	 * @return the exclusif_ w m s that was removed
	 * @throws com.sbi.wms.NoSuchExclusif_WMSException if a exclusif_ w m s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Exclusif_WMS remove(Serializable primaryKey)
		throws NoSuchExclusif_WMSException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Exclusif_WMS exclusif_WMS = (Exclusif_WMS)session.get(Exclusif_WMSImpl.class,
					primaryKey);

			if (exclusif_WMS == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExclusif_WMSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(exclusif_WMS);
		}
		catch (NoSuchExclusif_WMSException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Exclusif_WMS removeImpl(Exclusif_WMS exclusif_WMS)
		throws SystemException {
		exclusif_WMS = toUnwrappedModel(exclusif_WMS);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, exclusif_WMS);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(exclusif_WMS);

		return exclusif_WMS;
	}

	@Override
	public Exclusif_WMS updateImpl(
		com.sbi.wms.model.Exclusif_WMS exclusif_WMS, boolean merge)
		throws SystemException {
		exclusif_WMS = toUnwrappedModel(exclusif_WMS);

		boolean isNew = exclusif_WMS.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, exclusif_WMS, merge);

			exclusif_WMS.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
			Exclusif_WMSImpl.class, exclusif_WMS.getPrimaryKey(), exclusif_WMS);

		return exclusif_WMS;
	}

	protected Exclusif_WMS toUnwrappedModel(Exclusif_WMS exclusif_WMS) {
		if (exclusif_WMS instanceof Exclusif_WMSImpl) {
			return exclusif_WMS;
		}

		Exclusif_WMSImpl exclusif_WMSImpl = new Exclusif_WMSImpl();

		exclusif_WMSImpl.setNew(exclusif_WMS.isNew());
		exclusif_WMSImpl.setPrimaryKey(exclusif_WMS.getPrimaryKey());

		exclusif_WMSImpl.setRecId(exclusif_WMS.getRecId());
		exclusif_WMSImpl.setName(exclusif_WMS.getName());
		exclusif_WMSImpl.setCity(exclusif_WMS.getCity());
		exclusif_WMSImpl.setMobileno(exclusif_WMS.getMobileno());
		exclusif_WMSImpl.setEmail(exclusif_WMS.getEmail());
		exclusif_WMSImpl.setAgree(exclusif_WMS.getAgree());
		exclusif_WMSImpl.setCompanyId(exclusif_WMS.getCompanyId());
		exclusif_WMSImpl.setGroupId(exclusif_WMS.getGroupId());
		exclusif_WMSImpl.setUserId(exclusif_WMS.getUserId());
		exclusif_WMSImpl.setCreateDate(exclusif_WMS.getCreateDate());

		return exclusif_WMSImpl;
	}

	/**
	 * Returns the exclusif_ w m s with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the exclusif_ w m s
	 * @return the exclusif_ w m s
	 * @throws com.liferay.portal.NoSuchModelException if a exclusif_ w m s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Exclusif_WMS findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the exclusif_ w m s with the primary key or throws a {@link com.sbi.wms.NoSuchExclusif_WMSException} if it could not be found.
	 *
	 * @param recId the primary key of the exclusif_ w m s
	 * @return the exclusif_ w m s
	 * @throws com.sbi.wms.NoSuchExclusif_WMSException if a exclusif_ w m s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Exclusif_WMS findByPrimaryKey(long recId)
		throws NoSuchExclusif_WMSException, SystemException {
		Exclusif_WMS exclusif_WMS = fetchByPrimaryKey(recId);

		if (exclusif_WMS == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + recId);
			}

			throw new NoSuchExclusif_WMSException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				recId);
		}

		return exclusif_WMS;
	}

	/**
	 * Returns the exclusif_ w m s with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the exclusif_ w m s
	 * @return the exclusif_ w m s, or <code>null</code> if a exclusif_ w m s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Exclusif_WMS fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the exclusif_ w m s with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recId the primary key of the exclusif_ w m s
	 * @return the exclusif_ w m s, or <code>null</code> if a exclusif_ w m s with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Exclusif_WMS fetchByPrimaryKey(long recId) throws SystemException {
		Exclusif_WMS exclusif_WMS = (Exclusif_WMS)EntityCacheUtil.getResult(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
				Exclusif_WMSImpl.class, recId);

		if (exclusif_WMS == _nullExclusif_WMS) {
			return null;
		}

		if (exclusif_WMS == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				exclusif_WMS = (Exclusif_WMS)session.get(Exclusif_WMSImpl.class,
						Long.valueOf(recId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (exclusif_WMS != null) {
					cacheResult(exclusif_WMS);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(Exclusif_WMSModelImpl.ENTITY_CACHE_ENABLED,
						Exclusif_WMSImpl.class, recId, _nullExclusif_WMS);
				}

				closeSession(session);
			}
		}

		return exclusif_WMS;
	}

	/**
	 * Returns all the exclusif_ w m ses.
	 *
	 * @return the exclusif_ w m ses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Exclusif_WMS> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the exclusif_ w m ses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of exclusif_ w m ses
	 * @param end the upper bound of the range of exclusif_ w m ses (not inclusive)
	 * @return the range of exclusif_ w m ses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Exclusif_WMS> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the exclusif_ w m ses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of exclusif_ w m ses
	 * @param end the upper bound of the range of exclusif_ w m ses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of exclusif_ w m ses
	 * @throws SystemException if a system exception occurred
	 */
	public List<Exclusif_WMS> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Exclusif_WMS> list = (List<Exclusif_WMS>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EXCLUSIF_WMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXCLUSIF_WMS;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Exclusif_WMS>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Exclusif_WMS>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the exclusif_ w m ses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Exclusif_WMS exclusif_WMS : findAll()) {
			remove(exclusif_WMS);
		}
	}

	/**
	 * Returns the number of exclusif_ w m ses.
	 *
	 * @return the number of exclusif_ w m ses
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXCLUSIF_WMS);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the exclusif_ w m s persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.sbi.wms.model.Exclusif_WMS")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Exclusif_WMS>> listenersList = new ArrayList<ModelListener<Exclusif_WMS>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<Exclusif_WMS>)InstanceFactory.newInstance(
							clazz.getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(Exclusif_WMSImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = Exclusif_WMSPersistence.class)
	protected Exclusif_WMSPersistence exclusif_WMSPersistence;
	@BeanReference(type = WMS_INB_BRANCH_MASTERPersistence.class)
	protected WMS_INB_BRANCH_MASTERPersistence wms_inb_branch_masterPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EXCLUSIF_WMS = "SELECT exclusif_WMS FROM Exclusif_WMS exclusif_WMS";
	private static final String _SQL_COUNT_EXCLUSIF_WMS = "SELECT COUNT(exclusif_WMS) FROM Exclusif_WMS exclusif_WMS";
	private static final String _ORDER_BY_ENTITY_ALIAS = "exclusif_WMS.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Exclusif_WMS exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(Exclusif_WMSPersistenceImpl.class);
	private static Exclusif_WMS _nullExclusif_WMS = new Exclusif_WMSImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Exclusif_WMS> toCacheModel() {
				return _nullExclusif_WMSCacheModel;
			}
		};

	private static CacheModel<Exclusif_WMS> _nullExclusif_WMSCacheModel = new CacheModel<Exclusif_WMS>() {
			public Exclusif_WMS toEntityModel() {
				return _nullExclusif_WMS;
			}
		};
}