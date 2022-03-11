package ru.geraimovAV.commonUI.backupsCompare

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import ru.geraimovAV.commonUI.contentSurface.ContentSurface

@Composable
fun BackupContentView(
    backupsEntityUI: BackupsEntityUI
) {
    ContentSurface(
        title = "Backup info"
    ) {
        Column {
            Text("Robot type ${backupsEntityUI.robotType}")
            Text("Serial number ${backupsEntityUI.serialNumber}")
            Text("Uptime controller ${backupsEntityUI.uptimeController}")
            Text("Uptime servos ${backupsEntityUI.uptimeServo}")
            Text("Motor on counter ${backupsEntityUI.motorOnCounter}")
            Text("E-stop counter ${backupsEntityUI.eStopCounter}")
            Text("Brake counter ${backupsEntityUI.brakeCounter}")
        }
    }
}
