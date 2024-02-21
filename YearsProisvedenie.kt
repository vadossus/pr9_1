class YearsProisvedenie (var autor: String, var nameBook: String, var gods: Int, var pages: Int) : Books(nameBook,autor,gods,pages)
{
    fun Years(autor: String)
    {
        try
        {
            println("Введите автора из списка:\n1 - Толстой\n2 - Достоевский\n3 - Гоголь")
            var autor = readLine()

            when {
                (autor == "Толстой") -> println("Война и мир, Анна Каренина, Воскресение, Отрочество")
                (autor == "Достоевский") -> println("Преступление и наказание, Бедные люди, Униженные и оскорблённые")
                (autor == "Гоголь") -> println("Мертвые души, Ревизор, Шинель, Миргород")
                else -> println("Нужно вводить от 1 до 3")
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
            println("Объемная книга")
        }
        else
        {
            println("Необъемная книга")
        }
    }
}