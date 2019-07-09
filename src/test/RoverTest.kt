package test

import nasa.Rover
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RoverTest {

    var rover: Rover? = null

    @Test
    fun checkRoverInitialPostionOnPlateu() {
        rover = Rover(1, 2, 'N')

        Assertions.assertEquals(rover!!.roverXPosition, 1)
        Assertions.assertEquals(rover!!.roverYPosition, 2)
        Assertions.assertEquals(rover!!.roverCurrentDirection, 'N')

    }

    @Test
    fun checkRoverCurrentPositionBasedOnInstructions() {
        rover = Rover(3, 3, 'E')
        rover!!.moveRover("MMRMMRMRRM")

        Assertions.assertEquals(rover!!.roverXPosition, 5)
        Assertions.assertEquals(rover!!.roverYPosition, 1)
        Assertions.assertEquals(rover!!.roverCurrentDirection, 'E')
    }


}