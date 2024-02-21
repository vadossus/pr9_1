
open class Goods (
    val name: String,
    val price: Double,
    val edIzmereniya: String,
    val type: String,
    val kolvo: Int,
)
{
    open fun InfoGoods()
    {
        println("Название: $name")
        println("Цена: $price")
        println("Единицы измерения: $edIzmereniya")
        println("Вид товара: $type")
        println("Количество: $kolvo")
    }

    fun Vibor() {
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

    fun Opisanie() {
        println("Это товар $name в количестве $kolvo $edIzmereniya каждое по цене $price за $edIzmereniya")
    }


}
