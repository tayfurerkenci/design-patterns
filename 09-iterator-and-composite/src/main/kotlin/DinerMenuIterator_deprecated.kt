package org.hf_design_patterns

import kotlin.collections.Iterator

class DinerMenuIterator_deprecated(private val items: Array<MenuItem?>) : Iterator<MenuItem> {
    private var position: Int = 0

    override fun hasNext(): Boolean {
        // advance to the next non-null item
        while (position < items.size) {
            if (items[position] != null) return true
            position++
        }
        return false
    }

    override fun next(): MenuItem {
        if (!hasNext()) throw NoSuchElementException()
        return items[position++]!!
    }
}