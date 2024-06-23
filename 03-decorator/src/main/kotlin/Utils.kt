package org.hf_design_patterns.decorator

import java.math.BigDecimal
import java.math.RoundingMode

fun roundToTwoDecimalPlaces(number: Double): Double {
    val roundedNumber = BigDecimal(number).setScale(2, RoundingMode.HALF_EVEN)
    return roundedNumber.toDouble()
}