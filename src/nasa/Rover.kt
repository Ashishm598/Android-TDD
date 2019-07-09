package nasa

import util.DirectionManager

class Rover(
        var roverXPosition: Int,
        var roverYPosition: Int,
        var roverCurrentDirection: Char) {


    val directionManager = DirectionManager()

    fun moveRover(instructions: String) {
        for (input in instructions) {
            when (input) {
                'L', 'l' -> shiftRoverToLeft()
                'R', 'r' -> shiftRoverToRight()
                'M', 'm' -> moveRoverLocation()
                else -> {
                    println("Invalid Instructions!")
                }
            }
        }
    }

    fun moveRoverLocation() {
        when (directionManager.getCurrentAngelByDirection(roverCurrentDirection)) {
            90 -> roverYPosition++
            -90 -> roverYPosition--
            180 -> roverXPosition++
            -180 -> roverXPosition--
        }
    }

    private fun shiftRoverToRight() {
      this.roverCurrentDirection = directionManager.rotateDirectionClockwise(roverCurrentDirection)!!
    }

    private fun shiftRoverToLeft() {
        this.roverCurrentDirection = directionManager.rotateDirectionAntiClockwise(roverCurrentDirection)!!
    }

    fun setRoverCurrentPostion(Xposition: Int, Yposition: Int, direction: Char) {
        this.roverXPosition = Xposition
        this.roverYPosition = Yposition
        if (directionManager.isCorrectDirection(direction))
            this.roverCurrentDirection = direction
        else
            println("Invalid Direction!")
    }


}