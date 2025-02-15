package com.example.messageservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //questo ci crea getter e setter in automatico
@Builder(toBuilder = true) //interfaccia differente e fluida per settare parametri //tobuilder da una classe di creare il builder
@AllArgsConstructor //costruttore con tutti i parametri
@NoArgsConstructor //costruttore vuoto
public class User{
    private String username;
}
