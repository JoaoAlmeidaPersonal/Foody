package com.joaoalmeida.foody.util

import androidx.recyclerview.widget.DiffUtil
import com.joaoalmeida.foody.models.Result
import kotlin.math.sign

class RecipesDiffUtil<T>(
    private val oldList: List<T>,
    private val newList: List<T>,
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}
