package ru.geraimovAV.commonUI.backupsCompare

import androidx.compose.runtime.State
import androidx.compose.ui.graphics.ImageBitmap

interface BackupsModel {
    val backupsEntityList: State<List<BackupsEntityUI>>

    fun addBackupFromRobot()
    fun getAddFromRobotIcon(): ImageBitmap

    fun addBackupFromLocalStore()
    fun getAddFromLocalIcon(): ImageBitmap

    fun deleteBackups(chooseBackupsIndexes: List<Int>)
    fun getDeleteIcon(): ImageBitmap

    fun compareBackups(chooseBackupsIndexes: List<Int>)
    fun getCompareIcon(): ImageBitmap
}