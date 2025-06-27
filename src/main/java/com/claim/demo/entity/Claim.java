package com.claim.demo.entity;

import io.lettuce.core.dynamic.annotation.CommandNaming;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "claims")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claimID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userID", referencedColumnName = "userID")
    private User user;

    @Column
    private Date claimDate;

    public String getEmailId() {
        return emailId;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getClaimID() {
        return claimID;
    }

    public void setClaimID(Long claimID) {
        this.claimID = claimID;
    }

    @Column
    private Double claimAmount;

    @Column
    private String emailId;

    @Column
    private String claimType;

    @Column
    private String claimStatus;

    @Column
    private Date lastUpdated;

}