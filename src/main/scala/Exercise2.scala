object Exercise2 extends App {
val color1: String = "cyan"
val color2: String = "magenta"
val color3: String = "yellow"

  val colorOutput = color1 match {
    case "cyan" => println(s"#2323")
    case "magenta" => println(s"#4343")
    case "yellow" =>println(s"#5636")
  }
}
