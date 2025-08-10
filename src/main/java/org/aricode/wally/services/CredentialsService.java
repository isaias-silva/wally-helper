package org.aricode.wally.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import org.aricode.wally.dto.CreateCredentialsDto;
import org.aricode.wally.dto.CredentialsDto;
import org.aricode.wally.repositories.CredentialsRepository;

import java.util.List;

@ApplicationScoped
public class CredentialsService {

    @Inject
    private CredentialsRepository repository;

    public List<CredentialsDto> getAllCredentials() {
        throw new BadRequestException("not implemented");
    }

    public CredentialsDto getCredential(String id) {
        throw new BadRequestException("not implemented");
    }

    public CredentialsDto getFirstValid() {
        throw new BadRequestException("not implemented");
    }

    public String createCredential(CreateCredentialsDto data) {
        throw new BadRequestException("not implemented");
    }

}
