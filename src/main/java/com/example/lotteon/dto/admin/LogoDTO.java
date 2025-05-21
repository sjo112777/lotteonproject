package com.example.lotteon.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogoDTO {

  private String headerLogoLocation;

  private String footerLogoLocation;

  private String faviconLocation;
}
