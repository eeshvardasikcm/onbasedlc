package com.eeshvardasikcm.onbasedlc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.eeshvardasikcm.onbasedlc.ui.theme.OnBaseDLCTheme

/**
 * Main UI when starting up OnBaseDLC
 */
class MainActivity : ComponentActivity() {
    /**
     * May need to initialize some resources here
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContent {
            OnBaseDLCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Row {
                        Text(this@MainActivity.getString(R.string.app_name))
                    }
                    Row {
                        val offensiveTeamDiagram = OffensiveTeam(
                            this@MainActivity.getString(R.string.offensive_team),
                            this@MainActivity.getString(R.string.offensive_team_comment)
                        )
                        offensiveTeamDiagram.Draw()
                    }
                }
            }
        }
    }
}