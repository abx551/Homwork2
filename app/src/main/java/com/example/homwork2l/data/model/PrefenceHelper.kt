package com.example.homwork2l.data.model
import android.content.Context

    class PrefenceHelper(val context: Context) {
        private var prefenceHelper = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
        var userName: String?
            get() = prefenceHelper.getString(USER_NAME_KEY, "")

            set(value) {
                prefenceHelper.edit().putString(USER_NAME_KEY, "").apply()
            }

        companion object {
            const val USER_NAME_KEY = "userName"
        }
    }
