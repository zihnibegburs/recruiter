package com.crypto.client.remotive.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RemotiveJobResponseDTO {
    public String legalNotice;
    public int jobCount;
    public List<RemotiveJobDTO> jobs;
}
