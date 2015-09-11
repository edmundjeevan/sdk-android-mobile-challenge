package com.anypresence.anypresence_inc.citi_mobile_challenge.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import com.anypresence.anypresence_inc.citi_mobile_challenge.dao.CapitalMarketsOrder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CAPITALMARKETSORDERS.
 */
public class CapitalMarketsOrderDao
		extends
			AbstractDao<CapitalMarketsOrder, Long> {

	public static final String TABLENAME = "CAPITALMARKETSORDERS";

	/**
	 * Properties of entity CapitalMarketsOrder.<br/>
	 * Can be used for QueryBuilder and for referencing column names.
	 */
	public static class Properties {
		public final static Property Id = new Property(0, Long.class, "id",
				true, "_id");
		public final static Property Comments = new Property(1, String.class,
				"comments", false, "COMMENTS");
		public final static Property Currency = new Property(2, String.class,
				"currency", false, "CURRENCY");
		public final static Property LastPrice = new Property(3, Float.class,
				"lastPrice", false, "LAST_PRICE");
		public final static Property LastQty = new Property(4, Integer.class,
				"lastQty", false, "LAST_QTY");
		public final static Property Price = new Property(5, Float.class,
				"price", false, "PRICE");
		public final static Property Quantity = new Property(6, Integer.class,
				"quantity", false, "QUANTITY");
		public final static Property Side = new Property(7, String.class,
				"side", false, "SIDE");
		public final static Property Status = new Property(8, String.class,
				"status", false, "STATUS");
		public final static Property Symbol = new Property(9, String.class,
				"symbol", false, "SYMBOL");
		public final static Property TransactTime = new Property(10,
				String.class, "transactTime", false, "TRANSACT_TIME");
		public final static Property Scope = new Property(11, String.class,
				"scope", false, "SCOPE");
		public final static Property ObjectId = new Property(12, String.class,
				"objectId", false, "OBJECT_ID");
		public final static Property _cacheUpdatedAt = new Property(13,
				java.util.Date.class, "_cacheUpdatedAt", false,
				"_CACHE_UPDATED_AT");
		public final static Property ApCachedRequestId = new Property(14,
				Long.class, "apCachedRequestId", false, "AP_CACHED_REQUEST_ID");
	};

	private DaoSession daoSession;

	public CapitalMarketsOrderDao(DaoConfig config) {
		super(config);
	}

	public CapitalMarketsOrderDao(DaoConfig config, DaoSession daoSession) {
		super(config, daoSession);
		this.daoSession = daoSession;
	}

	/** Creates the underlying database table. */
	public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
		String constraint = ifNotExists ? "IF NOT EXISTS " : "";
		db.execSQL("CREATE TABLE " + constraint + "'CAPITALMARKETSORDERS' (" + //
				"'_id' INTEGER PRIMARY KEY ," + // 0: id
				"'COMMENTS' TEXT," + // 1: comments
				"'CURRENCY' TEXT," + // 2: currency
				"'LAST_PRICE' REAL," + // 3: lastPrice
				"'LAST_QTY' INTEGER," + // 4: lastQty
				"'PRICE' REAL," + // 5: price
				"'QUANTITY' INTEGER," + // 6: quantity
				"'SIDE' TEXT," + // 7: side
				"'STATUS' TEXT," + // 8: status
				"'SYMBOL' TEXT," + // 9: symbol
				"'TRANSACT_TIME' TEXT," + // 10: transactTime
				"'SCOPE' TEXT," + // 11: scope
				"'OBJECT_ID' TEXT," + // 12: objectId
				"'_CACHE_UPDATED_AT' INTEGER," + // 13: _cacheUpdatedAt
				"'AP_CACHED_REQUEST_ID' INTEGER);"); // 14: apCachedRequestId
		// Add Indexes
		db.execSQL("CREATE UNIQUE INDEX " + constraint
				+ "IDX_CAPITALMARKETSORDERS_OBJECT_ID ON CAPITALMARKETSORDERS"
				+ " (OBJECT_ID);");
	}

	/** Drops the underlying database table. */
	public static void dropTable(SQLiteDatabase db, boolean ifExists) {
		String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "")
				+ "'CAPITALMARKETSORDERS'";
		db.execSQL(sql);
	}

	/** @inheritdoc */
	@Override
	protected void bindValues(SQLiteStatement stmt, CapitalMarketsOrder entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}

		String comments = entity.getComments();
		if (comments != null) {
			stmt.bindString(2, comments);
		}

		String currency = entity.getCurrency();
		if (currency != null) {
			stmt.bindString(3, currency);
		}

		Float lastPrice = entity.getLastPrice();
		if (lastPrice != null) {
			stmt.bindDouble(4, lastPrice);
		}

		Integer lastQty = entity.getLastQty();
		if (lastQty != null) {
			stmt.bindLong(5, lastQty);
		}

		Float price = entity.getPrice();
		if (price != null) {
			stmt.bindDouble(6, price);
		}

		Integer quantity = entity.getQuantity();
		if (quantity != null) {
			stmt.bindLong(7, quantity);
		}

		String side = entity.getSide();
		if (side != null) {
			stmt.bindString(8, side);
		}

		String status = entity.getStatus();
		if (status != null) {
			stmt.bindString(9, status);
		}

		String symbol = entity.getSymbol();
		if (symbol != null) {
			stmt.bindString(10, symbol);
		}

		String transactTime = entity.getTransactTime();
		if (transactTime != null) {
			stmt.bindString(11, transactTime);
		}

		String scope = entity.getScope();
		if (scope != null) {
			stmt.bindString(12, scope);
		}

		String objectId = entity.getObjectId();
		if (objectId != null) {
			stmt.bindString(13, objectId);
		}

		java.util.Date _cacheUpdatedAt = entity.get_cacheUpdatedAt();
		if (_cacheUpdatedAt != null) {
			stmt.bindLong(14, _cacheUpdatedAt.getTime());
		}

		Long apCachedRequestId = entity.getApCachedRequestId();
		if (apCachedRequestId != null) {
			stmt.bindLong(15, apCachedRequestId);
		}
	}

	@Override
	protected void attachEntity(CapitalMarketsOrder entity) {
		super.attachEntity(entity);
		entity.__setDaoSession(daoSession);
	}

	/** @inheritdoc */
	@Override
	public Long readKey(Cursor cursor, int offset) {
		return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
	}

	/** @inheritdoc */
	@Override
	public CapitalMarketsOrder readEntity(Cursor cursor, int offset) {
		CapitalMarketsOrder entity = new CapitalMarketsOrder(
				//
				cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
				cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // comments
				cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // currency
				cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3), // lastPrice
				cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // lastQty
				cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // price
				cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // quantity
				cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // side
				cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // status
				cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // symbol
				cursor.isNull(offset + 10) ? null : cursor
						.getString(offset + 10), // transactTime
				cursor.isNull(offset + 11) ? null : cursor
						.getString(offset + 11), // scope
				cursor.isNull(offset + 12) ? null : cursor
						.getString(offset + 12), // objectId
				cursor.isNull(offset + 13) ? null : new java.util.Date(cursor
						.getLong(offset + 13)), // _cacheUpdatedAt
				cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14) // apCachedRequestId
		);
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, CapitalMarketsOrder entity, int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setComments(cursor.isNull(offset + 1) ? null : cursor
				.getString(offset + 1));
		entity.setCurrency(cursor.isNull(offset + 2) ? null : cursor
				.getString(offset + 2));
		entity.setLastPrice(cursor.isNull(offset + 3) ? null : cursor
				.getFloat(offset + 3));
		entity.setLastQty(cursor.isNull(offset + 4) ? null : cursor
				.getInt(offset + 4));
		entity.setPrice(cursor.isNull(offset + 5) ? null : cursor
				.getFloat(offset + 5));
		entity.setQuantity(cursor.isNull(offset + 6) ? null : cursor
				.getInt(offset + 6));
		entity.setSide(cursor.isNull(offset + 7) ? null : cursor
				.getString(offset + 7));
		entity.setStatus(cursor.isNull(offset + 8) ? null : cursor
				.getString(offset + 8));
		entity.setSymbol(cursor.isNull(offset + 9) ? null : cursor
				.getString(offset + 9));
		entity.setTransactTime(cursor.isNull(offset + 10) ? null : cursor
				.getString(offset + 10));
		entity.setScope(cursor.isNull(offset + 11) ? null : cursor
				.getString(offset + 11));
		entity.setObjectId(cursor.isNull(offset + 12) ? null : cursor
				.getString(offset + 12));
		entity.set_cacheUpdatedAt(cursor.isNull(offset + 13)
				? null
				: new java.util.Date(cursor.getLong(offset + 13)));
		entity.setApCachedRequestId(cursor.isNull(offset + 14) ? null : cursor
				.getLong(offset + 14));
	}

	/** @inheritdoc */
	@Override
	protected Long updateKeyAfterInsert(CapitalMarketsOrder entity, long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(CapitalMarketsOrder entity) {
		if (entity != null) {
			return entity.getId();
		} else {
			return null;
		}
	}

	/** @inheritdoc */
	@Override
	protected boolean isEntityUpdateable() {
		return true;
	}

	private String selectDeep;

	protected String getSelectDeep() {
		if (selectDeep == null) {
			StringBuilder builder = new StringBuilder("SELECT ");
			SqlUtils.appendColumns(builder, "T", getAllColumns());
			builder.append(',');
			SqlUtils.appendColumns(builder, "T0", daoSession
					.getAPCachedRequestDao().getAllColumns());
			builder.append(" FROM CAPITALMARKETSORDERS T");
			builder.append(" LEFT JOIN APCACHED_REQUEST T0 ON T.'AP_CACHED_REQUEST_ID'=T0.'_id'");
			builder.append(' ');
			selectDeep = builder.toString();
		}
		return selectDeep;
	}

	protected CapitalMarketsOrder loadCurrentDeep(Cursor cursor, boolean lock) {
		CapitalMarketsOrder entity = loadCurrent(cursor, 0, lock);
		int offset = getAllColumns().length;

		APCachedRequest aPCachedRequest = loadCurrentOther(
				daoSession.getAPCachedRequestDao(), cursor, offset);
		entity.setAPCachedRequest(aPCachedRequest);

		return entity;
	}

	public CapitalMarketsOrder loadDeep(Long key) {
		assertSinglePk();
		if (key == null) {
			return null;
		}

		StringBuilder builder = new StringBuilder(getSelectDeep());
		builder.append("WHERE ");
		SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
		String sql = builder.toString();

		String[] keyArray = new String[]{key.toString()};
		Cursor cursor = db.rawQuery(sql, keyArray);

		try {
			boolean available = cursor.moveToFirst();
			if (!available) {
				return null;
			} else if (!cursor.isLast()) {
				throw new IllegalStateException(
						"Expected unique result, but count was "
								+ cursor.getCount());
			}
			return loadCurrentDeep(cursor, true);
		} finally {
			cursor.close();
		}
	}

	/** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
	public List<CapitalMarketsOrder> loadAllDeepFromCursor(Cursor cursor) {
		int count = cursor.getCount();
		List<CapitalMarketsOrder> list = new ArrayList<CapitalMarketsOrder>(
				count);

		if (cursor.moveToFirst()) {
			if (identityScope != null) {
				identityScope.lock();
				identityScope.reserveRoom(count);
			}
			try {
				do {
					list.add(loadCurrentDeep(cursor, false));
				} while (cursor.moveToNext());
			} finally {
				if (identityScope != null) {
					identityScope.unlock();
				}
			}
		}
		return list;
	}

	protected List<CapitalMarketsOrder> loadDeepAllAndCloseCursor(Cursor cursor) {
		try {
			return loadAllDeepFromCursor(cursor);
		} finally {
			cursor.close();
		}
	}

	/** A raw-style query where you can pass any WHERE clause and arguments. */
	public List<CapitalMarketsOrder> queryDeep(String where,
			String... selectionArg) {
		Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
		return loadDeepAllAndCloseCursor(cursor);
	}

}