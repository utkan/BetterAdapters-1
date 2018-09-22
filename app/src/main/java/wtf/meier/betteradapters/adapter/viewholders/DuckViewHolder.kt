package wtf.meier.betteradapters.adapter.viewholders

import android.support.annotation.LayoutRes
import android.view.View
import android.widget.TextView
import wtf.meier.betteradapters.R
import wtf.meier.betteradapters.entities.Duck

/**
 * Created by meier on 29/12/2016.
 */

class DuckViewHolder(itemView: View) : AbstractBetterViewHolder<Duck>(itemView) {

    private val name: TextView by lazy {
        itemView.findViewById<TextView>(R.id.viewholder_duck_name)
    }
    private val number: TextView by lazy {
        itemView.findViewById<TextView>(R.id.viewholder_duck_number)
    }

    override fun bind(element: Duck) {
        name.text = element.name
        number.text = element.duckNumber.toString()
    }

    companion object {

        @LayoutRes
        val LAYOUT = R.layout.viewholder_duck
    }
}
