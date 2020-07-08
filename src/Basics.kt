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

    NOTES:
    - assigning between nullable and non-nullable
    - elvis operator
    - optional chaining
    - val, var and const

 */


val aString: String = "someString"
val maybeAString: String? = null

val definitelyAString: String = maybeAString ?: ""
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

                                                                                                              */



data class Person(
    val name: String,
    val age: Int
)

fun add(x: Int, y: Int = 5): Int = x + y

fun main() {
    val p = Person(
        name = "name",
        age = 42
    )

    println(p.copy(age = 43))
    println(p)

    println(p.copy() == p)

    add(x = 2, y = 7)
}