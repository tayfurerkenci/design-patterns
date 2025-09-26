package org.hf_design_patterns

import kotlin.collections.Iterator

interface Menu {
    fun createIterator(): Iterator<MenuItem>
}