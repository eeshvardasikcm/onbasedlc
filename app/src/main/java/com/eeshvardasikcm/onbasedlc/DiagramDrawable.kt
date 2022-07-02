package com.eeshvardasikcm.onbasedlc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 * Can be drawn onto a OnBaseDLC diagram
 */
open class DiagramDrawable(nameToSet: String, commentToSet: String) {
    /**
     * name the DiagramDrawable
     */
    private val name: String = nameToSet

    /**
     * comment on the DiagramDrawable
     */
    private val comment: String = commentToSet

    /**
     * draw the drawable
     */
    @Composable
    fun Draw() {
        Row {
            Column {
                Text(this@DiagramDrawable.name)
            }
            Column {
                Text(this@DiagramDrawable.comment)
            }
        }
    }
}