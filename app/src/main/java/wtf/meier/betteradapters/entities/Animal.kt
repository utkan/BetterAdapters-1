package wtf.meier.betteradapters.entities

import wtf.meier.betteradapters.adapter.Visitable

/**
 * Created by meier on 29/12/2016.
 */

interface Animal : Visitable {
    /**
     * case animals have names
     */
    val name: String
}
