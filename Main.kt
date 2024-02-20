package prak9_1



fun main()
{
    try {
        println("Что вы хотите выбрать:\n1 - Книга\n2 - Товары\n3 - И то и другое\n4 - Выбрать готовое")
        var n = readLine()!!.toInt()
        if (n == 1)
        {
            val book1 = Books.Input()
            VivodInfo1(book1)
        }
        else if (n == 2)
        {
            val goods = Goods.Input()
            VivodInfo2(goods)
        }
        else if (n == 3)
        {
            val book1 = Books.Input()
            val goods1 = Goods.Input()
            VivodInfo2(goods1)
            VivodInfo1(book1)
            println("")
            book1.Vibor()
            goods1.Vibor()
        }
        else if (n == 4)
        {
            val books = Books("Мастер и Маргарита","Михаил Булгаков", 1966, 456)
            val goods = Goods("Молоко", 250.0, "л.", "продукт", 10)
            Secret(books)
            books.Opisanie()
            println("")
            Secret2(goods)
            goods.Opisanie()
        }
        else
        {
            System.exit(0)
        }
    }
    catch (ex:Exception)
    {
        println("Ошибка: ${ex.message}")
    }



}

fun VivodInfo1(books: Books)
{
    books.InfoBooks()
}

fun VivodInfo2(goods: Goods)
{
    goods.InfoGoods()
}

fun Secret(books: Books)
{
    books.ForLazy()
}

fun Secret2(goods: Goods)
{
    goods.ForLazy()
}