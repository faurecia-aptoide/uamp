package com.example.android.uamp.poi

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class POISession: Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return POIScreen(carContext)
    }
}
