package org.aricode.wally.repositories;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.aricode.wally.entities.CredentialsEntity;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CredentialsRepository implements PanacheMongoRepository<CredentialsEntity> {

}
