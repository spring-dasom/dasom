package com.example.dasom.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class CsWriteDto {
    private Long csWriteNumber;
    private Long adminNumber;
    private String csWriteTitle;
    private String csWriteRecruitStart;
    private String csWriteRecruitEnd;
    private String csWriteCount;
    private String csWritePlace;
    private String csWriteActStart;
    private String csWriteActEnd;
    private Long csWriteStatus;
    private Date csWriteDate;
    private String csWriteManager;
    private String csWritePhone;
}
