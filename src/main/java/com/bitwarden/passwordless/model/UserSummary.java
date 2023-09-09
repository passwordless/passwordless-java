package com.bitwarden.passwordless.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class UserSummary {
    String userId;
    Integer aliasCount;
    List<String> aliases;
    Integer credentialsCount;
    LocalDateTime lastUsedAt;
}
