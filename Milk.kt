
class Milk (name_: String, price_: Double, edIzmereniya_: String, vid_: String, kolichestvo_: Int, val persent: Double) :Goods(name_,price_,edIzmereniya_,vid_,kolichestvo_)
{
    fun BestMilk(persent: Double)
    {
        when {
            (persent < 1.0) -> println("Обезжиренное молоко")
            (persent > 1.0 && persent <= 2.0) -> println("Молоко с малой жирностью")
            (persent > 2.5 && persent <= 3.5) -> println("Молоко с средней жирностью")
            (persent > 3.5) -> println("Молоко с большим количество жира")
        }
    }

    fun Milk()
    {
        println("Молоко богато витаминами и микроэлементами:")
        println("А, D и В1, В2, В12")
        println("Микроэлементы: кальций, калий, фосфор, магний, натрий, железо, фтор, йод.")
    }
}