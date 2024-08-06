package com.example.android.uamp.charging

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session
import com.example.android.uamp.charging.ChargingScreen

class ChargingSession: Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return ChargingScreen(carContext)
    }
}
