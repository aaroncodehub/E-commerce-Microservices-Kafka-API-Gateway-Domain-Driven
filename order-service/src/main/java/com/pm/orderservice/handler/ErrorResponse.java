package com.pm.orderservice.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
