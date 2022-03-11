package ru.geraimovAV.commonUI.backupsCompare

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import ru.geraimovAV.commonUI.entityCompareList.EntityContainsList

@Composable
fun BackupsCompareView(
    modifier: Modifier = Modifier,
    backupsModel: BackupsModel
) {
    val model = remember { BackupsCompareViewModel(backupsModel) }
    val lastCheck = remember { mutableStateOf(-1) }

    Row(modifier) {
        EntityContainsList(
            entityName = "Backups contains", // TODO: Move to the const
            entityList = backupsModel.backupsEntityList.value,
            iconButtonsList = model.iconButtonList,
            checkedIndexes = model.checkedIndexes,
            onClickEntityList = { index ->
                lastCheck.value = index
                if (model.checkedIndexes.contains(index)) {
                    model.checkedIndexes.remove(index)
                    if (index == lastCheck.value) {
                        val lastIndex = model.checkedIndexes.lastIndex
                        if (model.checkedIndexes.lastIndex != -1)
                            lastCheck.value = model.checkedIndexes[lastIndex]
                        else
                            lastCheck.value = -1
                    }
                } else {
                    model.checkedIndexes.add(index)
                }
            }
        )

        if (lastCheck.value != -1) {
            BackupContentView(
                backupsEntityUI = model.getBackupFromIndex(lastCheck.value)
            )
        }
    }
}
