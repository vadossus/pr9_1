class YearsProisvedenie (var autor: String, var nameBook: String, var gods: Int, var pages: Int) : Books(nameBook,autor,gods,pages)
{
    fun Years(autor: String)
    {
        try
        {
            when {
                (autor == "Толстой") -> println("Книги от автора: Война и мир, Анна Каренина, Воскресение, Отрочество")
                (autor == "Достоевский") -> println("Книги от автора: Преступление и наказание, Бедные люди, Униженные и оскорблённые")
                (autor == "Гоголь") -> println("Книги от автора: Мертвые души, Ревизор, Шинель, Миргород")
                else -> println("Тут мог быть ваш автор")
            }
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
        }
    }

    fun Pages()
    {
        println("В вашей книге больше 500 страниц?")
        var pages = readLine()!!.toInt()
        if (pages > 500)
        {
            println("Ваша книга: Объемная")
        }
        else
        {
            println("Ваша книга: Необъемная")
        }
    }
}