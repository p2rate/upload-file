package com.example.uploadingfiles.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadResponseDto {

  private boolean success;
//  private String errorCode;
//  private String errorDescription;
}
