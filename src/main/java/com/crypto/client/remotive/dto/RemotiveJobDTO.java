package com.crypto.client.remotive.dto;

import com.crypto.persistance.entity.Jobs;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RemotiveJobDTO {
    private int id;
    private String url;
    private String title;
    private String company_name;
    private String company_logo;
    private String category;
    private String jobType;
    private Timestamp publication_date;
    private String candidate_required_location;
    private String salary;
    private String description;

    public static Jobs getJob(RemotiveJobDTO remotiveJobDTO){
        return Jobs.builder()
                .url(remotiveJobDTO.getUrl())
                .companyName(remotiveJobDTO.getCompany_name())
                .description(remotiveJobDTO.getDescription())
                .title(remotiveJobDTO.getTitle())
                .publicationDate(remotiveJobDTO.getPublication_date())
                .build();
    }


}