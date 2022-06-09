package com.example.itransitiontask4.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class EditUsersRequest {

    // selected users ids that should be edited
    @NotEmpty(message = "Id list cannot be empty.")
    @NotNull
    private Long[] ids;

    // 1 - block, 2 - unblock. 3 - delete selected users
    @NotNull(message = "Non of these actions selected")
    private Integer action;
}
