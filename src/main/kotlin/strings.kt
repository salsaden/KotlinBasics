fun main(){
    var text="Hello World"
    var school="eMobilis"
    var day="It's a Saturday"  //never use a double quote inside another double quote

    println(text[0]) //Accessing an element
    println(text[10])

    println(text.indexOf('H'))
    println(text.indexOf("World"))

    println(text.toUpperCase())
    println(text.toLowerCase())

    println(text+" "+school) //string concatenation
    println(text.plus(school))

    println(text+ ", I study at "+school)
    println("$text, I study at $school") //string interpolation


}