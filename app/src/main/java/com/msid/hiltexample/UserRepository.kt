package com.msid.hiltexample

import android.util.Log
import javax.inject.Inject

const val TAG = "MUSID"
class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String){
        Log.d(TAG, "User saved in Repository")
    }
}