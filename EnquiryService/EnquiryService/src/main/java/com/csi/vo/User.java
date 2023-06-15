package com.csi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int userId;

    private String userName;

    private String userEmailId;

    private String userAddress;

    private long userContactNumber;

}
