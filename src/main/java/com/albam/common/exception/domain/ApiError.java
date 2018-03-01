package com.albam.common.exception.domain;


import lombok.Data;

@Data
public class ApiError {
    private String code;
    private String message;
    
    public ApiError() {
    }
    public ApiError(String code, String message) {
    	  this.code = code;
          this.message = message;
    }
}
