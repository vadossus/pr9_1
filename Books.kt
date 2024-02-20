package prak9_1

class Books (
    name: String,
    var author: String,
    var year: Int,
    var page: Int
) : Goods(name,0.0,"шт.","книга",1)
{
    companion object { fun Input(): Books {
        try {
            print("Введите название книги: ")
            val name = readLine()!!.toString()
            print("Введите автора книги: ")
            val author = readLine()!!.toString()
            print("Введите год создания книги: ")
            val year = readLine()!!.toInt()
            print("Введите количество страниц в книге: ")
            val page = readLine()!!.toInt()

            return Books(name, author, year, page)
        }
        catch (ex: Exception)
        {
            println("Ошибка: ${ex.message}")
            System.exit(0)
            return Books("", "", 0, 0)
        }
    }
    }

    fun InfoBooks() {
        println("Книга: $name")
        println("Автор: $author")
        println("Год выпуска: $year")
        println("Страницы: $page")
    }

    override fun Vibor() {
        print("Введите 1 для покупки или 2 для продажи книги $name: ")
        val choice = readLine()
        if (choice == "1") {
            println("Вы выбрали покупку книги $name")
        } else if (choice == "2") {
            println("Вы выбрали продажу книги $name")
        } else {
            println("Неверный выбор")
        }
    }
    override fun Opisanie() {
        super.Opisanie()
        println("Книга $name написана $author в $year году, в ней $page страниц")
    }

    override fun ForLazy() {
        InfoBooks()
    }


}

