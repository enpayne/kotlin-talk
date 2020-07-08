








// big-money-nw
// http://patorjk.com/software/taag/#p=display&f=Big%20Money-nw&t=NPE






/*

$$\   $$\           $$\     $$\ $$\                 $$\                  $$$$$$\              $$\     $$\
$$ | $$  |          $$ |    $$ |\__|                \__|                $$  __$$\             $$ |    \__|
$$ |$$  / $$$$$$\ $$$$$$\   $$ |$$\ $$$$$$$\        $$\ $$$$$$$\        $$ /  $$ | $$$$$$$\ $$$$$$\   $$\  $$$$$$\  $$$$$$$\
$$$$$  / $$  __$$\\_$$  _|  $$ |$$ |$$  __$$\       $$ |$$  __$$\       $$$$$$$$ |$$  _____|\_$$  _|  $$ |$$  __$$\ $$  __$$\
$$  $$<  $$ /  $$ | $$ |    $$ |$$ |$$ |  $$ |      $$ |$$ |  $$ |      $$  __$$ |$$ /        $$ |    $$ |$$ /  $$ |$$ |  $$ |
$$ |\$$\ $$ |  $$ | $$ |$$\ $$ |$$ |$$ |  $$ |      $$ |$$ |  $$ |      $$ |  $$ |$$ |        $$ |$$\ $$ |$$ |  $$ |$$ |  $$ |
$$ | \$$\\$$$$$$  | \$$$$  |$$ |$$ |$$ |  $$ |      $$ |$$ |  $$ |      $$ |  $$ |\$$$$$$$\   \$$$$  |$$ |\$$$$$$  |$$ |  $$ |
\__|  \__|\______/   \____/ \__|\__|\__|  \__|      \__|\__|  \__|      \__|  \__| \_______|   \____/ \__| \______/ \__|  \__|

 */


// by Nick Payne


// credit to Christina Lee, check out her talk "Advanced Kotlin" on youtube
































/*

$$\   $$\ $$\             $$\
$$ |  $$ |\__|            $$ |
$$ |  $$ |$$\  $$$$$$$\ $$$$$$\    $$$$$$\   $$$$$$\  $$\   $$\
$$$$$$$$ |$$ |$$  _____|\_$$  _|  $$  __$$\ $$  __$$\ $$ |  $$ |
$$  __$$ |$$ |\$$$$$$\    $$ |    $$ /  $$ |$$ |  \__|$$ |  $$ |
$$ |  $$ |$$ | \____$$\   $$ |$$\ $$ |  $$ |$$ |      $$ |  $$ |
$$ |  $$ |$$ |$$$$$$$  |  \$$$$  |\$$$$$$  |$$ |      \$$$$$$$ |
\__|  \__|\__|\_______/    \____/  \______/ \__|       \____$$ |
                                                      $$\   $$ |
                                                      \$$$$$$  |
                                                       \______/



- First revealed by JetBrains in 2011
- 1.0 released in 2016
- Google makes Kotlin the preferred language for Android in 2019

 */




























/*

 $$$$$$\            $$\           $$\             $$$$$$$$\                   $$\
$$  __$$\           \__|          $$ |            $$  _____|                  $$ |
$$ /  $$ |$$\   $$\ $$\  $$$$$$$\ $$ |  $$\       $$ |   $$$$$$\   $$$$$$$\ $$$$$$\    $$$$$$$\
$$ |  $$ |$$ |  $$ |$$ |$$  _____|$$ | $$  |      $$$$$\ \____$$\ $$  _____|\_$$  _|  $$  _____|
$$ |  $$ |$$ |  $$ |$$ |$$ /      $$$$$$  /       $$  __|$$$$$$$ |$$ /        $$ |    \$$$$$$\
$$ $$\$$ |$$ |  $$ |$$ |$$ |      $$  _$$<        $$ |  $$  __$$ |$$ |        $$ |$$\  \____$$\
\$$$$$$ / \$$$$$$  |$$ |\$$$$$$$\ $$ | \$$\       $$ |  \$$$$$$$ |\$$$$$$$\   \$$$$  |$$$$$$$  |
 \___$$$\  \______/ \__| \_______|\__|  \__|      \__|   \_______| \_______|   \____/ \_______/
     \___|


                    "Language design is cast in stone,
                     but this stone is reasonably soft,
                     and with some effort we can reshape it later."

                     Kotlin Design Team


- Open source
- It's a JVM language: it compiles to Java bytecode
- Interoperable with Java
- Claims to be "pragmatic"
- Wants to keep a low learning curve
- A lot of syntactic sugar
- Incentivizes good practices

 */













/*

    - explicit and implicit types
    - block vs expression body
    - no semicolons
    - no primitives

 */



const val hello = "hello world"
const val someInt: Int = 1

fun main() {
    println(hello)
}
























