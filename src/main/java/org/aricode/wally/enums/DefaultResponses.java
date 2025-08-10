package org.aricode.wally.enums;


import org.aricode.wally.dto.DefaultHttpResponseDto;

public enum DefaultResponses {
    CREDENTIAL_CREATED(new DefaultHttpResponseDto(201,"Credenciais salvas."));

    private final DefaultHttpResponseDto response;


    DefaultResponses(DefaultHttpResponseDto response) {
        this.response = response;
    }


    public DefaultHttpResponseDto getResponse() {
        return response;
    }
}
