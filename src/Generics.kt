/*

 $$$$$$\                                          $$\
$$  __$$\                                         \__|
$$ /  \__| $$$$$$\  $$$$$$$\   $$$$$$\   $$$$$$\  $$\  $$$$$$$\  $$$$$$$\
$$ |$$$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$ |$$  _____|$$  _____|
$$ |\_$$ |$$$$$$$$ |$$ |  $$ |$$$$$$$$ |$$ |  \__|$$ |$$ /      \$$$$$$\
$$ |  $$ |$$   ____|$$ |  $$ |$$   ____|$$ |      $$ |$$ |       \____$$\
\$$$$$$  |\$$$$$$$\ $$ |  $$ |\$$$$$$$\ $$ |      $$ |\$$$$$$$\ $$$$$$$  |
 \______/  \_______|\__|  \__| \_______|\__|      \__| \_______|\_______/

    - covariance, contravariance
    - no raw types
    - reified types

 */


//val raw: List = listOf<String>()


fun covariance(ints: List<Int>, nums: List<Number>) {
    val x: List<Number> = ints
//    val y: List<Int> = nums
}

fun contravariance(compInts: Comparable<Int>, compNums: Comparable<Number>) {
//    val x: Comparable<Number> = compInts
    val y: Comparable<Int> = compNums
}



















fun typeErasureFtw() {
    isThisA<String>("yes")
}

fun <T> isThisA(thing: Any): Boolean {
//    return thing is T
    TODO()
}


