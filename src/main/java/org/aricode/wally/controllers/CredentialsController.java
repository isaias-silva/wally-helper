package org.aricode.wally.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.aricode.wally.dto.CreateCredentialsDto;
import org.aricode.wally.dto.CredentialsDto;
import org.aricode.wally.services.CredentialsService;
import jakarta.validation.Valid;


@Path("credentials")
@Produces(MediaType.APPLICATION_JSON)

public class CredentialsController {
    @Inject
    private CredentialsService credentialsService;

    @GET()
    @Path("get")
    public CredentialsDto getCredential(@PathParam("id") String id) {
        return this.credentialsService.getCredential(id);
    }

    @GET()
    @Path("firstValid")
    public CredentialsDto getFirstValidCredential() {
        return this.credentialsService.getFirstValid();
    }

    @POST()
    @Path("create")
    public String createCredential(@Valid CreateCredentialsDto dto) {
        return this.credentialsService.createCredential(dto);
    }

    @DELETE()
    @Path("used")
    public CredentialsDto markedUse(@PathParam("id") String id) {
        throw new BadRequestException("not implemented");
    }


}
