import java.time.Instant

/*

$$$$$$$\                      $$\
$$  __$$\                     \__|
$$ |  $$ | $$$$$$\   $$$$$$$\ $$\  $$$$$$$\  $$$$$$$\
$$$$$$$\ | \____$$\ $$  _____|$$ |$$  _____|$$  _____|
$$  __$$\  $$$$$$$ |\$$$$$$\  $$ |$$ /      \$$$$$$\
$$ |  $$ |$$  __$$ | \____$$\ $$ |$$ |       \____$$\
$$$$$$$  |\$$$$$$$ |$$$$$$$  |$$ |\$$$$$$$\ $$$$$$$  |
\_______/  \_______|\_______/ \__| \_______|\_______/

 */
































/*

$$\   $$\ $$$$$$$\  $$$$$$$$\
$$$\  $$ |$$  __$$\ $$  _____|
$$$$\ $$ |$$ |  $$ |$$ |
$$ $$\$$ |$$$$$$$  |$$$$$\
$$ \$$$$ |$$  ____/ $$  __|
$$ |\$$$ |$$ |      $$ |
$$ | \$$ |$$ |      $$$$$$$$\
\__|  \__|\__|      \________|


aka the billion dollar mistake

    - assigning between nullable and non-nullable
    - elvis operator
    - optional chaining
    - val, var and const

 */


val aString: String = "someString"
val maybeAString: String? = null

val definitelyAString: String = maybeAString ?: "default"
val definitelyMaybeAString: String? = aString

// https://pbs.twimg.com/media/DEGrJDNXoAAeVfT.jpg







// what about Java ?

fun doSomeJava() {
    val java = GoodOldJava()
    val javaString: String? = java.someString
    println(javaString?.length)
}
















/*

$$$$$$$\             $$\                      $$$$$$\  $$\
$$  __$$\            $$ |                    $$  __$$\ $$ |
$$ |  $$ | $$$$$$\ $$$$$$\    $$$$$$\        $$ /  \__|$$ | $$$$$$\   $$$$$$$\  $$$$$$$\  $$$$$$\   $$$$$$$\
$$ |  $$ | \____$$\\_$$  _|   \____$$\       $$ |      $$ | \____$$\ $$  _____|$$  _____|$$  __$$\ $$  _____|
$$ |  $$ | $$$$$$$ | $$ |     $$$$$$$ |      $$ |      $$ | $$$$$$$ |\$$$$$$\  \$$$$$$\  $$$$$$$$ |\$$$$$$\
$$ |  $$ |$$  __$$ | $$ |$$\ $$  __$$ |      $$ |  $$\ $$ |$$  __$$ | \____$$\  \____$$\ $$   ____| \____$$\
$$$$$$$  |\$$$$$$$ | \$$$$  |\$$$$$$$ |      \$$$$$$  |$$ |\$$$$$$$ |$$$$$$$  |$$$$$$$  |\$$$$$$$\ $$$$$$$  |
\_______/  \_______|  \____/  \_______|       \______/ \__| \_______|\_______/ \_______/  \_______|\_______/


    - immutability
    - primary constructor
    - copy, equals, hashCode
    - named arguments
    - destructuring
    - extending classes and methods

*/


open class Person(
    val name: String,
    val age: Int
)





























/*

 $$$$$$\            $$\ $$\                       $$\     $$\
$$  __$$\           $$ |$$ |                      $$ |    \__|
$$ /  \__| $$$$$$\  $$ |$$ | $$$$$$\   $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\   $$$$$$$\
$$ |      $$  __$$\ $$ |$$ |$$  __$$\ $$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\ $$  _____|
$$ |      $$ /  $$ |$$ |$$ |$$$$$$$$ |$$ /        $$ |    $$ |$$ /  $$ |$$ |  $$ |\$$$$$$\
$$ |  $$\ $$ |  $$ |$$ |$$ |$$   ____|$$ |        $$ |$$\ $$ |$$ |  $$ |$$ |  $$ | \____$$\
\$$$$$$  |\$$$$$$  |$$ |$$ |\$$$$$$$\ \$$$$$$$\   \$$$$  |$$ |\$$$$$$  |$$ |  $$ |$$$$$$$  |
 \______/  \______/ \__|\__| \_______| \_______|   \____/ \__| \______/ \__|  \__|\_______/

 */



// The default in Kotlin is immutable

val list = listOf(1, 2, 3, 4)
val mutableList = mutableListOf(1, 2, 3, 4)

val set = setOf(1, 2, 3, 4)
val mutableSet = mutableSetOf(1, 2, 3, 4)

val map = mapOf(
        1 to 1,
        2 to 2,
        3 to 3,
        4 to 4
)




















/*

 $$$$$$\    $$\
$$  __$$\   $$ |
$$ /  \__|$$$$$$\    $$$$$$\   $$$$$$\   $$$$$$\  $$$$$$\$$$$\   $$$$$$$\
\$$$$$$\  \_$$  _|  $$  __$$\ $$  __$$\  \____$$\ $$  _$$  _$$\ $$  _____|
 \____$$\   $$ |    $$ |  \__|$$$$$$$$ | $$$$$$$ |$$ / $$ / $$ |\$$$$$$\
$$\   $$ |  $$ |$$\ $$ |      $$   ____|$$  __$$ |$$ | $$ | $$ | \____$$\
\$$$$$$  |  \$$$$  |$$ |      \$$$$$$$\ \$$$$$$$ |$$ | $$ | $$ |$$$$$$$  |
 \______/    \____/ \__|       \_______| \_______|\__| \__| \__|\_______/

// actually, there's no such thing in kotlin

 */

fun main() {
    streams()
}

fun streams() {
    val result = list.map { it + 1 }.filter { it % 2 == 0 }.also { println(it) }

    println(result::class)
}


































/*

$$$$$$$$\             $$\                                   $$\
$$  _____|            $$ |                                  \__|
$$ |      $$\   $$\ $$$$$$\    $$$$$$\  $$$$$$$\   $$$$$$$\ $$\  $$$$$$\  $$$$$$$\   $$$$$$$\
$$$$$\    \$$\ $$  |\_$$  _|  $$  __$$\ $$  __$$\ $$  _____|$$ |$$  __$$\ $$  __$$\ $$  _____|
$$  __|    \$$$$  /   $$ |    $$$$$$$$ |$$ |  $$ |\$$$$$$\  $$ |$$ /  $$ |$$ |  $$ |\$$$$$$\
$$ |       $$  $$<    $$ |$$\ $$   ____|$$ |  $$ | \____$$\ $$ |$$ |  $$ |$$ |  $$ | \____$$\
$$$$$$$$\ $$  /\$$\   \$$$$  |\$$$$$$$\ $$ |  $$ |$$$$$$$  |$$ |\$$$$$$  |$$ |  $$ |$$$$$$$  |
\________|\__/  \__|   \____/  \_______|\__|  \__|\_______/ \__| \______/ \__|  \__|\_______/



    - statically resolved
    - nullable or non-nullable receiver
    - visibility
    - can be used on Java types

*/

val members = listOf("John", "Geoffrey", "Hanspeter")

// extension method
fun List<String>.getLongestName() = this.maxBy { it.length }

// extension property
val List<String>.second get() = get(1)





























/*

 $$$$$$\
$$  __$$\
$$ /  \__|$$\   $$\  $$$$$$\   $$$$$$\   $$$$$$\
\$$$$$$\  $$ |  $$ |$$  __$$\  \____$$\ $$  __$$\
 \____$$\ $$ |  $$ |$$ /  $$ | $$$$$$$ |$$ |  \__|
$$\   $$ |$$ |  $$ |$$ |  $$ |$$  __$$ |$$ |
\$$$$$$  |\$$$$$$  |\$$$$$$$ |\$$$$$$$ |$$ |
 \______/  \______/  \____$$ | \_______|\__|
                    $$\   $$ |
                    \$$$$$$  |
                     \______/
 */




// *** Ranges ***

fun ranges() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 1 until 3) {
        println(i)
    }

    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}










// *** Infix functions ***

infix fun String.shouldMatch(other: String) = this == other




















// *** Strings

val template =  """
                    |This is a template that we
                    |could use for stuff like emails
                    |and whatnot.
""".trimMargin()





















// ** Operator overloading

data class Point(
        val x: Int,
        val y: Int
) {

    operator fun plus(other: Point): Point = this.copy(
            x = this.x + other.x,
            y = this.y + other.y
    )

    operator fun rangeTo(other: Point): List<Point> = listOf()
}
































// When

fun doSomeSwitching(name: String) {
    val message = when {
        name.isBlank() -> "it's empty"
        name.length > 50 -> "it's a pretty long string"
        else -> "it's a pretty regular string"
    }
    println(message)
}

fun whatIsIt(any: Any) {
    val message = when (any) {
        is String -> "it's a string of length ${any.length}" // smart cast!
        is Int -> "it's a number and it's square is ${any * any}"
        else -> "it's nothing interesting"
    }
    println(message)
}



























// Nice test methods

fun `should do expected stuff when stuff happens`() {

}