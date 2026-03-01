package com.capgemini.Url_Shortener_Service.dto;



import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ErrorResponseDto {

    private LocalDateTime timestamp;
    private int status;
    private String message;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}