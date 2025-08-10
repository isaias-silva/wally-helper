package org.aricode.wally.providers.mappers;

import jakarta.ws.rs.ClientErrorException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.aricode.wally.dto.DefaultHttpResponseDto;

@Provider
public class ClientExceptionProviderMapper implements ExceptionMapper<ClientErrorException> {

    @Override
    public Response toResponse(final ClientErrorException e) {

        int status = e.getResponse().getStatus();
        DefaultHttpResponseDto error = new DefaultHttpResponseDto(status, e.getMessage());

        return Response.status(status).entity(error).build();
    }
}
