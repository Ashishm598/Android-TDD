package test

import nasa.Rover
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import nasa.DirectionManager
import nasa.LocationManager

class RoverTest {

    var rover: Rover? = null
    var locationManager: LocationManager? = null
    var directionManager: DirectionManager? = null

    @Test
    fun checkRoverInitialPostionOnPlateu() {

        locationManager = LocationManager(1, 2)
        directionManager = DirectionManager(locationManager!!, 'N')
        rover = Rover(directionManager!!)

        rover!!.moveRover("LMLMLMLMM")

        Assertions.assertEquals(rover?.directionManager?.locationManager?.Xaxis, 1)
        Assertions.assertEquals(rover?.directionManager?.locationManager?.Yaxis, 3)
        Assertions.assertEquals(rover?.directionManager?.currentDirection, 'N')

    }

    @Test
    fun checkRoverCurrentPositionBasedOnInstructions() {

        locationManager = LocationManager(3, 3)
        directionManager = DirectionManager(locationManager!!,'E')
        rover = Rover(directionManager!!)

        rover!!.moveRover("MMRMMRMRRM")

        Assertions.assertEquals(rover?.directionManager?.locationManager?.Xaxis, 5)
        Assertions.assertEquals(rover?.directionManager?.locationManager?.Yaxis, 1)
        Assertions.assertEquals(rover?.directionManager?.currentDirection, 'E')
    }


}