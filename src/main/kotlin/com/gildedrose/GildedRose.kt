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
            "Backstage passes to a TAFKAL80ETC concert" -> {
                item.increaseQuality()
                if (item.sellIn <= 10) item.increaseQuality()
                if (item.sellIn <= 5) item.increaseQuality()
            }
            "Aged Brie" -> item.increaseQuality()
            "Sulfuras, Hand of Ragnaros" -> Unit
            else -> item.decreaseQuality()
        }
    }

    private fun updateSellIn(item: Item) {
        if (item.name != "Sulfuras, Hand of Ragnaros") item.sellIn -= 1
    }

    private fun handleExpiredSellIn(item: Item) {
        if (item.isExpired()) {
            if (item.name == "Backstage passes to a TAFKAL80ETC concert") item.quality = 0 else updateQuality(item)
        }
    }

    private fun Item.isExpired(): Boolean {
        return this.sellIn < 0
    }

    private fun Item.increaseQuality(by: Int = 1) {
        this.quality = (this.quality + by).coerceAtMost(50)
    }

    private fun Item.decreaseQuality(by: Int = 1) {
        this.quality = (this.quality - by).coerceAtLeast(0)
    }
}

