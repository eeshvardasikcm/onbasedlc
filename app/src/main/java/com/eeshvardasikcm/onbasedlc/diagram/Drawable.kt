package com.eeshvardasikcm.onbasedlc.diagram

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

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