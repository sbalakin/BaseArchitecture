package com.android.impl.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Product (
        @PrimaryKey
        @SerializedName("id")
        val id : Int?,

        @ColumnInfo(name = "title")
        @SerializedName("title")
        val title : String?,

        @ColumnInfo(name = "price")
        @SerializedName("price")
        val price : Double?,

        @ColumnInfo(name = "description")
        @SerializedName("description")
        val description : String?,

        @ColumnInfo(name = "category")
        @SerializedName("category")
        val category : String?,

        @ColumnInfo(name = "image")
        @SerializedName("image")
        val image : String?
)




