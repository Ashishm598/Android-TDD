package test

import nasa.LocationManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LocationManagerTest {

    var locationManager: LocationManager? = null

    @Test
    fun checkXaxis_YaxisOfLocationManager() {
        locationManager = LocationManager(4, 5)
        assertEquals(4, locationManager?.Xaxis)
        assertEquals(5, locationManager?.Yaxis)
    }


}