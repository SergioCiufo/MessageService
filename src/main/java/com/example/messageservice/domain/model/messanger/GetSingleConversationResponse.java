package com.example.messageservice.domain.model.messanger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class GetSingleConversationResponse {
    private String id;
    private String content;
    private String username_sender;
    private String username_receiver;
    private String createdAt;
    private Boolean isRead;
}
