package nasa

class DirectionManager(var locationManager: LocationManager, var currentDirection: Char) {

    val directionList = arrayOf('N', 'E', 'S', 'W')


    private fun getPointerByDirection(currentDirection: Char): Int {
        return directionList.indexOf(currentDirection)
    }

    private fun getCurrentDirectionByCurrentPointer(currentPointer: Int): Char {
        return directionList.get(currentPointer)
    }

    fun shiftRoverToLeft() {
        if (getPointerByDirection(currentDirection) == 0) currentDirection = directionList.get(directionList.lastIndex)
        else
            currentDirection = directionList.get(getPointerByDirection(currentDirection).minus(1))
    }

    fun shiftRoverToRight() {
        if (currentDirection == directionList.get(directionList.lastIndex)) currentDirection = directionList.get(0)
        else
            currentDirection = directionList.get(getPointerByDirection(currentDirection).plus(1))
    }

    fun moveRoverLocation() {
        when (currentDirection) {
            'N' -> locationManager.Yaxis++   // move Y axis up ++
            'S' -> locationManager.Yaxis-- // move Y axis down --
            'E' -> locationManager.Xaxis++  // move X axis forward ++
            'W' -> locationManager.Xaxis-- // move X axis backward --
        }
    }


}