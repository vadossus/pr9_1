class TovariPervoiNeobxodimosti (val name_tovara:String, val chena_tovara:Double, val edIzmerenya: String, val vid_tovara: String, val kolichestvo: Int, val Ves: Double, val price_za_gramm: Double) : Goods(name_tovara,chena_tovara,edIzmerenya,vid_tovara,kolichestvo)
{
    fun PrintAllTovars()
    {
        println("Все товары: ")
        println("Гречка")
        println("Молоко")
        println("Горох")
        println("Консервы")
        println("Яйца")
        println("Хлеб")
        println("Мука")
        println("Яблоки")
    }

    override fun InfoGoods() {
        super.InfoGoods()
        println("Вес товара: $Ves")
        println("Цена за 100 грамм: $price_za_gramm")
    }


}