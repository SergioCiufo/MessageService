package com.example.messageservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data //questo ci crea getter e setter in automatico
@Builder(toBuilder = true) //interfaccia differente e fluida per settare parametri //tobuilder da una classe di creare il builder
@AllArgsConstructor //costruttore con tutti i parametri
@NoArgsConstructor //costruttore vuoto
//@Entity
//@Table(neme = "Message")
public class Message {
    private int id;
    private String content;
    //@ManyToOne
    //@JoinColumn(name = "user_sender_id", referenceColumnName = "id", nullable = false)
    private User userSender;
    //@ManyToOne
    //@JoinColumn(name = "user_receiver_id", referenceColumnName = "id", nullable = false)
    private User userReceiver;

    private LocalDateTime createdAt;

    private Boolean isRead;
}
