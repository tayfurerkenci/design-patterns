package org.hf_design_patterns

class PancakeHouseMenuIterator(private val items: List<MenuItem>) : Iterator {
    private var position: Int = 0

    override fun hasNext(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem {
        if (!hasNext()) throw NoSuchElementException()
        return items[position++]
    }
}