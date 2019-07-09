package util

class DirectionManager {

    val directions: HashMap<Char, Int> = HashMap()

    init {
        directions.put('N', 90)
        directions.put('S', -90)
        directions.put('E', 180)
        directions.put('W', -180)
    }

    fun isCorrectDirection(d: Char): Boolean {
        for (key in directions.keys) {
            if (key == d) {
                return true
            }
        }
        return false
    }

    fun getCurrentAngelByDirection(d: Char): Int {
        return directions.getValue(d)
    }

    fun rotateDirectionClockwise(roverCurrentDirection: Char): Char? {
        when (getCurrentAngelByDirection(roverCurrentDirection)) {
            90 -> return 'E'
            -90 -> return 'W'
            180 -> return 'S'
            -180 -> return 'N'
        }
        return null
    }

    fun rotateDirectionAntiClockwise(roverCurrentDirection: Char): Char? {
        when (getCurrentAngelByDirection(roverCurrentDirection)) {
            90 -> return 'W'
            -90 -> return 'E'
            180 -> return 'N'
            -180 -> return 'S'
        }
        return null
    }


}