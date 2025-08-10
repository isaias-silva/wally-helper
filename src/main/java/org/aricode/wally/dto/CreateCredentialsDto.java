package org.aricode.wally.dto;

import io.smallrye.common.constraint.NotNull;

public record CreateCredentialsDto(@NotNull String key, @NotNull String value) {
}
