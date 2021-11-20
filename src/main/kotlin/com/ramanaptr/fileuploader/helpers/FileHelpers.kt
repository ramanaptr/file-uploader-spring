package com.ramanaptr.fileuploader.helpers

import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*


object FileHelpers {

    fun createFileFromMultipart(pathStore: String, file: MultipartFile): Path? {
        try {
            val bytes = file.bytes
            val dir = File(pathStore).apply { mkdirs() }
            val stringPath =
                "${dir.absolutePath}/${UUID.randomUUID()}-${DateHelper.formatDate(Date())}-${file.originalFilename?.trim()}"
            val path = Paths.get(stringPath.replace(" ", "_"))
            Files.write(path, bytes)
            return path
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

    fun createFileFromMultipart(pathStore: String, vararg files: MultipartFile): List<Path>? {
        try {
            val list: MutableList<Path> = ArrayList()
            for (file in files) {
                createFileFromMultipart(pathStore, file)?.let {
                    list.add(it)
                }
            }
            return list
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

    fun deleteFile(pathStore: String): Boolean {
        try {
            val file = File(pathStore)
            return file.delete()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }
}
