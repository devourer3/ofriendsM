package com.gibeom.ofriendsmobile.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gibeom.ofriendsmobile.home.data.Product;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OfriendsDao_Impl implements OfriendsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Product> __insertionAdapterOfProduct;

  private final SharedSQLiteStatement __preparedStmtOfDeleteLike;

  public OfriendsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProduct = new EntityInsertionAdapter<Product>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `product` (`id`,`type`,`title`,`catchPhrase`,`price`,`originPrice`,`rating`,`location`,`isHot`,`isOnly`,`isNew`,`like`,`image_link`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Product value) {
        stmt.bindLong(1, value.getId());
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getCatchPhrase() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCatchPhrase());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getPrice());
        }
        if (value.getOriginPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOriginPrice());
        }
        if (value.getRating() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getRating());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLocation());
        }
        if (value.isHot() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.isHot());
        }
        if (value.isOnly() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.isOnly());
        }
        if (value.isNew() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.isNew());
        }
        if (value.getLike() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getLike());
        }
        if (value.getImage_link() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getImage_link());
        }
      }
    };
    this.__preparedStmtOfDeleteLike = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM product WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertLike(final Product product) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProduct.insert(product);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteLike(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteLike.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteLike.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Product>> getLikes() {
    final String _sql = "SELECT * FROM product";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"product"}, false, new Callable<List<Product>>() {
      @Override
      public List<Product> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCatchPhrase = CursorUtil.getColumnIndexOrThrow(_cursor, "catchPhrase");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "originPrice");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfIsHot = CursorUtil.getColumnIndexOrThrow(_cursor, "isHot");
          final int _cursorIndexOfIsOnly = CursorUtil.getColumnIndexOrThrow(_cursor, "isOnly");
          final int _cursorIndexOfIsNew = CursorUtil.getColumnIndexOrThrow(_cursor, "isNew");
          final int _cursorIndexOfLike = CursorUtil.getColumnIndexOrThrow(_cursor, "like");
          final int _cursorIndexOfImageLink = CursorUtil.getColumnIndexOrThrow(_cursor, "image_link");
          final List<Product> _result = new ArrayList<Product>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Product _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpCatchPhrase;
            _tmpCatchPhrase = _cursor.getString(_cursorIndexOfCatchPhrase);
            final Integer _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            }
            final String _tmpOriginPrice;
            _tmpOriginPrice = _cursor.getString(_cursorIndexOfOriginPrice);
            final Integer _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            }
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final Integer _tmpIsHot;
            if (_cursor.isNull(_cursorIndexOfIsHot)) {
              _tmpIsHot = null;
            } else {
              _tmpIsHot = _cursor.getInt(_cursorIndexOfIsHot);
            }
            final Integer _tmpIsOnly;
            if (_cursor.isNull(_cursorIndexOfIsOnly)) {
              _tmpIsOnly = null;
            } else {
              _tmpIsOnly = _cursor.getInt(_cursorIndexOfIsOnly);
            }
            final Integer _tmpIsNew;
            if (_cursor.isNull(_cursorIndexOfIsNew)) {
              _tmpIsNew = null;
            } else {
              _tmpIsNew = _cursor.getInt(_cursorIndexOfIsNew);
            }
            final Integer _tmpLike;
            if (_cursor.isNull(_cursorIndexOfLike)) {
              _tmpLike = null;
            } else {
              _tmpLike = _cursor.getInt(_cursorIndexOfLike);
            }
            final String _tmpImage_link;
            _tmpImage_link = _cursor.getString(_cursorIndexOfImageLink);
            _item = new Product(_tmpId,_tmpType,_tmpTitle,_tmpCatchPhrase,_tmpPrice,_tmpOriginPrice,_tmpRating,_tmpLocation,_tmpIsHot,_tmpIsOnly,_tmpIsNew,_tmpLike,_tmpImage_link);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getProductId(final int id) {
    final String _sql = "SELECT COUNT(*) FROM product WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
