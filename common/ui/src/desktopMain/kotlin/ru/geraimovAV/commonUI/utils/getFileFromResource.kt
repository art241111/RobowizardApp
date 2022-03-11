package ru.geraimovAV.commonUI.utils

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import java.io.File
import java.net.URL
import org.jetbrains.skia.Image


fun getFileFromResource(fileName: String, classLoader: ClassLoader): File? {
    val resource: URL? = classLoader.getResource(fileName)
    return if (resource == null) {
        throw IllegalArgumentException("file not found! $fileName")
    } else {
        File(resource.toURI())
    }
}

fun getImgFromResource(fileName: String, classLoader: ClassLoader): ImageBitmap {
    return Image.makeFromEncoded(getFileFromResource(fileName, classLoader)?.readBytes()).toComposeImageBitmap()
}