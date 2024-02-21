class Proisvedenie(var namebook: String, var avtor: String, var god: Int, var pages: Int, var zanr: String): Books(namebook,avtor,god,pages)
{
    fun OpisanieKnigi()
    {
        print("Введите жанр книги: ")
        var zanr = readLine()
        if (namebook == "Мастер и Маргарита")
        {
            println("Книга Мастер и Маргарита была написана автором Михаилом Булгаковым в 1966 году, жанр книги: роман, страниц в книге: 456")
            println("Описание книги: В Москве появился сатана со свитой, после чего в городе начались беспорядки:\nв варьете состоялось странное представление, человек стал вампиром,\nа у честных людей появились запрещённые доллары.")
        }
        else if (namebook == "Война и мир")
        {
            println("Книга Война и мир была написана автором Львом Толстым в 1867 году, жанр книги: роман-эпопея, страниц в книге: 1296")
            println("Описание книги: Это огромная сага, с равной глубиной рассказывающая о событиях различного масштаба:\nот частной жизни нескольких семей и конкретных сражений 1812 года до движения народов и истории вообще.")
        }
        else
        {
            println("Описание книги:")
            println("Книга $namebook была написана в $year году, автором $avtor, $page страниц, жанр: $zanr ")
        }
    }

    fun Output()
    {
        println("Информация о книге:")
        println("Название книги:$namebook\nАвтор:$avtor\nГод создания:$god:\nСтраницы:$pages\nЖанр:$zanr")
    }
}