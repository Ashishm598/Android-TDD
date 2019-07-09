package nasa

class Rover(var directionManager: DirectionManager) {

    fun moveRover(instructions: String) {
        for (input in instructions) {
            when (input) {
                'L', 'l' -> directionManager.shiftRoverToLeft()
                'R', 'r' -> directionManager.shiftRoverToRight()
                'M', 'm' -> directionManager.moveRoverLocation()
                else -> {
                    println("Invalid Instructions!")
                }
            }
        }
    }

}