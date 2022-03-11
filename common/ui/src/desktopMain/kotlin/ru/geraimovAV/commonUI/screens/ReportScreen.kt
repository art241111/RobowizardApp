package ru.geraimovAV.commonUI.screens

import androidx.compose.runtime.Composable
import ru.geraimovAV.commonUI.backupsCompare.BackupsCompareView
import ru.geraimovAV.commonUI.backupsCompare.BackupsModel

@Composable
fun ReportScreen(
    backupsModel: BackupsModel
) {
    BackupsCompareView(
        backupsModel = backupsModel
    )
}