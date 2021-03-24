package com.android.impl.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.impl.data.Product

@Database(entities = [Product::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDAO
}