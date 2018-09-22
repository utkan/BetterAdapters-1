package wtf.meier.betteradapters.adapter

/**
 * Created by meier on 29/12/2016.
 */

interface Visitable {
    fun type(typeFactory: TypeFactory): Int
}
