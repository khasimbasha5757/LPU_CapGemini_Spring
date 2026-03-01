package com.capgemini.Url_Shortener_Service.service;


import java.util.List;

import org.springframework.data.domain.Page;

import com.capgemini.Url_Shortener_Service.dto.StatsDto;
import com.capgemini.Url_Shortener_Service.dto.UrlRequestDto;
import com.capgemini.Url_Shortener_Service.dto.UrlResponseDto;

public interface UrlMappingService {

    UrlResponseDto createShortUrl(UrlRequestDto request);

    String resolveAndIncrement(String shortCode);

    StatsDto getStats(String shortCode);

    Page<UrlResponseDto> getAll(int page, int size);

    void delete(String shortCode);

    List<UrlResponseDto> getTop5();
}