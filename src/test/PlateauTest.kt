package test

import nasa.Plateau
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class PlateauTest {

    var plateau: Plateau? = null

    @Test
    fun checkPlateauWidth_Height() {
        plateau = Plateau(5, 5)
        Assertions.assertEquals(plateau?.width,5)
        Assertions.assertEquals(plateau?.height,6)
    }

}