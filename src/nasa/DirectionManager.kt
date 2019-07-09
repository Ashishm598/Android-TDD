package nasa

class DirectionManager(var locationManager: LocationManager, var currentDirection: Char) {

    val directionList = arrayOf('N', 'E', 'S', 'W')
    var currentDirectionPointer = getPointerByDirection(currentDirection)

    private fun getPointerByDirection(currentDirection: Char): Int {
        return directionList.indexOf(currentDirection)
    }

    private fun getCurrentDirectionByCurrentPointer(currentPointer: Int): Char {
        return directionList.get(currentPointer)
    }

    fun shiftRoverToLeft() {
        if (currentDirectionPointer == 0) currentDirectionPointer = directionList.lastIndex
        else
            currentDirectionPointer--
    }

    fun shiftRoverToRight() {
        if (currentDirectionPointer == directionList.lastIndex) currentDirectionPointer = 0
        else
            currentDirectionPointer++
    }

    fun moveRoverLocation() {
        when (getCurrentDirectionByCurrentPointer(currentDirectionPointer)) {
            'N' -> locationManager.Yaxis++   // move Y axis up ++
            'S' -> locationManager.Yaxis-- // move Y axis down --
            'E' -> locationManager.Xaxis++  // move X axis forward ++
            'W' -> locationManager.Xaxis-- // move X axis backward --
        }
    }


}