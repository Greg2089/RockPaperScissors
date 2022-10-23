import java.net.SocketOptions


fun main() {
    /*создаем массив в main, чтобы массив создавался при запуске приложения.
    Кроме того, мы сможем использовать его во всем коде*/
    val options = arrayOf("Rock", "Paper", "Scissors")
    //вызываем функцию и передаем ей массив вариантов.


    val gameChoice = getGameChoice(options)
    /*Ссылка, возвращаемая функцией getGameChoice, помещается в новую переменную с именем gameChoice.
    Если, например, функция getGameChoice вернет ссылку на элемент «Scissors» из массива, это означает,
    что ссылка на объект «Scissors» помещается в переменной gameChoice.*/
    val userChoice = getUserChoice(options)

}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

//выбрать один из элементов массива случайным образом
fun getUserChoice(optionsParam: Array<String>): String {


//Переменная isValidChoice будет показывать,ввел ли пользователь допустимый вариант.
    var isValidChoice = false
    var userChoice = ""
    //Цикл продолжается до тех пор, пока переменная isValidChoice не будет равна true.
    while (!isValidChoice) {

        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print("$item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput =
            readLine()//Читает пользовательский ввод из стандартного входного потока. В нашем случае это окно вывода в IDE
        // Проверяем, что ввод пользователя отличен от null и что он присутствует в массиве options.
        if (userInput != null && userInput in optionsParam) {
            //Если ввод пользователя прошел проверку, цикл прерывается.
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}


