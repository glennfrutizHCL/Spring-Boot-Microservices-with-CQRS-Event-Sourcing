package com.springbank.user.cmd.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {
    private String id;
    private String message;
}
