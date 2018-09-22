package wtf.meier.betteradapters.adapter.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by meier on 29/12/2016.
 */

abstract class AbstractBetterViewHolder<T> internal constructor(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(element: T)
}
