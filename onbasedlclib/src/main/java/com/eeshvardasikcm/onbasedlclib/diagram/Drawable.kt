package com.eeshvardasikcm.onbasedlclib.diagram

/**
 * Can be drawn onto a OnBaseDLC diagram
 */
open class Drawable(nameToSet: String, commentToSet: String) {
    /**
     * name the Drawable
     */
    private val name: String = nameToSet

    /**
     * comment on the Drawable
     */
    private val comment: String = commentToSet

    /**
     * draw the drawable
     */
    @Composable
    fun Draw() {
        Row {
            Column {
                Text(this@Drawable.name)
            }
            Column {
                Text(this@Drawable.comment)
            }
        }
    }
}