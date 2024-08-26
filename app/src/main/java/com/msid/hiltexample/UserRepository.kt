package com.msid.hiltexample

import android.util.Log
import javax.inject.Inject

const val TAG = "MUSID"

interface  UserRepository{
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor(): UserRepository {

    override fun saveUser(email: String, password: String){
        Log.d(TAG, "User saved in DB")
    }
}

class Firebaserepository: UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in Firebase")
    }

}