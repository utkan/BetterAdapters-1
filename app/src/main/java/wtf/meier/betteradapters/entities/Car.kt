package wtf.meier.betteradapters.entities

import wtf.meier.betteradapters.adapter.TypeFactory
import wtf.meier.betteradapters.adapter.Visitable

/**
 * Created by meier on 29/12/2016.
 */

data class Car(val manufacturer: String, val powerInPs: Int) : Visitable {

    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(this)
    }
}
