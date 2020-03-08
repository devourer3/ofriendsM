package com.gibeom.ofriendsmobile.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.gibeom.ofriendsmobile.home.data.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun ofriendsDao(): OfriendsDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        // Create and pre-populate the database. See this article for more details:
        // https://medium.com/google-developers/7-pro-tips-for-room-fbadea4bfbd1#4785
        private fun buildDatabase(context: Context): AppDatabase {
//            val migration_1_2 = object : Migration(1,2) {
//                override fun migrate(database: SupportSQLiteDatabase) {
//                    database.execSQL(
//                        """
//                                ALTER TABLE Product ADD COLUMN `like` INTEGER
//                                """)
//                }
//            }
            return Room.databaseBuilder(context, AppDatabase::class.java, "ofriends.db")
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onOpen(db: SupportSQLiteDatabase) {
                        super.onOpen(db)
                    }
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                    }
                })
//                .addMigrations(migration_1_2)
                .build()
        }

    }

}