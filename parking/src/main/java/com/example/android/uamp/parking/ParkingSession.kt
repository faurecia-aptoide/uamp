package com.example.android.uamp.parking

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class ParkingSession: Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return ParkingScreen(carContext)
    }
}
