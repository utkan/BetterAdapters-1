package wtf.meier.betteradapters.adapter.exception

/**
 * Created by meier on 29/12/2016.
 */

class TypeNotSupportedException private constructor(message: String) : RuntimeException(message) {
    companion object {

        fun create(message: String): TypeNotSupportedException {
            return TypeNotSupportedException(message)
        }
    }
}
