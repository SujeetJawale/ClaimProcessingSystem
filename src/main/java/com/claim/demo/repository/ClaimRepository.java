package com.claim.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claim.demo.entity.Claim;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {

    List<Claim> findByUser_userId(Long userId);

    List<Claim> findByClaimStatusAndLastUpdatedBefore(String claimStatus, Date lastUpdated);
}