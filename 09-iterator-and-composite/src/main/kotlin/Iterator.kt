package org.hf_design_patterns

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem
}