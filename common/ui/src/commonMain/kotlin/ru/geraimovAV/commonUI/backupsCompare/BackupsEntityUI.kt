package ru.geraimovAV.commonUI.backupsCompare

import ru.geraimovAV.commonUI.entityCompareList.EntityCompare

class BackupsEntityUI(
    override val name: String,

    val robotType: String,
    val serialNumber: String,
    val uptimeController: String,
    val uptimeServo: String,
    val motorOnCounter: String,
    val eStopCounter: String,
    val brakeCounter: String,
) : EntityCompare