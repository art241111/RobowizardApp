package ru.geraimovAV.commonUI.backupsCompare

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import ru.geraimovAV.commonUI.entityCompareList.IconButton

class BackupsCompareViewModel(
    private val backupsModel: BackupsModel
) {
    val checkedIndexes by mutableStateOf(mutableListOf<Int>())

    val iconButtonList = listOf(
        IconButton(
            label = "Add backup from robot", // TODO: Move to the const
            icon = backupsModel.getAddFromRobotIcon(),
            onClick = { backupsModel.addBackupFromRobot() }
        ),

        IconButton(
            label = "Add backup from local storage", // TODO: Move to the const
            icon = backupsModel.getAddFromLocalIcon(),
            onClick = { backupsModel.addBackupFromLocalStore() }
        ),

        IconButton(
            label = "Compare backups ", // TODO: Move to the const
            icon = backupsModel.getCompareIcon(),
            onClick = { backupsModel.compareBackups(checkedIndexes) }
        ),

        IconButton(
            label = "Delete backups ", // TODO: Move to the const
            icon = backupsModel.getDeleteIcon(),
            onClick = { backupsModel.deleteBackups(checkedIndexes) }
        ),
    )

    fun getBackupFromIndex(index: Int): BackupsEntityUI {
        return backupsModel.backupsEntityList.value[index]
    }

    fun isBackupsCheck(): Boolean {
        return checkedIndexes.isNotEmpty()
    }
}