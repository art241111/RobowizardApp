import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ru.geraimovAV.commonUI.App
import ru.geraimovAV.commonUI.backupsCompare.BackupsModel
import ru.geraimovAV.commonUI.data.BackupsModelImpl
import ru.geraimovAV.commonUI.screens.ReportScreen

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication
    ) {
        val backupsModel = remember { BackupsModelImpl() }
        ReportScreen(backupsModel)
    }
}