import YearsProisvedenie.*
import Proisvedenie.*

fun main()
{
    try {

        println("Что вы хотите выбрать:\n1 - Товары\n2 - Книги")
        var a = readLine()!!.toInt()
        if (a == 1)
        {
            var b = Goods("",0.0,"","",0)
            b.Input(b)
            b.Vibor(b)
            b.Opisanie(b)

            println("Введите вес товара: ")
            var ves = readLine()!!.toDouble()
            println("Введите цену товара за 100 грамм: ")
            var price_za_100 = readLine()!!.toDouble()

            var c = TovariPervoiNeobxodimosti(b.name,b.price,b.edIzmereniya,b.type,b.kolvo,ves, price_za_100)
            c.InfoGoods(c)
            println("")
            c.PrintAllTovars()

            println("Интересно вам ознакомиться с молоком?: ")
            var d = readLine()!!.toString()
            if (d == "Да" && c.name == "Молоко" || d == "Да" && c.name == "молоко")
            {
                println("Введите проценты вашего молока: ")
                var pers = readLine()!!.toDouble()

                var a = Milk(c.name,c.price,c.edIzmereniya,c.type,c.kolvo, pers)

                a.BestMilk(pers)
                a.Milk()
            }
            else
            {
                var a = Milk(c.name,c.price,c.edIzmereniya,c.type,c.kolvo, 0.0)
                a.Milk()
                System.exit(0)
            }


        }
        else if (a == 2)
        {
            var b = Books("","",0,0)
            b.Input(b)
            b.Books()
            println("")
            println("Введите жанр вашей книги:")
            var zanr = readLine()!!.toString()

            var c = Proisvedenie(b.name,b.author,b.year,b.page,zanr)
            c.Info(c)
            println("")
            c.OpisanieKnigi(zanr,b.name, b.author)
            println("")
            c.Authors()

            var e = YearsProisvedenie(b.author,b.name,b.year,b.page)
            e.Years(b.author)
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

