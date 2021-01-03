package com.dhorowitz.ingroup.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.dhorowitz.ingroup.R
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launchWhenCreated {
            delay(DELAY)
            finish()
        }
    }

    companion object {
        private const val DELAY = 3000L
    }
}
