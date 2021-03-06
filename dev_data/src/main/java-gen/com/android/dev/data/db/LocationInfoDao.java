package com.android.dev.data.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.android.dev.data.db.LocationInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCATION_INFO".
*/
public class LocationInfoDao extends AbstractDao<LocationInfo, Long> {

    public static final String TABLENAME = "LOCATION_INFO";

    /**
     * Properties of entity LocationInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Longitude = new Property(1, Long.class, "longitude", false, "LONGITUDE");
        public final static Property Latitude = new Property(2, Long.class, "latitude", false, "LATITUDE");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property CreateTime = new Property(4, Long.class, "createTime", false, "CREATE_TIME");
        public final static Property UpdateTime = new Property(5, Long.class, "updateTime", false, "UPDATE_TIME");
    };


    public LocationInfoDao(DaoConfig config) {
        super(config);
    }
    
    public LocationInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCATION_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"LONGITUDE\" INTEGER," + // 1: longitude
                "\"LATITUDE\" INTEGER," + // 2: latitude
                "\"NAME\" TEXT," + // 3: name
                "\"CREATE_TIME\" INTEGER," + // 4: createTime
                "\"UPDATE_TIME\" INTEGER);"); // 5: updateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCATION_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, LocationInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindLong(2, longitude);
        }
 
        Long latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindLong(3, latitude);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        Long createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindLong(5, createTime);
        }
 
        Long updateTime = entity.getUpdateTime();
        if (updateTime != null) {
            stmt.bindLong(6, updateTime);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public LocationInfo readEntity(Cursor cursor, int offset) {
        LocationInfo entity = new LocationInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // longitude
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // latitude
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // createTime
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // updateTime
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, LocationInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLongitude(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setLatitude(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCreateTime(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setUpdateTime(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(LocationInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(LocationInfo entity) {
        if(entity != null) {
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
    
}
