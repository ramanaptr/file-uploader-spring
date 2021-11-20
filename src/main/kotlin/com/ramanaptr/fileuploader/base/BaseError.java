package com.ramanaptr.fileuploader.base;

public enum BaseError {
    SUCCESS(200, "Success"),
    BAD_REQUEST(400, "Maaf, terjadi kesalahan"),
    INTERNAL_SERVER_ERROR(500, "Maaf terjadi kesalahan dalam sistem"),
    NOT_FOUND(404, "Permintaan tidak ditemukan"),
    UNAUTHORIZED(401, "Tidak ada izin untuk mengakses"),
    EXPIRED(403, "Sesi berakhir"),
    ;

    private final int code;
    private final String message;

    BaseError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
