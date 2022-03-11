package ru.geraimovAV.commonUI.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.ImageBitmap
import ru.geraimovAV.commonUI.backupsCompare.BackupsEntityUI
import ru.geraimovAV.commonUI.backupsCompare.BackupsModel
import ru.geraimovAV.commonUI.utils.getImgFromResource


class BackupsModelImpl : BackupsModel {
    private val resourcesDir = BackupsModelImpl::class.java.classLoader

    private val _backupsEntityList: MutableState<List<BackupsEntityUI>> = mutableStateOf(emptyList())
    override val backupsEntityList: State<List<BackupsEntityUI>> = _backupsEntityList

    override fun addBackupFromRobot() {
        val mutableList = mutableListOf<BackupsEntityUI>()
        mutableList.addAll(_backupsEntityList.value)
        mutableList.add(BackupsEntityUI(name = "robot", "", "", "", "", "", "", ""))
        _backupsEntityList.value = mutableList
    }

    override fun getAddFromRobotIcon(): ImageBitmap {
        return getImgFromResource("robot.png", resourcesDir)
    }

    override fun addBackupFromLocalStore() {
        val mutableList = mutableListOf<BackupsEntityUI>()
        mutableList.addAll(_backupsEntityList.value)
        mutableList.add(BackupsEntityUI(name = "Local", "", "", "", "", "", "", ""))
        _backupsEntityList.value = mutableList
    }

    override fun getAddFromLocalIcon(): ImageBitmap {
        return getImgFromResource("filearrowdown.png", resourcesDir)
    }

    override fun deleteBackups(chooseBackupsIndexes: List<Int>) {
        val mutableList = mutableListOf<BackupsEntityUI>()
        mutableList.addAll(_backupsEntityList.value)
        chooseBackupsIndexes.forEachIndexed { _, value ->
            println(value)
            mutableList.removeAt(value)
        }
        _backupsEntityList.value = mutableList
    }

    override fun getDeleteIcon(): ImageBitmap {
        return getImgFromResource("minus.png", resourcesDir)
    }

    override fun compareBackups(chooseBackupsIndexes: List<Int>) {
        TODO("Not yet implemented")
    }

    override fun getCompareIcon(): ImageBitmap {
        return getImgFromResource("gitdiff.png", resourcesDir)
    }
}