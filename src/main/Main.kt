import nasa.DirectionManager
import nasa.LocationManager
import nasa.Plateau
import nasa.Rover

fun main(args: Array<String>) {

    val plateau: Plateau?
    val rover: Rover?
    val locationManager: LocationManager?
    val directionManager: DirectionManager?

    plateau = Plateau(5, 5)
    locationManager = LocationManager(3, 3)
    directionManager = DirectionManager(locationManager, 'E')
    rover = Rover(directionManager)
    rover.moveRover("MMRMMRMRRM")
}