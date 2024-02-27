
open class Goods (
    var name: String,
    var price: Double,
    var edIzmereniya: String,
    var type: String,
    var kolvo: Int,
)
{
    fun Input(goods: Goods)
    {
        try {
            println("Введите название товара: ")
            goods.name = readLine()!!.toString()
            println("Введите цену товара: ")
            goods.price = readLine()!!.toDouble()
            println("Введите ед.измерения товара: ")
            goods.edIzmereniya = readLine()!!.toString()
            println("Введите вид товара: ")
            goods.type = readLine()!!.toString()
            println("Введите количество товара: ")
            goods.kolvo = readLine()!!.toInt()
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
            System.exit(0)
        }
    }
    open fun InfoGoods(goods: Goods)
    {
        println("Название: ${goods.name}")
        println("Цена: ${goods.price}")
        println("Единицы измерения: ${goods.edIzmereniya}")
        println("Вид товара: ${goods.type}")
        println("Количество: ${goods.kolvo}")
    }

    fun Vibor(goods: Goods) {
        try {
            print("Введите 1 для покупки или 2 для продажи товара ${goods.name}: ")
            val choice = readLine()
            if (choice == "1") {
                println("Вы выбрали покупку товара ${goods.name}")
            } else if (choice == "2") {
                println("Вы выбрали продажу товара ${goods.name}")
            } else {
                println("Неверный выбор")
            }
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
        }
    }

    fun Opisanie(goods: Goods) {
        println("Это товар ${goods.name} в количестве ${goods.kolvo} ${goods.edIzmereniya} каждое по цене ${goods.price} за ${goods.edIzmereniya}")
    }


}
