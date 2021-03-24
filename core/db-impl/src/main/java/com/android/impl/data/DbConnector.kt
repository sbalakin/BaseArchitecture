package com.android.impl.data

import android.content.Context
import com.android.api.data.RoomApi
import javax.inject.Inject

class DbConnector @Inject constructor(room: Room) : RoomApi {

    fun hello() : String = "Hello"

}