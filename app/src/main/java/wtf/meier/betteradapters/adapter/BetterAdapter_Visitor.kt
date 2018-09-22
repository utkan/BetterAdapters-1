package wtf.meier.betteradapters.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import wtf.meier.betteradapters.adapter.viewholders.AbstractBetterViewHolder

/**
 *
 */
class BetterAdapter_Visitor(private val elements: List<Visitable>, private val typeFactory: TypeFactory) : RecyclerView.Adapter<AbstractBetterViewHolder<in Visitable>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractBetterViewHolder<Visitable> {
        val context = parent.context
        // attention: {@link viewType} as resource
        val contactView = LayoutInflater.from(context).inflate(viewType, parent, false)
        return typeFactory.createViewHolder(contactView, viewType) as AbstractBetterViewHolder<Visitable>
    }

    override fun onBindViewHolder(holder: AbstractBetterViewHolder<in Visitable>, position: Int) {
        // attention: unchecked
        holder.bind(elements[position])
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    override fun getItemViewType(position: Int): Int {
        return elements[position].type(typeFactory)
    }
}
