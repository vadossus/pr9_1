import YearsProisvedenie.*
import Proisvedenie.*

fun main()
{
    try {

        println("Что вы хотите выбрать:\n1 - Товары\n2 - Книги")
        var a = readLine()!!.toInt()
        if (a == 1)
        {
            var b = Goods.Input()


        }
        else if (a == 2)
        {
            var Books:Books = Books()
            var Proisvedenie:Proisvedenie = Proisvedenie(Pr)


        }
    }
    catch (ex:Exception)
    {

    }

}

