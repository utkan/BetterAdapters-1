package wtf.meier.betteradapters.adapter.viewholders

import android.support.annotation.LayoutRes
import android.view.View
import android.widget.TextView
import wtf.meier.betteradapters.R
import wtf.meier.betteradapters.entities.Mouse

/**
 * Created by meier on 29/12/2016.
 */

class MouseViewHolder(itemView: View) : AbstractBetterViewHolder<Mouse>(itemView) {

    private val name: TextView by lazy {
        itemView.findViewById<TextView>(R.id.viewholder_mouse_name)
    }

    override fun bind(element: Mouse) {
        name.text = element.name
    }

    companion object {

        @LayoutRes
        val LAYOUT = R.layout.viewholder_mouse
    }
}
