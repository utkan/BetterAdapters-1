package wtf.meier.betteradapters.adapter

import android.view.View

import wtf.meier.betteradapters.adapter.exception.TypeNotSupportedException
import wtf.meier.betteradapters.adapter.viewholders.AbstractBetterViewHolder
import wtf.meier.betteradapters.adapter.viewholders.CarViewHolder
import wtf.meier.betteradapters.adapter.viewholders.DuckViewHolder
import wtf.meier.betteradapters.adapter.viewholders.MouseViewHolder
import wtf.meier.betteradapters.entities.Car
import wtf.meier.betteradapters.entities.Duck
import wtf.meier.betteradapters.entities.Mouse

/**
 * Created by meier on 29/12/2016.
 */

class TypeFactoryForList : TypeFactory {
    override fun type(duck: Duck): Int {
        return DuckViewHolder.LAYOUT
    }

    override fun type(mouse: Mouse): Int {
        return MouseViewHolder.LAYOUT
    }

    override fun type(car: Car): Int {
        return CarViewHolder.LAYOUT
    }

    override fun createViewHolder(parent: View, type: Int): AbstractBetterViewHolder<out Visitable> {
        return when (type) {
            CarViewHolder.LAYOUT -> CarViewHolder(parent)
            DuckViewHolder.LAYOUT -> DuckViewHolder(parent)
            MouseViewHolder.LAYOUT -> MouseViewHolder(parent)
            else -> throw TypeNotSupportedException.create(String.format("LayoutType: %d", type))
        }
    }
}
