package com.ramanaptr.fileuploader.controller

import com.ramanaptr.fileuploader.base.BaseResponse
import com.ramanaptr.fileuploader.helpers.FileHelpers
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import kotlin.io.path.absolutePathString

@CrossOrigin
@RestController
@RequestMapping("file/")
class UploadController {

    @PostMapping("upload")
    fun fun1(
        @RequestParam("path") path: String,
        @RequestParam("file") file: MultipartFile
    ): ResponseEntity<*> {
        val pathObj = FileHelpers.createFileFromMultipart(path, file)
        return ResponseEntity.ok(BaseResponse(200, "success", pathObj?.absolutePathString()))
    }

    @PostMapping("delete")
    fun fun1(
        @RequestParam("path") path: String,
    ): ResponseEntity<*> {
        val isDelete = FileHelpers.deleteFile(path)
        return ResponseEntity.ok(BaseResponse(200, "success", isDelete))
    }

}