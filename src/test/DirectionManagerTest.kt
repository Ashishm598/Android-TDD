package test

import nasa.DirectionManager
import nasa.LocationManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DirectionManagerTest {

    var directionManager: DirectionManager? = null
    var locationManager: LocationManager? = null

    @Test
    fun shouldReturnSouthIfDefaultDirectionIsNorth_CommandInserted_LL() {
        locationManager = LocationManager(3, 3)
        directionManager = DirectionManager(locationManager!!, 'N')

        Assertions.assertEquals('N', directionManager?.currentDirection)

    }


}