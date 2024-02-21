
open class Books (
    val name: String,
    var author: String,
    var year: Int,
    var page: Int
)
{
     open fun Info()
     {
         println("Автор: $author")
         println("Название книги: $name")
         println("Год выпуска: $year")
         println("Страницы: $page")
     }


    open fun Books()
    {
        println("Рекомендуемые произведения: ")
        println("Герой нашего времени")
        println("Преступление и наказание")
        println("Война и мир")
    }

}










