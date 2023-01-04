package com.koreait.projectboard.repository;

import com.koreait.projectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserAccountRepository  extends JpaRepository<UserAccount, Long> {
}
