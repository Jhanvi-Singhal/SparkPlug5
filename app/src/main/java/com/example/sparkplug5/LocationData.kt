package com.example.sparkplug5

data class LocationData(
    var origins: String,
    var destinations: List<String>
)
data class Response(
    val results:List<DistanceResult>
)

data class DistanceResult(
    val destination:String,
    val distance:Int,
    val time: String
)