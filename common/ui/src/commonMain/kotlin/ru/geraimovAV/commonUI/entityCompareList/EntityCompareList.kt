package ru.geraimovAV.commonUI.entityCompareList

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ru.geraimovAV.commonUI.contentSurface.ContentSurface

@Composable
fun EntityContainsList(
    modifier: Modifier = Modifier,
    entityName: String,
    iconButtonsList: List<IconButton>,
    entityList: List<EntityCompare>,
    onClickEntityList: (index: Int) -> Unit,
    checkedIndexes: MutableList<Int>
) {
    ContentSurface(
        modifier = modifier,
        title = entityName
    ) {
        Column {
            Row {
                iconButtonsList.forEach {
                    IconButton(
                        onClick = it.onClick,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            it.icon,
                            it.label,
                        )
                    }
                }
            }

            Box(Modifier.wrapContentSize().heightIn(min = 200.dp)) {
                Column {
                    entityList.forEachIndexed { index, content ->
                        Box(
                            modifier = Modifier.clickable {
                                onClickEntityList(index)
                            }.background(
                                color = if (checkedIndexes.contains(index)) {
                                    Color.Blue
                                } else {
                                    Color.White
                                }
                            )

                        ) {
                            Text(content.name)
                        }
                    }
                }
            }
        }
    }
}