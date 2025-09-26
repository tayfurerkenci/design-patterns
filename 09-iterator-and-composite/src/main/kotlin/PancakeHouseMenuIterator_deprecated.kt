package org.hf_design_patterns

class PancakeHouseMenuIterator_deprecated(private val items: List<MenuItem>) : Iterator_deprecated {
    private var position: Int = 0

    override fun hasNext(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem {
        if (!hasNext()) throw NoSuchElementException()
        return items[position++]
    }
}