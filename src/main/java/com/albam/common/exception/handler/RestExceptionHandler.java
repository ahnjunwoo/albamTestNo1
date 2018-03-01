package com.albam.common.exception.handler;

import org.springframework.core.Ordered;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import com.albam.common.exception.domain.ApiError;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * 파라미터 길이 널,길이 체크 예외시 공통 처리
	 * @exception ConstraintViolationException
	 * @param apiError
	 * @return
	 */
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> ConstraintViolationException(ConstraintViolationException ex) {
		HashMap<String, Object> message = new HashMap<>();
	    Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
	    for (ConstraintViolation<?> violation : violations) {
	      message.put("msg", violation.getMessage());
	    }
	    String msg = (String) message.get("msg");
	    return buildResponseEntity(new ApiError("E0001",msg));
	}
	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
	}

}
