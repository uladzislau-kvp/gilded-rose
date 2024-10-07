package com.gildedrose

class GildedRose(var items: List<Item>) {
    fun update() {
        items.forEach { item ->
            updateQuality(item)
            updateSellIn(item)
            handleExpiredSellIn(item)
        }
    }

    private fun updateQuality(item: Item) {
        when (item.name) {
            "Sulfuras, Hand of Ragnaros" -> {

            }

            "Aged Brie" -> {
                if (item.quality < 50) item.quality += 1
            }

            "Backstage passes to a TAFKAL80ETC concert" -> {
                if (item.quality < 50) item.quality += 1
                if (item.sellIn <= 10) if (item.quality < 50) item.quality += 1
                if (item.sellIn <= 5) if (item.quality < 50) item.quality += 1
            }

            else -> {
                if (item.quality > 0) item.quality -= 1
            }
        }
    }

    private fun updateSellIn(item: Item) {
        if (item.name != "Sulfuras, Hand of Ragnaros") item.sellIn -= 1
    }

    private fun handleExpiredSellIn(item: Item) {
        if (item.sellIn < 0) {
            if (item.name == "Backstage passes to a TAFKAL80ETC concert") item.quality = 0 else updateQuality(item)
        }
    }
}

