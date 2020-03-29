package pl.rsjava.countriesdocker.controller;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.rsjava.countriesdocker.model.ApiError;

import javax.persistence.EntityNotFoundException;
import javax.swing.text.html.parser.Entity;

@Order(Ordered.HIGHEST_PRECEDENCE) // klasa będzie wczytywana do kontekstu springa jako pierwsza
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> handlerNullPointer(NullPointerException ex){
        ApiError apiError =
                new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, "INVALID COUNTRY CODE");
        return buildResponseEntity(apiError);

    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handlerEntityNotFound(EntityNotFoundException e){
        ApiError apiError =
                new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
        return buildResponseEntity(apiError);
    }

    @ExceptionHandler(JDBCConnectionException.class)
    public ResponseEntity<Object> handlerJDBCConnection(JDBCConnectionException e) {
        ApiError apiError =
                new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
        return buildResponseEntity(apiError);
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError){
        return  new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
