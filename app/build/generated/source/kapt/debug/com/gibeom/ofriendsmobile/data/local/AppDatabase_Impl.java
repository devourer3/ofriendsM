package com.gibeom.ofriendsmobile.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile OfriendsDao _ofriendsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `product` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT, `title` TEXT, `catchPhrase` TEXT, `price` INTEGER, `originPrice` TEXT, `rating` INTEGER, `location` TEXT, `isHot` INTEGER, `isOnly` INTEGER, `isNew` INTEGER, `like` INTEGER, `image_link` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '711367503e47073691b438fb339a848d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `product`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProduct = new HashMap<String, TableInfo.Column>(13);
        _columnsProduct.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("catchPhrase", new TableInfo.Column("catchPhrase", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("price", new TableInfo.Column("price", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("originPrice", new TableInfo.Column("originPrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("rating", new TableInfo.Column("rating", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("isHot", new TableInfo.Column("isHot", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("isOnly", new TableInfo.Column("isOnly", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("isNew", new TableInfo.Column("isNew", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("like", new TableInfo.Column("like", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("image_link", new TableInfo.Column("image_link", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProduct = new TableInfo("product", _columnsProduct, _foreignKeysProduct, _indicesProduct);
        final TableInfo _existingProduct = TableInfo.read(_db, "product");
        if (! _infoProduct.equals(_existingProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "product(com.gibeom.ofriendsmobile.home.data.Product).\n"
                  + " Expected:\n" + _infoProduct + "\n"
                  + " Found:\n" + _existingProduct);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "711367503e47073691b438fb339a848d", "eeeed41b25481e858baa8467558e8777");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "product");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `product`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public OfriendsDao ofriendsDao() {
    if (_ofriendsDao != null) {
      return _ofriendsDao;
    } else {
      synchronized(this) {
        if(_ofriendsDao == null) {
          _ofriendsDao = new OfriendsDao_Impl(this);
        }
        return _ofriendsDao;
      }
    }
  }
}
