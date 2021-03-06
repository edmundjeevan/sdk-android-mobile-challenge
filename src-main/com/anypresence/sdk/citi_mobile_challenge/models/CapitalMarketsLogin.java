package com.anypresence.sdk.citi_mobile_challenge.models;

//
//  CapitalMarketsLogin.java
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
public final class CapitalMarketsLogin extends com.anypresence.sdk.APObject {
	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(CapitalMarketsLogin.class);

	private static final String TAG = "CapitalMarketsLogin";

	/**
	 *  Scope names for CapitalMarketsLogin.
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

	@SerializedName("token")
	@Expose
	private ObjectId token;
	// Getter/Setter for the id
	@Override
	public ObjectId getObjectId() {
		return token;
	}

	@Override
	public void setObjectId(ObjectId id) {
		this.token = id;
	}

	public ObjectId getToken() {
		return getObjectId();
	}

	public void setToken(ObjectId token) {
		setObjectId(token);
	}

	public void setTokenAsString(String token) {
		setObjectId(new ObjectId(token));
	}

	// Getters/setters for field definitions.

	@SerializedName("password")
	@Expose
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@SerializedName("username")
	@Expose
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Copies provided object.
	 */
	public static final CapitalMarketsLogin copy(CapitalMarketsLogin orig) {
		final CapitalMarketsLogin newObject = new CapitalMarketsLogin();

		if (orig.getToken() != null)
			newObject.setToken(new ObjectId(orig.getToken()));

		if (orig.getPassword() != null)
			newObject.setPassword(new String(orig.getPassword()));

		if (orig.getUsername() != null)
			newObject.setUsername(new String(orig.getUsername()));

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
	 * Fetches a <tt>CapitalMarketsLogin</tt> with the provided <tt>objectId</tt>.
	 *
	 * @param objectId the id of the object
	 * @return an instance of <tt>CapitalMarketsLogin</tt>
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static CapitalMarketsLogin fetch(String objectId)
			throws RemoteRequestException {
		RemoteRequest.RemoteRequestBuilder remoteRequestBuilder = RemoteRailsConfig
				.getRouterAdapterByClassOrUseDefaultAdapter(
						CapitalMarketsLogin.class).createRemoteRequestBuilder(
						RequestMethod.GET, CapitalMarketsLogin.class);

		CapitalMarketsLogin object = new CapitalMarketsLogin();
		object.setObjectIdAsString(objectId);

		remoteRequestBuilder.context(object);

		RemoteRequest remoteRequest = remoteRequestBuilder
				.createRemoteRequest();
		remoteRequest = Utility.interpolateRemoteRequest(remoteRequest);

		return com.anypresence.sdk.APObject.fetch(remoteRequest,
				CapitalMarketsLogin.class);
	}

	/**
	 * Fetches a <tt>CapitalMarketsLogin</tt> with the provided <tt>objectId</tt> in the background.
	 *
	 * <p>
	 * The {@link import com.anypresence.sdk.callbacks.APCallback} callback allows you to run code in the main UI thread.
	 * </p>
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * CapitalMarketsLogin.fetchInBackground("123", new APCallback<CapitalMarketsLogin>() {
	 *     
	 *     public void finished(CapitalMarketsLogin object, Throwable ex) {
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
	
	 * @return the cached <tt>CapitalMarketsLogin</tt> if it exists, otherwise, null.
	
	 */
	public static CapitalMarketsLogin

	fetchInBackground(String objectId,
			IAPFutureCallback<CapitalMarketsLogin> futureCallback) {

		return com.anypresence.sdk.APObject.fetchInBackground(objectId,
				CapitalMarketsLogin.class, futureCallback);

	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt>.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CapitalMarketsLogin> query(String scope)
			throws RemoteRequestException {
		return query(scope, null, null, null);
	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt> and other params.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @param offset offset for the query, or <tt>null</tt> for no offset.
	 * @param limit max results to return back, <tt>null</tt> for no limit.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CapitalMarketsLogin> query(String scope,
			Map<String, String> params, Integer offset, Integer limit)
			throws RemoteRequestException {
		RemoteRequest.RemoteRequestBuilder remoteRequestBuilder = RemoteRailsConfig
				.getRouterAdapterByClassOrUseDefaultAdapter(
						CapitalMarketsLogin.class).createRemoteRequestBuilder(
						scope, RequestMethod.GET, CapitalMarketsLogin.class);
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
				CapitalMarketsLogin.class);
	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt> and other params.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CapitalMarketsLogin> query(String scope,
			Map<String, String> params) throws RemoteRequestException {
		return query(scope, params, null, null);
	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt> and other params.
	 *
	 * Note: the scopes were defined from the Designer.
	 *
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @throws RemoteRequestException If there are other issues with the request.
	 */
	public static List<CapitalMarketsLogin> queryInBackground(
			final String scope, Map<String, String> params,
			IAPFutureCallback<List<CapitalMarketsLogin>> futureCallback) {

		return queryInBackground(scope, params, null, null, futureCallback);

	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt> in the background.
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
	 * CapitalMarketsLogin.queryInBackground("all", new APCallback<List<CapitalMarketsLogin>>() {
	 *     
	 *     public void finished(List<CapitalMarketsLogin> objects, Throwable ex) {
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
	 * @return list of cached <tt>CapitalMarketsLogin</tt> objects.
	 */
	public static List<CapitalMarketsLogin> queryInBackground(String scope,
			IAPFutureCallback<List<CapitalMarketsLogin>> futureCallback) {

		return queryInBackground(scope, null, null, null, futureCallback);

	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt> in the background.
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
	 * CapitalMarketsLogin.queryInBackground("all", 0, 25, new APCallback<List<CapitalMarketsLogin>>() {
	 *     
	 *     public void finished(List<CapitalMarketsLogin> objects, Throwable ex) {
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
	 * @return list of cached <tt>CapitalMarketsLogin</tt> objects.
	 */
	public static List<CapitalMarketsLogin> queryInBackground(String scope,
			Integer offset, Integer limit,
			IAPFutureCallback<List<CapitalMarketsLogin>> futureCallback) {

		return queryInBackground(scope, null, offset, limit, futureCallback);

	}

	/**
	 * Queries for <tt>CapitalMarketsLogin</tt> with the provided <tt>scope</tt> in the background.
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
	 * CapitalMarketsLogin.queryInBackground("all", params, 0, 25, new APCallback<List<CapitalMarketsLogin>>() {
	 *     
	 *     public void finished(List<CapitalMarketsLogin> objects, Throwable ex) {
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
	public static List<CapitalMarketsLogin> queryInBackground(
			final String scope, Map<String, String> params, Integer offset,
			Integer limit,
			IAPFutureCallback<List<CapitalMarketsLogin>> futureCallback) {

		RemoteRequest.RemoteRequestBuilder remoteRequestBuilder = RemoteRailsConfig
				.getRouterAdapterByClassOrUseDefaultAdapter(
						CapitalMarketsLogin.class).createRemoteRequestBuilder(
						scope, RequestMethod.GET, CapitalMarketsLogin.class);
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
				CapitalMarketsLogin.class, futureCallback);

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
				CapitalMarketsLogin.class);
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
	 * CapitalMarketsLogin.aggregateQueryInBackground("count", params, new APCallback<String>() {
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
				CapitalMarketsLogin.class, futureCallback);
	}

	/**
	 * Deletes all data in cache for <tt>CapitalMarketsLogin</tt>.
	 */
	public static void deleteAllInCache() {
		com.anypresence.sdk.APObject.deleteAllInCache();
	}

	/**
	 * Loads all <tt>CapitalMarketsLogin</tt> objects in local cache.
	 *
	 * @return list of <tt>CapitalMarketsLogin</tt>
	 */
	public static List<CapitalMarketsLogin> loadAllInCache() {
		return com.anypresence.sdk.APSDKSetup.getCacheManager().loadAllInCache(
				CapitalMarketsLogin.class);
	}

	/**
	 * Loads <tt>CapitalMarketsLogin</tt> objects in local cache.
	 *
	 * @param offset the offset
	 * @param limit the limit
	 * @return list of <tt>CapitalMarketsLogin</tt>
	 */
	public static List<CapitalMarketsLogin> loadInCache(Integer offset,
			Integer limit) {
		return null;
	}

	/**
	 * Updates object in cache if the object id is not null.
	 */
	public void updateInCache() {
		com.anypresence.sdk.APSDKSetup.getCacheManager().updateInCache(
				CapitalMarketsLogin.class, this);
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
				CapitalMarketsLogin.class, this, scope);
	}

	/**
	 * Saves object into cache with provided <tt>APCachedRequest</tt>.
	 */
	public void saveInCacheWithRequest(IAPCachedRequest request) {
		com.anypresence.sdk.APSDKSetup.getCacheManager()
				.saveInCacheWithRequest(CapitalMarketsLogin.class, this,
						request);
	}

	/**
	 * Deletes all <tt>CapitalMarketsLogin</tt> objects in cache that has
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
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with provided remote object id.
	 * 
	 * @param objectId the remote object id.
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithObjectIdPredicate(
			String objectId) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithObjectIdPredicate(CapitalMarketsLogin.class,
						objectId);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache by searching for requests matching 
	 * the exact scope and parameters provided.
	 * <p>
	 * Example:
	 * </p>
	 * <pre>
	 * {@code
	 * Map<String,String> params = new HashMap<String,String>();
	 * params.put("name", "test");
	 * CapitalMarketsLogin.queryInBackground("all", params, new APCallback<List<CapitalMarketsLogin>>() {
	 *     
	 *     public void finished(List<CapitalMarketsLogin> objects, Throwable ex) {
	 *         if (ex == null) {
	 *             Log.i(TAG, "Objects fetched!");
	 *         } else {
	 *             Log.e(TAG, "Unable to fetch objects!", ex);
	 *         }
	 *     }
	 * });
	 * // Get the cached objects from the above query.
	 * CapitalMarketsLogin.fetchInCacheWithParameterPredicate("all", params);
	 * }
	 *
	 * </pre>
	 * 
	 * @param scope the scope 
	 * @param params the parameter
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithParameterPredicate(
			String scope, Map<String, String> params) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithParameterPredicate(CapitalMarketsLogin.class,
						scope, params);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with provided scope.
	 * 
	 * @param scope the scope.
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithScopePredicate(
			String scope, Integer offset, Integer limit) {
		return fetchInCacheWithScopePredicate(scope, null, offset, limit);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with provided scope.
	 * 
	 * @param scope the scope.
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithScopePredicate(
			String scope) {
		return fetchInCacheWithScopePredicate(scope, null, null);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with provided scope.
	 * 
	 * @param scope the scope
	 * @param params the parameters
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithScopePredicate(
			String scope, Map<String, String> params) {
		return fetchInCacheWithScopePredicate(scope, params, null, null);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with provided scope.
	 * 
	 * @param scope the scope.
	 * @param params the parameters
	 * @param offset the offset
	 * @param limit the limit
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithScopePredicate(
			String scope, Map<String, String> params, Integer offset,
			Integer limit) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithScopePredicate(CapitalMarketsLogin.class,
						scope, params, offset, limit);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with provided request.
	 * 
	 * @param request instance of <tt>com.anypresence.anypresence_inc.citi_mobile_challenge.dao.APCachedRequest</tt>.
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithAPCachedRequestPredicate(
			IAPCachedRequest request) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithAPCachedRequestPredicate(
						CapitalMarketsLogin.class, request);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with latest request.
	 * 
	 * @param scope the scope to perform the query.
	 * @param params a map of parameters.
	 * @param offset offset for the query, or <tt>null</tt> for no offset.
	 * @param limit max results to return back, <tt>null</tt> for no limit.
	 * @return a list of <tt>CapitalMarketsLogin</tt>;
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithLatestAPCachedRequestPredicate(
			String scope, Map<String, String> params, Integer offset,
			Integer limit) {
		return com.anypresence.sdk.APSDKSetup
				.getCacheManager()
				.fetchInCacheWithLatestAPCachedRequestPredicate(
						CapitalMarketsLogin.class, scope, params, offset, limit);
	}

	/**
	 * Fetches <tt>CapitalMarketsLogin</tt> from cache with predicates.
	 *
	 * @see com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsLoginDao.Properties
	 *
	 * @param predicates hash of predicates
	 * @return a list of <tt>CapitalMarketsLogin</tt>
	 */
	public static List<CapitalMarketsLogin> fetchInCacheWithPredicates(
			Map<String, String> predicates) {
		return com.anypresence.sdk.APSDKSetup.getCacheManager()
				.fetchInCacheWithPredicates(CapitalMarketsLogin.class,
						predicates);
	}

	/**
	 * Deletes <tt>CapitalMarketsLogin</tt> from cache matching <tt>objectId</tt>.
	 * 
	 * @param objectId the remote object id.
	 */
	public static void deleteAllInCacheWithObjectIdPredicate(String objectId) {
		com.anypresence.sdk.APSDKSetup.getCacheManager()
				.deleteAllInCacheWithObjectIdPredicate(
						CapitalMarketsLogin.class, objectId);
	}

	/**
	 * Deletes <tt>CapitalMarketsLogin</tt> from cache matching <tt>scope</tt>.
	 * 
	 * @param scope the scope.
	 */
	public static void deleteAllInCacheWithScopePredicate(String scope) {
		com.anypresence.sdk.APSDKSetup.getCacheManager()
				.deleteAllInCacheWithScopePredicate(CapitalMarketsLogin.class,
						scope);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).

		append(token).

		append(password).

		append(username).

		append(getObjectId()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;
		CapitalMarketsLogin other = (CapitalMarketsLogin) obj;
		return new EqualsBuilder().

		append(token, other.token).

		append(password, other.password).

		append(username, other.username).

		append(getObjectId(), other.getObjectId()).isEquals();
	}

	// Backend on Device
	public static String MAPPING = "CapitalMarketsLogin";
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
					.getResponseRemoteFieldName("token"), "token");

			builder.addFieldMapping(((HttpAdapter) routerAdapter)
					.getConfigurationsAsConfiguration("POST")
					.getResponseRemoteFieldName("password"), "password");

			builder.addFieldMapping(((HttpAdapter) routerAdapter)
					.getConfigurationsAsConfiguration("POST")
					.getResponseRemoteFieldName("username"), "username");

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
		CapitalMarketsLogin object = new CapitalMarketsLogin();
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

				object.token = parser.parse(
						configuration.getResponseRemoteFieldName("token"),
						ObjectId.class);

			} catch (PathNotFoundException e) {
				log.info("Unable to deserialize field: " + e.getMessage());
			}

			try {

				object.password = parser.parse(
						configuration.getResponseRemoteFieldName("password"),
						String.class);

			} catch (PathNotFoundException e) {
				log.info("Unable to deserialize field: " + e.getMessage());
			}

			try {

				object.username = parser.parse(
						configuration.getResponseRemoteFieldName("username"),
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

			object = (CapitalMarketsLogin) Utilities.transformJsonToObject(
					json, this.getClass());
		}

		return object;
	}

}
