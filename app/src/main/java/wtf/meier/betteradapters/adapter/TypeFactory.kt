package wtf.meier.betteradapters.adapter

import android.view.View

import wtf.meier.betteradapters.adapter.viewholders.AbstractBetterViewHolder
import wtf.meier.betteradapters.entities.Car
import wtf.meier.betteradapters.entities.Duck
import wtf.meier.betteradapters.entities.Mouse

/**
 * Created by meier on 29/12/2016.
 */

interface TypeFactory {
    fun type(duck: Duck): Int

    fun type(mouse: Mouse): Int

    fun type(car: Car): Int

    fun createViewHolder(parent: View, type: Int): AbstractBetterViewHolder<out Visitable>
}
