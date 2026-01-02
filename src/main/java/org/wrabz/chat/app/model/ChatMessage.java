package org.wrabz.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ChatMessage {


    private Long id;
    private String content;
    private String sender;
}
