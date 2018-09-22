package wtf.meier.betteradapters.entities

import wtf.meier.betteradapters.adapter.TypeFactory

/**
 * Created by meier on 29/12/2016.
 */

data class Mouse(private val mouseName: String) : Animal {

    override val name: String
        get() = "Mimimi$mouseName"

    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(this)
    }
}
