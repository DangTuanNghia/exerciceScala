object Exrecise extends App {
  def descTime(milliseconds: Long) = {
    val secs = milliseconds / 1000
    val days = secs / 86400
    val hours = (secs % 86400) / 3600
    val minutes = (secs % 3600) / 60
    val seconds = secs / 60
    println(s"$days days, $hours hours, $minutes minutes, $seconds seconds")
  }
  descTime(234234234L)
}
