package com.capgemini.Url_Shortener_Service.dto;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UrlResponseDto {

    private String shortCode;
    private String originalUrl;
    private String shortUrl;
    private Long clickCount;
    private LocalDateTime createdAt;
}