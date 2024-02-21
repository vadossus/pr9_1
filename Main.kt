import YearsProisvedenie.*
import Proisvedenie.*

fun main()
{
    try {

        println("Что вы хотите выбрать:\n1 - Товары\n2 - Книги")
        var a = readLine()!!.toInt()
        if (a == 1)
        {
            println("Введите название товара: ")
            var name = readLine()!!.toString()
            println("Введите цену товара: ")
            var price = readLine()!!.toDouble()
            println("Введите ед.измерения товара: ")
            var edIzmerenya = readLine()!!.toString()
            println("Введите вид товара: ")
            var type = readLine()!!.toString()
            println("Введите количество товара: ")
            var kolvo = readLine()!!.toInt()

            var b = Goods(name,price,edIzmerenya,type,kolvo)

            b.Vibor()
            b.Opisanie()

            println("Введите вес товара: ")
            var ves = readLine()!!.toDouble()
            println("Введите цену товара за 100 грамм: ")
            var price_za_100 = readLine()!!.toDouble()

            var c = TovariPervoiNeobxodimosti(name,price,edIzmerenya,type,kolvo,ves, price_za_100)
            c.InfoGoods()
            println("")
            c.PrintAllTovars()

            println("Интересно вам ознакомиться с молоком?: ")
            var d = readLine()!!.toString()
            if (d == "Да" && name == "Молоко")
            {
                println("Введите проценты вашего молока: ")
                var pers = readLine()!!.toDouble()

                var a = Milk(name,price,edIzmerenya,type,kolvo, pers)

                a.BestMilk(pers)
                a.Milk()
            }
            else
            {
                var c = Milk(name,price,edIzmerenya,type,kolvo, 0.0)
                c.Milk()
                System.exit(0)
            }


        }
        else if (a == 2)
        {
            println("Введите название книги: ")
            var namebook = readLine()!!.toString()
            println("Введите автора книги: ")
            var author = readLine()!!.toString()
            println("Введите год выпуска данной книги: ")
            var year = readLine()!!.toInt()
            println("Введите страницы книги: ")
            var pagesbook = readLine()!!.toInt()

            var b = Books(namebook,author,year,pagesbook)

            b.Books()
            println("")

            println("Введите жанр вашей книги:")
            var zanr = readLine()!!.toString()

            var c = Proisvedenie(namebook,author,year,pagesbook,zanr)
            b.Info()
            println("")
            c.OpisanieKnigi(zanr)
            println("")
            c.Authors()


            var e = YearsProisvedenie(author,namebook,year,pagesbook)
            e.Years(author)
            e.Pages()

        }
        else
        {
            System.exit(0)
        }
    }
    catch (ex:Exception)
    {
        println("В процессе ввода возникла ошибка: ${ex.message}")
    }

}

