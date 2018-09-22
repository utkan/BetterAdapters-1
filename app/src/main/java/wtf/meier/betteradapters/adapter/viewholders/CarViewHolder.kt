package wtf.meier.betteradapters.adapter.viewholders

import android.support.annotation.LayoutRes
import android.view.View
import android.widget.TextView
import wtf.meier.betteradapters.R
import wtf.meier.betteradapters.entities.Car

/**
 * Created by meier on 29/12/2016.
 */

class CarViewHolder(itemView: View) : AbstractBetterViewHolder<Car>(itemView) {

    private val manufacturer: TextView by lazy {
        itemView.findViewById<TextView>(R.id.viewholder_car_name)
    }
    private val power: TextView by lazy {
        itemView.findViewById<TextView>(R.id.viewholder_car_ps)
    }

    override fun bind(element: Car) {
        manufacturer.text = element.manufacturer
        power.text = String.format("%d PS", element.powerInPs)
    }

    companion object {
        @LayoutRes
        val LAYOUT = R.layout.viewholder_car
    }
}
