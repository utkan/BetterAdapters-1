package wtf.meier.betteradapters.entities

import wtf.meier.betteradapters.adapter.TypeFactory

/**
 * Created by meier on 29/12/2016.
 */

data class Duck
constructor(val duckNumber: Int = ++instanceId,
            override val name: String = String.format("Duck-%d", duckNumber)) : Animal {

    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(this)
    }

    companion object {
        private var instanceId = 0
    }
}
