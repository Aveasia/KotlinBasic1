fun main (){
    val secondsInSpace: Int = 6480
    val hours = (secondsInSpace / 3600)
    val secondsAfterHours = (secondsInSpace % 3600)
    val minutes = (secondsAfterHours / 60)
    val seconds = (secondsAfterHours % 60)
    println("$hours:$minutes:$seconds")
}
