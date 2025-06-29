package com.claim.demo.service;

import com.claim.demo.dto.ClaimDTO;
import com.claim.demo.entity.Claim;

import java.util.List;

public interface ClaimsServiceI {
    ClaimDTO submitClaim(Claim claim);

    Object findClaimById(Long claimId);

    ClaimDTO convertToDTO(Object claimById);

    ClaimDTO updateClaim(Long claimId, ClaimDTO updatedClaim);

    void deleteClaim(Long claimId);

    List<ClaimDTO> findClaimsByUserId(Long userId);

    String getClaimStatus(Long claimId);
}
