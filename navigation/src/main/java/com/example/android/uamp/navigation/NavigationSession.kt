package com.example.android.uamp.navigation

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class NavigationSession: Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return NavigationScreen(carContext)
    }
}
