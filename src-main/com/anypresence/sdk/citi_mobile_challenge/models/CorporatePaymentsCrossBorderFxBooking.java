package com.anypresence.sdk.citi_mobile_challenge.models;

//
//  CorporatePaymentsCrossBorderFxBooking.java
//  
//
//  Generated by AnyPresence, Inc on 2015-09-21
//  Copyright (c) 2015. All rights reserved.
//

import com.google.common.util.concurrent.*;
import java.util.*;
import java.util.concurrent.Callable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.lang.reflect.Field;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import com.anypresence.rails_droid.*;
import com.anypresence.rails_droid.http.RequestMethod;
import com.anypresence.sdk.acl.*;
import com.anypresence.sdk.callbacks.*;
import com.anypresence.sdk.query.*;
import com.anypresence.sdk.config.Config;
import com.anypresence.sdk.acl.UnauthorizedException;
import com.anypresence.sdk.*;
import com.anypresence.sdk.cache.*;
import com.anypresence.sdk.cache.greendao.*;
import com.anypresence.sdk.parse.*;
import java.net.MalformedURLException;
import com.anypresence.rails_droid.RemoteRailsConfig;
import com.anypresence.rails_droid.http.RouterAdapter;
import com.anypresence.sdk.http.HttpAdapter;
import com.anypresence.sdk.Utility;

import com.jayway.jsonpath.PathNotFoundException;

import static com.anypresence.sdk.config.Config.DEBUG_MODE;
import static com.anypresence.sdk.http.HttpAdapter.JSON;
import static com.anypresence.sdk.http.HttpAdapter.XML;
import static com.anypresence.sdk.http.HttpAdapter.FORM_ENCODED;

/**
 * This class represents a model constructed from the Designer.
 *
 * Fields that are to be serialized into json must be annotated with <tt>@Expose</tt>.
 */
public final class CorporatePaymentsCrossBorderFxBooking
		extends
			com.anypresence.sdk.APObject {
	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory
			.getLog(CorporatePaymentsCrossBorderFxBooking.class);

	private static final String TAG = "CorporatePaymentsCrossBorderFxBooking";

	/**
	 *  Scope names for CorporatePaymentsCrossBorderFxBooking.
	 */
	public static class Scopes {

		public final static String ALL = "all";

		public final static String EXACT_MATCH = "exact_match";

		public final static String COUNT = "count";

		public final static String COUNT_EXACT_MATCH = "count_exact_match";

	}

	private static QueryScope getScope(String scope) {
		if (getQueryScopes().get(scope) == null) {
			return getQueryScopes().get("all");
		}

		return getQueryScopes().get(scope);
	}

	@SerializedName("accepted_on")
	@Expose
	private ObjectId acceptedOn;
	// Getter/Setter for the id
	@Override
	public ObjectId getObjectId() {
		return acceptedOn;
	}

	@Override
	public void setObjectId(ObjectId id) {
		this.acceptedOn = id;
	}

	public ObjectId getAcceptedOn() {
		return getObjectId();
	}

	public void setAcceptedOn(ObjectId acceptedOn) {
		setObjectId(acceptedOn);
	}

	public void setAcceptedOnAsString(String acceptedOn) {
		setObjectId(new ObjectId(acceptedOn));
	}

	// Getters/setters for field definitions.

	@SerializedName("accepted_by")
	@Expose
	private String acceptedBy;

	public String getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(String acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	@SerializedName("rate_reference")
	@Expose
	private String rateReference;

	public String getRateReference() {
		return rateReference;
	}

	public void setRateReference(String rateReference) {
		this.rateReference = rateReference;
	}

	/**
	 * Copies provided object.
	 */
	public static final CorporatePaymentsCrossBorderFxBooking copy(
			CorporatePaymentsCrossBorderFxBooking orig) {
		final CorporatePaymentsCrossBorderFxBooking newObject = new CorporatePaymentsCrossBorderFxBooking();

		if (orig.getAcceptedOn() != null)
			newObject.setAcceptedOn(new ObjectId(orig.getAcceptedOn()));

		if (orig.getAcceptedBy() != null)
			newObject.setAcceptedBy(new String(orig.getAcceptedBy()));

		if (orig.getRateReference() != null)
			newObject.setRateReference(new String(orig.getRateReference()));

		return newObject;
	}

	// Query scopes
	private static Map<String, QueryScope> queryScopes = new HashMap<String, QueryScope>();

	public void setQueryScopes(Map<String, QueryScope> queryScopes) {
		this.queryScopes = queryScopes;
	}

	public static Map<String, QueryScope> getQueryScopes() {
		return queryScopes;
	}

	static {

		QueryScope queryScopeall = new QueryScope();
		queryScopeall.setName("all");

		queryScopes.put(queryScopeall.getName(), queryScopeall);

		QueryScope queryScopeexact_match = new QueryScope();
		queryScopeexact_match.setName("exact_match");

		queryScopes.put(queryScopeexact_match.getName(), queryScopeexact_match);

		QueryScope queryScopecount = new QueryScope();
		queryScopecount.setName("count");

		queryScopes.put(queryScopecount.getName(), queryScopecount);

		QueryScope queryScopecount_exact_match = new QueryScope();
		queryScopecount_exact_match.setName("count_exact_match");

		queryScopes.put(queryScopecount_exact_match.getName(),
				queryScopecount_exact_match);

	}

	/**
	 * Fetches a <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>objectId</tt>.
	 *
	 * @param objectId the id of the object
	 * @return an instance of <tt>CorporatePaymentsCrossBorderFxBooking</tt>
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static CorporatePaymentsCrossBorderFxBooking fetch(String objectId)
			throws RemoteRequestException {
		RemoteRequest.RemoteRequestBuilder remoteRequestBuilder = RemoteRailsConfig
				.getRouterAdapterByClassOrUseDefaultAdapter(
						CorporatePaymentsCrossBorderFxBooking.class)
				.createRemoteRequestBuilder(RequestMethod.GET,
						CorporatePaymentsCrossBorderFxBooking.class);

		CorporatePaymentsCrossBorderFxBooking object = new CorporatePaymentsCrossBorderFxBooking();
		object.setObjectIdAsString(objectId);

		remoteRequestBuilder.context(object);

		RemoteRequest remoteRequest = remoteRequestBuilder
				.createRemoteRequest();
		remoteRequest = Utility.interpolateRemoteRequest(remoteRequest);

		return com.anypresence.sdk.APObject.fetch(remoteRequest,
				CorporatePaymentsCrossBorderFxBooking.class);
	}

	/**
	 * Fetches a <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>objectId</tt> in the background.
	 *
	 * <p>
	 * The {@link import com.anypresence.sdk.callbacks.APCallback} callback allows you to run code in the main UI thread.
	 * </p>
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * CorporatePaymentsCrossBorderFxBooking.fetchInBackground("123", new APCallback<CorporatePaymentsCrossBorderFxBooking>() {
	 *     
	 *     public void finished(CorporatePaymentsCrossBorderFxBooking object, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "Object fetched!");
	 *         } else {
	 *             Log.e(TAG, "Unable to fetch object!", ex);
	 *         }
	 *     }
	 * });
	 * }
	 * </pre>
	 *
	 * @see import com.anypresence.sdk.callbacks.APCallback
	 * @param objectId the id of the object
	 * @param futureCallback the callback that handles the result of the request.
	
	 * @return the cached <tt>CorporatePaymentsCrossBorderFxBooking</tt> if it exists, otherwise, null.
	
	 */
	public static CorporatePaymentsCrossBorderFxBooking

	fetchInBackground(
			String objectId,
			IAPFutureCallback<CorporatePaymentsCrossBorderFxBooking> futureCallback) {

		return com.anypresence.sdk.APObject.fetchInBackground(objectId,
				CorporatePaymentsCrossBorderFxBooking.class, futureCallback);

	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt>.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> query(String scope)
			throws RemoteRequestException {
		return query(scope, null, null, null);
	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt> and other params.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @param offset offset for the query, or <tt>null</tt> for no offset.
	 * @param limit max results to return back, <tt>null</tt> for no limit.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> query(
			String scope, Map<String, String> params, Integer offset,
			Integer limit) throws RemoteRequestException {
		RemoteRequest.RemoteRequestBuilder remoteRequestBuilder = RemoteRailsConfig
				.getRouterAdapterByClassOrUseDefaultAdapter(
						CorporatePaymentsCrossBorderFxBooking.class)
				.createRemoteRequestBuilder(scope, RequestMethod.GET,
						CorporatePaymentsCrossBorderFxBooking.class);
		remoteRequestBuilder.query(scope);
		if (params != null) {
			remoteRequestBuilder.addToParameters(params);
			remoteRequestBuilder.context(params);
		}
		if (offset != null) {
			remoteRequestBuilder.addToParameters("offset", offset.toString());
		}

		if (limit != null) {
			remoteRequestBuilder.addToParameters("limit", limit.toString());
		}
		RemoteRequest remoteRequest = remoteRequestBuilder
				.createRemoteRequest();

		return com.anypresence.sdk.APObject.query(remoteRequest, offset, limit,
				CorporatePaymentsCrossBorderFxBooking.class);
	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt> and other params.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> query(
			String scope, Map<String, String> params)
			throws RemoteRequestException {
		return query(scope, params, null, null);
	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt> and other params.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> queryInBackground(
			final String scope,
			Map<String, String> params,
			IAPFutureCallback<List<CorporatePaymentsCrossBorderFxBooking>> futureCallback) {

		return queryInBackground(scope, params, null, null, futureCallback);

	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt> in the background.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * <p>
	 * The {@link import com.anypresence.sdk.callbacks.APCallback} callback allows you to run code in the main UI thread.
	 * </p>
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * CorporatePaymentsCrossBorderFxBooking.queryInBackground("all", new APCallback<List<CorporatePaymentsCrossBorderFxBooking>>() {
	 *     
	 *     public void finished(List<CorporatePaymentsCrossBorderFxBooking> objects, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "Objects fetched!");
	 *         } else {
	 *             Log.e(TAG, "Unable to fetch objects!", ex);
	 *         }
	 *     }
	 * });
	 * }
	 * </pre>
	 *
	 * @see import com.anypresence.sdk.callbacks.APCallback
	 * @param scope the scope to perform the query.
	 * @param futureCallback the callback that handles the result of the request.
	 * @return list of cached <tt>CorporatePaymentsCrossBorderFxBooking</tt> objects.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> queryInBackground(
			String scope,
			IAPFutureCallback<List<CorporatePaymentsCrossBorderFxBooking>> futureCallback) {

		return queryInBackground(scope, null, null, null, futureCallback);

	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt> in the background.
	 *
	 * Note: the scopes were defined from the Designer.
	 * <p>
	 * The {@link import com.anypresence.sdk.callbacks.APCallback} callback allows you to run code in the main UI thread.
	 * </p>
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * CorporatePaymentsCrossBorderFxBooking.queryInBackground("all", 0, 25, new APCallback<List<CorporatePaymentsCrossBorderFxBooking>>() {
	 *     
	 *     public void finished(List<CorporatePaymentsCrossBorderFxBooking> objects, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "Objects fetched!");
	 *         } else {
	 *             Log.e(TAG, "Unable to fetch objects!", ex);
	 *         }
	 *     }
	 * });
	 * }
	 * </pre>
	 *
	 * @see import com.anypresence.sdk.callbacks.APCallback
	 * @param scope the scope to perform the query.
	 * @param offset offset for the query, or <tt>null</tt> for no offset.
	 * @param limit max results to return back, <tt>null</tt> for no limit.
	 * @param futureCallback the callback that handles the result of the request.
	 * @return list of cached <tt>CorporatePaymentsCrossBorderFxBooking</tt> objects.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> queryInBackground(
			String scope,
			Integer offset,
			Integer limit,
			IAPFutureCallback<List<CorporatePaymentsCrossBorderFxBooking>> futureCallback) {

		return queryInBackground(scope, null, offset, limit, futureCallback);

	}

	/**
	 * Queries for <tt>CorporatePaymentsCrossBorderFxBooking</tt> with the provided <tt>scope</tt> in the background.
	 *
	 * Note: the scopes were defined from the Designer.
	 * <p>
	 * The {@link import com.anypresence.sdk.callbacks.APCallback} callback allows you to run code in the main UI thread.
	 * </p>
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * Map<String,String> params = new HashMap<String,String>();
	 * params.put("name", "test");
	 * CorporatePaymentsCrossBorderFxBooking.queryInBackground("all", params, 0, 25, new APCallback<List<CorporatePaymentsCrossBorderFxBooking>>() {
	 *     
	 *     public void finished(List<CorporatePaymentsCrossBorderFxBooking> objects, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "Objects fetched!");
	 *         } else {
	 *             Log.e(TAG, "Unable to fetch objects!", ex);
	 *         }
	 *     }
	 * });
	 * }
	 * </pre>
	 *
	 * @see import com.anypresence.sdk.callbacks.APCallback
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @param offset offset for the query, or <tt>null</tt> for no offset.
	 * @param limit max results to return back, <tt>null</tt> for no limit.
	 * @param futureCallback the callback that handles the result of the request.
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> queryInBackground(
			final String scope,
			Map<String, String> params,
			Integer offset,
			Integer limit,
			IAPFutureCallback<List<CorporatePaymentsCrossBorderFxBooking>> futureCallback) {

		RemoteRequest.RemoteRequestBuilder remoteRequestBuilder = RemoteRailsConfig
				.getRouterAdapterByClassOrUseDefaultAdapter(
						CorporatePaymentsCrossBorderFxBooking.class)
				.createRemoteRequestBuilder(scope, RequestMethod.GET,
						CorporatePaymentsCrossBorderFxBooking.class);
		remoteRequestBuilder.query(scope);
		if (params != null) {
			remoteRequestBuilder.addToParameters(params);
			remoteRequestBuilder.context(params);
		}

		if (offset != null) {
			remoteRequestBuilder.addToParameters("offset", offset.toString());
		}

		if (limit != null) {
			remoteRequestBuilder.addToParameters("limit", limit.toString());
		}

		RemoteRequest remoteRequest = remoteRequestBuilder
				.createRemoteRequest();

		if (DEBUG_MODE) {
			System.out.println(ReflectionToStringBuilder
					.reflectionToString(remoteRequest));
		}

		return com.anypresence.sdk.APObject.queryInBackground(remoteRequest,
				CorporatePaymentsCrossBorderFxBooking.class, futureCallback);

	}

	/**
	 * Performs aggregate query with the provided <tt>scope</tt>.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static String aggregateQuery(String scope, Map<String, String> params)
			throws RemoteRequestException {
		return com.anypresence.sdk.APObject.aggregateQuery(scope, params,
				CorporatePaymentsCrossBorderFxBooking.class);
	}

	/**
	 * Performs aggregate query with the provided <tt>scope</tt> in the background.
	 *
	 * Note: the scopes were defined from the Designer.
	 * <p>
	 * The {@link import com.anypresence.sdk.callbacks.APCallback} callback allows you to run code in the main UI thread.
	 * </p>
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * Map<String,String> params = new HashMap<String,String>();
	 * CorporatePaymentsCrossBorderFxBooking.aggregateQueryInBackground("count", params, new APCallback<String>() {
	 *     
	 *     public void finished(String count, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "success");
	 *         } else {
	 *             Log.e(TAG, "failure", ex);
	 *         }
	 *     }
	 * });
	 * }
	 * </pre>
	 *
	 * @see import com.anypresence.sdk.callbacks.APCallback
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @param futureCallback the callback that handles the result of the request.
	 */
	public static void aggregateQueryInBackground(String scope,
			Map<String, String> params, IAPFutureCallback<String> futureCallback) {
		com.anypresence.sdk.APObject.aggregateQueryInBackground(scope, params,
				CorporatePaymentsCrossBorderFxBooking.class, futureCallback);
	}

	/**
	 * Deletes all data in cache for <tt>CorporatePaymentsCrossBorderFxBooking</tt>.
	 */
	public static void deleteAllInCache() {
		com.anypresence.sdk.APObject.deleteAllInCache();
	}

	/**
	 * Loads all <tt>CorporatePaymentsCrossBorderFxBooking</tt> objects in local cache.
	 *
	 * @return list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> loadAllInCache() {
		return com.anypresence.sdk.APSDKSetup.getCacheManager().loadAllInCache(
				CorporatePaymentsCrossBorderFxBooking.class);
	}

	/**
	 * Loads <tt>CorporatePaymentsCrossBorderFxBooking</tt> objects in local cache.
	 *
	 * @param offset the offset
	 * @param limit the limit
	 * @return list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> loadInCache(
			Integer offset, Integer limit) {
		return null;
	}

	/**
	 * Updates object in cache if the object id is not null.
	 */
	public void updateInCache() {
		com.anypresence.sdk.APSDKSetup.getCacheManager().updateInCache(
				CorporatePaymentsCrossBorderFxBooking.class, this);
	}

	/**
	 * Saves object into cache.
	 */
	public void saveInCache() {
		saveInCache(null);
	}

	/**
	 * Saves object into cache with provided scope.
	 */
	public void saveInCache(String scope) {
		com.anypresence.sdk.APSDKSetup.getCacheManager().saveInCache(
				CorporatePaymentsCrossBorderFxBooking.class, this, scope);
	}

	/**
	 * Saves object into cache with provided <tt>APCachedRequest</tt>.
	 */
	public void saveInCacheWithRequest(IAPCachedRequest request) {
		com.anypresence.sdk.APSDKSetup.getCacheManager()
				.saveInCacheWithRequest(
						CorporatePaymentsCrossBorderFxBooking.class, this,
						request);
	}

	/**
	 * Deletes all <tt>CorporatePaymentsCrossBorderFxBooking</tt> objects in cache that has
	 * this instance's object id.
	 */
	public void deleteInCache() {
		if (this.getObjectId() != null) {
			deleteAllInCacheWithObjectIdPredicate(this.getObjectId()
					.stringify());
		} else {
			log.info("Cannot delete in local cache since the objectId is not set");
		}
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with provided remote object id.
	 * 
	 * @param objectId the remote object id.
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithObjectIdPredicate(
			String objectId) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithObjectIdPredicate(
						CorporatePaymentsCrossBorderFxBooking.class, objectId);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache by searching for requests matching 
	 * the exact scope and parameters provided.
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * Map<String,String> params = new HashMap<String,String>();
	 * params.put("name", "test");
	 * CorporatePaymentsCrossBorderFxBooking.queryInBackground("all", params, new APCallback<List<CorporatePaymentsCrossBorderFxBooking>>() {
	 *     
	 *     public void finished(List<CorporatePaymentsCrossBorderFxBooking> objects, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "Objects fetched!");
	 *         } else {
	 *             Log.e(TAG, "Unable to fetch objects!", ex);
	 *         }
	 *     }
	 * });
	 * // Get the cached objects from the above query.
	 * CorporatePaymentsCrossBorderFxBooking.fetchInCacheWithParameterPredicate("all", params);
	 * }
	 *
	 * </pre>
	 * 
	 * @param scope the scope 
	 * @param params the parameter
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithParameterPredicate(
			String scope, Map<String, String> params) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithParameterPredicate(
						CorporatePaymentsCrossBorderFxBooking.class, scope,
						params);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with provided scope.
	 * 
	 * @param scope the scope.
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithScopePredicate(
			String scope, Integer offset, Integer limit) {
		return fetchInCacheWithScopePredicate(scope, null, offset, limit);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with provided scope.
	 * 
	 * @param scope the scope.
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithScopePredicate(
			String scope) {
		return fetchInCacheWithScopePredicate(scope, null, null);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with provided scope.
	 * 
	 * @param scope the scope
	 * @param params the parameters
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithScopePredicate(
			String scope, Map<String, String> params) {
		return fetchInCacheWithScopePredicate(scope, params, null, null);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with provided scope.
	 * 
	 * @param scope the scope.
	 * @param params the parameters
	 * @param offset the offset
	 * @param limit the limit
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithScopePredicate(
			String scope, Map<String, String> params, Integer offset,
			Integer limit) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithScopePredicate(
						CorporatePaymentsCrossBorderFxBooking.class, scope,
						params, offset, limit);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with provided request.
	 * 
	 * @param request instance of <tt>com.anypresence.anypresence_inc.citi_mobile_challenge.dao.APCachedRequest</tt>.
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithAPCachedRequestPredicate(
			IAPCachedRequest request) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithAPCachedRequestPredicate(
						CorporatePaymentsCrossBorderFxBooking.class, request);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with latest request.
	 * 
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @param offset offset for the query, or <tt>null</tt> for no offset.
	 * @param limit max results to return back, <tt>null</tt> for no limit.
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>;
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithLatestAPCachedRequestPredicate(
			String scope, Map<String, String> params, Integer offset,
			Integer limit) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithLatestAPCachedRequestPredicate(
						CorporatePaymentsCrossBorderFxBooking.class, scope,
						params, offset, limit);
	}

	/**
	 * Fetches <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache with predicates.
	 *
	 * @see com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CorporatePaymentsCrossBorderFxBookingDao.Properties
	 *
	 * @param predicates hash of predicates
	 * @return a list of <tt>CorporatePaymentsCrossBorderFxBooking</tt>
	 */
	public static List<CorporatePaymentsCrossBorderFxBooking> fetchInCacheWithPredicates(
			Map<String, String> predicates) {
		return com.anypresence.sdk.APSDKSetup
				.getCacheManager()
				.fetchInCacheWithPredicates(
						CorporatePaymentsCrossBorderFxBooking.class, predicates);
	}

	/**
	 * Deletes <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache matching <tt>objectId</tt>.
	 * 
	 * @param objectId the remote object id.
	 */
	public static void deleteAllInCacheWithObjectIdPredicate(String objectId) {
		com.anypresence.sdk.APSDKSetup.getCacheManager()
				.deleteAllInCacheWithObjectIdPredicate(
						CorporatePaymentsCrossBorderFxBooking.class, objectId);
	}

	/**
	 * Deletes <tt>CorporatePaymentsCrossBorderFxBooking</tt> from cache matching <tt>scope</tt>.
	 * 
	 * @param scope the scope.
	 */
	public static void deleteAllInCacheWithScopePredicate(String scope) {
		com.anypresence.sdk.APSDKSetup.getCacheManager()
				.deleteAllInCacheWithScopePredicate(
						CorporatePaymentsCrossBorderFxBooking.class, scope);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).

		append(acceptedOn).

		append(acceptedBy).

		append(rateReference).

		append(getObjectId()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		CorporatePaymentsCrossBorderFxBooking other = (CorporatePaymentsCrossBorderFxBooking) obj;
		return new EqualsBuilder().

		append(acceptedOn, other.acceptedOn).

		append(acceptedBy, other.acceptedBy).

		append(rateReference, other.rateReference).

		append(getObjectId(), other.getObjectId()).isEquals();
	}

	// Backend on Device
	public static String MAPPING = "CorporatePaymentsCrossBorderFxBooking";
	public static String BASE_URL = "";
	public static String PORT = "";
	public static String PREFIX = "";
	public static String QUERY_PREFIX = "";
	public static boolean USE_SUFFIX = false;

	/**
	 * Deprecated: Pulled up into HttpAdapter
	 */
	@Override
	@Deprecated
	public String requestMapping() {
		return MAPPING;
	}

	/**
	 * Deprecated: Pulled up into HttpAdapter
	 */
	@Override
	@Deprecated
	public String requestBaseUrl() throws MalformedURLException {
		return BASE_URL;
	}

	/**
	 * Deprecated: Pulled up into HttpAdapter
	 */
	@Override
	@Deprecated
	public String requestPrefix() {
		return PREFIX;
	}

	/**
	 * Deprecated: Pulled up into HttpAdapter
	 */
	@Deprecated
	public static String requestQueryPrefix() {
		if (QUERY_PREFIX.isEmpty()) {
			return "%s";
		}
		return QUERY_PREFIX + "[%s]";
	}

	@Override
	public String serialize() {
		String bodyFormat = getSerializationBodyFormat();
		SerializerBuilder builder = null;

		String recordSelector = HttpAdapter.createResponseWrangling(this)
				.getRecordSelector();
		if (XML.equals(bodyFormat)) {
			builder = new XmlSerializer.XmlSerializerBuilder(recordSelector);
		} else if (JSON.equals(bodyFormat)) {
			builder = new JsonSerializer.JsonSerializerBuilder(recordSelector);
		} else if (FORM_ENCODED.equals(bodyFormat)) {
			builder = new FormEncodedSerializer.FormEncodedSerializerBuilder(
					recordSelector);
		}

		final RouterAdapter routerAdapter = RemoteRailsConfig
				.getRouterAdapterByClass(this.getClass());
		if (builder != null && routerAdapter != null) {

			builder.addFieldMapping(((HttpAdapter) routerAdapter)
					.getConfigurationsAsConfiguration("POST")
					.getResponseRemoteFieldName("accepted_on"), "accepted_on");

			builder.addFieldMapping(((HttpAdapter) routerAdapter)
					.getConfigurationsAsConfiguration("POST")
					.getResponseRemoteFieldName("accepted_by"), "accepted_by");

			builder.addFieldMapping(((HttpAdapter) routerAdapter)
					.getConfigurationsAsConfiguration("POST")
					.getResponseRemoteFieldName("rate_reference"),
					"rate_reference");

			return builder.create().serialize(this);
		} else {
			return super.serialize();
		}
	}

	@Override
	public ArrayList<RemoteObject> deserializeArray(String queryScope,
			String input) {
		String bodyFormat = getDeserializationBodyFormat();
		if (XML.equals(bodyFormat)) {
			return deserializeArrayAsXml(queryScope, input);
		} else if (JSON.equals(bodyFormat)) {
			return deserializeArrayAsJson(queryScope, input);
		} else {
			return deserializeArrayAsJson(queryScope, input);
		}
	}

	@Override
	public ArrayList<RemoteObject> deserializeArray(String input) {
		return deserializeArray("", input);
	}

	private ArrayList<RemoteObject> deserializeArrayAsXml(String queryScope,
			String input) {
		ArrayList<RemoteObject> objects = new ArrayList<RemoteObject>();

		XmlParser parser = new XmlParser(input);
		XmlElement parent = ((XmlElement) parser.parse(HttpAdapter
				.createResponseWrangling(queryScope, this)
				.getCollectionSelector(), XmlElement.class)).getParent();
		for (int i = 0; i < parent.getChildCount(); i++) {
			objects.add(deserialize(queryScope, new XmlParser(parent.get(i))));
		}

		return objects;
	}

	private ArrayList<RemoteObject> deserializeArrayAsJson(String queryScope,
			String input) {
		ArrayList<RemoteObject> objects = new ArrayList<RemoteObject>();

		JsonParser parser = new JsonParser(input);
		JsonArray parent = ((JsonElement) parser.parse(HttpAdapter
				.createResponseWrangling(queryScope, this)
				.getCollectionSelector(), JsonElement.class)).getAsJsonArray();
		for (int i = 0; i < parent.size(); i++) {
			objects.add(deserialize(queryScope, new JsonParser(parent.get(i))));
		}

		return objects;
	}

	@Override
	public String getDeserializationBodyFormat() {
		final HttpAdapter routerAdapter = (HttpAdapter) RemoteRailsConfig
				.getRouterAdapterByClass(this.getClass());
		if (routerAdapter == null
				|| routerAdapter.getConfigurationsAsConfiguration("GET") == null) {
			return RemoteRailsConfig.getInstance().getDefaultRouterAdapter()
					.getSuffix();
		}
		return routerAdapter.getConfigurationsAsConfiguration("GET")
				.getBodyFormat();
	}

	@Override
	public String getSerializationBodyFormat() {
		final HttpAdapter routerAdapter = (HttpAdapter) RemoteRailsConfig
				.getRouterAdapterByClass(this.getClass());
		if (routerAdapter == null
				|| routerAdapter.getConfigurationsAsConfiguration("GET") == null) {
			return RemoteRailsConfig.getInstance().getDefaultRouterAdapter()
					.getSuffix();
		}
		return routerAdapter.getConfigurationsAsConfiguration("POST")
				.getBodyFormat();
	}

	@Override
	public RemoteObject deserialize(String queryScope, String input) {
		String bodyFormat = getDeserializationBodyFormat();
		// TODO parse role if auth object
		Parser parser = null;
		if (XML.equals(bodyFormat)) {
			parser = createXmlParser(queryScope, input);
		} else if (JSON.equals(bodyFormat)) {
			parser = createJsonParser(queryScope, input);
		} else {
			parser = createJsonParser(queryScope, input);
		}

		return deserialize(queryScope, parser);
	}

	@Override
	public RemoteObject deserialize(String input) {
		return deserialize("", input);
	}

	private Parser createXmlParser(String queryScope, String input) {
		Parser parser = new XmlParser(input);
		if (!HttpAdapter.createResponseWrangling(queryScope, this)
				.getRecordSelector().isEmpty()) {
			((XmlParser) parser).setRootElement(parser.parse(HttpAdapter
					.createResponseWrangling(queryScope, this)
					.getRecordSelector(), XmlElement.class));
		}
		return parser;
	}

	private Parser createJsonParser(String queryScope, String input) {
		Parser parser = new JsonParser(input);
		if (!HttpAdapter.createResponseWrangling(queryScope, this)
				.getRecordSelector().isEmpty()) {
			((JsonParser) parser).setRootElement(parser.parse(HttpAdapter
					.createResponseWrangling(queryScope, this)
					.getRecordSelector(), JsonElement.class));
		}
		return parser;
	}

	public RemoteObject deserialize(String queryScope, Parser parser) {
		final RouterAdapter routerAdapter = RemoteRailsConfig
				.getRouterAdapterByClass(this.getClass());
		CorporatePaymentsCrossBorderFxBooking object = new CorporatePaymentsCrossBorderFxBooking();
		HttpAdapter.Configuration configuration = null;
		if ((routerAdapter != null) && (routerAdapter instanceof HttpAdapter)) {
			if (queryScope != null && !queryScope.isEmpty()) {
				configuration = ((HttpAdapter) routerAdapter)
						.getScopedConfigurationsByNameAsConfiguration(queryScope);
			} else {
				configuration = ((HttpAdapter) routerAdapter)
						.getConfigurationsAsConfiguration("GET");
			}
		}
		if (configuration != null) {

			try {

				object.acceptedOn = parser
						.parse(configuration
								.getResponseRemoteFieldName("accepted_on"),
								ObjectId.class);

			} catch (PathNotFoundException e) {
				log.info("Unable to deserialize field: " + e.getMessage());
			}

			try {

				object.acceptedBy = parser
						.parse(configuration
								.getResponseRemoteFieldName("accepted_by"),
								String.class);

			} catch (PathNotFoundException e) {
				log.info("Unable to deserialize field: " + e.getMessage());
			}

			try {

				object.rateReference = parser.parse(configuration
						.getResponseRemoteFieldName("rate_reference"),
						String.class);

			} catch (PathNotFoundException e) {
				log.info("Unable to deserialize field: " + e.getMessage());
			}

		} else {
			// Default to use gson deserializer
			String json = "";
			if (parser instanceof JsonParser) {
				json = ((JsonParser) parser).getRootElement().toString();
			}

			object = (CorporatePaymentsCrossBorderFxBooking) Utilities
					.transformJsonToObject(json, this.getClass());
		}

		return object;
	}

}
