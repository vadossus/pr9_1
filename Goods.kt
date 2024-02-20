package prak9_1

open class Goods (
    val name: String,
    val price: Double,
    val edIzmereniya: String,
    val type: String,
    val kolvo: Int,
)
{
    companion object {fun Input(): Goods {
        try {
            print("Введите название товара: ")
            val name = readLine()!!.toString()
            print("Введите цену товара: ")
            val price = readLine()!!.toDouble()
            print("Введите ед.измерения товара: ")
            val edIzmereniya = readLine()!!.toString()
            print("Введите вид товара: ")
            val type = readLine()!!.toString()
            print("Введите количество товара: ")
            val kolvo = readLine()!!.toInt()

            return Goods(name, price, edIzmereniya, type, kolvo)
        }
        catch (ex: Exception)
        {
            println("Ошибка: ${ex.message}")
            System.exit(0)
            return Goods("", 0.0, "", "", 0)
        }
    }
    }

    fun InfoGoods()
    {
        println("Название: $name")
        println("Цена: $price")
        println("Единицы измерения: $edIzmereniya")
        println("Вид товара: $type")
        println("Количество: $kolvo")
    }

    open fun Vibor() {
        try {
            print("Введите 1 для покупки или 2 для продажи товара $name: ")
            val choice = readLine()
            if (choice == "1") {
                println("Вы выбрали покупку товара $name")
            } else if (choice == "2") {
                println("Вы выбрали продажу товара $name")
            } else {
                println("Неверный выбор")
            }
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
        }
    }

    open fun Opisanie() {
        println("Это товар $name в количестве $kolvo $edIzmereniya каждое по цене $price за $edIzmereniya")
    }

    open fun ForLazy()
    {
        InfoGoods()
    }



}
