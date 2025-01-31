package com.example.messageservice.domain.model.messanger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class FirstStepSendMessageRequest {
    private String usernameSender;
    private String usernameReceiver;
    private String content;
}
