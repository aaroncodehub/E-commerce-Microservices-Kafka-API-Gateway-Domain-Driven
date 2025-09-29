package com.pm.customerservice.handler;


import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}