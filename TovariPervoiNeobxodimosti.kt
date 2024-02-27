class TovariPervoiNeobxodimosti (name_tovara:String, chena_tovara:Double, edIzmerenya: String, vid_tovara: String, kolichestvo: Int, val Ves: Double, val price_za_gramm: Double) : Goods(name_tovara,chena_tovara,edIzmerenya,vid_tovara,kolichestvo)
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

    override fun InfoGoods(goods: Goods) {
        super.InfoGoods(goods)
        println("Вес товара: $Ves")
        println("Цена за 100 грамм: $price_za_gramm")
    }


}