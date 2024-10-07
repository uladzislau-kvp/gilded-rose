package com.gildedrose

fun main(args: Array<String>) {
    println("OMGHAI!")

    val items = listOf(
        Item(name = "+5 Dexterity Vest", sellIn = 10, quality = 20),
        Item(name = "Aged Brie", sellIn = 2, quality = 0),
        Item(name = "Elixir of the Mongoose", sellIn = 5, quality = 7),
        Item(name = "Sulfuras, Hand of Ragnaros", sellIn = 0, quality = 80),
        Item(name = "Sulfuras, Hand of Ragnaros", sellIn = -1, quality = 80),
        Item(name = "Backstage passes to a TAFKAL80ETC concert", sellIn = 15, quality = 20),
        Item(name = "Backstage passes to a TAFKAL80ETC concert", sellIn = 10, quality = 49),
        Item(name = "Backstage passes to a TAFKAL80ETC concert", sellIn = 5, quality = 49),
        Item(name = "Conjured Mana Cake", sellIn = 3, quality = 6)
    )

    val app = GildedRose(items)

    var days = 20
    if (args.isNotEmpty()) {
        days = Integer.parseInt(args[0]) + 1
    }

    (0..< days).forEach { day ->
        println("-------- day $day --------")
        println("name, sellIn, quality")
        items.forEach(::println)
        println()
        app.update()
    }
}