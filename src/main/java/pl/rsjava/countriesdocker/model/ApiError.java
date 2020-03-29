package pl.rsjava.countriesdocker.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiError {

    private HttpStatus status;
    private LocalDateTime localDateTime;
    private String message;

    public ApiError() {
    }

    public ApiError(HttpStatus status) {
        this.status = status;
        this.localDateTime = LocalDateTime.now();
    }

    public ApiError(HttpStatus status, String message) {
        this.status = status;
        this.localDateTime = LocalDateTime.now();
        this.message = message;
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this.status = status;
        this.localDateTime = LocalDateTime.now();
        this.message = "Unexpected Error";
    }

    public HttpStatus getStatus() {
        return status;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getMessage() {
        return message;
    }
}
