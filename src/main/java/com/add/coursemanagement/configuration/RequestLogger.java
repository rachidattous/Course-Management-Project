package com.add.coursemanagement.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Profile("dev")
@Configuration
@Slf4j
public class RequestLogger extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
    ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

    long startTime = System.currentTimeMillis();
    filterChain.doFilter(requestWrapper, responseWrapper);
    long timeTaken = System.currentTimeMillis() - startTime;

    String requestBody = getStringValue(requestWrapper.getContentAsByteArray(),
        request.getCharacterEncoding());

    log.info(
        "FINISHED PROCESSING : METHOD = {}; REQUEST URI = {}; REQUEST PAYLOAD = {}; RESPONSE CODE = {}; TIME TAKEN = {}ms;",
        request.getMethod(), request.getRequestURI(), requestBody, response.getStatus(),
        timeTaken);
    responseWrapper.copyBodyToResponse();
  }

  private String getStringValue(byte[] contentAsByteArray, String characterEncoding) {
    try {
      return new String(contentAsByteArray, 0, contentAsByteArray.length, characterEncoding);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return "";
  }

}
