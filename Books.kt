
open class Books (
    var name: String,
    var author: String,
    var year: Int,
    var page: Int
)
{

    fun Input(books: Books)
    {
        try {
            println("Введите название книги: ")
            books.name = readLine()!!.toString()
            println("Введите автора книги: ")
            books.author = readLine()!!.toString()
            println("Введите год выпуска данной книги: ")
            books.year = readLine()!!.toInt()
            println("Введите страницы книги: ")
            books.page = readLine()!!.toInt()
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
        }
    }

     open fun Info(books: Books)
     {
         println("Автор: ${books.author}")
         println("Название книги: ${books.name}")
         println("Год выпуска: ${books.year}")
         println("Страницы: ${books.page}")
     }


    open fun Books()
    {
        println("Рекомендуемые произведения: ")
        println("Герой нашего времени")
        println("Преступление и наказание")
        println("Война и мир")
    }

}










