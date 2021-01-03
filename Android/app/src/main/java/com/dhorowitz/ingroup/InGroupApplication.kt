package com.dhorowitz.ingroup

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class InGroupApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
